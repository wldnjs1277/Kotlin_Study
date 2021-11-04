package com.example.kotlinstudy


 open class Human(val name : String = "anonymous"){

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
    open fun singasong(){
         println("hahaha")
     }
}

class Korean : Human(){
    override fun singasong(){
        println("하하하")
    }

}

fun main(){
    //val human = Human(name = "jiwon")
    //val human = Human()
    //human.eatingcake()
    //val stranger = Human()
    //println("human name = ${stranger.name}")

    val human2 = Human(name = "jiwon2", age = 26)
    val korean = Korean()
    korean.singasong()
}