package wasthu.varga

import android.app.Application
import android.content.res.Resources
import android.provider.Settings.Global.getString
import wasthu.varga.R



class Porondam {
    var sqFt:Double=0.00

    var WaduRiyan:Double=0.0 //[1]
    var Wargaya:Double=0.0 //[2]
    var Aya:Double=0.0  //[3]
    var Vaya:Double=0.0  //[4]
    var Yoni:Double=0.0 //[5]
    var Nekatha:Double=0.0  //[6]
    var Dina:Double=0.0 //[7]
    var Ansaka:Double=0.0 //[8]
    var Rashi:Double=0.0 //[9]
    var Thithi:Double=0.0 //[10]
    var Wansha:Double=0.0 //[11]
    var Devatha:Double=0.0 //[12]
    var Ayusha:Double=0.0 //[13]

    val res:Resources= Resources.getSystem()



    //var aResults: Array<String> = arrayOf("", "", "", "","","","","","","","","","","")

    var aResults = Array(12) { Array(2) { "" } }



    constructor(areaSqft:Double){
        sqFt=areaSqft

    }


    fun CalculatePorondam(){
        WaduRiyan=Math.round(sqFt*144/961 * 100.0) / 100.0

        aResults[0][0]=WaduRiyan.toString()

        //Wargaya=Math.round((WaduRiyan % 8) * 1.0) / 1.0

        //aResults[2][1]=Wargaya.toString()

        Aya=Math.round((WaduRiyan*12 % 8) * 1.0) / 1.0

        aResults[1][0]=Aya.toString()

        Vaya=Math.round((WaduRiyan*9 % 10) * 1.0) / 1.0
        aResults[2][0]=Vaya.toString()



        Yoni=Math.round((WaduRiyan*3 % 8) * 1.0) / 1.0
        if (Yoni==1.0)
            aResults[3][0]= App.res?.getString(R.string.yoni_1_dvaja).toString()
        else if (Yoni==2.0)
            aResults[3][0]=App.res?.getString(R.string.yoni_2_dhumu).toString()
        else if (Yoni==3.0)
            aResults[3][0]=App.res?.getString(R.string.yoni_3_sinha).toString()
        else if (Yoni==4.0)
            aResults[3][0]=App.res?.getString(R.string.yoni_4_sunakha).toString()
        else if (Yoni==5.0)
            aResults[3][0]=App.res?.getString(R.string.yoni_5_vrushabha).toString()
        else if (Yoni==6.0)
            aResults[3][0]=App.res?.getString(R.string.yoni_6_kotalu).toString()
        else if (Yoni==7.0)
            aResults[3][0]=App.res?.getString(R.string.yoni_7_gaja).toString()
        else if (Yoni==0.0)
            aResults[3][0]=App.res?.getString(R.string.yoni_0_dvanksha).toString()

        Nekatha=Math.round((WaduRiyan*8 % 27) * 1.0) / 1.0

        if (Nekatha==1.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_1_pusha).toString()
        else if (Nekatha==2.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_2_visa).toString()
        else if (Nekatha==3.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_3_siyawasa).toString()
        else if (Nekatha==4.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_4_muwasirasa).toString()
        else if (Nekatha==5.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_5_hatha).toString()
        else if (Nekatha==6.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_6_uthrasala).toString()
        else if (Nekatha==7.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_7_berana).toString()
        else if (Nekatha==8.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_8_ma).toString()
        else if (Nekatha==9.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_9_deta).toString()
        else if (Nekatha==10.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_10_uthraputupa).toString()
        else if (Nekatha==11.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_11_punawasa).toString()
        else if (Nekatha==12.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_12_sa).toString()
        else if (Nekatha==13.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_13_denata).toString()
        else if (Nekatha==14.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_14_rehena).toString()
        else if (Nekatha==15.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_15_uthrapal).toString()
        else if (Nekatha==16.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_16_puwasala).toString()
        else if (Nekatha==17.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_17_asvida).toString()
        else if (Nekatha==18.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_18_aslisa).toString()
        else if (Nekatha==19.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_19_anura).toString()
        else if (Nekatha==20.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_20_puwaputupa).toString()
        else if (Nekatha==21.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_21_ada).toString()
        else if (Nekatha==22.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_22_sitha).toString()
        else if (Nekatha==23.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_23_suwana).toString()
        else if (Nekatha==24.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_24_kathi).toString()
        else if (Nekatha==25.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_25_puwapal).toString()
        else if (Nekatha==26.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_26_chula).toString()
        else if (Nekatha==0.0)
            aResults[4][0]=App.res?.getString(R.string.nekatha_27_revathi).toString()

        Dina=Math.round((WaduRiyan*9 % 7) * 1.0) / 1.0
        if (Dina==1.0)
            aResults[5][0]=App.res?.getString(R.string.dina_1_Chandra).toString()
        else if (Dina==2.0)
            aResults[5][0]=App.res?.getString(R.string.dina_2_budha).toString()
        else if (Dina==3.0)
            aResults[5][0]=App.res?.getString(R.string.dina_3_sikuru).toString()
        else if (Dina==4.0)
            aResults[5][0]=App.res?.getString(R.string.dina_4_ravi).toString()
        else if (Dina==5.0)
            aResults[5][0]=App.res?.getString(R.string.dina_5_kuja).toString()
        else if (Dina==6.0)
            aResults[5][0]=App.res?.getString(R.string.dina_6_guru).toString()
        else if (Dina==0.0)
            aResults[5][0]=App.res?.getString(R.string.dina_0_senasuru).toString()

        Ansaka=Math.round((WaduRiyan*4 % 9) * 1.0) / 1.0
        if (Ansaka==1.0)
            aResults[6][0]=App.res?.getString(R.string.anshaka_1_artha).toString()
        else if (Ansaka==2.0)
            aResults[6][0]=App.res?.getString(R.string.anshaka_2_arthahina).toString()
        else if (Ansaka==3.0)
            aResults[6][0]=App.res?.getString(R.string.anshaka_3_bala).toString()
        else if (Ansaka==4.0)
            aResults[6][0]=App.res?.getString(R.string.anshaka_4_durbala).toString()
        else if (Ansaka==5.0)
            aResults[6][0]=App.res?.getString(R.string.anshaka_5_bhutha).toString()
        else if (Ansaka==6.0)
            aResults[6][0]=App.res?.getString(R.string.anshaka_6_danya).toString()
        else if (Ansaka==7.0)
            aResults[6][0]=App.res?.getString(R.string.anshaka_7_thas).toString()
        else if (Ansaka==8.0)
            aResults[6][0]=App.res?.getString(R.string.anshaka_8_nrupathi).toString()
        else if (Ansaka==0.0)
            aResults[6][0]=App.res?.getString(R.string.anshaka_0_pretha).toString()

        Rashi=Math.round((WaduRiyan*5 % 12) * 1.0) / 1.0
        if (Rashi==1.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_1_mesha).toString()
        else if (Rashi==2.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_2_vrushaba).toString()
        else if (Rashi==3.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_3_mithuna).toString()
        else if (Rashi==4.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_4_kataka).toString()
        else if (Rashi==5.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_5_sinha).toString()
        else if (Rashi==6.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_6_mesha).toString()
        else if (Rashi==7.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_7_thula).toString()
        else if (Rashi==8.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_8_vrushchika).toString()
        else if (Rashi==9.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_9_dhanu).toString()
        else if (Rashi==10.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_10_makara).toString()
        else if (Rashi==11.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_11_kumbha).toString()
        else if (Rashi==0.0)
            aResults[7][0]=App.res?.getString(R.string.rashi_12_mina).toString()

        Thithi=Math.round((WaduRiyan*9 % 30) * 1.0) / 1.0
        aResults[8][0]=Thithi.toString()

        Wansha=Math.round((WaduRiyan*3 % 4) * 1.0) / 1.0
        if (Wansha==1.0)
            aResults[9][0]=App.res?.getString(R.string.vansha_1_brahmana).toString()
        else if (Wansha==2.0)
            aResults[9][0]=App.res?.getString(R.string.vansha_2_kshathriya).toString()
        else if (Wansha==3.0)
            aResults[9][0]=App.res?.getString(R.string.vansha_3_vaishya).toString()
        else if (Wansha==0.0)
            aResults[9][0]=App.res?.getString(R.string.vansha_4_kshudra).toString()

        Devatha=Math.round((WaduRiyan*5 % 3) * 1.0) / 1.0
        if (Devatha==1.0)
            aResults[10][0]=App.res?.getString(R.string.devatha_1_brahma).toString()
        else if (Devatha==2.0)
            aResults[10][0]=App.res?.getString(R.string.devatha_2_vishnu).toString()
        else if (Devatha==0.0)
            aResults[10][0]=App.res?.getString(R.string.devatha_3_shiva).toString()

        Ayusha=Math.round((WaduRiyan*27 % 100) * 1.0) / 1.0
        aResults[11][0]=Ayusha.toString()

    }


