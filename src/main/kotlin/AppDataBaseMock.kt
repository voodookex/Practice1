import kotlin.random.Random

class AppDataBaseMock {
    val list = mutableListOf<Animals>()

    init {
        for (i in 0..10) {
            val animal = Animals(
                id = i,
                name = "name$i",
                limbsСount = Random.nextInt(8),
                classification = if (Random.nextBoolean()) "Carnivore" else "Herbivorous"
            )
            list.add(animal)
        }
    }
}