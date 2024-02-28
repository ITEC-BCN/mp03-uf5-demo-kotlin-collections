package controllers

fun main() {
    //Definim la llista i la llista mutable (buida)
    val llista : List<Int> = listOf(1, 12, 3, 14)
    val llistaM : MutableList<Int> = mutableListOf()

    //Recorrem la llista i anem afegint els mateixos elements a la llista mutable
    for (i in llista)
        llistaM.add(i)
    //Afegim un element a la llista mutable. Si ho intentem sobre la llista, donaria error
    llistaM.add(999)
    // llista.add(999)  // ** ERROR !!!

    //Eliminem el segon element de la llista
    llistaM.removeAt(1)

    //Accedim al segon element de la llista  (base 0!!!)
    println("El segon element de la llista és: ${llista[1]}")

    //Provem les operacions de la llista
    println("Contingut de la llista: ${llista.toString()}")
    println("Tamany de la llista: ${llista.size}")
    println("Conté l'element 12? ${llista.contains(12)}")
    println("Conté l'element 13? ${llista.contains(13)}")
    println("Conté tots els elements (1,12,3) : ${llista.containsAll(listOf(1,12,3))}")
    println("Conté tots els elements (1,12,99) : ${llista.containsAll(listOf(1,12,99))}")
    println("Està buida?: ${llista.isEmpty()}")

    //Provem les operacions de la llista mutable
    println("Contingut de la llista mutable: ${llistaM.toString()}")
    llistaM.add(7777)
    println("Nou contingut de la llista mutable: ${llistaM.toString()}")
    llistaM.removeAt(0)
    println("Nou contingut de la llista mutable: ${llistaM.toString()}")
    llistaM.remove(3)
    println("Nou contingut de la llista mutable: ${llistaM.toString()}")
    llistaM.removeAll(listOf(1, 14, 3))
    println("Nou contingut de la llista mutable: ${llistaM.toString()}")
    llistaM.clear()
    println("Nou contingut de la llista mutable: ${llistaM.toString()}")
    println("Està buida?: ${llistaM.isEmpty()}")

}