package gameplay

sealed class FireType {
    object singleShoot: FireType(){}
    data class BurstShoot(val burstLength: Int):FireType() {}
}