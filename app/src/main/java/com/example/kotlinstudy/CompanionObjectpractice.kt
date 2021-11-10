package com.example.kotlinstudy

fun main(){
    val book = Book.create()
    println("${book.id} ${book.name}")
}

class Book private constructor(val id : Int, val name:String){

    companion object {
        val myBook = "new book"
        fun create()=Book(0, myBook)
    }

}