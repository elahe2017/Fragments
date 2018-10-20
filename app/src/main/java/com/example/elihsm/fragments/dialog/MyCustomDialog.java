package com.example.elihsm.fragments.dialog;

import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.elihsm.fragments.R;

public class MyCustomDialog extends DialogFragment {
    private onButtonAClicked onButtonAClicked;
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getContext());
        View view= LayoutInflater.from(getContext()).inflate(R.layout.dialog_custom,null);
        Button buttonA=view.findViewById(R.id.button_dialogSample_a);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onButtonAClicked!=null)
                    onButtonAClicked.onClick("Button A Clicked");
            }
        });
        builder.setView(view);
return builder.create();


    }

    public void setOnButtonAClicked(MyCustomDialog.onButtonAClicked onButtonAClicked) {
        this.onButtonAClicked = onButtonAClicked;
    }

    public interface onButtonAClicked{
        void onClick(String message);
    }
}
