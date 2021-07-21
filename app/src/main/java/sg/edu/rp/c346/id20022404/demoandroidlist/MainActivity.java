package sg.edu.rp.c346.id20022404.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        al = new ArrayList<>();

        al.add("Pie - 9.0");
        al.add("Oreo - 8.0");
        al.add("Nougat - 7.0");
        al.add("Marshmallow - 6.0");

        aa = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1, al);
        lv.setAdapter(aa);
    }
}