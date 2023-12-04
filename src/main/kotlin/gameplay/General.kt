package gameplay
import kotlin.random.Random

class General(name: String): AbstractWarrior(){
    override var warriorType: WarriorType = WarriorType.general
    override val healthMax: Int = WarriorType.general.healthMax
    override var name: String = name
    init {
        health = Random.nextInt(200, healthMax)
        aim = Random.nextDouble(0.0, 0.9)
        weapon = Weapons.createWeapon(WeaponType.ak47)
        weapon.reload()
        info()
    }
}
