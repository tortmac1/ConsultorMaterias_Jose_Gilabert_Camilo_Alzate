package com.example.consultormaterias_jos_gilabert_camilo_alzate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_animacion, btn_vfx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_animacion = (Button)findViewById(R.id.btn_animacion);
        btn_vfx = (Button)findViewById(R.id.btn_vfx);


    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void selection(View view) {
        Intent button1 = new Intent(MainActivity.this,InfoActivity.class);

        switch(view.getId())
        {
            case R.id.btn_animacion:
                //Operación animacion...
                button1.putExtra("valor", 0);
                break;
            case R.id.btn_vfx:
                //Operación vfx...
                button1.putExtra("valor", 1);
                break;

        }
        startActivity(button1);



    }

}