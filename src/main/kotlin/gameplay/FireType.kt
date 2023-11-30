package gameplay

sealed class FireType {
    object singleShoot{}
    data class burstShoot(val burstLength: Int) {}
}