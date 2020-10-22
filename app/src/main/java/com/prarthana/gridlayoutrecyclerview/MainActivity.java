package com.prarthana.gridlayoutrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> firstBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBook = new ArrayList<>();
        firstBook.add(new Book(
                "He died with",
                "Categorie Book",
                "Description Book",
                R.drawable.hediedwith
                ));

        firstBook.add(new Book(
                "Maria Semples",
                "Categorie Book",
                "Description Book",
                R.drawable.mariasemples
        ));

        firstBook.add(new Book(
                "Privacy",
                "Categorie Book",
                "Description Book",
                R.drawable.privacy
        ));

        firstBook.add(new Book(
                "The Martian",
                "Categorie Book",
                "Description Book",
                R.drawable.themartian
        ));

        firstBook.add(new Book(
                "The Vegitarian",
                "Categorie Book",
                "Description Book",
                R.drawable.thevigitarian
        ));

        firstBook.add(new Book(
                "The Wild Robot",
                "Categorie Book",
                "Description Book",
                R.drawable.thewildrobot
        ));

        firstBook.add(new Book(
                "He died with",
                "Categorie Book",
                "Description Book",
                R.drawable.hediedwith
        ));

        firstBook.add(new Book(
                "Maria Semples",
                "Categorie Book",
                "Description Book",
                R.drawable.mariasemples
        ));
        firstBook.add(new Book(
                "Privacy",
                "Categorie Book",
                "Description Book",
                R.drawable.privacy
        ));

        firstBook.add(new Book(
                "The Martian",
                "Categorie Book",
                "Description Book",
                R.drawable.themartian
        ));

        firstBook.add(new Book(
                "The Vegitarian",
                "Categorie Book",
                "Description Book",
                R.drawable.thevigitarian
        ));

        firstBook.add(new Book(
                "The Wild Robot",
                "Categorie Book",
                "Description Book",
                R.drawable.thewildrobot
        ));

        firstBook.add(new Book(
                "He died with",
                "Categorie Book",
                "Description Book",
                R.drawable.hediedwith
        ));

        firstBook.add(new Book(
                "Maria Semples",
                "Categorie Book",
                "Description Book",
                R.drawable.mariasemples
        ));

        firstBook.add(new Book(
                "Privacy",
                "Categorie Book",
                "Description Book",
                R.drawable.privacy
        ));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdopter myAdopter = new RecyclerViewAdopter(this,firstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdopter);

    }
}