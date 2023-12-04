package gameplay

sealed class WeaponType {
    object beretta: WeaponType() {
        override fun toString(): String = "Beretta"
    }
    object ups: WeaponType() {
        override fun toString(): String = "HK UPS"
    }
    object makarov: WeaponType() {
        override fun toString(): String = "Makarov"
    }
    object m134: WeaponType() {
        override fun toString(): String = "M134 MachineGun"
    }
    object ak47: WeaponType() {
        override fun toString(): String = "AK-47"
    }
    object m16: WeaponType() {
        override fun toString(): String = "M-16"
    }
}
