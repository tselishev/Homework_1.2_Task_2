package ru.netology

fun main() {
    val likes = 5

    if (((likes % 10 == 1) && (likes != 11)) || (likes == 1)){
        println ("Понравилось $likes человеку")
    } else  {
        println ("Понравилось $likes людям")
    }
}