package com.example.kotlinstudy


//val square : (Int) -> (Int) = {number -> number*number}
val square  = {number : Int -> number*number}
val nameAge = {name : String, age : Int -> "my name is ${name} I'm ${age}"}

fun main(){
    println(square(12))
    println(nameAge("jiwon",26))

    val a = "jiwon said "
    val b = "you said "
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

}

//확장함수

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best !"
}