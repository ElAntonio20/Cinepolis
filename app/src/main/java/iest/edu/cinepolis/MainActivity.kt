package iest.edu.cinepolis

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private var cambioIcono : Boolean = false
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var ivLogo = findViewById<ImageView>(R.id.cara)
        ivLogo.setOnClickListener {
            var arregloImagenes = arrayOf<Int>(R.drawable.ant, R.drawable.lol)
            if(cambioIcono) {
                ivLogo.setImageResource(arregloImagenes[0])
            }else{
                ivLogo.setImageResource(arregloImagenes[1])
            }
            cambioIcono = !cambioIcono
            //ivLogo.setImageResource(R.drawable.descarga)
        }



        val salir = findViewById<TextView>(R.id.salir)
        salir.setOnClickListener {
            finish()
        }


        fun onItemSelected(adapterView: AdapterView<*>, view: View?, posicion: Int, l: Long) {
            val programa = adapterView.getItemAtPosition(posicion).toString()
            Snackbar.make(
                adapterView, "lO SENTIMOS SE HAN AGOTADO LAS ENTRADAS ",
                Snackbar.LENGTH_LONG
            ).show()
            if (posicion == 15:00 SUB) {
            } else if (posicion == 17:00 3D ESP)run {
                else if (posicion == 19:00 ESP){
            }
            }
        }


    }
}