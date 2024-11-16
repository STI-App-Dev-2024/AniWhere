package com.example.aniwhere.uiPage;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.aniwhere.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class SignUpPageActivity extends AppCompatActivity {

    private EditText firstNameEditText, lastNameEditText, usernameEditText, emailEditText;
    private TextInputEditText passwordEditText, confirmPasswordEditText;
    private CheckBox termsCheckbox;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signuppage);

        ImageButton left_btn = findViewById(R.id.left_arrow);

        // Initialize UI elements
        firstNameEditText = findViewById(R.id.firstname);
        lastNameEditText = findViewById(R.id.lastname);
        usernameEditText = findViewById(R.id.username);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.enterpassword).findViewById(R.id.password);
        confirmPasswordEditText = findViewById(R.id.confirmpassword).findViewById(R.id.confirm_password);
        termsCheckbox = findViewById(R.id.terms_checkbox);
        signUpButton = findViewById(R.id.signup_button);
        signUpButton.setOnClickListener(view -> handleSignUp());

        left_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpPageActivity.this, LoginPageActivity.class);
                startActivity(intent);
            }
        });
    }

    private void handleSignUp() {
        String firstName = firstNameEditText.getText().toString().trim();
        String lastName = lastNameEditText.getText().toString().trim();
        String username = usernameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String password = Objects.requireNonNull(passwordEditText.getText()).toString().trim();
        String confirmPassword = Objects.requireNonNull(confirmPasswordEditText.getText()).toString().trim();

        if (isInputValid(firstName, lastName, username, email, password, confirmPassword)) {
            saveUserData(firstName, lastName, username, email, password);
            Toast.makeText(this, "Sign-up successful!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, HomePageActivity.class));
            finish();
        }
    }

    private boolean isInputValid(String firstName, String lastName, String username, String email, String password, String confirmPassword) {
        if (TextUtils.isEmpty(firstName) || TextUtils.isEmpty(lastName) || TextUtils.isEmpty(username) ||
                TextUtils.isEmpty(email) || TextUtils.isEmpty(password) || TextUtils.isEmpty(confirmPassword)) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!password.equals(confirmPassword)) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!termsCheckbox.isChecked()) {
            Toast.makeText(this, "You must agree to the terms and conditions", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void saveUserData(String firstName, String lastName, String username, String email, String password) {
        SharedPreferences.Editor editor = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE).edit();
        editor.putString("firstName", firstName);
        editor.putString("lastName", lastName);
        editor.putString("username", username);
        editor.putString("email", email);
        editor.putString("password", password);
        editor.apply();
    }
}
