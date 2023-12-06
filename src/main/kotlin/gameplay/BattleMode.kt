package gameplay

import kotlin.random.Random

sealed class BattleMode {
    object RandomAttack : BattleMode() {
        override fun attack(warriors: Team, enemies: Team) {
            val warrior = warriors.getWarriorByIndex(Random.nextInt(0, warriors.size))
            val enemy = enemies.getWarriorByIndex(Random.nextInt(0, enemies.size))
            warrior.attack(enemy)
        }
    }
    object RoundAttack : BattleMode() {
        override fun attack(warriors: Team, enemies: Team) {
            for (warrior in warriors) {
                for (enemy in enemies) {
                    if (enemy.isKilled)
                        continue
                    else {
                        warrior.attack(enemy)
                    }
                }
            }
        }
    }

    abstract fun attack(warriors: Team, enemies: Team)
}
