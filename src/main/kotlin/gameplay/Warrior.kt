package gameplay

interface Warrior {
    val isKilled: Boolean
    val escapeChance: Double
    fun attack(enemy: AbstractWarrior)
    fun getDamage(damage: Int)
}