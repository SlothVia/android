package training.androidkotlin.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = "Bob"
        val age = 10

        println("String template simple : $name a $age ans")

        println("String template complexe : ${name.toUpperCase()} a ${age + 5} ans")

        println("Concaténation classique :\n"
                + "Nom : " + name + "\n"
                + "Age : " + age + "\n")

        println("""Raw string :
Nom : ${name}
Age : ${age}
""")

        println("""Raw string trim :
        |Nom : ${name}
        |Age : ${age}
        """.trimMargin())

        println("""Raw string trim2 :
        >Nom : ${name}
        >Age : ${age}
        >Et encore une nouvelle ligne !
        """.trimMargin(">"))
    }
}
