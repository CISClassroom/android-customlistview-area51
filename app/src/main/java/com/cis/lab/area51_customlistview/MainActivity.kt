package com.cis.lab.area51_customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listview)
        var list = mutableListOf<Model>()

        list.add(Model("พรหมพัฒน์ ชาญโชคประเสริฐ", "603410052-3", R.drawable.guy))
        list.add(Model("ติยพล ต่อติด", "603410202-0", R.drawable.tua))
        list.add(Model("ณรงค์ศึก เตชะศรี", "603410200-4", R.drawable.tong))
        list.add(Model("สิขเรศ คุ้มยิ้ม", "603410220-8", R.drawable.pound))
        list.add(Model("นายพรสิน มีสีบู", "603410210-1", R.drawable.kan))

        listView.adapter = Adapter(this,R.layout.row,list)


        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0) {
                Toast.makeText(this@MainActivity, "Prompat Profile", Toast.LENGTH_LONG).show()
                val changePage = Intent(this, PrompatActivity::class.java)
                startActivity(changePage)
            }
            if (position == 1) {
                Toast.makeText(this@MainActivity, "Tiyapon Profile", Toast.LENGTH_LONG).show()
                val changePage = Intent(this, PrompatActivity::class.java)
                startActivity(changePage)
            }
            if (position == 2) {
                Toast.makeText(this@MainActivity, "Narongsuek Profile", Toast.LENGTH_LONG).show()
                val changePage = Intent(this, PrompatActivity::class.java)
                startActivity(changePage)
            }
            if(position == 3){
                Toast.makeText(this@MainActivity,"Sikaret Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, PrompatActivity::class.java)
                startActivity(changePage)
        }
            if(position == 4){
                Toast.makeText(this@MainActivity,"Pornsil Profile",Toast.LENGTH_LONG).show()
                val changePage = Intent(this, PrompatActivity::class.java)
                startActivity(changePage)
            }
//        }

        }
    }
}
