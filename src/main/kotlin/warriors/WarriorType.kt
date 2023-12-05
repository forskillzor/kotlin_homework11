package warriors

sealed class WarriorType {
    object soldier : WarriorType(){
        override fun toString(): String = "Солдат"
        val healthMax = 50
    }
    object captain : WarriorType(){
        override fun toString(): String = "Капитан"
        val healthMax = 80
    }
    object general : WarriorType(){
        override fun toString(): String = "Генерал"
        val healthMax = 100
    }
}