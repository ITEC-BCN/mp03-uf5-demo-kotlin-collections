package models

class Personatge {
    private val nom: String
    private val fills: MutableList<Personatge>

    constructor(nom: String) {
        this.nom = nom
        fills = mutableListOf<Personatge>()
    }

    public fun getNom(): String {
        return this.nom
    }

    public fun getFills(): MutableList<Personatge> {
        return this.fills
    }

    public fun neixerFill(fill: Personatge) {
        fills.add(fill)
    }
}