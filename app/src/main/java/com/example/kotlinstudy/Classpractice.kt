package com.example.kotlinstudy


class Human{

    val name = "jiwon"
    fun eatingcake(){
        println("this is so yummy!!")
    }
}



fun main(){
    val human = Human()
    human.eatingcake()
    println("human name = ${human.name}")
}