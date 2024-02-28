package controllers

fun main() {
    //Definim el conjunt (set) i el conjunt mutable (buit)
    val set : Set<Int> = setOf(1, 12, 3, 14, 7, 7, 7)
    val setM : MutableSet<Int> = mutableSetOf()

    //Recorrem el set i anem afegint els mateixos elements al set mutable
    for (i in set)
        setM.add(i)
    //Afegim un element al set mutable. Si ho intentem sobre el set, donaria error
    setM.add(999)
    //set.add(999)  // ** ERROR !!!

    //Els conjunts no tenen els elements ordenats,
    // per tant, no podem accedir a una posició
    //setM.removeAt(1)

    //Provem les operacions del set
    println("Contingut de el set: ${set.toString()}")
    println("Tamany de el set: ${set.size}")
    println("Conté l'element 12? ${set.contains(12)}")
    println("Conté l'element 13? ${set.contains(13)}")
    println("Conté tots els elements (1,12,3) : ${set.containsAll(listOf(1,12,3))}")
    println("Conté tots els elements (1,12,99) : ${set.containsAll(listOf(1,12,99))}")
    println("Està buit?: ${set.isEmpty()}")

    //Provem les operacions del set mutable
    println("Contingut del set mutable: ${setM.toString()}")
    setM.add(7777);setM.add(7777);setM.add(7777);setM.add(7777)
    println("Nou contingut del set mutable: ${setM.toString()}")
    setM.remove(3)
    println("Nou contingut del set mutable: ${setM.toString()}")
    setM.removeAll(listOf(1, 14, 3))
    println("Nou contingut del set mutable: ${setM.toString()}")
    setM.clear()
    println("Nou contingut del set mutable: ${setM.toString()}")
    println("Està buit?: ${setM.isEmpty()}")

}
