package com.example.historyageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    enum class HistoricalEvent(val age: Int, val description: String) {
     EVENT_1(95,"Nelson Mandela is a historical figure what died at the age 95 "),
     EVENT_2(76,"Albert Einstein is a historical figure what died at the age 97"),
     EVENT_3(56,"Abraham Lincoln is a historical figure what died at the age 56"),
     EVENT_4(39,"Martin Luther King Jr. was a historical figure what at the age died 39"),
     EVENT_5(67,"George Washington was a historical figure what died at the age 67"),
     EVENT_6(81,"Muhammad Ali was a historical figure what died at the age 81"),
     EVENT_7(35,"Wolfgang Amadeus Mozart was a historical figure what died at the age 35"),
     EVENT_8(40,"Edgar Allan Poe was a historical figure what died at the age 40"),
     EVENT_9(22,"Buddy Holly was a historical figure what died at the age 22"),
     EVENT_10(26,"Otis Redding was a historical figure what died at the age 26"),
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val btnResult = findViewById<Button>(R.id.btnResults)
     val btnClear = findViewById<Button>(R.id.btnClear)
     val txtResult = findViewById<TextView>(R.id.txtResult)
     val edtBirthAge = findViewById<EditText>(R.id.edtAge)

     btnResult?.setOnClickListener()
     {
         val birthAge = edtBirthAge.text.toString().toIntOrNull()
         if (birthAge != null && birthAge in 20..100){

             val eventAge = HistoricalEvent.values().map{it.age }
             val events = when (birthAge)
             {
                 in eventAge -> {
                    val event = HistoricalEvent.values().find {it.age == birthAge}
                    listOf("Your $birthAge: ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it - 1 } -> {
                    val event = HistoricalEvent.values().find { it.age == birthAge + 1 }
                    listOf("Your age is one year before ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it + 1 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge - 1 }
                     listOf("Your age is one years after ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it - 2 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge + 2 }
                     listOf("Your age is two years before ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it + 2 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge - 2 }
                     listOf("Your age is two years after ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it - 3 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge + 3 }
                     listOf("Your age is three years before ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it + 3 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge - 3 }
                     listOf("Your age is three years after ${event?.description ?: "event"}")
                 }
             in eventAge.map { it - 4 } -> {
                 val event = HistoricalEvent.values().find { it.age == birthAge + 4 }
                 listOf("Your age is four years before ${event?.description ?: "event"}")
             }
             in eventAge.map { it + 4 } -> {
                 val event = HistoricalEvent.values().find { it.age == birthAge - 4 }
                 listOf("Your age is four years after ${event?.description ?: "event"}")
             }
                 in eventAge.map { it - 5 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge + 5 }
                     listOf("Your age is five years before ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it + 5 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge - 5 }
                     listOf("Your age is five years after ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it - 6 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge + 6 }
                     listOf("Your age is six years before ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it + 6 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge - 6 }
                     listOf("Your age is six years after ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it - 7 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge + 7 }
                     listOf("Your age is seven years before ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it + 7 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge - 7 }
                     listOf("Your age is seven years after ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it - 8 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge + 7 }
                     listOf("Your age is eight years before ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it + 8 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge - 7 }
                     listOf("Your age is eight years after ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it - 9 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge + 7 }
                     listOf("Your age is nine years before ${event?.description ?: "event"}")
                 }
                 in eventAge.map { it + 9 } -> {
                     val event = HistoricalEvent.values().find { it.age == birthAge - 7 }
                     listOf("Your age is nine years after ${event?.description ?: "event"}")
                 }

                 else -> listOf("No ages found for $birthAge")
             }
             txtResult.text = events.joinToString( "\n")
         }
         else
         {
             txtResult.text ="Please enter age from 20 to 100"
         }
     }
     btnClear?.setOnClickListener() {
         edtBirthAge.text.clear()
         txtResult.text = ""
     }

    }
}