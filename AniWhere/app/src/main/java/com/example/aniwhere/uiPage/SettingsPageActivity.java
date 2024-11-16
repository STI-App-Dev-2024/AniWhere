package com.example.aniwhere.uiPage;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aniwhere.R;

public class SettingsPageActivity extends AppCompatActivity {

    private ImageButton backBtn;
    private ImageView profileEditBtn;
    private LinearLayout notifBtn, helpBtn, feedbackBtn, logoutBtn;
    private TextView firstName, username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingspage);

        backBtn = findViewById(R.id.backbtn);
        profileEditBtn = findViewById(R.id.profile_editbtn);
        notifBtn = findViewById(R.id.notifbtn);
        helpBtn = findViewById(R.id.helpbtn);
        feedbackBtn = findViewById(R.id.feedbackbtn);
        logoutBtn = findViewById(R.id.logoutbtn);
        firstName = findViewById(R.id.firstname);
        username = findViewById(R.id.username);


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsPageActivity.this, HomePageActivity.class);
            }
        });

        profileEditBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsPageActivity.this, EditProfilePageActivity.class);
                startActivity(intent);
            }
        });

        notifBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsPageActivity.this, NotificationsPageActivity.class);
                startActivity(intent);
            }
        });
        helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsPageActivity.this, HelpPageActivity.class);
                startActivity(intent);
            }
        });

        feedbackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsPageActivity.this, FeedbackCenterPageActivity.class);
                startActivity(intent);
            }
        });
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsPageActivity.this, "Logged out", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SettingsPageActivity.this, LoginPageActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
    }
}
