package warriors

import gameplay.Team
import weapons.WeaponType
import weapons.Weapons
import kotlin.random.Random

class Soldier(team: Team, name: String) : AbstractWarrior() {
    override var name: String = name
    override var team: Team = team
    override var warriorType: WarriorType = WarriorType.soldier
    override val healthMax: Int = WarriorType.soldier.healthMax
    override var health = Random.nextInt(30, healthMax)
    override val chanceToDodge = 5
    override var aim = 60

    init {
        weapon = Weapons.createWeapon(WeaponType.makarov)
        weapon.reload()
        info()
    }
}