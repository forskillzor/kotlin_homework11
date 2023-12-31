package utils

class Stack<T> {
    private val list = mutableListOf<T>()
    fun push(item: T) {
        list.add(item)
    }
    fun pop(): T? {
        if (!isEmpty()) {
            val last = list.lastIndex
            val result = list[last]
            list.removeAt(last)
            return result
        }
        return null
    }
    fun isEmpty(): Boolean{
        return list.size == 0
    }

    override fun toString(): String {
        return "Stack(list=$list)"
    }
    val size: Int
    get() = list.size
}