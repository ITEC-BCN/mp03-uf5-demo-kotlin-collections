package controllers

fun main() {
    //Definim el mapa (map) i el mapa mutable (buit)
    val mapa : Map<Int,String> = mapOf(1 to "Un", 2 to "Dos", 3 to "Tres")
    val mapaM : MutableMap<Int,String> = mutableMapOf()

    //Recorrem el set i anem afegint els mateixos elements al set mutable
    for (i in mapa)
        mapaM.put(i.key,i.value)

    //Afegim un element al set mutable. Si ho intentem sobre el set, donaria error
    mapaM.put(999, "nou-cents noranta-nou")
    //set.add(999)  // ** ERROR !!!

    //Els mapes no tenen els elements ordenats,
    // per tant, no podem accedir a una posició
    //map.removeAt(1)

    //Provem les operacions del map
    println("Contingut de el set: ${mapa.toString()}")
    println("Tamany de el set: ${mapa.size}")
    println("Conté la clau 1? ${mapa.contains(1)}")
    println("Conté la clau 12? ${mapa.contains(12)}")
    println("Conté el valor 'Un'? ${mapa.containsValue("Un")}")
    println("Conté el valor 'quatre'? ${mapa.containsValue("quatre")}")
    println("Quin és el valor per al 2 : ${mapa.getValue(2)}")
    println("Està buit?: ${mapa.isEmpty()}")

    //Provem les operacions del set mutable
    println("Contingut del set mutable: ${mapaM.toString()}")
    mapaM.put(77,"setanta-set");mapaM.put(77,"setanta-set repetit");
    mapaM.putIfAbsent(78,"setenta-vuit");mapaM.putIfAbsent(78,"setanta-vuit repetit");
    println("Nou contingut del set mutable: ${mapaM.toString()}")
    mapaM.remove(3)
    println("Nou contingut del set mutable: ${mapaM.toString()}")
    mapaM.replace(78,"seventy eight")
    println("Nou contingut del set mutable: ${mapaM.toString()}")
    mapaM[78] = "setenta y ocho"
    println("Nou contingut del set mutable: ${mapaM.toString()}")
    mapaM.clear()
    println("Nou contingut del set mutable: ${mapaM.toString()}")
    println("Està buit?: ${mapaM.isEmpty()}")

}
