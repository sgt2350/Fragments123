package com.mobileappscompany.training.fragments123;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Another extends AppCompatActivity {
    TextView textView;
    Button button;

 //This is my second Update git

    //I have made some changes for the Xml file
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
     textView = (TextView)findViewById(R.id.tv);
        Intent intent = getIntent();
        String Name = intent.getStringExtra("myname");
        textView.setText(Name);
        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Thats all for the day Man!",
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
