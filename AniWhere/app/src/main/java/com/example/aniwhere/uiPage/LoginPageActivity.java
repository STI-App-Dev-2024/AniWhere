package com.example.aniwhere.uiPage;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.aniwhere.R;

public class LoginPageActivity extends AppCompatActivity{

    private EditText usernameEditText, passwordEditText;
    private CheckBox rememberMeCheckBox;
    private Button login_Button;
    private TextView forgotPasswordTextView, signUpTextView;

    //RememberCheckbox
    private static final String PREFS_NAME = "LoginName";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_REMEMBER_ME = "rememberMe";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        rememberMeCheckBox = findViewById(R.id.remember_me_checkbox);
        login_Button = findViewById(R.id.login_button);
        signUpTextView = findViewById(R.id.sign_up); //Wala pang i.d
        loadLoginDetails();
        login_Button.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(LoginPageActivity.this, "Please fill out all fields", Toast.LENGTH_SHORT).show();
            } else {
                if (rememberMeCheckBox.isChecked()) {
                    saveLoginDetails(username, password);
                } else {
                    clearLoginDetails();
                }
                Toast.makeText(LoginPageActivity.this, "Logging in...", Toast.LENGTH_SHORT).show();
            }
        });

        signUpTextView.setOnClickListener(v -> {
            Intent intent = new Intent(LoginPageActivity.this, SignUpPageActivity.class);
            startActivity(intent);
        });
    }
        public void onForgotPasswordClick(View view) {
            Intent intent = new Intent(LoginPageActivity.this, ForgotPassPageActivity.class);
            startActivity(intent);
        }
        private void loadLoginDetails() {
            SharedPreferences preferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
            String savedUsername = preferences.getString(KEY_USERNAME, "");
            String savedPassword = preferences.getString(KEY_PASSWORD, "");
            boolean rememberMe = preferences.getBoolean(KEY_REMEMBER_ME, false);

            if (rememberMe) {
                usernameEditText.setText(savedUsername);
                passwordEditText.setText(savedPassword);
                rememberMeCheckBox.setChecked(true);
        }
    }

    private void saveLoginDetails(String username, String password) {
            SharedPreferences preferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();

            editor.putString(KEY_USERNAME, username);
            editor.putString(KEY_PASSWORD, password);
            editor.putBoolean(KEY_REMEMBER_ME, true);
            editor.apply();
    }
        private void clearLoginDetails() {
            SharedPreferences preferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();

            editor.remove(KEY_USERNAME);
            editor.remove(KEY_PASSWORD);
            editor.putBoolean(KEY_REMEMBER_ME, false);
            editor.apply();
    }
}

