class AnimalsRepository constructor(private val appDataBaseMock: AppDataBaseMock) {

    fun getAll(): MutableList<Animals> {
        return appDataBaseMock.list
    }

    fun findById(id: Int): Animals? {
        return appDataBaseMock.list.find { it.id == id }
    }

    fun insert(animal: Animals): Unit {
        appDataBaseMock.list.add(animal)
    }

    fun delete(animal: Animals) {
        appDataBaseMock.list.remove(animal)
    }

    fun update(animal: Animals) {
        val animalF = findById(animal.id)
        if (animalF != null) {
            val index = appDataBaseMock.list.indexOf(animalF)
            appDataBaseMock.list[index] = animal
        }
    }
}