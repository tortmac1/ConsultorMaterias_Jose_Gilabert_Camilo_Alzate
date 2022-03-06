package com.example.consultormaterias_jos_gilabert_camilo_alzate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button1 = new Intent(MainActivity.this,InfoActivity.class);
                startActivity(button1);
            }
        });
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

}