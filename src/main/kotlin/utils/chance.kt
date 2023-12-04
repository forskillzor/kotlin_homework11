package gameplay

import kotlin.random.Random

fun Int.chance(): Boolean {
    if (this > 100) {
        println("Number of chance must be from 0 to 100")
        return false
    }
    return Random.nextInt(1, 100) <= this
}