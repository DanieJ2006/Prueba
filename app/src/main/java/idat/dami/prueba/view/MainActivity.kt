package idat.dami.prueba.view


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import idat.dami.prueba.R
import idat.dami.prueba.view.fragment.ListarConsignadosFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.consignadof, ListarConsignadosFragment()).commit()

    }
}