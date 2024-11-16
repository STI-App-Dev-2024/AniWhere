package com.example.aniwhere.uiPage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.aniwhere.R;
import com.example.aniwhere.adapter.AdoptionAdapter;
import com.example.aniwhere.models.AdoptionModels;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AdoptionPageActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdoptionAdapter adoptionAdapter;
    private List<AdoptionModels> adoptionModels;
    private List<AdoptionModels> filteredList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adoptionpage);

        adoptionModels = new ArrayList<>();
        populateData();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        filteredList = new ArrayList<>(adoptionModels);
        adoptionAdapter = new AdoptionAdapter(filteredList, this);
        recyclerView.setAdapter(adoptionAdapter);

        ImageView dogSelector = findViewById(R.id.dogselector);
        ImageView catSelector = findViewById(R.id.catselector);
        ImageView otherSelector = findViewById(R.id.otherselector);

        dogSelector.setOnClickListener(v -> filterList("Dog"));
        catSelector.setOnClickListener(v -> filterList("Cat"));
        otherSelector.setOnClickListener(v -> filterList("Others"));
    }

    private void populateData() {

        adoptionModels.add(new AdoptionModels("Buddy", R.drawable.lostandfound, "Golden Retriever", "3 years old", "New York"));
        adoptionModels.add(new AdoptionModels("Whiskers", R.drawable.locator, "Persian", "2 years old", "Los Angeles"));
        adoptionModels.add(new AdoptionModels("Luna", R.drawable.adoption, "Mix", "5 years old", "San Francisco"));
    }

    private void filterList(String category) {
        filteredList.clear();
        filteredList.addAll(
                adoptionModels.stream()
                        .filter(model -> model.getName().equals(category))
                        .collect(Collectors.toList())
        );
        adoptionAdapter.notifyDataSetChanged();

        ImageView Profile = findViewById(R.id.image);
        TextView Name = findViewById(R.id.name);
        TextView Breed = findViewById(R.id.breed);
        TextView Age = findViewById(R.id.age);
        TextView Location = findViewById(R.id.location);

        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdoptionPageActivity.this, AdoptionProfilePageActivity.class);
                startActivity(intent);
            }
        });
        Name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdoptionPageActivity.this, AdoptionProfilePageActivity.class);
                startActivity(intent);
            }
        });
        Breed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdoptionPageActivity.this, AdoptionProfilePageActivity.class);
                startActivity(intent);
            }
        });
        Age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdoptionPageActivity.this, AdoptionProfilePageActivity.class);
                startActivity(intent);
            }
        });
        Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdoptionPageActivity.this, AdoptionProfilePageActivity.class);
                startActivity(intent);
            }
        });
    }
}
