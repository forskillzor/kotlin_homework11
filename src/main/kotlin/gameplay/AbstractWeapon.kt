package gameplay
import utils.Stack

abstract class AbstractWeapon {
    abstract val magazineSize: Int
    abstract val fireType: FireType
    abstract val magazin: Stack<Ammo>
    abstract val isEmptyMagazin: Boolean

    abstract fun reload()
    abstract fun createBullet(): Ammo
    abstract fun getBulletForShoot()
}