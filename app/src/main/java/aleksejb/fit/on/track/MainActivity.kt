package aleksejb.fit.on.track

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import aleksejb.fit.on.track.theme.FitOnTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ConfigureEdgeToEdgeWindow()

            FitOnTrackTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    /**
     * Enables edge to edge support of this activity.
     *
     * If you'd like, you can override the default behavior of system bars by
     * customizing the parameters in the call to [enableEdgeToEdge].
     */
    @Composable
    private fun ConfigureEdgeToEdgeWindow() {
        DisposableEffect(Unit) {
            enableEdgeToEdge()
            onDispose {}
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
