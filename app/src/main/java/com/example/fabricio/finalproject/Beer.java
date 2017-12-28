package com.example.fabricio.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Beer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer);

        ListView listaDeBebidas = (ListView) findViewById(R.id.lista_beer);
        List<Bebidas> bebidas = todasAsBebidas();
        ArrayAdapter<Bebidas> adapter = new ArrayAdapter<Bebidas>(this, android.R.layout.simple_list_item_1, bebidas);
        listaDeBebidas.setAdapter(adapter);
    }
    private List<Bebidas> todasAsBebidas() {
        return new ArrayList<>(Arrays.asList(
                new Bebidas("Lager", "Cerveja de baixa fermentação. Elas são feitas com um levedo que age sob baixas temperaturas e na parte inferior do tanque de fermentação", 8),
                new Bebidas("Bock", "Avermelhada, bastante maltada e com teor alcoólico alto.", 9),
                new Bebidas("India Pale Ale", "A IPA é uma cerveja carregada no álcool e no amargor.", 15)));
    }
}