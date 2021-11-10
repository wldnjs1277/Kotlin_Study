package com.example.kotlinstudy

fun main(){
    val book = Book.create()
    println("${book.id} ${book.name}")
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