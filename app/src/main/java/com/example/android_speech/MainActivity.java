package com.example.android_speech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android_speech.authentication.EmailPasswordActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firebaseAuthentication(View view){
        Intent intent = new Intent(this, EmailPasswordActivity.class);
        startActivity(intent);
    }


}
