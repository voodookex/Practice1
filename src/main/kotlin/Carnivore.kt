class Carnivore(id: Int, name: String, limbsСount: Int, classification: String, val hunter: Boolean) :
    Animals(id, name, limbsСount, classification) {

    override fun toString(): String {
        return "Animal(id=$id, name='$name', limbsСount=$limbsСount, classification=$classification, classification=$classification, hunter=$hunter)"
    }
}