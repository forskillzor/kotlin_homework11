package warriors

import gameplay.chance
import weapons.AbstractWeapon
import weapons.WeaponType
import weapons.Weapons

abstract class AbstractWarrior(
    val team: String
) : Warrior {
    abstract val name: String
    abstract var warriorType: WarriorType
    abstract val healthMax: Int
    abstract var health: Int
    abstract val aim: Int
    protected var weapon: AbstractWeapon = Weapons.createWeapon(WeaponType.makarov)

    fun info() {
        println("Комманда $team ${warriorType} по имени $name")
        println("Характеристики:")
        println("Здоровье: $health")
        println("Точность: $aim")
        println("Оружие: ${weapon.weaponType}")
        println()
    }

    override var isKilled: Boolean = false

    override fun attack(enemy: AbstractWarrior) {
        if ( this === enemy) {
            println("Нельзя стрелять в самого себя")
            return
        }

        println("$team ${warriorType}: ${name} стреляет из ${weapon.weaponType} в ${enemy.team} ${enemy.warriorType}а: ${enemy.name}")

        for (n in 1..weapon.fireType.numOfBullets) {
            val bullet = weapon.getBulletForShoot()
            if (bullet == null){
                weapon.reload()
                break
            }
            if (enemy.isKilled) break
            val damage = bullet.getDamage()
            if(aim.chance()) {
                enemy.getDamage(damage)
            } else {
                println("Промазал!")
            }
        }
    }

    override fun getDamage(damage: Int) {
        if (chanceToDodge.chance()) {
            println("$warriorType $name увернулся от выстрела!")
            return
        }
        else {
            health -= damage
            println("$warriorType $name получил урон: $damage")
        }
        if (health <= 0) {
            isKilled = true
            println("$warriorType $name убит!")
        }
    }
}