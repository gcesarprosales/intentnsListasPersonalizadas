package com.example.gcesar.proyectoandroidbasico;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends ListActivity {
    List elementos;
    Button btn_chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        elementos = new ArrayList();
        elementos.add(new ItemClassMuro("Guillermo Cesar Perez Rosales","Hoy fui al cine a ver stars wars en 4DX :3"));
        elementos.add(new ItemClassMuro("Erica Monserrat Luna Mendez", "Mi primer dia de clases y ya me aburri en la school :,("));
        elementos.add(new ItemClassMuro("Elena Rosales Urban", "No le entiendo a esta cosa, que alguien me explique "));
        elementos.add(new ItemClassMuro("Sandra Raya","Saludos desde el hospital, los quiero mucho"));
        elementos.add(new ItemClassMuro("Guillermo Cesar Perez Rosales","Hoy fui al cine a ver stars wars en 4DX :3"));
        elementos.add(new ItemClassMuro("Erica Monserrat Luna Mendez", "Mi primer dia de clases y ya me aburri en la school :,("));
        elementos.add(new ItemClassMuro("Elena Rosales Urban", "No le entiendo a esta cosa, que alguien me explique "));
        elementos.add(new ItemClassMuro("Sandra Raya", "Saludos desde el hospital, los quiero mucho"));

        setListAdapter(new MiAdaptadorMuro(elementos, R.layout.elemento_lista_muro, getApplicationContext()) {
            @Override
            public View inicializaElemento(Object elemento, View view) {
                ((TextView) view.findViewById(R.id.tvNombre)).setText(((ItemClassMuro) elemento).getNombre());
                ((TextView) view.findViewById(R.id.tvComentario)).setText(((ItemClassMuro) elemento).getComentario());
                return view;
            }
        });

        btn_chat = (Button) findViewById(R.id.btn_chat);

        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),ThirdActivity.class);

                startActivity(intent1);
            }
        });


    }
}
