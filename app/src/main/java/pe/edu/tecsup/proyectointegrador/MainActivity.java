package pe.edu.tecsup.proyectointegrador;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //quitar el actionBar por defecto.
        getSupportActionBar().hide();

    }
}