package com.guisanp.formulario;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ObjetoDatos miobjeto;
        miobjeto=new ObjetoDatos();
        final TextInputEditText nombre = (TextInputEditText) findViewById(R.id.nombre);
        final TextInputEditText telefono = (TextInputEditText) findViewById(R.id.Telefono);
        final TextInputEditText mail = (TextInputEditText) findViewById(R.id.email);
        final TextInputEditText descripcion = (TextInputEditText) findViewById(R.id.descl);
        final DatePicker fecha = (DatePicker) findViewById(R.id.calendario);

        final Button botonacceso = (Button) findViewById(R.id.siguiente);
            botonacceso.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    miobjeto.setNombre(String.valueOf(nombre.getText()));
                    miobjeto.setTelefono(String.valueOf(telefono.getText()));
                    miobjeto.setDescripcion(String.valueOf(descripcion.getText()));
                    miobjeto.setMail(String.valueOf(mail.getText()));
                    miobjeto.setYear(fecha.getYear());
                    miobjeto.setMonth(fecha.getMonth());
                    miobjeto.setDay(fecha.getDayOfMonth());

                    Intent intent=new Intent(MainActivity.this,ReviewActivity.class);
                    intent.putExtra("parametro",miobjeto);
                    startActivity(intent);
                }
            });
    }
}
