package `in`.arpaul.daggermagicbox

import `in`.arpaul.daggermagicbox.components.DaggerSingletonBox
import `in`.arpaul.daggermagicbox.components.MagicBox
import `in`.arpaul.daggermagicbox.components.SingletonBox
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

// https://medium.com/@elye.project/dagger-2-for-dummies-in-kotlin-subcomponent-5a969b6aec7a

class MainActivity : AppCompatActivity() {

    private lateinit var mainBox: SingletonBox
    private lateinit var magicBox: MagicBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBox = DaggerSingletonBox.create()
        magicBox = mainBox.getMagicBox()

        btnCreate.setOnClickListener {
            magicBox = mainBox.getMagicBox()
            useStorage()
//            val storage = Storage()
//            magicBox.poke(storage)
//            tvText.text = "Unique ${storage.uniqueMagic.count}" +
//                    "\nNormal ${storage.normalMagic.count} "
        }

        btnReuse.setOnClickListener{
            useStorage()
//            val storage = Storage()
//            magicBox.poke(storage)

//            tvText.text = "Unique ${storage.uniqueMagic.count}" +
//                    "\nNormal ${storage.normalMagic.count} "
        }
    }

    private fun useStorage() {
        val storage = Storage()
        magicBox.poke(storage)

        tvText.text =
            "\nSingletonOne ${storage.singletonOne.count} " +
            "\nUniqueMagic ${storage.uniqueMagic.count}" +
            "\nNormalMagic ${storage.normalMagic.count} "
    }
}
