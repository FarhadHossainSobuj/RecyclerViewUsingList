package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> listName;
    private List<String> listContact;
    private List<Integer> listImage;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        listName = new ArrayList<>();
        listContact = new ArrayList<>();
        listImage = new ArrayList<>();

        listName.add("Farhad");
        listContact.add("014545454");
        listImage.add((R.drawable.p1));

        listName.add("Rony");
        listContact.add("014545454");
        listImage.add((R.drawable.p2));


        listName.add("Mazlan");
        listContact.add("014545454");
        listImage.add((R.drawable.p3));

        listName.add("Farhad");
        listContact.add("014545454");
        listImage.add((R.drawable.p1));

        listName.add("Rony");
        listContact.add("014545454");
        listImage.add((R.drawable.p2));


        listName.add("Mazlan");
        listContact.add("014545454");
        listImage.add((R.drawable.p3));

        CustomAdapter adapter = new CustomAdapter(listName, listContact, listImage);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
