package warriors

import gameplay.Team

interface Warrior {
    val isKilled: Boolean
    val chanceToDodge: Int
    val name: String
    var team: Team
    val warriorType: WarriorType
    fun attack(enemy: Warrior)
    fun getDamage(damage: Int)
}