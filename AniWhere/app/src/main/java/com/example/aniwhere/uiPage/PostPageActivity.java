package com.example.aniwhere.uiPage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aniwhere.R;
import com.example.aniwhere.adapter.PhotoPostAdapter;

import java.util.ArrayList;
import java.util.List;

public class PostPageActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_SELECT_PHOTO = 1;
    private ImageButton backbtn;
    private RecyclerView photoRecyclerView;
    private Button addPhotosButton, postButton;
    private EditText commentEditText;
    private PhotoPostAdapter photoPostAdapter;
    private List<Uri> photoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postpage);

        backbtn = findViewById(R.id.backbtn);
        photoRecyclerView = findViewById(R.id.photoRecyclerView);
        addPhotosButton = findViewById(R.id.addPhotosButton);
        postButton = findViewById(R.id.postButton);
        commentEditText = findViewById(R.id.commentEditText);
        photoList = new ArrayList<>();
        photoPostAdapter = new PhotoPostAdapter(photoList);
        photoRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        photoRecyclerView.setAdapter(photoPostAdapter);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        addPhotosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectPhotoFromGallery();
            }
        });
        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postComment();
            }
        });
    }
    private void selectPhotoFromGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, REQUEST_CODE_SELECT_PHOTO);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_SELECT_PHOTO && resultCode == RESULT_OK && data != null) {
            Uri selectedImageUri = data.getData();
            if (selectedImageUri != null) {
                photoList.add(selectedImageUri);
                photoPostAdapter.notifyDataSetChanged();
                Toast.makeText(this, "Photo added!", Toast.LENGTH_SHORT).show();
            }
        }
    }
    private void postComment() {
        String comment = commentEditText.getText().toString();
        if (!comment.isEmpty()) {
            Toast.makeText(this, "Posted: " + comment, Toast.LENGTH_SHORT).show();
            commentEditText.setText("");
        } else {
            Toast.makeText(this, "Please enter a comment before posting", Toast.LENGTH_SHORT).show();
        }
    }
}
