package com.example.kotlinstudy

//lamda/ companionobject

fun main(){
    println(calculator(10,2))

    val jiwonfood ="burger"
    println(jiwonfood.burger())

    println(mymy("jiwon",26, "2021-11-13"))
}

//lamda

val calculator = {number1:Int,number2:Int -> number1/number2}

val burger : String.() -> String = {
    this+" "+"taste good"
}

fun mymy(name:String,age:Int,date:String) : String {
    val introduce:String.(Int,String) -> String = {age:Int,date:String ->
        "my name ${this} age = ${age} today = ${date}"
    }
    return name.introduce(age,date)
}



//companionobject

