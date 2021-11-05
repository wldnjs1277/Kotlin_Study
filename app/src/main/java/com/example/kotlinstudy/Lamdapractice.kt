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
    println(extendString(name = "jiwon", age = 26))
    println(calculationGrade(971))


    val lamda = {number : Double -> number == 4.2343}

    println(invokeLamda(lamda))
    println(invokeLamda { it > 3.22 })




}

//확장함수

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best !"
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

//.람다의 Return

val calculationGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "error"
    }
}

//람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}