package gameplay

sealed class FireType {
    object singleShoot : FireType() {
        override val numOfBullets: Int = 1
    }
    data class BurstShoot(val burstLength: Int) : FireType() {
        override val numOfBullets: Int = burstLength
    }

    abstract val numOfBullets: Int
    fun numberOfBullets(): Int {return numOfBullets}
}