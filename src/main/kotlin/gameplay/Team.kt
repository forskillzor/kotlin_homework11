package gameplay

import warriors.*
import kotlin.random.Random

class Team(
    public val teamName: String,
    size: Int
) {
    private val list = mutableListOf<Warrior>()
    val removeCandidates = mutableListOf<Warrior>()
    val generalChance = 10
    val captainChance = 40
    val size: Int
        get() = list.size
    val names = listOf<String>(
        "Сергей", "Антон", "Николай", "Михаил", "Алексей", "Александр", "Вячеслав", "Олег", "Анатолий",
        "Ярослав", "Андрей", "Константин", "Евгений", "Петр", "Глеб", "Яков", "Ильдар", "Ахмед",
    )

    init {
        for (i in 0 until size) {
            if (generalChance.chance()) {
                list.add(General(this, getVarName()))
                continue
            }
            if (captainChance.chance()) {
                list.add(Captain(this,getVarName()))
                continue
            }
            list.add(Soldier(this, getVarName()))
        }
    }

    private fun getVarName(): String {
        return names.get(Random.nextInt(0, names.size-1))
    }

    fun update() {
        list.removeAll(removeCandidates)
    }

    fun killed(warrior: Warrior) {
        removeCandidates.add(warrior)
    }
}