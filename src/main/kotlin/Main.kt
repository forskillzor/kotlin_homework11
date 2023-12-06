import gameplay.Battle
import gameplay.BattleMode
import gameplay.Team

fun main() {

    val assault = Team("Assaults",3)
    val terrorist = Team("Terrorists", 3)

    val battle = Battle(assault, terrorist, battleMode = BattleMode.RandomAttack)

    while (!battle.isFinished) {
        battle.getState()
        battle.next()
    }

}