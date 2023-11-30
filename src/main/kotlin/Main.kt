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

}