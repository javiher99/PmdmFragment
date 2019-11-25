package com.example.PmdmFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CodigoFragment2 extends Fragment {
    Button bt3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View vista;
        vista = inflater.inflate(R.layout.fragmento2, container);

        initComponents(vista);
        return vista;


    }

    void initComponents(View view) {
        bt3 = view.findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Fragment 2", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
