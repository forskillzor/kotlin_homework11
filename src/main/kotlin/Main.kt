import gameplay.Battle
import gameplay.Team

fun main() {

    val assault = Team("Assaults",20)
    val terrorist = Team("Terrorists", 20)

    val battle = Battle(assault, terrorist)

    while (!battle.isFinished) {
        battle.getState()
        battle.next()
    }

}