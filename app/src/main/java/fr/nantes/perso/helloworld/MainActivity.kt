package fr.nantes.perso.helloworld


import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var unreadEmailCount = 3
        var notificationEnabled: Boolean = false

        do {
            println("Vérification des emails en cours...")
            if (!notificationEnabled) {
                break
            }
            println("Vous avez $unreadEmailCount emails non lus")
            unreadEmailCount--
        }while (unreadEmailCount >0)

    }
}



