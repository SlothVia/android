package training.androidkotlin.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Decare a mutable / immutable age
        val minimumAge = 5
        var age: Int = 10

        // Display a property
        var name: String? = "Bob"
        println(name?.length)

        if (name != null) { println(name.length) }

        // Decalare a nullable String
        var nullableName: String? = "Bob"
        // nullableName = null

        // Check for null in conditions
        if (nullableName != null) {
            // println(nullableName.length)
        }

        // Using the safe call operator "?."
        // nullableName = null
        val nameLength: Int? = nullableName?.length
        println(nameLength)


        // Using the non-null assert operator "!!"
        nullableName = null
        val notNullName: String = nullableName!!
        val nameLengthForced: Int = nullableName!!.length
        println(name!!.length)

    }
}
