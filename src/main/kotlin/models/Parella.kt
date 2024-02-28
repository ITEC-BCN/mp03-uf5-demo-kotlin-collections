package models

class Parella<T> {
    private val primer: T
    private val segon: T

    constructor(primer: T, segon: T) {
        this.primer = primer
        this.segon = segon
    }

    public fun ajuntar(): T {
        var result: T
        when (primer) {
            is Int -> result = (primer + (segon as Int)) as T
            is Personatge -> {
                val p: T = (Personatge(primer.getNom() + " " + (segon as Personatge).getNom())) as T
                primer.neixerFill(p as Personatge)
                segon.neixerFill(p as Personatge)
                result = p
            }

            else -> throw (Exception("Tipus no vàlid"))
        }
        return result
    }
}
