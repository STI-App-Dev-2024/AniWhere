package com.example.aniwhere.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aniwhere.R;
import com.google.android.material.imageview.ShapeableImageView;

public class HomePageItem extends AppCompatActivity {

    private ShapeableImageView profileImage, mainImage, subImage1, subImage2, subImage3, subImage4;
    private TextView profileName, userName, description;
    private Button followBtn;
    private ImageView likeBtn, commentBox, shareBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_item);

        profileImage = findViewById(R.id.profile_image);
        mainImage = findViewById(R.id.main_image);
        subImage1 = findViewById(R.id.sub_image1);
        subImage2 = findViewById(R.id.sub_image2);
        subImage3 = findViewById(R.id.sub_image3);
        subImage4 = findViewById(R.id.sub_image4);

        profileName = findViewById(R.id.name);
        userName = findViewById(R.id.username);
        description = findViewById(R.id.description);

        followBtn = findViewById(R.id.followbtn);
        likeBtn = findViewById(R.id.like_btn);
        commentBox = findViewById(R.id.comment_box);
        shareBtn= findViewById(R.id.share_btn);


        followBtn.setOnClickListener(view -> Toast.makeText(this, "Followed", Toast.LENGTH_SHORT).show());
        likeBtn.setOnClickListener(view -> Toast.makeText(this, "Liked!", Toast.LENGTH_SHORT).show());
        commentBox.setOnClickListener(view -> Toast.makeText(this, " ", Toast.LENGTH_SHORT).show());
        shareBtn.setOnClickListener(view -> Toast.makeText(this, "Shared post", Toast.LENGTH_SHORT).show());
    }
}