    fun CalculateGoodBad():Boolean {
        var bAya: Boolean = false
        var bVaya: Boolean = false
        var bYoni:Boolean=false
        var bNekatha:Boolean=false
        var bAyusha:Boolean=false
        var bMainPorondam:Boolean=false


        if (Aya > 6.0) {
            aResults[1][1] = App.res?.getString(R.string.suba).toString()
            bAya = true
        } else {
            aResults[1][1] = App.res?.getString(R.string.asuba).toString()
        }

        if (Vaya < 5.0) {
            aResults[2][1] =App.res?.getString(R.string.suba).toString()
            bVaya = true
        } else {
            aResults[2][1] =App.res?.getString(R.string.asuba).toString()
        }

        if (Yoni==1.0 || Yoni==3.0 || Yoni==5.0 || Yoni==7.0) {
            aResults[3][1] = App.res?.getString(R.string.suba).toString()
            bYoni=true
        }else {
            aResults[3][1] = App.res?.getString(R.string.asuba).toString()
        }


        // NEKATHA PORONDAMA
        if (Nekatha==6.0 || Nekatha==7.0 || Nekatha==8.0 || Nekatha==9.0 || Nekatha==10.0 || Nekatha==11.0 || Nekatha==24.0 || Nekatha==25.0 || Nekatha==26.0){
            aResults[4][1] = App.res?.getString(R.string.suba).toString()
            bNekatha=true
        }else{
            aResults[4][1] = App.res?.getString(R.string.asuba).toString()
            bNekatha=false
        }

        // nekath match with Yoni
        if (Yoni==7.0 && (Nekatha==10.0 || Nekatha==11.0)){
            aResults[4][1] = App.res?.getString(R.string.asuba).toString()
            bNekatha=false
        }

        if (Yoni==5.0 && Nekatha==6.0){
            aResults[4][1] = App.res?.getString(R.string.asuba).toString()
            bNekatha=false
        }

        if (Yoni==3.0 &&  (Nekatha==24.0 || Nekatha==25.0 || Nekatha==26.0)){
            aResults[4][1] = App.res?.getString(R.string.asuba).toString()
            bNekatha=false
        }



        // DINA PORONDAMA
        if (Dina==1.0 || Dina==2.0 || Dina==3.0 || Dina==6.0) {
            aResults[5][1] =App.res?.getString(R.string.suba).toString()
        }else {
            aResults[5][1] = App.res?.getString(R.string.asuba).toString()
        }

        //dina match with yoni
        if (Dina==2.0 && Yoni==3.0){
            aResults[5][1] = App.res?.getString(R.string.asuba).toString()
        }


        // ANSHAKA PORONDAMA
        if (Ansaka==1.0 || Ansaka==3.0 || Ansaka==5.0 || Ansaka==6.0){
            aResults[6][1] = App.res?.getString(R.string.suba).toString()
        }else
        {
            aResults[6][1] =App.res?.getString(R.string.asuba).toString()
        }


        // RASHI PORONDAMA

        if (Rashi==2.0 || Rashi==3.0 || Rashi==5.0 || Rashi==9.0 || Rashi==11.0){
            aResults[7][1] = App.res?.getString(R.string.suba).toString()
        }else{
            aResults[7][1] = App.res?.getString(R.string.asuba).toString()
        }


        //Rashi match with Yoni
        if (Yoni==7.0 && (Rashi==5.0)){
            aResults[7][1] = App.res?.getString(R.string.asuba).toString()
        }

        if (Yoni==3.0 && (Rashi==11.0)){
            aResults[7][1] = App.res?.getString(R.string.asuba).toString()
        }

        if (Yoni==5.0 && (Rashi==2.0 || Rashi==3.0)){
            aResults[7][1] = App.res?.getString(R.string.asuba).toString()
        }

        if (Yoni==1.0 && (Rashi==9.0)){
            aResults[7][1] = App.res?.getString(R.string.asuba).toString()
        }



        // THITHI PORONDAMA
        if (Thithi!=0.00)
            aResults[8][1] = App.res?.getString(R.string.suba).toString()


        if (Yoni==5.0 && (Thithi==1.0 || Thithi==6.0 || Thithi==11.0 || Thithi==16.0 || Thithi==21.0 || Thithi==26.0))
            aResults[8][1] = App.res?.getString(R.string.asuba).toString()

        if (Yoni==7.0 && (Thithi==2.0 || Thithi==7.0 || Thithi==12.0 || Thithi==17.0 || Thithi==22.0 || Thithi==27.0))
            aResults[8][1] =App.res?.getString(R.string.asuba).toString()

        if (Yoni==1.0 && (Thithi==3.0 || Thithi==8.0 || Thithi==13.0 || Thithi==18.0 || Thithi==23.0 || Thithi==28.0))
            aResults[8][1] = App.res?.getString(R.string.asuba).toString()

        if (Yoni==3.0 && (Thithi==4.0 || Thithi==9.0 || Thithi==14.0 || Thithi==19.0 || Thithi==24.0 || Thithi==29.0))
            aResults[8][1] = App.res?.getString(R.string.asuba).toString()


        // WANSHA PORONDAMA
        if (Wansha==1.0 || Wansha==2.0 || Wansha==3.0) {
            aResults[9][1] = App.res?.getString(R.string.suba).toString()
        }else
        {
            aResults[9][1] = App.res?.getString(R.string.asuba).toString()
        }

        // DEVATHA PORONDAMA
        if (Devatha==1.0 || Devatha==2.0 ) {
            aResults[10][1] = App.res?.getString(R.string.suba).toString()
        }else
        {
            aResults[10][1] = App.res?.getString(R.string.asuba).toString()
        }


        // AYUSHA PORONDAMA
        if (Ayusha>50)
        {
            aResults[11][1] = App.res?.getString(R.string.suba).toString()
            bAyusha=true
        }else{
            aResults[11][1] =App.res?.getString(R.string.asuba).toString()
            bAyusha=false
        }






        if (bAya && bVaya && bYoni && bNekatha && bAyusha)
            bMainPorondam=true
        else
            bMainPorondam = false




        return bMainPorondam


    }





}