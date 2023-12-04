package warriors

import weapons.WeaponType
import weapons.Weapons
import kotlin.random.Random

class Soldier(team: String, name: String) : AbstractWarrior(team) {
    override var name: String = name
    override var warriorType: WarriorType = WarriorType.soldier
    override val healthMax: Int = WarriorType.soldier.healthMax
    override var health = Random.nextInt(50, healthMax)
    override val chanceToDodge = 50
    override var aim = 30

    init {
        weapon = Weapons.createWeapon(WeaponType.makarov)
        weapon.reload()
        info()
    }
}