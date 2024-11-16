package com.example.aniwhere.uiPage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aniwhere.R;

public class HelpLoginPageActivity extends AppCompatActivity {
    private ImageButton backButton;

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginerrorpage);

        backButton = findViewById(R.id.backbtn);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpLoginPageActivity.this, HelpPageActivity.class);
            }
        });
    }
}
