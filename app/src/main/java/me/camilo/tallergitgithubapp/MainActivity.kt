package me.camilo.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.camilo.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Targeta()

            }
        }
    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Targeta(){
    Column(modifier = Modifier.fillMaxSize().padding(30.dp), horizontalAlignment = Alignment.CenterHorizontally ) {
        val painter = painterResource(id = R.drawable.petro)

        Image(
            painter = painterResource(id = R.drawable.petro), contentDescription = "presidente",
            modifier = Modifier
                .clip(CircleShape)
                .size(120.dp)
        )
        Text( modifier = Modifier.padding(top = 25.dp, bottom = 5.dp),
            text = "Juan Perez",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

        Text( modifier = Modifier.padding(top = 0.dp, bottom = 20.dp),
            text = "Desarrollador Movil Jr.",
            fontSize = 20.sp,
            color = Color.Blue
        )

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 8.dp),
            thickness = 1.dp,
            color = Color.Gray
        )

        Text( modifier = Modifier.fillMaxWidth().padding(top = 2.dp),
            text = "Edad",
            fontSize = 20.sp,
            color = Color.LightGray,
            textAlign = TextAlign.Start
        )

        Text( modifier = Modifier.fillMaxWidth().padding(top = 3.dp),
            text = "20 años",
            fontSize = 19.sp,
            color = Color.Black,
            textAlign = TextAlign.Start
        )

        Text( modifier = Modifier.fillMaxWidth().padding(top = 3.dp),
            text = "Correo",
            fontSize = 20.sp,
            color = Color.LightGray,
            textAlign = TextAlign.Start
        )

        Text( modifier = Modifier.fillMaxWidth().padding(top = 3.dp),
            text = "calderoncamilo905@gmail.com",
            fontSize = 19.sp,
            color = Color.Blue,
            textAlign = TextAlign.Start,
        )

        Text( modifier = Modifier.fillMaxWidth().padding(top = 3.dp),
            text = "Ciudad",
            fontSize = 20.sp,
            color = Color.LightGray,
            textAlign = TextAlign.Start
        )

        Text( modifier = Modifier.fillMaxWidth().padding(top = 3.dp),
            text = "Bucaramanga, Colombia",
            fontSize = 19.sp,
            color = Color.Black,
            textAlign = TextAlign.Start
        )

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 8.dp),
            thickness = 1.dp,
            color = Color.Gray
        )







    }



}
