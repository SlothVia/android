package fr.nantes.perso.helloworld


import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


fun  isOldEnough (age: Int): Boolean = age >=5

fun describePeople (name: String, age: Int, height: Float, detail: String = "Aucun détail") {
    val canPlayString = when(isOldEnough(age)) {
        true -> "peut jouer au basket"
        false -> "ne peut pas jouer au basket"
    }
    println("${name} a ${age}, mesure ${height} et ${canPlayString}")
}
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = "Bob"
        var age = 10
        var height = 1.6F
        describePeople(name, age, height)

        name = "Bobette"
        age = 4
        height = 1.8F
        describePeople(name, age, height, detail = "c'est un détail")


    }
}



