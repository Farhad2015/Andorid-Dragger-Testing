package com.octaedge.daggersimpleproject.model

import javax.inject.Inject

class Players @Inject constructor() {

    fun getPlayersName(): String {
        return "Tamim Iqbal, Liton Das, Sakib Al Hasan, Soumya Sarkar, Mushfiqur Rahim, Mahmudullah, Saifuddin, Mashrafee, Mustafiz, Rubel, Taskin"
    }

}