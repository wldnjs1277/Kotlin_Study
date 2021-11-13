package com.example.kotlinstudy

//lamda/ companionobject

fun main(){
    println(calculator(10,2))

    val jiwonfood ="burger"
    println(jiwonfood.burger())

    println(mymy("jiwon",26, "2021-11-13"))
    ////////////////////////////////

    val my = My.create()

    println("${my.age},${my.date},${my.name}")

    val myname = My.getname()
    println("my name is $myname")
}

//lamda

val calculator = {number1:Int,number2:Int -> number1/number2}

val burger : String.() -> String = {
    "$this taste good"
}

fun mymy(name:String,age:Int,date:String) : String {
    val introduce:String.(Int,String) -> String = {
            age1: Int, today: String -> "my name $this age = $age1 today = $today" }
    return name.introduce(age,date)
    /*val introduce:String.(Int)->String={"my name ${this} age=${it}"}
    return name.introduce(age)*/
}
//companionobject

class My private constructor(val name: String,val age: Int,val date: String){

    companion object MyFactory : nameprovider{
        override fun getname(): String {
            return "jiwon"
        }
        var myage = 26
        var today = "2021-11-13"
        fun create()= My(getname(), myage,today)
    }
}

interface nameprovider{
    fun getname():String
}