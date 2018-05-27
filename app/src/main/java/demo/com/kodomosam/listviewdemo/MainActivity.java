package demo.com.kodomosam.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    String items[] = new String[]{"Brasil",
//            "Uruguai", "USA", "Argentina",
//            "Equador","Africa","China", "França","Chile",
//            "Japao","Romenia","Iran","Pasaquistao","Corea",
//            "Italia","Franca","Iran","Romenia","Australia"};

    String[] items = new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items[0] = "Brasil";
        items[1] = "Uruguai";
        items[2] = "Usa";
        items[3] = "China";
        items[4] = "Iran";
        items[5] = "França";
        items[6] = "Romenia";
        items[7] = "Italia";
        items[8] = "Australia";
        items[9] = "Equador";
        items[10] = "Paraguai";

        ListView listView = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,items[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
