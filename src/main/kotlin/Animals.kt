open class Animals(val id: Int, var name: String, var limbsСount: Int, val classification: String) {

    fun nameUpper(): String {
        return name.uppercase()
    }

    override fun toString(): String {
        return "Animal(id=$id, name='$name', limbsСount=$limbsСount, classification=$classification)"
    }
}
