package com.telemetry.outputsleepapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.telemetry.outputsleepapp.R;

public class SignUpActivity extends AppCompatActivity{

    ImageView signUpCheckbox;
    boolean signUpCheckboxFlag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sign_up);

        signUpCheckbox = (ImageView)findViewById(R.id.sign_up_checkbox);
    }

    public void onClick(View view) {
        switch(view.getId()) {
            case  R.id.sign_up_label:

                break;

            case R.id.sign_up_checkbox:
                if(signUpCheckboxFlag)
                    signUpCheckbox.setImageResource(R.drawable.checkbox_on);
                else
                    signUpCheckbox.setImageResource(R.drawable.checkbox_off);
                signUpCheckboxFlag = !signUpCheckboxFlag;
                break;

            case R.id.sign_up_the_terms:

                break;

            case R.id.sign_up_facebook:

                break;

        }
    }

}
