package fr.nantes.perso.helloworld


import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array: Array<Int> = Array<Int>(10) {0}
        println(Arrays.toString(array))

        val name = Array<String>(5){""}
        name.set(0,"Bob")
        println(name.get(0))

        name[1] = "John"
        println(name[1])

        val ages = arrayOf(4, 7, 99)
        val indexAge = 2
        println("Le 3ème élément est : ${ages[indexAge]}")

        ages[indexAge] = 29
        println("Le 3ème élément est à présent :  ${ages[indexAge]}")

    }
}



