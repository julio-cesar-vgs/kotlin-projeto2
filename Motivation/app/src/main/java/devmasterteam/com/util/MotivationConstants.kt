package devmasterteam.com.util

/**
 * instancia que ira passar a chave para o shared
 */
class MotivationConstants private constructor() {
    object KEY {
        val PERSON_NAME = "personName"
    }

    object PHRASE_FILTER {
        val ALL = 1
        val SUN = 2
        val HAPPY = 3
    }
}