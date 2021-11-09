package com.example.kotlinstudy

//pojo
data class Ticket(val CompanyName : String,val name : String,var date : String, var seatNumber : Int)
//toString(),hashCode(),equals(),copy()
class Ticketnormal(val CompanyName : String,val name : String,var date : String, var seatNumber : Int)
fun main(){
    val ticketA = Ticket("koreanAir", "jiwon", "20201-11-8", 13)

    val ticketB = Ticketnormal("koreanAir", "jiwon", "20201-11-8", 13)

    println(ticketA)
    println(ticketB)
}