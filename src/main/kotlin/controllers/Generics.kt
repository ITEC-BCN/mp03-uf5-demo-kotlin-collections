package controllers

class Parella<T> {
    private val primer: T
    private val segon: T
    constructor(primer: T,  segon: T) {
        this.primer = primer
        this.segon = segon
    }

    fun ajuntar() : T {
        var result : T
        when (primer) {
            is Int -> result = (primer + (segon as Int)) as T
            is Personatge -> {
                val p: T = (Personatge(primer.nom + " " + (segon as Personatge).nom)) as T
                primer.neixerFill(p as Personatge)
                segon.neixerFill(p as Personatge)
                result = p
            }
            else -> throw(Exception("Tipus no vàlid"))
        }
        return result
    }
}

fun <T> sumar(a: T, b: T) : T {
    return ((a as Int) + (b as Int) )as T
}

class Personatge {
    val nom:String
    val fills:MutableList<Personatge>
    constructor(nom:String) {
        this.nom = nom
        fills = mutableListOf<Personatge>()
        }
    fun neixerFill(fill:Personatge) {
        fills.add(fill)
    }
}

fun main() {
    val par : Parella<Int> = Parella(3, 4)
    println(par.ajuntar())
    val p1 : Personatge = Personatge("Josep")
    val p2 : Personatge = Personatge("Maria")
    println("Fills de p1: " + p1.fills)
    println("Fills de p2: " + p2.fills)
    val par2 : Parella<Personatge> = Parella(p1, p2)
    val p3 : Personatge = par2.ajuntar()
    println("p3: " + p3.nom + " : " + p3)
    println("Fills de p1: " + p1.fills)
    println("Fills de p2: " + p2.fills)

    val par3: Parella<String> = Parella("Hola", "Mon")
    println(par3.ajuntar())

}