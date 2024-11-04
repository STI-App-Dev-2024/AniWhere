package com.example.aniwhere.ui;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.aniwhere.R;
import androidx.appcompat.app.AppCompatActivity;

public class AppNotWorkingActivity extends AppCompatActivity {
    private ImageView leftArrow, rightLogo;
    private TextView mainText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appnotworkingpage);


        leftArrow = findViewById(R.id.left_arrow);
        rightLogo = findViewById(R.id.right_logo);

        mainText = findViewById(R.id.text);

    }
}
