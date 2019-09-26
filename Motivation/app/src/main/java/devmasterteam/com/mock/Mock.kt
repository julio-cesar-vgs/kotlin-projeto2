package devmasterteam.com.mock

import devmasterteam.com.util.MotivationConstants
import java.util.*


class Phrase(val description: String, val category: Int)

/**
 * extensions class
 */
fun Int.random() = Random().nextInt(this)

class Mock {
    private val ALL = MotivationConstants.PHRASE_FILTER.ALL
    private val SUN = MotivationConstants.PHRASE_FILTER.SUN
    private val HAPPY = MotivationConstants.PHRASE_FILTER.HAPPY

    /**
     * Lista de frases
     */
    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Não sabendo que era impossivel, foi la e fez.", HAPPY),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste.", HAPPY),
        Phrase("Quando está mais escuro, vemos mais estrelas!", HAPPY),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente", HAPPY),
        Phrase("Não pare quando estiver cansado, pare quando estiver terminado", HAPPY),
        Phrase("O que você pode fazer agora tem o maior impacto sobre o seu sucesso?", HAPPY),
        Phrase("A melhor maneira de prever o futuro é inventa-lo", SUN),
        Phrase("O que você pode fazer agora que o tmaior imapcto sobre o seu sucesso?", SUN),
        Phrase("Você perde todas as chances que você não aproveita", SUN),
        Phrase("Fracasso é o condimento que da sabor ao sucesso.", SUN),
        Phrase("Enquanto não estivermos comprometidos, havera histação", SUN),
        Phrase("Se você não saber onde quer ir, qualquer caminho serve", SUN),
        Phrase("Se você acredita, faz toda a diferenca", SUN),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada", SUN)
    )

    /**
     * Funcao que traz as frases de forma randomica
     */
    fun getPhrase(value: Int): String {
        val filtered = mListPhrases.filter { it -> (it.category == value || value == ALL) }
        val random = (filtered.size.random())

        return filtered[random].description
    }
}