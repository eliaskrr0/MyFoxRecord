package eliaskrr.myfoxrecord.controlador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import eliaskrr.myfoxrecord.R
import eliaskrr.myfoxrecord.controlador.menu_principal.ActualizarActivity
import eliaskrr.myfoxrecord.controlador.menu_principal.BorrarActivity
import eliaskrr.myfoxrecord.controlador.menu_principal.MostrarActivity
import eliaskrr.myfoxrecord.controlador.menu_principal.RegistrarActivity


class MainActivity : AppCompatActivity() {

    private lateinit var btRegistrar: Button
    private lateinit var btMostrar: Button
    private lateinit var btActualizar: Button
    private lateinit var btBorrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btRegistrar = findViewById(R.id.btRegistrar)
        btMostrar = findViewById(R.id.btMostrar)
        btActualizar = findViewById(R.id.btActualizar)
        btBorrar = findViewById(R.id.btBorrar)

        btRegistrar.setOnClickListener {
            val abrirVista = Intent(this, RegistrarActivity::class.java)
            startActivity(abrirVista)
        }

        btMostrar.setOnClickListener {
            val abrirVista = Intent(this, MostrarActivity::class.java)
            startActivity(abrirVista)
        }

        btActualizar.setOnClickListener {
            val abrirVista = Intent(this, ActualizarActivity::class.java)
            startActivity(abrirVista)
        }

        btBorrar.setOnClickListener {
            val abrirVista = Intent(this, BorrarActivity::class.java)
            startActivity(abrirVista)
        }
    }
}