package com.example.kotlinstudy

//pojo
data class Ticket(val CompanyName : String,val name : String,var date : String, var seatNumber : Int){
    init {
        println("----init----")
    }
}
//toString(),hashCode(),equals(),copy()
class Ticketnormal(val CompanyName : String,val name : String,var date : String, var seatNumber : Int)
fun main(){
    val ticketA = Ticket("koreanAir", "jiwon", "20201-11-8", 13)

    val ticketB = Ticketnormal("koreanAir", "jiwon", "20201-11-8", 13)

    //var a = Ticket("test","a","11-8",1)
    //println(a.toString())
    //var b = a.copy()
    //println(b)
    println(ticketA)
    println(ticketB)
}