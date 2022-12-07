fun main(args: Array<String>) {

    val cat = Carnivore(0, "Felix", 4, "carnivore", true)
    val dog = Carnivore(1, "Tuzik", 4, "carnivore", true)
    val kow = Herbivorous(2, "Murka", 4, "herbivorous", true)
    val rabbit = Herbivorous(3, "Flash", 4, "herbivorous", true)

    val list = mutableListOf<Animals>()
    list.add(cat)
    list.add(dog)
    list.add(kow)
    list.add(rabbit)

    for (animal in list) {
        println(animal)
    }
}