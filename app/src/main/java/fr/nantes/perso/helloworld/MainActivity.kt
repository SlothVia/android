package fr.nantes.perso.helloworld


import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: Array<String> = arrayOf("Bob", "Bobette", "Jane", "Mike")
        for (i in 0..name.size-1){
            println(i)
        }

    }
}



