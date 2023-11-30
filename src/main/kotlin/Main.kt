import gameplay.Weapons
import utils.Stack

fun main() {
    println("Hello World!!!")

    val stack = Stack<Int>()

    println(stack)

    println("Stack is empty: ${stack.isEmpty()}")

    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.push(5)

    println(stack)

    println("Stack is empty: ${stack.isEmpty()}")

    val value1 = stack.pop()

    println("$stack, stack pop=$value1")

    val value2 = stack.pop()

    println("$stack, stack pop=$value2")

    val beretta = Weapons.createBeretta()
    val ups = Weapons.createUPS()
    val makarov = Weapons.createMakarov()
    val m16 = Weapons.createM16()
    val machinegun = Weapons.createMachinegun()
    val ak47 = Weapons.createAK47()
}