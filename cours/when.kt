package training.androidkotlin.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val age = 10
        val name = "Bob"

        when (age) {
            is Byte -> println("est un Byte")
            is Int -> println("est un Int")
            is Float -> println("est un Float")
            is Double -> println("est un Double")
        }

        if (name == "Bob") {
            println("${name} est un garçon")
        } else if (name == "Bobette") {
            println("${name} est une fille")
        } else {
            println("On ne connait pas le genre de ${name}")
        }

        when (name) {
            "Bob" -> println("${name} est un garçon")
            "Bobette" -> println("${name} est une fille")
            else -> println("On ne connait pas le sexe de ${name}")
        }

        when (age) {
            in 1..5 -> println("${name} est trop jeune")
            in 6..10 -> println("${name} peut jouer au basket")
            !in 1..18 -> println("${name} ne peut pas jouer avec les enfants")
            else -> println("Condition non gérée")
        }

        val canPlayBasketBall = when (age) {
            in 5..10 -> true
            else -> false
        }

    }
}
