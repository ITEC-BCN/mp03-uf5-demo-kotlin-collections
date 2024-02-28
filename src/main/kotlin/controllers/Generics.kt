package controllers

import models.Parella
import models.Personatge

fun <T> sumar(a: T, b: T): T {
    return ((a as Int) + (b as Int)) as T
}

fun main() {
    val par: Parella<Int> = Parella(3, 4)
    println(par.ajuntar())

    val p1: Personatge = Personatge("Josep")
    val p2: Personatge = Personatge("Maria")
    println("Fills de p1: " + p1.getFills())
    println("Fills de p2: " + p2.getFills())

    val par2: Parella<Personatge> = Parella(p1, p2)
    val p3: Personatge = par2.ajuntar()
    println("p3: " + p3.getNom() + " : " + p3)
    println("Fills de p1: " + p1.getFills())
    println("Fills de p2: " + p2.getFills())

    val par3: Parella<String> = Parella("Hola", "Mon")

    try {
        println(par3.ajuntar())
    } catch (e: Exception) {
        println(e.message)
    }

}