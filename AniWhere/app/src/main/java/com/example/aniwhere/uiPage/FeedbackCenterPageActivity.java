package com.example.aniwhere.uiPage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aniwhere.R;
import com.google.android.material.textfield.TextInputEditText;

public class FeedbackCenterPageActivity extends AppCompatActivity {

    private ImageButton backButton;
    private ImageView rightLogo;
    private TextView feedbackTitle, feedbackText;
    private RatingBar ratingBar;
    private Button submitButton;
    private TextInputEditText commentBox;
    private Button b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedbackcenterpage);

        // Initialize Views
        backButton = findViewById(R.id.backbtn);
        rightLogo = findViewById(R.id.right_logo);
        feedbackTitle = findViewById(R.id.feedback);
        feedbackText = findViewById(R.id.feedbacktext);
        ratingBar = findViewById(R.id.ratingBar);
        submitButton = findViewById(R.id.submit);
        commentBox = findViewById(R.id.textInputEditText);

        // Initialize suggestion buttons
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        ratingBar.setRating(4.5f);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FeedbackCenterPageActivity.this, HomePageActivity.class);
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String feedback = commentBox.getText().toString();
                float rating = ratingBar.getRating();
                Toast.makeText(FeedbackCenterPageActivity.this,
                        "Submitted Feedback: " + feedback + "\nRating: " + rating,
                        Toast.LENGTH_SHORT).show();

                commentBox.setText("");
                ratingBar.setRating(4.5f); // Reset to default rating if needed
            }
        });

        View.OnClickListener suggestionClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) v;
                String suggestion = button.getText().toString();
                commentBox.setText(suggestion);
                Toast.makeText(FeedbackCenterPageActivity.this, "Selected: " + suggestion, Toast.LENGTH_SHORT).show();
            }
        };

        b1.setOnClickListener(suggestionClickListener);
        b2.setOnClickListener(suggestionClickListener);
        b3.setOnClickListener(suggestionClickListener);
        b4.setOnClickListener(suggestionClickListener);
        b5.setOnClickListener(suggestionClickListener);
        b6.setOnClickListener(suggestionClickListener);
    }
}
