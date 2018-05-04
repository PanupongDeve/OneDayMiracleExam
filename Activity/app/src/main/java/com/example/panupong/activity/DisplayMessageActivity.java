package com.example.panupong.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
        Toast.makeText(this, "Name : " + message, Toast.LENGTH_SHORT).show();
        Bundle bundle = getIntent().getExtras();
        System.out.println(bundle.getInt("value"));
        System.out.println(bundle.getBoolean("isTrue", false));
        System.out.println(bundle.getString("message"));

        Bundle bd = getIntent().getBundleExtra("bd");
        System.out.println( bd.getInt("value")   );
        System.out.println( bd.getString("message") );

        MyData md = getIntent().getParcelableExtra("MyData");
        System.out.println("x = " + md.x + "\n y = " + md.y );
    }

    public void quit(View v) {
        finish();
    }
}
