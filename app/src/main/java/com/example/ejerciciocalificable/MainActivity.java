package com.example.ejerciciocalificable;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Camiseta", 19.99, R.drawable.camiseta));
        listaProductos.add(new Producto("Pantalones", 39.99, R.drawable.pantalones));
        listaProductos.add(new Producto("Zapatos", 49.99, R.drawable.zapatos));
        listaProductos.add(new Producto("Chaqueta", 59.99, R.drawable.chaqueta));
        listaProductos.add(new Producto("Sombrero", 15.99, R.drawable.sombrero));

        ProductoAdapter adapter = new ProductoAdapter(listaProductos);
        recyclerView.setAdapter(adapter);
    }
}
