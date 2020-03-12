package fr.nantes.perso.helloworld


import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

open class Vehicule(val wheelsCount:Int){
    fun showWheels() {
        println("Nombre de roues: ${wheelsCount}")
    }

    open fun honk() {
        println("Pas de klaxon")
    }
}

class Car : Vehicule(4){
    override fun honk() {
        println("Pouet!")
    }
}

class Motorcycle : Vehicule(2) {
    override fun honk() {
        println("Tsouin!")
    }
}


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vehicule : Vehicule = Car()
        vehicule.showWheels()
        vehicule.honk()

        vehicule = Motorcycle()
        vehicule.showWheels()
        vehicule.honk()
    }
}



