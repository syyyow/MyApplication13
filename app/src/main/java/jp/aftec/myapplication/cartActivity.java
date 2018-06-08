package jp.aftec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class cartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

        // データを準備
        ArrayList<String> items = new ArrayList<>();
        for(int i = 0; i < 30; i++) {
            items.add("items-" + i);
        }

        // Adapter - ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, // 第1引数:Context
                R.layout.list_item, // 第2引数:行のレイアウト指定
                items // 第3引数:データ
        );

        // ListViewに表示
        myListView.setAdapter(adapter);
    }


}