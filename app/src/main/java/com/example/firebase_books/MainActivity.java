package com.example.firebase_books;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAdd(v);
            }
        });

        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerview_books);
        new FirebaseDataHelper().readBooks(new FirebaseDataHelper.DataStatus() {

            @Override
            public void DataIsLoaded(List<Book> books, List<String> keys) {
                new RecyclerView_Config().setConfig(mRecyclerView,MainActivity.this, books, keys);
            }

            @Override
            public void DataIsInserted() {}
        });
    }

    public void clickAdd(View view) {
        Intent intent = new Intent(this, NewBookActivity.class);
        startActivity(intent);
    }
}
