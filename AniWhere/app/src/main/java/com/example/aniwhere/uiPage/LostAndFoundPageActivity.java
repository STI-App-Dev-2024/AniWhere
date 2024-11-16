package com.example.aniwhere.uiPage;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.aniwhere.R;
import com.example.aniwhere.adapter.LostAndFoundAdapter;
import com.example.aniwhere.models.LostAndFoundModels;
import com.example.aniwhere.ui.LostAndFoundSearchActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class LostAndFoundPageActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LostAndFoundAdapter lostAndFoundAdapter;
    private List<LostAndFoundModels> lostAndFoundModels;
    private ImageButton searchBtn, backBtn;
    private FloatingActionButton postBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lostandfoundpage);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        searchBtn = findViewById(R.id.search);
        backBtn = findViewById(R.id.backbtn);
        postBtn = findViewById(R.id.postbtn);


        lostAndFoundModels = new ArrayList<>();
        lostAndFoundModels.add(new LostAndFoundModels("Dog", "Labrador", "Buddy", "Male", "New York", "2024-11-01", R.drawable.lostandfound));
        lostAndFoundModels.add(new LostAndFoundModels("Cat", "Persian", "Whiskers", "Female", "Los Angeles", "2024-10-30", R.drawable.lostandfound));

        lostAndFoundAdapter = new LostAndFoundAdapter(this, lostAndFoundModels);
        recyclerView.setAdapter(lostAndFoundAdapter);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LostAndFoundPageActivity.this, LostAndFoundSearchActivity.class);
                startActivity(intent);
            }
        });
        postBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LostAndFoundPageActivity.this, ReportLostPetPageActivity.class);
                startActivity(intent);
            }
        });
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
