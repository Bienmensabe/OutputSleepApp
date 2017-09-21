package com.telemetry.outputsleepapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.telemetry.outputsleepapp.R;

public class LaunchActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch);
    }

    public void onClick(View view) {
        Intent intent = new Intent();

        switch(view.getId()) {
            case R.id.launch_sign_in:
                intent = new Intent(LaunchActivity.this, SignInActivity.class);
                break;
            case R.id.launch_sign_up:
                intent = new Intent(LaunchActivity.this, SignUpActivity.class);
                break;
        }

        startActivity(intent);

    }
}
