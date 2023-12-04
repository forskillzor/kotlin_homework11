package gameplay

import utils.Stack

open class AbstractWeapon {
    protected open val magazineSize: Int = 10
    open val fireType: FireType = FireType.singleShoot
    // TODO protected magazin
    var magazin: Stack<Ammo> = Stack()
    open val weaponType: WeaponType = WeaponType.beretta
    protected open val ammoType: Ammo = Ammo.PARABELLUM_9X19

    val isEmptyMagazin: Boolean
        get() = magazin.isEmpty()

    fun createBullet(): Ammo {
        return when (ammoType) {
            Ammo.PARABELLUM_9X19 -> Ammo.PARABELLUM_9X19
            Ammo.SW40_9x19 -> Ammo.SW40_9x19
            Ammo.PM_9x18 -> Ammo.PM_9x18
            Ammo.AK_7_62 -> Ammo.AK_7_62
            Ammo.M_5_56 -> Ammo.M_5_56
        }
    }

    fun getBulletForShoot(): Ammo?{
        if (isEmptyMagazin) {
            return null
        } else {
            return magazin.pop()
        }
    }
    fun reload() {
        val newMagazin = Stack<Ammo>()
        for (ammo in 0 until magazineSize) {
            newMagazin.push(createBullet())
        }
        magazin = newMagazin
    }
}