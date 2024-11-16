package com.example.aniwhere.uiPage;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.aniwhere.R;
public class HelpPageActivity extends AppCompatActivity {

    private ImageButton backButton;
    private ImageView rightLogo;
    private TextView helpCenterText;
    private Button reportLostButton, reportFoundButton, donateButton, adoptButton, cantLoginButton, appNotWorkingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helpcenterpage);

        backButton = findViewById(R.id.backbtn);
        rightLogo = findViewById(R.id.right_logo);
        helpCenterText = findViewById(R.id.helpcentertext);
        reportLostButton = findViewById(R.id.reportlost);
        reportFoundButton = findViewById(R.id.reportfound);
        donateButton = findViewById(R.id.donate);
        adoptButton = findViewById(R.id.adopt);
        cantLoginButton = findViewById(R.id.cantlogin);
        appNotWorkingButton = findViewById(R.id.appnotworking);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpPageActivity.this, SettingsPageActivity.class);
            }
        });
        reportLostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpPageActivity.this, HelpReportPageActivity.class);
            }
        });
        reportFoundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpPageActivity.this, HelpFoundPageActivity.class);
            }
        });
        donateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpPageActivity.this, HelpDonatePageActivity.class);
            }
        });
        adoptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpPageActivity.this, HelpAdoptPageActivity.class);
            }
        });
        cantLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpPageActivity.this, HelpLoginPageActivity.class);
            }
        });
        appNotWorkingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpPageActivity.this, HelpAppPageActivity.class);
            }
        });

    }
}
