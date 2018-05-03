package com.example.panupong.menu;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] resId = {R.drawable.ic_action_alarm,
                R.drawable.ic_action_github,
                R.drawable.ic_action_google_play};

        String[] list = {"Alarm", "GitHub", "GooglePlay"};

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list, resId);

        ListView listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long row_id) {
                TextView textView = (TextView)view.findViewById(R.id.textView1);
                System.out.println( textView.getText());
                Toast.makeText(getApplicationContext(), "Clicked on item:" +  position , Toast.LENGTH_SHORT).show();
            }
        });
    }
}




