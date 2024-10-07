package br.unipar.atividadecorrecao

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tipoTransacao: Spinner = findViewById<Spinner>(R.id.spTipoTransacao)
        val valorTransacao = findViewById<EditText>(R.id.etValor)
        val descricaoTrasacao = findViewById<EditText>(R.id.etDescricao)
        val btnLancar = findViewById<Button>(R.id.btnLancar)
        val viewTransacao = findViewById<RecyclerView>(R.id.rcViewTransacao)

        viewTransacao.layoutManager = LinearLayoutManager(this)
        viewTransacao.adapter


        btnLancar.setOnClickListener{

            println("cliquei no botão")
            println(tipoTransacao.selectedItem.toString())

        }

    }
}