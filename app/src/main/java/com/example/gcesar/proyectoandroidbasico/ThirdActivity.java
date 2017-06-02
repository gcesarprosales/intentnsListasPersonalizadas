package com.example.gcesar.proyectoandroidbasico;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends ListActivity {

    List elementos;
    Button btn_muro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        elementos = new ArrayList();
        elementos.add(new ItemClassChat(R.drawable.fotouno,"Gerardo Arrollo Mendez"));
        elementos.add(new ItemClassChat(R.drawable.fotodos,"Elena Rosales Urban"));
        elementos.add(new ItemClassChat(R.drawable.fototres, "Ich heisse Uwe"));
        elementos.add(new ItemClassChat(R.drawable.fotocuatro, "Erika Monserrat Luna"));

        setListAdapter(new MiAdaptadorChat(elementos, R.layout.elemento_lista_chat, getApplicationContext()) {
            @Override
            public View inicializaElemento(Object elemento, View vista) {
                ((ImageView) vista.findViewById(R.id.iv_foto)).setImageResource(((ItemClassChat) elemento).getImagen());
                ((TextView) vista.findViewById(R.id.tv_nombre)).setText(((ItemClassChat) elemento).getNombre());
                return vista;
            }
        });

        btn_muro =  (Button) findViewById(R.id.btn_muro);
        btn_muro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent);
            }
        });



    }
}
