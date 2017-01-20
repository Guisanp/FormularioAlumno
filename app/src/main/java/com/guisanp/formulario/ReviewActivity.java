package com.guisanp.formulario;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.util.DiffUtil;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.attr.id;
import static com.guisanp.formulario.R.id.nombre;
import static com.guisanp.formulario.R.layout.activity_main;

public class ReviewActivity extends AppCompatActivity {
    public String FechaNac;
    public int Anyo;
    public int mes;
    public int day;

    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);


        final ObjetoDatos objeto = (ObjetoDatos)getIntent().getExtras().getSerializable("parametro");

        TextView textonombre=(TextView) findViewById(R.id.nombre2);
        textonombre.setText(objeto.getNombre());

        final TextView telefono=(TextView) findViewById(R.id.nombre6);
        telefono.setText(objeto.getTelefono());

        TextView email=(TextView) findViewById(R.id.nombre8);
        email.setText(objeto.getMail());

        final TextView descripcion=(TextView) findViewById(R.id.nombre10);
        descripcion.setText(objeto.getDescripcion());

        Anyo=objeto.getYear();
        mes=objeto.getMonth();
        day=objeto.getDay();
        FechaNac=String.valueOf(Anyo).concat("-").concat(String.valueOf(mes)).concat("-").concat(String.valueOf(day));

        final TextView fecha=(TextView) findViewById(R.id.nombre4);
        fecha.setText(FechaNac);

        Button botoneditar=(Button) findViewById(R.id.editar);
        botoneditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }

}
