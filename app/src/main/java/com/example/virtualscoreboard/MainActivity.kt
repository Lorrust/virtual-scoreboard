package com.example.virtualscoreboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.virtualscoreboard.ui.theme.VirtualScoreboardTheme

@Preview(showBackground = true)
@Composable
fun TestScoreView() {
    val team1 = Score("Team 1", 0)
    val team2 = Score("Team 2", 0)
    ScoreView(team1, team2)
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val team1 = Score("Team 1", 0)
        val team2 = Score("Team 2", 0)

//        THE APP STARTS HERE (MAIN FUNCTION)
        setContent {
            ScoreView(team1, team2)
        }
    }
}