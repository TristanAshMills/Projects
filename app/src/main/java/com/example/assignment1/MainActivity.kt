package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.system.measureNanoTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editField: EditText = findViewById<EditText>(R.id.editTextNumber)
        val textView3: TextView = findViewById<TextView>(R.id.textView3)
        val clearNumberBtn: Button = findViewById<Button>(R.id.clear_number_button)
        clearNumberBtn.setOnClickListener{editField.text.clear()
        textView3.text = ""
        }

        val textInput:EditText = findViewById<EditText>(R.id.editTextNumber)
        val clickMeButton:Button = findViewById<Button>(R.id.generateHistoryButton)
        val textView:TextView = findViewById<TextView>(R.id.textView3)

        clickMeButton?.setOnClickListener {
            var message: String = ""
            var text: Int

            text = textInput.text.toString().toInt()

            if (text >= 0 && text <= 19)
            {
                message = "This age is too young for history"
                textView.text = message
            }
            else if (text >= 20 && text <= 29)
            {
                message = "Oprah Winfrey was fired from her first job"
                textView.text = message
            }
            else if (text >= 30 && text <= 30)
            {
                message = "Nelson Mandela was released from prison on February 11, 1990, after spending 27 years incarcerated. His release marked a crucial step towards the end of apartheid in South Africa."
                textView.text = message
            }
            else if (text >= 32 && text <= 35)
            {
                message = "Nelson Mandela was released from prison on February 11, 1990, after spending 27 years incarcerated. His release marked a crucial step towards the end of apartheid in South Africa."
                textView.text = message
            }
            else if (text >= 31 && text <= 31)
            {
                message = "Jason Statham started acting at the age of 31"
                textView.text = message
            }
            else if (text >= 36 && text <= 36)
            {
                message = "Bob Marley passed away at the age of 36"
                textView.text = message
            }
            else if (text >= 37 && text <= 39)
            {
                message = "Nelson Mandela was released from prison on February 11, 1990, after spending 27 years incarcerated. His release marked a crucial step towards the end of apartheid in South Africa."
                textView.text = message
            }
            else if (text >= 40 && text <=49)
            {
                message = "The fall of the Berlin Wall in 1989 symbolized the end of the Cold War and the beginning of the collapse of communist regimes in Eastern Europe." + "The conflict between Iran and Iraq began in 1980 and lasted for eight years, resulting in significant casualties and geopolitical ramifications in the Middle East."
                textView.text = message
            }
            else if (text >= 50 && text <= 59)
            {
                message = "The Vietnam War concluded with the fall of Saigon on April 30, 1975, leading to the reunification of North and South Vietnam." + "1970 The Apollo 13 mission to the moon faced a life-threatening crisis when an oxygen tank exploded. The astronauts, with the help of NASA's ground control, managed to "
                textView.text = message
            }
            else if (text >= 60 && text <= 69)
            {
                message = "On July 20, 1969, NASA's Apollo 11 mission successfully landed astronauts Neil Armstrong and Buzz Aldrin on the moon, with Armstrong taking the first steps on its surface." +
                        "Civil Rights Act of 1964: President Lyndon B. Johnson signed the Civil Rights Act, prohibiting discrimination based on race, color, religion, sex, or national origin."
                textView.text = message
            }
            else if (text >= 70 && text <= 79)
            {
                message = "The Korean War began in 1950 when North Korean forces invaded South Korea. The conflict ended in 1953 with an armistice, establishing the Korean Demilitarized Zone."
                textView.text = message
            }
            else if (text >= 75 && text <= 75)
            {
                message = "Nelson Mandela became president of South Africa at the age of 75"
                textView.text = message
            }
            else if (text >= 80 && text <= 89)
            {
                message = "World War II (1939–1945): The war began in 1939, but significant events continued into the early 1940s. Key moments include the Blitz in London, the Battle of Stalingrad, D-Day (1944), and the dropping of atomic bombs on Hiroshima and Nagasaki (1945)."
                textView.text = message
            }
            else if (text >=90 && text <= 95)
            {
                message = "Great Depression (1929–1939): The global economic downturn, known as the Great Depression, persisted through much of the 1930s, leading to widespread unemployment and poverty."
                textView.text = message
            }
            else if (text >= 96 && text <= 96)
            {
                message = "Queen Elizabeth II passed away at the age of 96"
                textView.text = message
            }
            else if (text >= 100 && text <= 100)
            {
                message = "You are the same age as kirk Douglas"
                textView.text = message
            }
            else if (text >= 101 && text <= 999999999999999999)
            {
                message = "Please enter a valid age"
                textView.text = message
            }
        }

    }
}