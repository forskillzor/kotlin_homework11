package gameplay
import kotlin.random.Random

fun chance(): Boolean{
    return Random.nextInt(1, 10) == 1
}