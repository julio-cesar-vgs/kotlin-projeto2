package devmasterteam.com

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import devmasterteam.com.util.MotivationConstants
import devmasterteam.com.util.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splashctivity.*

class Splashctivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurity: SecurityPreferences

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


    private fun handleSave() {
        val name = editName.text.toString()
        mSecurity.storeString(MotivationConstants.KEY.PERSON_NAME, name)
    }
}
