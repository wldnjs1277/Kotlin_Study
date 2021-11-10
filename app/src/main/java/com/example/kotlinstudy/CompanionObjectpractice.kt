package com.example.kotlinstudy

fun main(){
    val book = Book.create()
    val bookId = Book.Bookfactory.getId()
    println("${book.id} ${book.name} ${bookId}")

    val introduce = Introduce.myself()
    println("myname = ${introduce.name} , my age = ${introduce.age}")
}

class Book private constructor(val id : Int, val name:String){

    companion object Bookfactory : IdProvider {
        override fun getId() : Int {
            return 444
        }
        val myBook = "new book"
        fun create()=Book(getId(), myBook)
    }
}
interface IdProvider{
    fun getId() : Int
}

class Introduce private constructor(val name: String,val age:Int){
    companion object : ageProvider{
        override fun getAge() : Int{
            return 26
        }
        val myname = "jiwon"
        fun myself()=Introduce(myname, getAge())
    }
}
interface ageProvider{
    fun getAge():Int
}