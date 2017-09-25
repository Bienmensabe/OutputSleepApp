package com.telemetry.outputsleepapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.telemetry.outputsleepapp.R;

public class SignInActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
    }

    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.sign_in_label:

                break;

            case R.id.sign_in_forgot_password:

                break;
        }
    }
}
