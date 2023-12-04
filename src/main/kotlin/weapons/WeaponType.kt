package weapons

sealed class WeaponType {
    object beretta: WeaponType() {
        override fun toString(): String = "пистолет Beretta"
    }
    object ups: WeaponType() {
        override fun toString(): String = "пистолет HK UPS"
    }
    object makarov: WeaponType() {
        override fun toString(): String = "пистолет Makarov"
    }
    object m134: WeaponType() {
        override fun toString(): String = "пулемет M134 MachineGun"
    }
    object ak47: WeaponType() {
        override fun toString(): String = "автомат AK-47"
    }
    object m16: WeaponType() {
        override fun toString(): String = "автомат M-16"
    }
}
