package br.com.dominandorecyclerview.model

data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
);

class EmailBuilder {
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build() : Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails() = listOf(
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais para vocÊ conseguir"
        preview = "Olá Artur, você precisa ver esse site para"
        date = "26 jun"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Um amigo quer que você curta uma página dele"
        preview = "Fulano convidou você para curtir sua página"
        date = "30 jun"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "Tiago Aguiar acabou de enviar um vídeo"
        preview = "Tiago Aguiar enviou ANDORID: GOOGLE MAPS, LOCATION"
        date = "26 jun"
        stared = true
        unread = true
    },
    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para vocÊ conseguir"
        preview = "Olá Artur, você precisa ver esse site para"
        date = "30 jun"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais para vocÊ conseguir"
        preview = "Olá Artur, você precisa ver esse site para"
        date = "26 jun"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Um amigo quer que você curta uma página dele"
        preview = "Fulano convidou você para curtir sua página"
        date = "30 jun"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "Tiago Aguiar acabou de enviar um vídeo"
        preview = "Tiago Aguiar enviou ANDORID: GOOGLE MAPS, LOCATION"
        date = "26 jun"
        stared = true
        unread = true
    },
    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para vocÊ conseguir"
        preview = "Olá Artur, você precisa ver esse site para"
        date = "30 jun"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais para vocÊ conseguir"
        preview = "Olá Artur, você precisa ver esse site para"
        date = "26 jun"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Um amigo quer que você curta uma página dele"
        preview = "Fulano convidou você para curtir sua página"
        date = "30 jun"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "Tiago Aguiar acabou de enviar um vídeo"
        preview = "Tiago Aguiar enviou ANDORID: GOOGLE MAPS, LOCATION"
        date = "26 jun"
        stared = true
        unread = true
    },
    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para vocÊ conseguir"
        preview = "Olá Artur, você precisa ver esse site para"
        date = "30 jun"
        stared = false
    }
)