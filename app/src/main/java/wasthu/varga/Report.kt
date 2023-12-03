package wasthu.varga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.content.*
import android.graphics.Color
import android.view.View
import android.provider.AlarmClock.EXTRA_MESSAGE
import wasthu.varga.databinding.ActivityReportBinding


class Report : AppCompatActivity() {
    private lateinit var binding: ActivityReportBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_report)

        var mainCount:Int=0
        var nCount:Int=0


        binding = ActivityReportBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var aR = Array(12) { Array(2) { "" } }
        //val message = intent.getStringArrayExtra(EXTRA_MESSAGE)
        aR= intent.getSerializableExtra(EXTRA_MESSAGE) as Array<Array<String>>


        binding.textAyaR.text=aR[1][0]
        binding.textAyaS.text=aR[1][1]
        if (aR[1][1]==resources.getString(R.string.suba))
        {
            binding.textAyaS.setTextColor(Color.parseColor("#448f28"))
            mainCount++
            nCount++
        }else{
            binding.textAyaS.setTextColor(Color.parseColor("#FF0000"))
        }


        binding.textVayaR.text=aR[2][0]
        binding.textVayaS.text=aR[2][1]
        if (aR[2][1]==resources.getString(R.string.suba))
        {
            mainCount++
            nCount++
            binding.textVayaS.setTextColor(Color.parseColor("#448f28"))
        }else{
            binding.textVayaS.setTextColor(Color.parseColor("#FF0000"))
        }




        binding.textYoniR.text=aR[3][0]
        binding.textYoniS.text=aR[3][1]
        if (aR[3][1]==resources.getString(R.string.suba))
        {
            mainCount++
            nCount++
            binding.textYoniS.setTextColor(Color.parseColor("#448f28"))
        }else{
            binding.textYoniS.setTextColor(Color.parseColor("#FF0000"))
        }




        binding.textNekathaR.text=aR[4][0]
        binding.textNekathaS.text=aR[4][1]
        if (aR[4][1]==resources.getString(R.string.suba))
        {
            mainCount++
            nCount++
            binding.textNekathaS.setTextColor(Color.parseColor("#448f28"))
        }else{
            binding.textNekathaS.setTextColor(Color.parseColor("#FF0000"))
        }



        binding.textDinaR.text=aR[5][0]
        binding.textDinaS.text=aR[5][1]
        if (aR[5][1]==resources.getString(R.string.suba))
        {
            nCount++
            binding.textDinaS.setTextColor(Color.parseColor("#448f28"))
        }else{
            binding.textDinaS.setTextColor(Color.parseColor("#FF0000"))
        }



        binding.textAnshakaR.text=aR[6][0]
        binding.textAnsakaS.text=aR[6][1]
        if (aR[6][1]==resources.getString(R.string.suba))
        {
            nCount++
            binding.textAnsakaS.setTextColor(Color.parseColor("#448f28"))
        }else{
            binding.textAnsakaS.setTextColor(Color.parseColor("#FF0000"))
        }



        binding.textRashiR.text=aR[7][0]
        binding.textRashiS.text=aR[7][1]
        if (aR[7][1]==resources.getString(R.string.suba))
        {
            nCount++
            binding.textRashiS.setTextColor(Color.parseColor("#448f28"))
        }else{
            binding.textRashiS.setTextColor(Color.parseColor("#FF0000"))
        }



        binding.textThithiR.text=aR[8][0]
        binding.textThithiS.text=aR[8][1]
        if (aR[8][1]==resources.getString(R.string.suba))
        {
            nCount++
            binding.textThithiS.setTextColor(Color.parseColor("#448f28"))
        }else{
            binding.textThithiS.setTextColor(Color.parseColor("#FF0000"))
        }



        binding.textVanshaR.text=aR[9][0]
        binding.textVanshaS.text=aR[9][1]
        if (aR[9][1]==resources.getString(R.string.suba))
        {
            nCount++
            binding.textVanshaS.setTextColor(Color.parseColor("#448f28"))
        }else{
            binding.textVanshaS.setTextColor(Color.parseColor("#FF0000"))
        }




        binding.textDevathaR.text=aR[10][0]
        binding.textDevathaS.text=aR[10][1]
        if (aR[10][1]==resources.getString(R.string.suba))
        {
            nCount++
            binding.textDevathaS.setTextColor(Color.parseColor("#448f28"))
        }else{
            binding.textDevathaS.setTextColor(Color.parseColor("#FF0000"))
        }


        binding.textAyushaR.text=aR[11][0]
        binding.textAyushaS.text=aR[11][1]
        if (aR[11][1]==resources.getString(R.string.suba))
        {
            mainCount++
            nCount++
            binding.textAyushaS.setTextColor(Color.parseColor("#448f28"))
        }else{
            binding.textAyushaS.setTextColor(Color.parseColor("#FF0000"))
        }

        var sStatus:String=""

        if (mainCount<4){
            sStatus=resources.getString(R.string.porondam_report_1)}
        else
        {
            sStatus=resources.getString(R.string.porondam_report_2)
        }

        var pr:Double=0.00
        //pr=nCount*100.00/11

        pr=Math.round((nCount*100.00/11) * 1.0) / 1.0
        sStatus=sStatus+resources.getString(R.string.porondam_report_3)+pr.toString()+"%."

        sStatus=sStatus+resources.getString(R.string.porondam_report_4)+resources.getString(R.string.porondam_report_5)

        binding.textReportStatus.text=sStatus



    }




}






