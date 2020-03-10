# Android & Kotlin 
Formation Complète

**Variables**

Pratique
````kotlin
var age: Int = 5
var name: String = "Bob"
var height: Float = 1.60F
println("$name a $age ans")

age = 10
println("$name a $age ans")

age *= 2
println("$name a $age ans")
````

**Strings**

Pratique
````kotlin
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
````

**Contrôle de flux : if/else**

Pratique
````kotlin
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
````

**Mutabilité et Nullabilité**

Pratique
````kotlin
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
````

**Fonctions**

Pratique
````kotlin
fun  isOldEnough (age: Int): Boolean = age >=5

fun describePeople (name: String, age: Int, height: Float, detail: String = "Aucun détail") {
    val canPlayString = when(isOldEnough(age)) {
        true -> "peut jouer au basket"
        false -> "ne peut pas jouer au basket"
    }
    println("${name} a ${age}, mesure ${height} et ${canPlayString}")
}
````

````kotlin
var name = "Bob"
var age = 10
var height = 1.6F
describePeople(name, age, height)

name = "Bobette"
age = 4
height = 1.8F
describePeople(name, age, height, detail = "c'est un détail")
````

**Tableaux**

Création via constructeur

````kotlin
val tableau = Array <Type>(Taille) {valeur}

````
*Exemple*
````kotlin
val ages = Array<Int>(10) { 0 }
//Un tableau de nombres de taille 10 et ayant comme valeur par défaut 0
````

Création via factory function

````kotlin
val tableau = arrayOf (valeur1, valeur2,)
//Le type  du tableau sera la même que celles des valeurs si elles ont le même type
````

*Exemple*
````kotlin
val ages = arrayOf(4, 7, 15)
//Un tableau d'entier de taille 3
````

Récupérer une valeur

````kotlin
ages.get(index)
ages[index]
````

Modifier une valeur

````kotlin
ages.set(index, valeur)
ages[index] = valeur
````

Pratique

````kotlin
````
