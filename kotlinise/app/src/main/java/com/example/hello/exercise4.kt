package com.example.hello

class RectangularShape(var x: Int, var y: Int, var width: Int, var height: Int, var color: Int) {
    fun measure() {}
    fun render() {}
}

fun validateShape(shape: RectangularShape): Boolean {
    when {
        shape.x < 0 || shape.y < 0 -> {
            print("Invalid position")
            return false
        }
        shape.width > 1024 || shape.height > 1024 -> {
            print("Shape too big")
            return false
        }
        shape.color < 0 || shape.color > 0xFFFFFF -> {
            print("Invalid color")
            return false
        }
        else -> {
            return true
        }

    }
}

fun initShape(shape: RectangularShape?) {
    shape?.apply {
        x = 10
        y = 20
        width = 100
        height = 200
        color = 0xFF0066
    } ?: throw IllegalArgumentException()
}

fun drawShape(shape: RectangularShape) {
    shape?.let {
        validateShape(it)
        it.measure()
        it.render()
    }
}