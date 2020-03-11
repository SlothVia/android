# Android & Kotlin

Formation Complète

**Variables**
==============

>>>>>>
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
==============

>>>>>>
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
==============

>>>>>>
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
==============

>>>>>>
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
=============

>>>>>>
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
==============

Création via constructeur

````kotlin
val tableau = Array <Type>(Taille) {valeur}

````

*Exemple*

````kotlin
val ages = Array<Int>(10) { 0 }
//Un tableau de nombres de taille 10 et ayant comme valeur par défaut 0
````

===========================================

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

===========================================

Récupérer une valeur

````kotlin
ages.get(index)
ages[index]
````
===========================================

Modifier une valeur

````kotlin
ages.set(index, valeur)
ages[index] = valeur
````
>>>>>>
Pratique

````kotlin
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
````

**Contrôle de flux : for**
==========================

For sur un range (simple)

````kotlin
for (i in 1..5){
    println(i)
}

//Console 
1
2
3
4
5
````

==========================

For sur un range (step)

````kotlin
for (i in 1..5 step 2){
    println(i)
}

//Console 
1
3
5
````

==========================

For sur un range (downTo)

````kotlin
for (i in 5 downTo 1){
    println(i)
}

//Console 
5
4
3
2
1
````

==========================

For sur un range (down To + step)

````kotlin
for (i in 5 downTo 1 step 2) {
    println(i)
}

//Console
5
3
1
````

==========================

Foreach sur une collection

````kotlin
for (item in collection) {
    //do something with item
}
````

==========================

Continue

````kotlin
for (item in collection){
    if (condition) {
    continue
    }
    //do something with item
}
````

>>>>>>
Pratique

````kotlin
val names: Array<String> = arrayOf("Bob", "Bobette", "Jane", "Mike")
for (i in 0..names.size-1){
            println(i)
        }

//Console
0
1
2
3
````

````kotlin
val names: Array<String> = arrayOf("Bob", "Bobette", "Jane", "Mike")
for (name in names) {
            println(name)
        }

//Console
"Bob"
"Bobette"
"Jane"
"Mike"
````

````kotlin
val names: Array<String> = arrayOf("Bob", "Bobette", "Jane", "Mike")
for ((index, name) in names.withIndex()) {
            println("$name est à l'index $index")
        }

//Console
"Bob est à l'index 0"
"Bobette est à l'index 1"
"Jane est à l'index 2"
"Mike est à l'index 3"
````

````kotlin
val names: Array<String> = arrayOf("Bob", "Bobette", "Jane", "Mike")
for (name in names) {
            if (name =="Jane"){
                println("$name est absent(e)")
                continue
            }
            println("$name est présent(e)")
        }

//Console
"Bob est présent(e)"
"Bobette est présent(e)"
"Jane est absent(e)"
"Mike est présent(e)"
````

**Contrôle de flux: while**
===========================

While

````
while (condition){
    ...
}
````

==========================

Do while

````kotlin
do  {
    x = getX()
}while (x > 10)
````

==========================

While + Break

````kotlin
while (condition) {
    //action 1 
    if (breakCondition) {
    break
    }
    //action 2
}
````

>>>>>>
Pratique

````kotlin
var unreadEmailCount = 3

        while (unreadEmailCount >0){
            println("Vérification des emails en cours...")
            println("Vous avez $unreadEmailCount emails non lus")
            unreadEmailCount--
        }

//Console
"Vérification des emails en cours..."
"Vous avez 3 emails non lus"
"Vérification des emails en cours..."
"Vous avez 2 emails non lus"
"Vérification des emails en cours..."
"Vous avez 1 emails non lus"        
````

````kotlin
var unreadEmailCount = 0
do {
      println("Vérification des emails en cours...")
      println("Vous avez $unreadEmailCount emails non lus")
      unreadEmailCount--
    }while (unreadEmailCount >0)

//Console
"Vérification des emails en cours..."
"Vous avez 0 emails non lus"        
````

````kotlin
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
   
//Console
"Vérification des emails en cours..."
````

**Les packages**
================







