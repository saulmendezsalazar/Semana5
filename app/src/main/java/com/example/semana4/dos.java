package com.example.semana4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class dos extends AppCompatActivity {
CheckBox op1, op2, op3;
Button verificar;
TextView PEG1;


    EditText reciboU;
    EditText reciboP;
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        reciboU=findViewById(R.id.edUser);
        reciboP=findViewById(R.id.edPassword);
        datos=getIntent().getExtras();
        String user =datos.getString("valorEnviado");
        reciboU.setText(user);
        String password =datos.getString("valorPassword");
        reciboP.setText(password);


        op1 = findViewById(R.id.cbOpcion1);
        op2 = findViewById(R.id.cbOpcion2);
        op3 = findViewById(R.id.cbOpcion3);
        //s

    }
    public void  verificar (View v){
        if(op1.isChecked()){
            Toast.makeText(getApplicationContext(), "SELECCIONO" + op1.getText(), Toast.LENGTH_LONG).show();


        }else if(op2.isChecked()){
            Toast.makeText(getApplicationContext(), "SELECCIONO" + op2.getText(), Toast.LENGTH_LONG).show();

        }else if(op3.isChecked()){
            Toast.makeText(getApplicationContext(), "SELECCIONO" + op3.getText(), Toast.LENGTH_LONG).show();


        }
    }
}
