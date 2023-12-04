package warriors

interface Warrior {
    val isKilled: Boolean
    val chanceToDodge: Int
    fun attack(enemy: AbstractWarrior)
    fun getDamage(damage: Int)
}