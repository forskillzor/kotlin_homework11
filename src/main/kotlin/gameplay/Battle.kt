package gameplay

import warriors.Warrior
import kotlin.random.Random

class Battle(
    private val team1: Team,
    private val team2: Team,
) {
    private var state: BattleState = BattleState.Progress

    enum class AttackOrder { TEAM1, TEAM2 }

    var attackOrder: AttackOrder = AttackOrder.TEAM1
    var warriors = team1
    var enemies = team2

    var isFinished = false

    private fun changeAttackOrder() {
        when (attackOrder) {
            AttackOrder.TEAM1 -> {
                warriors = team1
                enemies = team2
                attackOrder = AttackOrder.TEAM2
            }
            AttackOrder.TEAM2 -> {
                warriors = team2
                enemies = team1
                attackOrder = AttackOrder.TEAM1
            }
        }
    }

    private fun changeState(state: String) {
        when (state) {
            "progress" -> {
                this.state = BattleState.Progress
            }
            "victory 1 team" -> {
                this.state = BattleState.VictoryFirstTeam
            }
            "victory 2 team" -> {
                this.state = BattleState.VictorySecondTeam
            }
            "draw" -> {
                this.state = BattleState.Draw
            }
        }
    }

    private fun randomAttack(warriors: Team, enemies: Team) {
        if (warriors.size == 1 || enemies.size == 1) {
            isFinished = true
            return
        }

        val warrior = warriors.getWarriorByIndex(Random.nextInt(0, warriors.size))
        val enemy = enemies.getWarriorByIndex(Random.nextInt(0, enemies.size))
        warrior.attack(enemy)
    }

    fun getState() {
        state.getState()
    }

    fun next() {
        randomAttack(warriors, enemies)
        update()
        getState()
        changeAttackOrder()
    }

    fun update() {
        team1.update()
        team2.update()

        if (team2.isDead) {
            isFinished = true
            changeState("victory 1 team")
        }
        if (team1.isDead) {
            isFinished = true
            changeState("victory 2 team")
        }
    }
}