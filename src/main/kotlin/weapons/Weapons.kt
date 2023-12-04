package weapons

object Weapons {
    fun createWeapon(weapon: WeaponType): AbstractWeapon {
        return when (weapon) {
            WeaponType.beretta ->
                object : AbstractWeapon() {
                    override val magazineSize = 15
                    override val fireType = FireType.singleShoot
                    override val weaponType = WeaponType.beretta
                    override val ammoType = Ammo.PARABELLUM_9X19
                }
            WeaponType.ak47 ->
                object : AbstractWeapon() {
                    override val magazineSize: Int = 60
                    override val fireType: FireType = FireType.BurstShoot(10)
                    override val weaponType = WeaponType.ak47
                    override val ammoType = Ammo.AK_7_62
                }
            WeaponType.m16 ->
                object : AbstractWeapon() {
                    override val magazineSize: Int = 50
                    override val fireType: FireType = FireType.BurstShoot(10)
                    override val weaponType = WeaponType.m16
                    override val ammoType = Ammo.M_5_56
                }
            WeaponType.m134 ->
                object : AbstractWeapon() {
                    override val magazineSize: Int = 1500
                    override val fireType: FireType = FireType.BurstShoot(20)
                    override val weaponType = WeaponType.m134
                    override val ammoType = Ammo.AK_7_62
                }
            WeaponType.makarov ->
                object : AbstractWeapon() {
                    override val magazineSize: Int = 8
                    override val fireType: FireType = FireType.singleShoot
                    override val weaponType = WeaponType.makarov
                    override val ammoType = Ammo.PM_9x18
                }
            WeaponType.ups ->
                object : AbstractWeapon() {
                    override val magazineSize: Int = 60
                    override val fireType: FireType = FireType.singleShoot
                    override val weaponType = WeaponType.ups
                    override val ammoType = Ammo.SW40_9x19
                }
        }
    }
}