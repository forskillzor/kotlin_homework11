package warriors

import weapons.WeaponType
import weapons.Weapons
import kotlin.random.Random

class Captain(team: String, name: String) : AbstractWarrior(team) {
    override var name: String = name
    override var warriorType: WarriorType = WarriorType.captain
    override val healthMax: Int = WarriorType.captain.healthMax
    override var health = Random.nextInt(100, healthMax)
    override val chanceToDodge = 70
    override val aim = 70

    init {
        weapon = Weapons.createWeapon(WeaponType.ups)
        weapon.reload()
        info()
    }
}
