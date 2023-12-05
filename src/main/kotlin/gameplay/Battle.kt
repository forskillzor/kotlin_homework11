package gameplay

import warriors.Warrior
import kotlin.random.Random

class Battle(
    val team1: Team,
    val team2: Team,
) {
    val state: BattleState = BattleState.Progress

    var isFinished = false

    fun getState() {
        state.getState()
        /* TODO get victory criterias
        GET STATE from BattleState
        Here is criterias
        Here is battle state
         */
    }

    fun next() {
        val warriors = team1
        val enemies = team2
        /* TODO(next iteration of battle)
        random warrior attack random enemy
         */
        randomAttack(warriors, enemies)
        update()
        getState()
    }

    fun randomAttack(warriors: Team, enemies: Team) {
        if(warriors.size == 1 || enemies.size == 1) {
            isFinished = true
            return
        }

        val warrior = warriors.getWarriorByIndex(Random.nextInt(0, warriors.size))
        val enemy = enemies.getWarriorByIndex(Random.nextInt(0, enemies.size))
        warrior.attack(enemy)
    }

    fun update() {
        team1.update()
        team2.update()

        if(team1.isDead || team2.isDead) {
            isFinished = true
        }
    }
}