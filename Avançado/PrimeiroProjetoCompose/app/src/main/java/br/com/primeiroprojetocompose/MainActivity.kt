package br.com.primeiroprojetocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.primeiroprojetocompose.ui.theme.PrimeiroProjetoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeiroProjetoComposeTheme {
                PrimeiraTela()
            }
        }
    }

    @Composable
    fun PrimeiraTela() {
        Column() {
            Text(
                text = "Hello World!"
            )

            Text(
                text = "Artur Brasileiro"
            )

            Row {
                Text(
                    text = "Hello World!"
                )

                Text(
                    text = "Artur Brasileiro"
                )
            }
        }
    }

    @Preview
    @Composable
    fun PrimeiraTelaPreview() {
        PrimeiraTela()
    }    
}

