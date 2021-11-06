package com.example.kotlinstudy


val square1 = {number : Int -> number*number}

val mynameAge = {name:String,age:Int -> "My name is ${name}, ${age} years old"}



fun main(){
    println(square1(12))
    println(mynameAge("jiwon",26))
    println(pizza("taste good "))
}

////////////

val pizza : String.() -> String = {this + "pizza"}