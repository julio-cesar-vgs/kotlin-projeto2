package devmasterteam.com.views

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import devmasterteam.com.R
import devmasterteam.com.mock.Mock
import devmasterteam.com.util.MotivationConstants
import devmasterteam.com.util.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // declaracao inicial da variavel trazendo o all
    private var mFilter = MotivationConstants.PHRASE_FILTER.ALL
    //faz a instancia tardia do securityPreferencas
    private lateinit var mSecurityPreferences: SecurityPreferences

    private val mMock = Mock()

    //cria a primeira tela.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //faz a instancia de um novo contexto
        mSecurityPreferences = SecurityPreferences(this)

        /**
         * setta o evento
         */
        setListeners()

        //Inicializa
        handleFilter(R.id.imageAll)
        // da um refresh na frase
        refreshPhrase()
        //traz o nome do usuario do outro local
        verifyUsername()
    }

    private fun verifyUsername() {
        textUserName.text =
            mSecurityPreferences.getStoredString(MotivationConstants.KEY.PERSON_NAME)
    }

    /**
     * onde é feito o click dos botoes
     */
    private fun setListeners() {
        imageAll.setOnClickListener(this)
        imageHappy.setOnClickListener(this)
        imageSun.setOnClickListener(this)
        buttonNewPhrase.setOnClickListener(this)
    }

    /**
     * Aqui sera reconhecido o click dos itens.
     */
    override fun onClick(view: View?) {
        val id = view?.id
        val listID = listOf(R.id.imageAll, R.id.imageHappy, R.id.imageSun)
        if (id in listID) {
            handleFilter(id)
        } else if (id == R.id.buttonNewPhrase) {
            refreshPhrase()
        }

    }

    // fara o filtro dos itens pressionados
    private fun handleFilter(id: Int?) {

        imageSun.setImageResource(R.drawable.ic_sun_unselected)
        imageAll.setImageResource(R.drawable.ic_all_unselected)
        imageHappy.setImageResource(R.drawable.ic_happy_unselected)

        //sera feito o efeito de clique dos itens
        if (id == R.id.imageAll) {
            mFilter = MotivationConstants.PHRASE_FILTER.ALL
            textPhrase.text = mMock.getPhrase((mFilter))
            imageAll.setImageResource(R.drawable.ic_all_selected)
        } else if (id == R.id.imageHappy) {
            mFilter = MotivationConstants.PHRASE_FILTER.HAPPY
            textPhrase.text = mMock.getPhrase((mFilter))
            imageHappy.setImageResource(R.drawable.ic_happy_selected)
        } else if (id == R.id.imageSun) {
            mFilter = MotivationConstants.PHRASE_FILTER.SUN
            textPhrase.text = mMock.getPhrase((mFilter))
            imageSun.setImageResource(R.drawable.ic_sun_selected)
        }
    }

    /**
     * Metodo que vai trazer uma nova frase
     */
    private fun refreshPhrase() {
        textPhrase.text = mMock.getPhrase((mFilter))
    }


}
