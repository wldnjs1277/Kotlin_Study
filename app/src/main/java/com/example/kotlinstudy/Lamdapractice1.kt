package com.example.kotlinstudy


val square1 = {number : Int -> number*number}

val mynameAge = {name:String,age:Int -> "My name is ${name}, ${age} years old"}



fun main(){
    println(square1(12))
    println(mynameAge("jiwon",26))
    println(pizza("taste good "))
    val a = "jiwon said "
    println(a.pizza()+" taste good")

    println(extendString1(name = "jiwon",age = 26))
    println(Calculator(999))
}

//////확장함수//////

val pizza : String.() -> String = {this + "pizza"}

fun extendString1(name:String,age:Int) : String{
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it}"}
    return name.introduceMyself(age)
}

//람다의 Return

val Calculator : (Int) -> String = {
    when(it){
        in 0..50 -> "fail"
        in 51..70 -> "good"
        in 71..100 -> "perfect"
        else -> "error"
    }

}