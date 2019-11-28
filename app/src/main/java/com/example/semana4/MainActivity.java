package com.example.semana4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button enviar;
    EditText textoEnvio;
    EditText textoPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enviar=findViewById(R.id.btnEnvio);
        textoEnvio=findViewById(R.id.etEnvio);
        textoPassword=findViewById(R.id.etPassword);

    }

//tarea semana 4 SAUL MEDMDEZ
public void enviarDato(View v) {

    Intent abrir =new Intent(MainActivity.this, dos.class);
    //abrir.putExtra("valor Enviado","dato enviado");
    //if(textoEnvio.getText().toString() == "uisrael" && textoPassword.getText().toString()=="uisrael.20" ){

     abrir.putExtra("valorEnviado",textoEnvio.getText().toString());
     abrir.putExtra("valorPassword",textoPassword.getText().toString());
     startActivity(abrir);
        Toast.makeText((getApplicationContext()), "Ingreso satisfactorio",Toast.LENGTH_LONG).show();


    //}else{
     //   Toast.makeText((getApplicationContext()), "Alerta",Toast.LENGTH_LONG);
   }


      //  }

        public void mostrarMensaje(View v){

            Toast.makeText((getApplicationContext()), "Alerta",Toast.LENGTH_LONG);
    }
}