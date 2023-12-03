package wasthu.varga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class Info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_info)

        var listview = findViewById<ListView>(R.id.listview)
        //here friends i will create a separate listview variable
        var list = mutableListOf<Model>()

        resources.getString(R.string.btn_info)

        list.add(Model(resources.getString(R.string.btn_info), "facebook description....", R.drawable.img ))
        list.add(Model("What's app", "what's app description....", R.drawable.info_1 ))
        list.add(Model("Instagram", "instagram description....", R.drawable.info_2 ))
        list.add(Model("Twitter", "twitter description....", R.drawable.info_3 ))
        list.add(Model("YouTube", "youtube description....", R.drawable.info_4 ))

        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0)
            {
                Toast.makeText(this,"you click on facebook",Toast.LENGTH_SHORT).show()
            }
            if (position == 1)
            {
                Toast.makeText(this,"you click on Whats app",Toast.LENGTH_SHORT).show()
            }
            if (position == 2)
            {
                Toast.makeText(this,"you click on Instagram",Toast.LENGTH_SHORT).show()
            }
            if (position == 3)
            {
                Toast.makeText(this,"you click on Twitter",Toast.LENGTH_SHORT).show()
            }
            if (position == 4)
            {
                Toast.makeText(this,"you click on YouTube",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
