package gameplay
import kotlin.random.Random

class Soldier(name: String): AbstractWarrior(){
    override var warriorType: WarriorType = WarriorType.soldier
    override val healthMax: Int = WarriorType.soldier.healthMax
    override var name: String = name
    init {
        health = Random.nextInt(20, healthMax)
        aim = Random.nextDouble(0.0, 0.9)
        weapon = Weapons.createWeapon(WeaponType.makarov)
        weapon.reload()
        info()
    }
}