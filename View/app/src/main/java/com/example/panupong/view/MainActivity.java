package com.example.panupong.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOutput;
    Tools tools = new Tools();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOutput = (TextView) findViewById(R.id.tvOutput);
    }

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkbox_meat:
                if (checked) {
                    tvOutput.setText(tools.putMeat());
                    System.out.println("Put some meat on the sandwich");
                }
                else {
                    tvOutput.setText(tools.removeMeat());
                    System.out.println("Remove the meat");
                }
                break;
            case R.id.checkbox_cheese:
                if (checked) {
                    tvOutput.setText(tools.showCheese());
                } else {
                    tvOutput.setText(tools.removeCheese());
                }
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_pirates:
                if(checked)
                    tvOutput.setText(tools.showPirates());
                break;
             case R.id.radio_ninjas:
                   if(checked)
                       tvOutput.setText(tools.showNinja());
                   break;
        }
    }
}
