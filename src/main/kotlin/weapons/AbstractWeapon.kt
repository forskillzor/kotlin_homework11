package weapons

import utils.Stack

abstract class AbstractWeapon {
    abstract protected val magazineSize: Int
    abstract protected val ammoType: Ammo
    abstract val fireType: FireType
    abstract val weaponType: WeaponType

    protected var magazine: Stack<Ammo> = Stack<Ammo>()

    val isEmptyMagazin: Boolean
        get() = magazine.isEmpty()

    fun createBullet(): Ammo {
        return when (ammoType) {
            Ammo.PARABELLUM_9X19 -> Ammo.PARABELLUM_9X19
            Ammo.SW40_9x19 -> Ammo.SW40_9x19
            Ammo.PM_9x18 -> Ammo.PM_9x18
            Ammo.AK_7_62 -> Ammo.AK_7_62
            Ammo.M_5_56 -> Ammo.M_5_56
        }
    }

    fun getBulletForShoot(): Ammo? {
        if (isEmptyMagazin) {
            return null
        } else {
            return magazine.pop()
        }
    }

    fun reload() {
        val newMagazin = Stack<Ammo>()
        for (ammo in 0 until magazineSize) {
            newMagazin.push(createBullet())
        }
        magazine = newMagazin
    }
}