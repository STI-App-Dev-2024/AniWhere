package com.example.aniwhere.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.aniwhere.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LostAndFoundSearchActivity extends AppCompatActivity {

    private ImageButton backBtn, searchBtn;
    private FloatingActionButton postBtn;
    private boolean isSearchMode = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lostandfoundpage);

        backBtn = findViewById(R.id.backbtn);
        searchBtn = findViewById(R.id.search);
        postBtn = findViewById(R.id.postbtn);

        loadSearchFragment();

        backBtn.setOnClickListener(v -> finish());

        searchBtn.setOnClickListener(v -> {
            if (!isSearchMode) {
                loadSearchFragment();
                isSearchMode = true;
            }
        });

        postBtn.setOnClickListener(v -> {
            if (isSearchMode) {
                loadPostFragment();
                isSearchMode = false;
            }
        });
    }

    // Method to load the search fragment
    private void loadSearchFragment() {
        SearchFragment searchFragment = new SearchFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.search, searchFragment);
        transaction.commit();
    }

    private void loadPostFragment() {
        PostFragment postFragment = new PostFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, postFragment);
        transaction.commit();
    }
}
