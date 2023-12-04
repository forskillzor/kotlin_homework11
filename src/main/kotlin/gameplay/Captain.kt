package gameplay
import kotlin.random.Random

class Captain(name: String): AbstractWarrior(){
    override var warriorType: WarriorType = WarriorType.captain
    override val healthMax: Int = WarriorType.captain.healthMax
    override var name: String = name
    init {
        health = Random.nextInt(100, healthMax)
        aim = Random.nextDouble(0.0, 0.9)
        weapon = Weapons.createWeapon(WeaponType.ups)
        weapon.reload()
        info()
    }
}
