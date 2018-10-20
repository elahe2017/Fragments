package com.example.elihsm.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.PluralsRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentA extends Fragment {
    private TextView textView;
    private String character;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         character= getArguments().getString(MainActivity.KEY_CHARACTER);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_a,container,false);
        textView=rootView.findViewById(R.id.tv_fragmentA);
        textView.setText(character);
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
    }
    public static FragmentA newInstance(String character){

        Bundle bundle=new Bundle();
        bundle.putString(MainActivity.KEY_CHARACTER,character);
        FragmentA fragmentA=new FragmentA();
        fragmentA.setArguments(bundle);
        return fragmentA;


    }
}
