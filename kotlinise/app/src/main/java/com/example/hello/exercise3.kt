package com.example.hello

fun countVocals(s: String) =
    s.filter { it in "aeiouAEIOU" }.count()

countVocals("Hello")
countVocals("World")
countVocals("cddcdd")
countVocals("aeiouYM")