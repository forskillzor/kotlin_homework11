package gameplay

import utils.Stack

// TODO change abstract class to open class

open class AbstractWeapon {
    val ammoType: Ammo = Ammo.BERETTA
    val fireType: FireType = FireType.singleShoot
    protected val magazineSize: Int = 10
    protected var magazin: Stack<Ammo> = Stack()

    val isEmptyMagazin: Boolean
        get() = magazin.size == 0

    fun createBullet(): Ammo {
        return when (ammoType) {
            Ammo.BERETTA -> Ammo.BERETTA
            Ammo.UPS -> Ammo.UPS
            Ammo.MAKAROV -> Ammo.MAKAROV
            Ammo.MACHINEGUN -> Ammo.MACHINEGUN
            Ammo.AK47 -> Ammo.AK47
            Ammo.M16 -> Ammo.M16
        }
    }

    fun getBulletForShoot(): Ammo {
        return magazin.pop()
    }
    fun reload() {
        val newMagazin = Stack<Ammo>()
        for (ammo in 0 until magazineSize) {
            newMagazin.push(createBullet())
        }
        magazin = newMagazin
    }
}