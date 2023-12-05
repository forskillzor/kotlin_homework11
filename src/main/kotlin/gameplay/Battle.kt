package gameplay

import warriors.Warrior
import kotlin.random.Random

class Battle(
    val team1: Team,
    val team2: Team
) {

    val removeCandidateTeam1 = mutableListOf<Warrior>()
    val removeCandidateTeam2 = mutableListOf<Warrior>()

    var isFinished = false

    fun getState() {
        /* TODO get victory criterias
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
        val warrior = Random.nextInt(0, warriors.size - 1)
        val enemy = Random.nextInt(0, enemies.size - 1)
    }

    fun update() {
        team1.update()
        team2.update()
    }

    fun kill(warrior: Warrior, enemy: Warrior) {
        warrior.attack(enemy)
    }
}