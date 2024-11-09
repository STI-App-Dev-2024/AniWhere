package com.example.aniwhere.uiPage;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.aniwhere.R;
import com.example.aniwhere.adapter.LostAndFoundAdapter;
import com.example.aniwhere.models.LostAndFoundModels;
import java.util.ArrayList;
import java.util.List;

public class LostAndFoundPageActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LostAndFoundAdapter adapter;
    private List<LostAndFoundModels> animalList;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lostandfoundpage);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        animalList = new ArrayList<>();
        animalList.add(new LostAndFoundModels("Dog | Poodle", "Peanut", "Male", "Vermosa, Imus", "12/15/2024 11:29 PM", "LOST", R.drawable.lostandfound));
        animalList.add(new LostAndFoundModels("Cat | Turkish Angora", "Mamita", "Female", "Tagaytay City", "09/04/2024 9:30 PM", "FOUND", R.drawable.lostandfound));
        animalList.add(new LostAndFoundModels("Cat | British Shorthair", "Cloney", "Male", "Silang, Cavite", "10/05/2024 2:50 AM", "FOUND", R.drawable.lostandfound));
        animalList.add(new LostAndFoundModels("Dog | Golden Retriever", "Lucky", "Male", "Dasmarinas, Cavite", "05/18/2024 9:16 PM", "LOST", R.drawable.lostandfound));

        adapter = new LostAndFoundAdapter(animalList);
        recyclerView.setAdapter(adapter);

        ImageView PetLostProfile = findViewById(R.id.petlostprofile);
        petlostprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LostAndFoundPageActivity.this, FoundPageActivity.class);
                startActivity(intent);
            }
        });
    }
}
