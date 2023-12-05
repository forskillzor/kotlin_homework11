package warriors

import gameplay.chance
import weapons.AbstractWeapon
import weapons.WeaponType
import weapons.Weapons

abstract class AbstractWarrior(
) : Warrior {
    abstract val healthMax: Int
    abstract var health: Int
    abstract val aim: Int
    protected var weapon: AbstractWeapon = Weapons.createWeapon(WeaponType.makarov)

    fun info() {
        println("Комманда ${team.teamName} ${warriorType} по имени $name")
        println("Характеристики:")
        println("Здоровье: $health")
        println("Точность: $aim")
        println("Оружие: ${weapon.weaponType}")
        println()
    }

    override var isKilled: Boolean = false

    override fun attack(enemy: Warrior) {
        when {
            enemy === this -> println("Нельзя стрелять в самого себя")
//            enemy.isKilled -> return
        }

        println("$team ${warriorType}: ${name} стреляет из ${weapon.weaponType} в ${enemy.team.teamName} ${enemy.warriorType}а: ${enemy.name}")

        for (n in 1..weapon.fireType.numOfBullets) {
            val bullet = weapon.getBulletForShoot()
            when {
                bullet == null -> {
                    weapon.reload()
                    println("Перезаряжается!")
                    return
                }
            }
            val damage = bullet?.getDamage()
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
            team.killed(this)
            println("$warriorType $name убит!")
        }
    }
}