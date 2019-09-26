package devmasterteam.com.util

import android.content.Context
import android.content.SharedPreferences


/**
 * Classe responsavel por guardar as informacoes do usuario
 * @param passando um conexto como parametro
 */
class SecurityPreferences(context: Context) {

    // instancia que vai guardar uma chave e um formato para ser chamado.
    private val mSharedPreferences: SharedPreferences = context
        .getSharedPreferences("motivation", Context.MODE_PRIVATE)


    //funcao que vai guardar as informacoes que vamos passar, por uma chave  e valor
    fun storeString(key: String, value: String) {
        mSharedPreferences.edit().putString(key, value).apply()
    }


    // funcao que vai recuperar as informacoes passadas para o usuario
    fun getStoredString(key: String): String {
        return mSharedPreferences.getString(key, "") ?: ""
    }
}