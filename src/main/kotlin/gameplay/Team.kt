package gameplay

import warriors.Captain
import warriors.General
import warriors.Soldier
import warriors.Warrior
import kotlin.random.Random

class Team(
    val teamName: String,
    size: Int
) {
    val list = mutableListOf<Warrior>()
    val generalChance = 10
    val captainChance = 40
    val names = listOf<String>(
        "Сергей", "Антон", "Николай", "Михаил", "Алексей", "Александр", "Вячеслав", "Олег", "Анатолий",
        "Ярослав", "Андрей", "Константин", "Евгений", "Петр", "Глеб", "Яков", "Ильдар", "Ахмед",
    )

    init {
        for (i in 0 until size) {
            if (generalChance.chance()) {
                list.add(General(teamName, getVarName()))
                continue
            }
            if (captainChance.chance()) {
                list.add(Captain(teamName,getVarName()))
                continue
            }
            list.add(Soldier(teamName, getVarName()))
        }
    }

    fun getVarName(): String {
        return names.get(Random.nextInt(0, names.size-1))
    }
}