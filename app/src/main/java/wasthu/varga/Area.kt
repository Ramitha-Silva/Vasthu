package wasthu.varga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.content.*
import android.graphics.Color
import android.view.View
import android.provider.AlarmClock.EXTRA_MESSAGE
import wasthu.varga.databinding.ActivityAreaBinding
//import wasthu.varga.databinding.ActivityMainBinding


class Area : AppCompatActivity() {
    private lateinit var binding: ActivityAreaBinding
    //var aResults: Array<String> = arrayOf("", "", "", "","","","","","","","","","","")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_area)

        binding = ActivityAreaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editSqft.isEnabled = false
        binding.editInch.isEnabled= false
        binding.editLengthFt.isEnabled=false
        binding.editLengthInch.isEnabled=false
        binding.editWidthFt.isEnabled=false
        binding.editLengthInch.isEnabled=false







        binding.radioGroup.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->



                if(binding.radioGroup.getCheckedRadioButtonId() == findViewById<RadioButton>(R.id.radioButton1).getId()) {
                    //binding.editTextNumberDecimal.visibility= View.INVISIBLE}
                    binding.editSqft.isEnabled = true
                    binding.editInch.isEnabled= false
                    binding.editLengthFt.isEnabled=false
                    binding.editLengthInch.isEnabled=false
                    binding.editWidthFt.isEnabled=false
                    binding.editLengthInch.isEnabled=false


                }else  if(binding.radioGroup.getCheckedRadioButtonId() == findViewById<RadioButton>(R.id.radioButton2).getId()){
                    binding.editSqft.isEnabled = false
                    binding.editInch.isEnabled= true
                    binding.editLengthFt.isEnabled=false
                    binding.editLengthInch.isEnabled=false
                    binding.editWidthFt.isEnabled=false
                    binding.editLengthInch.isEnabled=false


                }else  if(binding.radioGroup.getCheckedRadioButtonId() == findViewById<RadioButton>(R.id.radioButton3).getId()){
                    binding.editSqft.isEnabled = false
                    binding.editInch.isEnabled= false
                    binding.editLengthFt.isEnabled=true
                    binding.editLengthInch.isEnabled=true
                    binding.editWidthFt.isEnabled=true
                    binding.editLengthInch.isEnabled=true

                }

                if (binding.editSqft.isEnabled)
                {
                    binding.editSqft.setBackgroundColor(Color.YELLOW)
                    binding.editLengthFt.setBackgroundColor(Color.WHITE)
                    binding.editLengthInch.setBackgroundColor(Color.WHITE)
                    binding.editWidthFt.setBackgroundColor(Color.WHITE)
                    binding.editWidthInch.setBackgroundColor(Color.WHITE)
                    binding.editInch.setBackgroundColor(Color.WHITE)
                }

                if (binding.editInch.isEnabled)
                {
                    binding.editInch.setBackgroundColor(Color.YELLOW)
                    binding.editSqft.setBackgroundColor(Color.WHITE)
                    binding.editLengthFt.setBackgroundColor(Color.WHITE)
                    binding.editLengthInch.setBackgroundColor(Color.WHITE)
                    binding.editWidthFt.setBackgroundColor(Color.WHITE)
                    binding.editWidthInch.setBackgroundColor(Color.WHITE)
                }

                if (binding.editLengthFt.isEnabled)
                {
                    binding.editLengthFt.setBackgroundColor(Color.YELLOW)
                    binding.editLengthInch.setBackgroundColor(Color.YELLOW)
                    binding.editWidthFt.setBackgroundColor(Color.YELLOW)
                    binding.editWidthInch.setBackgroundColor(Color.YELLOW)
                    binding.editInch.setBackgroundColor(Color.WHITE)
                    binding.editSqft.setBackgroundColor(Color.WHITE)
                }





            })

        binding.btnCalculate.setOnClickListener {


            //binding.labelLength.text=areaFt.toString()
            calPorondam()
        }


    }





    fun getSqft():Double{
        var areaInFt:Double=0.0

        if (binding.editSqft.isEnabled){
            areaInFt= binding.editSqft.text.toString().toDouble()
        }

        if (binding.editInch.isEnabled){
            var sqft:Double=0.00

            sqft=binding.editInch.text.toString().toDouble()/144


            areaInFt= Math.round(sqft * 100.0) / 100.0
        }

        if (binding.editLengthFt.isEnabled){
            var sqFt:Double=0.00
            var lengthFt:Double=0.00
            var widthFt:Double=0.00

            var inchesInFt:Double=0.00
            inchesInFt=Math.round(binding.editLengthInch.text.toString().toDouble()/12 * 100.0) / 100.0
            lengthFt=binding.editLengthFt.text.toString().toDouble()+inchesInFt

            inchesInFt=Math.round(binding.editWidthInch.text.toString().toDouble()/12 * 100.0) / 100.0
            widthFt=binding.editWidthFt.text.toString().toDouble()+inchesInFt

            sqFt=lengthFt*widthFt

            areaInFt= Math.round(sqFt * 100.0) / 100.0

        }

        return areaInFt
    }


    fun calPorondam(){
        var areaFt: Double=0.0
        areaFt = getSqft()

        var porondam:Porondam=Porondam(areaFt)
        porondam.CalculatePorondam()

        porondam.CalculateGoodBad()
        //binding.textLengthWidth.text=porondam.aResults[2][1]



        val intentx = Intent(this, Report::class.java).apply {
            putExtra(EXTRA_MESSAGE,porondam.aResults)
        }


        startActivity(intentx)



    }





}