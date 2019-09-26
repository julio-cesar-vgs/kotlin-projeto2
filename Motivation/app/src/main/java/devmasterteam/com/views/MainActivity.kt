package devmasterteam.com.views

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import devmasterteam.com.R
import devmasterteam.com.util.MotivationConstants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // declaracao inicial da variavel trazendo o all
    private var mFilter = MotivationConstants.PHRASE_FILTER.ALL

    //cria a primeira tela.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * setta o evento
         */
        setListeners()

        //Inicializa
        handleFilter(R.id.imageAll)
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
        } else {
            refreshPhrase()
        }

    }

    private fun handleFilter(id: Int?) {

        imageSun.setImageResource(R.drawable.ic_sun_unselected)
        imageAll.setImageResource(R.drawable.ic_all_unselected)
        imageHappy.setImageResource(R.drawable.ic_happy_unselected)

        if (id == R.id.imageAll) {
            mFilter = MotivationConstants.PHRASE_FILTER.ALL
            imageAll.setImageResource(R.drawable.ic_all_selected)
        } else if (id == R.id.imageHappy) {
            mFilter = MotivationConstants.PHRASE_FILTER.HAPPY
            imageHappy.setImageResource(R.drawable.ic_happy_selected)
        } else if (id == R.id.imageSun) {
            mFilter = MotivationConstants.PHRASE_FILTER.SUN
            imageSun.setImageResource(R.drawable.ic_sun_selected)
        }
    }

    private fun refreshPhrase() {

    }


}
