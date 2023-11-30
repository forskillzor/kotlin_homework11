package gameplay

import utils.Stack

abstract class AbstractWeapon {
    abstract val magazineSize: Int
    abstract val fireType: FireType
    abstract val magazin: Stack<Ammo>
    val isEmptyMagazin: Boolean
        get() = magazin.size == 0

    abstract fun createBullet(): Ammo
    abstract fun getBulletForShoot()
    abstract fun reload()
}