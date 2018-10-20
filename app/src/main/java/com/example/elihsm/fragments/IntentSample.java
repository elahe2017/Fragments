package com.example.elihsm.fragments;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class IntentSample extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_sample);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_explicitIntent:
                Intent intent=new Intent(this,MainActivity.class);
                intent.putExtra(MainActivity.KEY_CHARACTER, "C");
                startActivity(intent);
                break;
            case R.id.button_implicitIntent:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com")));
        }
    }
}
