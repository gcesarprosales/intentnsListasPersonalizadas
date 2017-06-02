package com.example.gcesar.proyectoandroidbasico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String emailTrue = "gcesarprosales@gmail.com";
    final String passTrue = "android2016";

    String correo, contrasenia;

    EditText etUsuario, etContrasenia;
    Button btn_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etContrasenia = (EditText) findViewById(R.id.etContrasenia);
        btn_enviar = (Button) findViewById(R.id.btn_enviar);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correo = etUsuario.getText().toString();
                contrasenia = etContrasenia.getText().toString();

                if( correo.equals(emailTrue) && contrasenia.equals(passTrue) ){
                    Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Datos incorrectos",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
