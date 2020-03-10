package com.example.hello

data class Student(
    val name: String, val address: String,
    val grade: Int
)

val students = listOf(
    Student("John", "Boston", 6),
    Student("Jacob", "Baltimore", 2),
    Student("Edward", "New York", 7),
    Student("William", "Providence", 6),
    Student("Alice", "Philadelphia", 4),
    Student("Robert", "Boston", 7),
    Student("Richard", "Boston", 10),
    Student("Steven", "New York", 3)
)

println(students)
println(students.sortedBy { it.name })
students.sortedBy { it.name }.forEach { print(it.name) }
println(students.sortedWith(compareBy({ it.grade }, { it.name })))
println(students.groupBy { it.address })