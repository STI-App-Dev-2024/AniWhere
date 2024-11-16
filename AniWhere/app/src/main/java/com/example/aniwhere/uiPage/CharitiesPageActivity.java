package com.example.aniwhere.uiPage;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aniwhere.R;
import com.example.aniwhere.adapter.CharitiesAdapter;
import com.example.aniwhere.models.CharitiesModel;

import java.util.ArrayList;
import java.util.List;

public class CharitiesPageActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CharitiesAdapter charitiesAdapter;
    private List<CharitiesModel> charitiesModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.charitiesanddonationpage);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        charitiesModels = new ArrayList<>();
        charitiesModels.add(new CharitiesModel("Charity Name", "Charity Username", "Description of the charity", "https://example.com/image.jpg"));

        charitiesAdapter = new CharitiesAdapter(charitiesModels);
        recyclerView.setAdapter(charitiesAdapter);
    }
}
