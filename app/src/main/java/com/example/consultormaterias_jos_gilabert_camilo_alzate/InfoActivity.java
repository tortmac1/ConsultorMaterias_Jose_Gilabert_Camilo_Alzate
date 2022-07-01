package com.example.consultormaterias_jos_gilabert_camilo_alzate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ImageView imageInfo=null;
        TextView textInfo=null;

        imageInfo = findViewById(R.id.imagen_info);
        textInfo = findViewById(R.id.texto_info);


        int valor=0;

         valor = getIntent().getExtras().getInt("valor");
         //valor=1;

         if(valor == 1){
             imageInfo.setImageDrawable(getResources().getDrawable(R.drawable._24_original));
             textInfo.setText(R.string.texto_vfx_completo);
         }else{
             imageInfo.setImageDrawable(getResources().getDrawable(R.drawable.animacion));
             textInfo.setText(R.string.texto_animacion_completo);
         }
    }
}