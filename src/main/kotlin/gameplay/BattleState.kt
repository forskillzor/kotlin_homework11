package gameplay

sealed class BattleState {
    object Progress{}
    object VictoryFirstTeam{}
    object VictorySecondTeam{}
    object Draw{}
}
