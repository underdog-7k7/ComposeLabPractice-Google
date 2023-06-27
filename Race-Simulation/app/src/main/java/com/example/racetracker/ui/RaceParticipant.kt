
package com.example.racetracker.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay
import kotlin.random.Random


class RaceParticipant(
    val name: String,
    val maxProgress: Int = 100,
    private val progressIncrement: Int = 1,
    private val initialProgress: Int = 0
) {
    var currentProgress by mutableStateOf(initialProgress)
        private set

    suspend fun run(){
        while (currentProgress < maxProgress) {
            delay( Random.nextLong(50L,1000L))
            currentProgress += progressIncrement
        }
    }
    init {
        require(maxProgress > 0) { "maxProgress=$maxProgress; must be > 0" }
        require(progressIncrement > 0) { "progressIncrement=$progressIncrement; must be > 0" }
    }




    fun reset() {
        currentProgress = 0
    }
}


val RaceParticipant.progressFactor: Float
    get() = currentProgress / maxProgress.toFloat()
