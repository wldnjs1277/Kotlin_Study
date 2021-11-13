package com.example.kotlinstudy
//lamda/ companionobject

fun main(){
    println(calculator(10,2))

    val Jiwon = "jiwon said"
    println(Jiwon.burger())
}

//lamda

val calculator = {number1:Int,number2:Int -> number1/number2}

val burger : String.() -> String = {
    this +" "+"burger good"
}



//companionobject