package models

class Alumne : Comparable<Alumne> {
    private var nom: String
    private var edat: Int = 0

    constructor(nom: String, edat: Int) {
        this.nom = nom
        this.edat = edat
    }

    override fun toString(): String {
        return "Alumne(nom='$nom', edat=$edat)"
    }

    override fun compareTo(other: Alumne): Int {
        var result: Int

        if (this.edat != other.edat)
            result = this.edat - other.edat
        else
            result = this.nom.compareTo(other.nom)

        return result
    }
}