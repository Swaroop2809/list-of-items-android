package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ClipData.Item> items;
    private ArrayAdapter<ClipData.Item> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        // Adding three sample items to the list
        addItem(new ClipData.Item("Item 1", "9.99"));
        addItem(new ClipData.Item("Item 2", "14.99"));
        addItem(new ClipData.Item("Item 3", "19.99"));
    }

    private void addItem(ClipData.Item item) {
        items.add(item);
        adapter.notifyDataSetChanged();
    }
}