package com.example.aniwhere.uiPage;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.aniwhere.R;
import com.example.aniwhere.adapter.HomePageAdapter;
import com.example.aniwhere.adapter.PostAdapter;
import com.example.aniwhere.models.HomeProfileModels;
import com.example.aniwhere.models.PostModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePageActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HomePageAdapter homePageAdapter;
    private List<HomeProfileModels> homeProfileModelsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        LinearLayout LostAndFound = findViewById(R.id.lostandfound);
        LinearLayout Locator = findViewById(R.id.locator);
        LinearLayout Adaption = findViewById(R.id.adoption);
        LinearLayout Charities = findViewById(R.id.charities);
        FloatingActionButton PostButton = findViewById(R.id.addbtn);
        ImageView ProfileSettings =  findViewById(R.id.settingsbtn);

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
                Intent intent = new Intent(HomePageActivity.this, AdoptionPageActivity.class);
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
        PostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, PostPageActivity.class);
                startActivity(intent);
            }
        });
        ProfileSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, SettingsPageActivity.class);
            }
        });

        recyclerView = findViewById(R.id.postLayout);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        homeProfileModelsList = new ArrayList<>();
        homeProfileModelsList.add(new HomeProfileModels(
                "John Doe",
                "@john_doe",
                R.drawable.charities, R.drawable.charities, R.drawable.charities, R.drawable.charities, R.drawable.charities, R.drawable.charities));

        homePageAdapter = new HomePageAdapter(this, homeProfileModelsList);
        recyclerView.setAdapter(homePageAdapter);
    }

}
