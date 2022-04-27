package www.smktelkommlg.sch.id.styleandtheme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import www.smktelkommlg.sch.id.styleandtheme.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Xiaomi 11"

    }

}
