package com.example.aniwhere.uiPage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aniwhere.R;
import com.example.aniwhere.adapter.PostAdapter;
import com.example.aniwhere.models.PostModel;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePageActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PostAdapter postAdapter;
    private List<PostModel> postList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        ShapeableImageView LostAndFound = findViewById(R.id.lostandfound);
        ShapeableImageView Locator = findViewById(R.id.locator);
        ShapeableImageView Adaption = findViewById(R.id.adaption);
        ShapeableImageView Charities = findViewById(R.id.charities);

        LostAndFound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, LostAndFoundPageActivity.class);
                startActivity(intent);
            }
        });
        Locator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, LocatorPageActivity.class);
                startActivity(intent);
            }
        });
        Adaption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, AdaptionPageActivity.class);
                startActivity(intent);
            }
        });
        Charities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, CharitiesPageActivity.class);
                startActivity(intent);
            }
        });

        recyclerView = findViewById(R.id.postLayout);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        postList = new ArrayList<>();
        postList.add(new PostModel(
                "Name",
                "Username",
                R.drawable.charities,  //Image rescource of homepage_item
                Arrays.asList(R.drawable.charities, R.drawable.charities, R.drawable.charities, R.drawable.charities, R.drawable.charities)
        ));

        postAdapter = new PostAdapter(this, postList);
        recyclerView.setAdapter(postAdapter);
    }

}
