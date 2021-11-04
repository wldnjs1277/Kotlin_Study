package com.example.kotlinstudy


class Human constructor(val name : String = "anonymous"){

    constructor(name: String , age:Int) : this(name){
        println("my name is ${name}, ${age}years old")
    }

    init{
        println("---new Human has been born---")
    }
    //val name = "jiwon"
    fun eatingcake(){
        println("this is so yummy!!")
    }
}



fun main(){
    //val human = Human(name = "jiwon")
    //val human = Human()
    //human.eatingcake()
    //val stranger = Human()
    //println("human name = ${stranger.name}")

    val human2 = Human(name = "jiwon2", age = 26)
}