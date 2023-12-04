package gameplay

enum class Ammo {
    PARABELLUM_9X19 {
        private val damage = 1
        private val criticalDamageChance = 20
        private val criticalDamageK = 5
        override fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    SW40_9x19 {
        private val damage = 2
        private val criticalDamageChance = 15
        private val criticalDamageK = 8
        override fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    PM_9x18 {
        private val damage = 1
        private val criticalDamageChance = 25
        private val criticalDamageK = 18
        override fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    AK_7_62 {
        private val damage = 5
        private val criticalDamageChance = 6
        private val criticalDamageK = 10
        override fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    M_5_56 {
        private val damage = 3
        private val criticalDamageChance = 3
        private val criticalDamageK = 5
        override fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    };
    abstract fun getDamage(): Int
}