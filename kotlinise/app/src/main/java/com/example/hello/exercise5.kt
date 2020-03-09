package com.example.hello

val data = listOf(4, 6, 34, 9, 2, 4, 7)

// A
println(data)
// B
println(data.asReversed())
// C
println(data.toSet())
// D
println(data.take(3))
// E
if(data.all { it > 0 }) print(data)
// F
println(data.map {it*it})
// G
println(data.filter { it%2 == 0 })
// H
println(data?.mapIndexed { index, value -> if (value%2!=0) index else null }.filter {it != null})
// I
fun Int.isPrime(): Boolean = (2..this/2).none { this%it == 0 }
println(data.filter { it.isPrime() })
// J
println(data.last { it.isPrime() })