package br.com.testefirebase.view.telaprincipal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.testefirebase.R
import br.com.testefirebase.databinding.ActivityTelaPrincipalBinding
import br.com.testefirebase.view.formlogin.FormLogin
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class TelaPrincipal : AppCompatActivity() {

    private lateinit var binding : ActivityTelaPrincipalBinding
    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTelaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btDeslogar.setOnClickListener {
            FirebaseAuth.getInstance().signOut()

            val intent = Intent(this, FormLogin::class.java)
            startActivity(intent)
            finish()
        }

        binding.btGravarDadosBD.setOnClickListener {

            val usuarioMap = hashMapOf(
                "nome" to "Artur",
                "sobrenome" to "Morais Brasileiro",
                "idade" to 20
            )

            db.collection("Usuários").document("Artur").set(usuarioMap)
                .addOnCompleteListener {
                    Log.d("db", "Sucesso ao salvar os dados do usuário!")
                }.addOnFailureListener {

                }
        }

        binding.btLerDadosBD.setOnClickListener {
            db.collection("Usuários").document("Artur")
                .addSnapshotListener { documento, error ->
                    if (documento != null) {
                        val idade = documento.getLong("idade")
                        binding.txtResultadoNome.text = documento.getString("nome")
                        binding.txtResultadoSobrenome.text = documento.getString("sobrenome")
                        binding.txtResultadoIdade.text = idade.toString()
                    }
            }
        }

        binding.btAtualizarDadosBD.setOnClickListener {
            db.collection("Usuários").document("Artur")
                .update("idade", 21).addOnCompleteListener {
                    Log.d("db_update", "Sucesso ao atualizar os dados do usuário!")
                }
        }

        binding.btDeletarDadosBD.setOnClickListener {
            db.collection("Usuários").document("Artur")
                .delete().addOnCompleteListener {
                    Log.d("db_delete", "Sucesso ao deletar os dados do usuário!")
                }
        }
    }
}