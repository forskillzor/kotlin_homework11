package warriors

import gameplay.Team
import weapons.WeaponType
import weapons.Weapons
import kotlin.random.Random

class General(team: Team, name: String) : AbstractWarrior() {
    override var name: String = name
    override var team: Team = team
    override var warriorType: WarriorType = WarriorType.general
    override val healthMax: Int = WarriorType.general.healthMax
    override var health = Random.nextInt(80, healthMax)
    override val chanceToDodge = 50
    override var aim: Int = 95

    init {
        weapon = Weapons.createWeapon(WeaponType.ak47)
        weapon.reload()
        info()
    }
}
