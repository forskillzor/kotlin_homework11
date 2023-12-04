package gameplay

sealed class WarriorType {
    object soldier : WarriorType(){
        override fun toString(): String = "Солдат"
        val healthMax = 100
    }
    object captain : WarriorType(){
        override fun toString(): String = "Капитан"
        val healthMax = 200
    }
    object general : WarriorType(){
        override fun toString(): String = "Генерал"
        val healthMax = 500
    }
}