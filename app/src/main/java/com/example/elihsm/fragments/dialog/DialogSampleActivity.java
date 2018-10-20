package com.example.elihsm.fragments.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.elihsm.fragments.R;

public class DialogSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_sample);
        Button button=findViewById(R.id.button_dialogSample_standard);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog=new AlertDialog.Builder(DialogSampleActivity.this)
                        .setTitle("Hello")
                        .setMessage("This is a test")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(DialogSampleActivity.this,"positive button clicked",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(DialogSampleActivity.this,"negative button clicked",Toast.LENGTH_SHORT).show();

                            }
                        }).create();
                alertDialog.show();
            }


        });
        Button customDialogButton=findViewById(R.id.button_dialogSample_custom);
        customDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyCustomDialog myCustomDialog=new MyCustomDialog();
                myCustomDialog.show(getSupportFragmentManager(),null);
                myCustomDialog.setOnButtonAClicked(new MyCustomDialog.onButtonAClicked() {
                    @Override
                    public void onClick(String message) {
                        Toast.makeText(DialogSampleActivity.this,message,Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });

    }
}
