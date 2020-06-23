package com.octaedge.daggersimpleproject.model

import javax.inject.Inject

class BangladeshCricketTeam @Inject constructor(val players: Players) {

    fun getMyBestEleven() : String = players.getPlayersName()

}