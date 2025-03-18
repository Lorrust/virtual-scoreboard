package com.example.virtualscoreboard

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TeamScore(score: Score) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(top = 16.dp),
            text = score.teamName
        )
        Button(onClick = {
            score.teamScore += 1
            Log.d("teamScore", "Button +1 clicked: ${score.teamScore}")
        }) {
            Text(text = "+")
        }
        Text("${score.teamScore}")
        Button(onClick = {
            score.teamScore -= 1
            Log.d("teamScore", "Button -1 clicked: ${score.teamScore}")
        }) {
            Text(text = "-")
        }
    }
}

@Composable
fun ScoreView(team1: Score, team2: Score) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row (
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TeamScore(team1)
            TeamScore(team2)
        }
    }
}