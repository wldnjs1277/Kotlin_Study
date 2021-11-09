package com.example.kotlinstudy

//pojo
data class Ticket(val CompanyName : String,val name : String,var date : String, var seatNumber : Int)
//toString(),hashCode(),equals(),copy()
class Ticketnormal(val CompanyName : String,val name : String,var date : String, var seatNumber : Int)
fun main(){
    val ticketA = Ticket(CompanyName = "koreanAIR",name = "jiwon",
        date = "20201-11-8",seatNumber = 13)

    val ticketB = Ticketnormal(CompanyName = "koreanAIR",name = "jiwon",
        date = "20201-11-8",seatNumber = 13)

    println(ticketA)
    println(ticketB)
}