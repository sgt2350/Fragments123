package com.mobileappscompany.training.fragments123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button button;
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext = (EditText) findViewById(R.id.et1);
        button = (Button) findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String Name = edittext.getText().toString();

                Intent intent = new Intent(getApplicationContext(),Another.class);

                intent.putExtra("myname",Name);
                startActivity(intent);

            }
        });

    }
}