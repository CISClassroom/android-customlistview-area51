# รายงานผลการทดลอง

<นายพรหมพัฒน์ ชาญโชคประเสริฐ> <603410052-3>
<นายติยพล ต่อติด> <603410202-0>
<นายณรงค์ศึก เตชะศรี> <603410200-4>
<นายสิขเรศ คุ้มยิ้ม> <603410220-8>
<นายพรสิน มีสีบู> <603410210-1>

## Custom Listview

แสดงคำสั่งสำหรับแสดงข้อมูลชื่อนักศึกษาภายในกลุ่ม กลุ่มละไม่เกิน 4 คน รายละเอียดข้อมูลประกอบด้วย

- ชื่อ-นามสกุล
- รหัสนักศึกษา
- รูปภาพ

เมื่อทำการเลือกรายชื่อนักศึกษาจะทำการเปิดไปยังหน้าที่แสดงข้อมูลนักศึกษาเพิ่มเติม ข้อมูลนักศึกษาประกอบด้วย

- ชื่อ-นามสกุล
- รหัสนักศึกษา
- รูปภาพ
- สาขาวิชา
- อีเมล
- เบอร์โทรศัพท์
- Github

ให้นักศึกษาออกแบบ layout ได้ตามความเหมาสม

## Custom Listview Report

### ข้อมูล Array

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="16dp"
    >
    <ImageView
        android:layout_width="75dp"
        android:layout_height="75dp"
        android:src="@mipmap/ic_launcher"
        android:id="@+id/image">
    </ImageView>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        >
       <TextView
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:id="@+id/textView1"
           android:text="Main Text"
           android:textStyle="bold"
           android:textSize="15sp"
           android:layout_margin="5dp"
           android:textColor="#000">
           </TextView>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/textView2"
            android:text="Sub Text"
            android:textSize="13sp"
            android:layout_margin="5dp"
            android:textColor="#000">
        </TextView>
    </LinearLayout>

</LinearLayout>

### Custom Listview Layout

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Area51 Member"
        android:textAlignment="center"
        android:textColor="#4CAF50"
        android:textSize="24sp" />

    <ListView
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/listview"
    >
</ListView>
</LinearLayout>

### setOnItemClickListener และการส่งข้อมูลไปอีก Activity
class Adapter(var mCtx:Context,var resources:Int,var items:List<Model>):ArrayAdapter<Model>(mCtx,resources,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources,null)

        val imageView: ImageView = view.findViewById(R.id.image)
        val titleTextView:TextView = view.findViewById(R.id.textView1)
        val descriptionTextView:TextView = view.findViewById(R.id.textView2)

        var mItem:Model = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title
        descriptionTextView.text = mItem.description

        return view
    }
}

### การรับข้อมูลจากอีก Activity

class Model (val title:String,val description:String,val img:Int) {
}
