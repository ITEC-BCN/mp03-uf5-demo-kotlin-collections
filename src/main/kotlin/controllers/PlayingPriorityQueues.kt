package controllers

import java.util.PriorityQueue
import models.Alumne

fun main() {
    //Definim la cua amb prioritat
    val cua: PriorityQueue<Alumne> = PriorityQueue<Alumne>()

    //Afegim elements a la cua
    val a1: Alumne = Alumne("Joan", 20)
    val a2: Alumne = Alumne("Joan", 18)
    val a3: Alumne = Alumne("Pep", 18)
    val a4: Alumne = Alumne("Maria", 25)
    cua.add(a1)
    cua.add(a2)
    cua.add(a3)
    cua.add(a4)

    //Mostrem el contingut de la cua
    println("Contingut de la cua: ${cua.toString()}")

    //Treiem un element de la cua
    println("Treiem un element de la cua: ${cua.poll()}")
    println("Contingut de la cua: ${cua.toString()}")
    val a5: Alumne = Alumne("Pau", 22)
    cua.add(a5)
    println("Contingut de la cua: ${cua.toString()}")

    //Recorrer la cua sense treure els elements
    println("Recorrem la cua sense treure els elements")
    for (i in cua) {
        println(i)
    }

    //Mirar el primer element, sense treure'l
    val front = cua.peek()
    println("El primer element de la cua és: $front")
    println("Contingut de la cua: ${cua.toString()}")

    //Treure tots els elements de la cua
    println("Treure tots els elements de la cua")
    while (!cua.isEmpty()) {
        println(cua.poll())
    }
    println("Contingut de la cua: ${cua.toString()}")

    //Està buida?
    println("Està buida?: ${cua.isEmpty()}")

}
