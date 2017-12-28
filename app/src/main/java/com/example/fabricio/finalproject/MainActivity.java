package com.example.fabricio.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {


    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Eating", R.drawable.eating, "#09A9FF"));
        arrayList.add(new DataModel("Beer", R.drawable.beer_if, "#3E51B1"));
        /*arrayList.add(new DataModel("Payment", R.drawable.payment, "#673BB7"));*/
        arrayList.add(new DataModel("Social", R.drawable.share, "#F94336"));
        arrayList.add(new DataModel("Local", R.drawable.streamline, "#0A9B88"));
        arrayList.add(new DataModel("About", R.drawable.info_outline, "#4BAA50"));


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(adapter);


        /**
         AutoFitGridLayoutManager that auto fits the cells by the column width defined.
         **/

        AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 500);
        recyclerView.setLayoutManager(layoutManager);


        /**
         Simple GridLayoutManager that spans two columns
         **/
        /*GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);*/
    }

    @Override
    public void onItemClick(DataModel item) {

        if(item.text.equals("Eating")){
            Intent it = new Intent(MainActivity.this, Eating.class);
            startActivity(it);
        }else if (item.text.equals("Beer")){
            Intent it = new Intent(MainActivity.this, Beer.class);
            startActivity(it);
        }else if (item.text.equals("Social")){
            Intent it = new Intent(MainActivity.this, SocialMedia.class);
            startActivity(it);
        }else if (item.text.equals("Local")){
            Intent it = new Intent(MainActivity.this, LocalMap.class);
            startActivity(it);
        }else if (item.text.equals("About")){
            Intent it = new Intent(MainActivity.this, About.class);
            startActivity(it);
        }

        Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();

    }
}