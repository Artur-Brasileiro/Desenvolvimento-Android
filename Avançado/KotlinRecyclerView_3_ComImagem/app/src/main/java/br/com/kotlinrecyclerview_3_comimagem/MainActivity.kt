package br.com.kotlinrecyclerview_3_comimagem

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.kotlinrecyclerview_3_comimagem.model.Pessoa

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val items = listOf<Pessoa>(
            Pessoa("Artur Morais Brasileiro", "000.000.000-00", "21/04/2004", "https://i.pinimg.com/originals/4e/45/88/4e458893b1fdc033508016e09fa5553c.jpg"),
            Pessoa("Enzo Morais Brasileiro", "000.000.000-00", "30/08/2012", "https://img.freepik.com/fotos-gratis/pessoa-de-origem-indiana-se-divertindo_23-2150285283.jpg?w=360&t=st=1716845443~exp=1716846043~hmac=84619b946356be06ce03f70dcfe65c457a01b8ac4b60458c96b70c87e5df8361"),
            Pessoa("Fulano Augusto Medeiros", "000.000.000-00", "27/03/2000", "https://img.freepik.com/psd-premium/uma-mulher-com-uma-jaqueta-rosa-no-peito-esta-em-frente-a-uma-grade-com-as-palavras-a-marca_176841-37276.jpg?w=740"),
            Pessoa("Victor Hugo de Alencar Moraes", "000.000.000-00", "19/09/1996", "https://img.freepik.com/fotos-gratis/designer-trabalhando-no-modelo-3d_23-2149371896.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Daniel Lima Goncalves", "000.000.000-00", "05/01/2002", "https://img.freepik.com/fotos-gratis/homem-caucasiano-bonito-vestindo-roupas-casuais-e-oculos-com-um-sorriso-feliz-e-legal-no-rosto-pessoa-sortuda_839833-12772.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Pedro de Souza Cruz", "000.000.000-00", "10/05/1975", "https://img.freepik.com/psd-premium/uma-mulher-com-cabelos-cacheados-segura-um-laptop-em-frente-a-um-fundo-verde_176841-36656.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Thalys Jacinto Pinto", "000.000.000-00", "20/02/2009", "https://img.freepik.com/psd-premium/latina-empatica-paralegal-cabelo-encaracolado-meia-idade-inclinada-para-a-frente-pose-em-verde-pastel_410516-137271.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Ciclano de Nao Sei o Que", "000.000.000-00", "14/07/1993", "https://img.freepik.com/psd-premium/um-homem-de-oculos-e-camisa-azul-esta-em-frente-ao-logotipo-de-uma-empresa_176841-36892.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Artur Morais Brasileiro", "000.000.000-00", "21/04/2004", "https://i.pinimg.com/originals/4e/45/88/4e458893b1fdc033508016e09fa5553c.jpg"),
            Pessoa("Enzo Morais Brasileiro", "000.000.000-00", "30/08/2012", "https://img.freepik.com/fotos-gratis/pessoa-de-origem-indiana-se-divertindo_23-2150285283.jpg?w=360&t=st=1716845443~exp=1716846043~hmac=84619b946356be06ce03f70dcfe65c457a01b8ac4b60458c96b70c87e5df8361"),
            Pessoa("Fulano Augusto Medeiros", "000.000.000-00", "27/03/2000", "https://img.freepik.com/psd-premium/uma-mulher-com-uma-jaqueta-rosa-no-peito-esta-em-frente-a-uma-grade-com-as-palavras-a-marca_176841-37276.jpg?w=740"),
            Pessoa("Victor Hugo de Alencar Moraes", "000.000.000-00", "19/09/1996", "https://img.freepik.com/fotos-gratis/designer-trabalhando-no-modelo-3d_23-2149371896.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Daniel Lima Goncalves", "000.000.000-00", "05/01/2002", "https://img.freepik.com/fotos-gratis/homem-caucasiano-bonito-vestindo-roupas-casuais-e-oculos-com-um-sorriso-feliz-e-legal-no-rosto-pessoa-sortuda_839833-12772.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Pedro de Souza Cruz", "000.000.000-00", "10/05/1975", "https://img.freepik.com/psd-premium/uma-mulher-com-cabelos-cacheados-segura-um-laptop-em-frente-a-um-fundo-verde_176841-36656.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Thalys Jacinto Pinto", "000.000.000-00", "20/02/2009", "https://img.freepik.com/psd-premium/latina-empatica-paralegal-cabelo-encaracolado-meia-idade-inclinada-para-a-frente-pose-em-verde-pastel_410516-137271.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Ciclano de Nao Sei o Que", "000.000.000-00", "14/07/1993", "https://img.freepik.com/psd-premium/um-homem-de-oculos-e-camisa-azul-esta-em-frente-ao-logotipo-de-uma-empresa_176841-36892.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Artur Morais Brasileiro", "000.000.000-00", "21/04/2004", "https://i.pinimg.com/originals/4e/45/88/4e458893b1fdc033508016e09fa5553c.jpg"),
            Pessoa("Enzo Morais Brasileiro", "000.000.000-00", "30/08/2012", "https://img.freepik.com/fotos-gratis/pessoa-de-origem-indiana-se-divertindo_23-2150285283.jpg?w=360&t=st=1716845443~exp=1716846043~hmac=84619b946356be06ce03f70dcfe65c457a01b8ac4b60458c96b70c87e5df8361"),
            Pessoa("Fulano Augusto Medeiros", "000.000.000-00", "27/03/2000", "https://img.freepik.com/psd-premium/uma-mulher-com-uma-jaqueta-rosa-no-peito-esta-em-frente-a-uma-grade-com-as-palavras-a-marca_176841-37276.jpg?w=740"),
            Pessoa("Victor Hugo de Alencar Moraes", "000.000.000-00", "19/09/1996", "https://img.freepik.com/fotos-gratis/designer-trabalhando-no-modelo-3d_23-2149371896.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Daniel Lima Goncalves", "000.000.000-00", "05/01/2002", "https://img.freepik.com/fotos-gratis/homem-caucasiano-bonito-vestindo-roupas-casuais-e-oculos-com-um-sorriso-feliz-e-legal-no-rosto-pessoa-sortuda_839833-12772.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Pedro de Souza Cruz", "000.000.000-00", "10/05/1975", "https://img.freepik.com/psd-premium/uma-mulher-com-cabelos-cacheados-segura-um-laptop-em-frente-a-um-fundo-verde_176841-36656.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Thalys Jacinto Pinto", "000.000.000-00", "20/02/2009", "https://img.freepik.com/psd-premium/latina-empatica-paralegal-cabelo-encaracolado-meia-idade-inclinada-para-a-frente-pose-em-verde-pastel_410516-137271.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Ciclano de Nao Sei o Que", "000.000.000-00", "14/07/1993", "https://img.freepik.com/psd-premium/um-homem-de-oculos-e-camisa-azul-esta-em-frente-ao-logotipo-de-uma-empresa_176841-36892.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Artur Morais Brasileiro", "000.000.000-00", "21/04/2004", "https://i.pinimg.com/originals/4e/45/88/4e458893b1fdc033508016e09fa5553c.jpg"),
            Pessoa("Enzo Morais Brasileiro", "000.000.000-00", "30/08/2012", "https://img.freepik.com/fotos-gratis/pessoa-de-origem-indiana-se-divertindo_23-2150285283.jpg?w=360&t=st=1716845443~exp=1716846043~hmac=84619b946356be06ce03f70dcfe65c457a01b8ac4b60458c96b70c87e5df8361"),
            Pessoa("Fulano Augusto Medeiros", "000.000.000-00", "27/03/2000", "https://img.freepik.com/psd-premium/uma-mulher-com-uma-jaqueta-rosa-no-peito-esta-em-frente-a-uma-grade-com-as-palavras-a-marca_176841-37276.jpg?w=740"),
            Pessoa("Victor Hugo de Alencar Moraes", "000.000.000-00", "19/09/1996", "https://img.freepik.com/fotos-gratis/designer-trabalhando-no-modelo-3d_23-2149371896.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Daniel Lima Goncalves", "000.000.000-00", "05/01/2002", "https://img.freepik.com/fotos-gratis/homem-caucasiano-bonito-vestindo-roupas-casuais-e-oculos-com-um-sorriso-feliz-e-legal-no-rosto-pessoa-sortuda_839833-12772.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Pedro de Souza Cruz", "000.000.000-00", "10/05/1975", "https://img.freepik.com/psd-premium/uma-mulher-com-cabelos-cacheados-segura-um-laptop-em-frente-a-um-fundo-verde_176841-36656.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Thalys Jacinto Pinto", "000.000.000-00", "20/02/2009", "https://img.freepik.com/psd-premium/latina-empatica-paralegal-cabelo-encaracolado-meia-idade-inclinada-para-a-frente-pose-em-verde-pastel_410516-137271.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph"),
            Pessoa("Ciclano de Nao Sei o Que", "000.000.000-00", "14/07/1993", "https://img.freepik.com/psd-premium/um-homem-de-oculos-e-camisa-azul-esta-em-frente-ao-logotipo-de-uma-empresa_176841-36892.jpg?size=626&ext=jpg&ga=GA1.1.1126143189.1716845401&semt=sph")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PessoaAdapter(items)
    }
}