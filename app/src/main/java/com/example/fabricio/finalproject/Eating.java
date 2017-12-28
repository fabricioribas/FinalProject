package com.example.fabricio.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Seta o Layout
        setContentView(R.layout.activity_eating);

        ListView listaDeComidas = (ListView) findViewById(R.id.lista);
        List<Comidas> comidas = todasAsComidas();
        ArrayAdapter<Comidas> adapter = new ArrayAdapter<Comidas>(this, android.R.layout.simple_list_item_1, comidas);
        listaDeComidas.setAdapter(adapter);
    }
    private List<Comidas> todasAsComidas() {
        return new ArrayList<>(Arrays.asList(
                new Comidas("Siri", "Pão 300gr recheado de Siri", 30),
                new Comidas("Carne e Queijo", "Pão italiano de 300gr recheado com carne e queijo", 20),
                new Comidas("Salada", "Pão branco 300gr recheado com bife e variadades de saladas", 15)));
    }
}
