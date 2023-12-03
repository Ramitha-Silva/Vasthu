package wasthu.varga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.content.*
import android.view.View
import android.provider.AlarmClock.EXTRA_MESSAGE
import wasthu.varga.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalc.setOnClickListener{

            val intent=Intent(this,Area::class.java)

            startActivity(intent)
        }

        binding.btnNekath.setOnClickListener{

            val intentp=Intent(this,Fullapp::class.java)

            startActivity(intentp)
        }

        binding.btnAutoCal.setOnClickListener{

            val intento=Intent(this,Fullapp::class.java)

            startActivity(intento)
        }


        binding.btnInfo.setOnClickListener{

            val intentI=Intent(this,Info::class.java)

            startActivity(intentI)
        }


    }




}