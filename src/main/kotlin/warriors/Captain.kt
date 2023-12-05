package warriors

import gameplay.Team
import weapons.WeaponType
import weapons.Weapons
import kotlin.random.Random

class Captain(team: Team, name: String) : AbstractWarrior() {
    override var name: String = name
    override var team: Team = team
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
