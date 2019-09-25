package devmasterteam.com

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import devmasterteam.com.util.MotivationConstants
import devmasterteam.com.util.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splashctivity.*

class Splashctivity : AppCompatActivity(), View.OnClickListener {

    // instancia de uma SecurityPreferences com carregamento atrasado
    private lateinit var mSecurity: SecurityPreferences

    // funcao para o click
    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttonSave) {
            handleSave()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashctivity)

        mSecurity = SecurityPreferences(this)

        buttonSave.setOnClickListener(this)
    }


    // funcao que fara o save das informacoes.
    private fun handleSave() {
        val name = editName.text.toString()

        if (name.isNullOrEmpty()) {
            Toast.makeText(this, "Por favor informe seu nome", Toast.LENGTH_LONG).show()
        } else {
            mSecurity.storeString(MotivationConstants.KEY.PERSON_NAME, name)

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }
    }
}
