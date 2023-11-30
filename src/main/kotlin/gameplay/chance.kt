package gameplay
import kotlin.random.Random

fun Int.chance(): Boolean{
    // need arg % probability and return boolean
    return Random.nextInt(1, this) == 1
}