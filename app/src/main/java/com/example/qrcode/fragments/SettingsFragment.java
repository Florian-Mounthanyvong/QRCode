package com.example.qrcode.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.*;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.qrcode.R;

public class SettingsFragment extends Fragment {

    public SettingsFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button b1 = getView().findViewById(R.id.login);
        EditText username = (EditText) getView().findViewById(R.id.username);
        EditText password = (EditText) getView().findViewById(R.id.password);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    Toast.makeText(getContext(),
                            "Connected!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}