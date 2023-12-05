package weapons

import gameplay.chance

enum class Ammo {
    PARABELLUM_9X19 {
        private val damage = 10
        private val criticalDamageChance = 10
        private val criticalDamageK = 5
        override fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    SW40_9x19 {
        private val damage = 15
        private val criticalDamageChance = 15
        private val criticalDamageK = 8
        override fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    PM_9x18 {
        private val damage = 10
        private val criticalDamageChance = 10
        private val criticalDamageK = 5
        override fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    AK_7_62 {
        private val damage = 25
        private val criticalDamageChance = 5
        private val criticalDamageK = 5
        override fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    M_5_56 {
        private val damage = 20
        private val criticalDamageChance = 15
        private val criticalDamageK = 3
        override fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    };
    abstract fun getDamage(): Int
}