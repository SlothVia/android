package training.udemy.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age: Int = 5
        var name: String = "Bob"
        var height: Float = 1.60F

        println("${name} a ${age} ans")

        age = 10
        println("${name} a ${age} ans")

        age = age * 2
        println("${name} a ${age} ans")
    }
}
