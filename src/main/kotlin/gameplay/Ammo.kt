package gameplay

enum class Ammo {
    BERETTA {
        private val damage = 1
        private val criticalDamageChance = 20
        private val criticalDamageK = 5
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    UPS {
        private val damage = 2
        private val criticalDamageChance = 15
        private val criticalDamageK = 8
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }

    },
    MAKAROV {
        private val damage = 2
        private val criticalDamageChance = 20
        private val criticalDamageK = 8
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    MACHINEGUN {
        private val damage = 10
        private val criticalDamageChance = 20
        private val criticalDamageK = 50
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    AK47 {
        private val damage = 1
        private val criticalDamageChance = 20
        private val criticalDamageK = 5
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    M16 {
        private val damage = 1
        private val criticalDamageChance = 20
        private val criticalDamageK = 5
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },

}