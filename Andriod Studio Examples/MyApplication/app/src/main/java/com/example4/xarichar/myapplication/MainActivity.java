package com.example4.xarichar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example4.xarichar.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button XavierButton = (Button)findViewById(R.id.Xavierbutton);
        XavierButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView XavierText = (TextView)findViewById(R.id.XavierText);
                        XavierText.setText("Hey listen");
                    }

                });

    }
}
