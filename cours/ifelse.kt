package training.androidkotlin.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val age = 5
        val name = "Bob"
        val height = 1.60F

        if (age < 5) {
            println("${name} n'est pas assez vieux pour du basket")
        }

        if (age >= 5 && height >= 1.50f) {
            println("${name} peut jouer au basket")
        } else {
            println("${name} n'a ni l'âge, ni la taille requise pour jouer")
        }
        
        if (name == "Bob") {
            println("${name} est un garçon")
        } else if (name == "Bobette") {
            println("${name} est une fille")
        } else {
            println("On ne connait pas le sexe de ${name}")
        }
        
        val type = if (age < 18) "child" else "adult"
        println("${name} est un ${type}")
    }
}
