package wasthu.varga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.content.*
import android.graphics.Color
import android.view.View
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.TypedValue
import wasthu.varga.databinding.ActivityFullappBinding



class Fullapp : AppCompatActivity() {
    private lateinit var binding: ActivityFullappBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_fullapp)
        binding = ActivityFullappBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textMsg.setTextSize(TypedValue.COMPLEX_UNIT_SP,20F)

    }
}