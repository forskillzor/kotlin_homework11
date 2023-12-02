package gameplay

import utils.Stack

object Weapons {
    fun createBeretta(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val magazineSize = 15
            fireType = FireType.BurstShoot(10)
            override val magazin: Stack<Ammo>
                get() = TODO("Not yet implemented")

            override fun createBullet(): Ammo {
                TODO("Not yet implemented")
            }

            override fun getBulletForShoot() {
                TODO("Not yet implemented")
            }

            override fun reload() {
                TODO("Not yet implemented")
            }
        }
    }
    fun createUPS() {}
    fun createAK47() {}
    fun createM16() {}
    fun createMachinegun() {}
    fun createMakarov() {}
}