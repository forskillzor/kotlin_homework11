package gameplay

abstract class AbstractWarrior(
) : Warrior {
    abstract var warriorType: WarriorType
    abstract val name: String
    abstract val healthMax: Int

    protected var health: Int = 10
    protected var aim: Double = 0.3
    protected val probAvoidHit: Double = 0.2
    protected var weapon: AbstractWeapon = Weapons.createWeapon(WeaponType.makarov)

    init {
        weapon.reload()
    }

    fun info() {
        println("${warriorType} по имени $name")
        println("Характеристики:")
        println("Здоровье: $health")
        println("Точность: $aim")
        println("Оружие: ${weapon.weaponType}")
        println()
    }

    override var isKilled: Boolean = false
        get() = TODO("Not yet implemented")
    override val escapeChance: Double
        get() = TODO("Not yet implemented")

    // TODO redesign attack function for rigth logic
    override fun attack(enemy: AbstractWarrior) {
        if ( this === enemy) {
            println("Нельзя стрелять в самого себя")
            return
        }

        println("${warriorType}: ${name} стреляет из ${weapon.weaponType} в ${enemy.warriorType}а: ${enemy.name}")

        // TODO this block has wrong algorithm

        for (n in 1..weapon.fireType.numOfBullets) {
            val bullet = weapon.getBulletForShoot()
            if (bullet == null){
                weapon.reload()
                break
            }
            val damage = bullet.getDamage()
            enemy.getDamage(damage)
//            println("${warriorType}: ${name} стреляет из ${weapon.weaponType} в ${enemy.warriorType}а: ${enemy.name}")
        }
    }

    override fun getDamage(damage: Int) {
        health -= damage
        if (health <= 0)
            isKilled = true
    }
}