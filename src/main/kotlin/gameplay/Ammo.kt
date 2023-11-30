package gameplay

enum class Ammo {
    BERETTA {
        val damage = 1
        val criticalDamageChance = 20
        val criticalDamageK = 5
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    UPS {
        val damage = 2
        val criticalDamageChance = 15
        val criticalDamageK = 8
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }

    },
    MAKAROV {
        val damage = 2
        val criticalDamageChance = 20
        val criticalDamageK = 8
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    MACHINEGUN {
        val damage = 10
        val criticalDamageChance = 20
        val criticalDamageK = 50
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    AK47 {
        val damage = 1
        val criticalDamageChance = 20
        val criticalDamageK = 5
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },
    M16 {
        val damage = 1
        val criticalDamageChance = 20
        val criticalDamageK = 5
        fun getDamage(): Int {
            var currentDamage = damage
            if (criticalDamageChance.chance()) currentDamage += damage * criticalDamageK
            return currentDamage
        }
    },

}