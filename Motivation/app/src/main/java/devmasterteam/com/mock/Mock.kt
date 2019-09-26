package devmasterteam.com.mock

import devmasterteam.com.util.MotivationConstants

class Phrase(description: String, category: Int)

class Mock {
    private val ALL = MotivationConstants.PHRASE_FILTER.ALL
    private val SUN = MotivationConstants.PHRASE_FILTER.SUN
    private val HAPPY = MotivationConstants.PHRASE_FILTER.HAPPY


    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Não sabendo que era impossivel, foi la e fez.", HAPPY),
        Phrase("Você não é derrotado quando perde, voce é derrotado quando desiste.", HAPPY),
        Phrase("Quando está mais escuro, vemos mais estrelas!", HAPPY),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente", HAPPY),
        Phrase("não pare qunaod estiver cansado, pare quando estiver terminado", HAPPY),
        Phrase("o que voce pode fazer agora tem o maior impacto sobre o seu sucesso?", HAPPY),
        Phrase("a melhor maneira de prever o futuro é inventa-lo", SUN),
        Phrase("o que voce pode fazer agora que o tmaior imapcto sobre o seu sucesso?", SUN),
        Phrase("voce perde todas as chances que voce nao aproveita", SUN),
        Phrase("fracasso é o condimento que da sabor ao sucesso.", SUN),
        Phrase("enquanto nao estivermos comprometidos, havera histação", SUN),
        Phrase("Se voce nao saber onde quer ir, qualquer caminho serve", SUN),
        Phrase("se voce acredita, faz toda a diferenca", SUN),
        Phrase("Riscos devem ser corridos, porque o maior perigo é nao arriscar nada", SUN)

    )
}