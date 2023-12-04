package warriors

import weapons.WeaponType
import weapons.Weapons
import kotlin.random.Random

class General(team: String, name: String) : AbstractWarrior(team) {
    override var name: String = name
    override var warriorType: WarriorType = WarriorType.general
    override val healthMax: Int = WarriorType.general.healthMax
    override var health = Random.nextInt(200, healthMax)
    override val chanceToDodge = 90
    override var aim: Int = 80

    init {
        weapon = Weapons.createWeapon(WeaponType.ak47)
        weapon.reload()
        info()
    }
}
