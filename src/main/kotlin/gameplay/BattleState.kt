package gameplay

sealed class BattleState() {

    object Progress : BattleState() {
        override fun getState() {
//            println
        }
    }

    object VictoryFirstTeam : BattleState() {
        override fun getState() {
//            TODO("Not yet implemented")
        }
    }

    object VictorySecondTeam : BattleState() {
        override fun getState() {
//            TODO("Not yet implemented")
        }
    }

    object Draw : BattleState() {
        override fun getState() {
//            TODO("Not yet implemented")
        }
    }

    abstract fun getState()
}
