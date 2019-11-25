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

public class CodigoFragment1 extends Fragment {

    Button bt1, bt2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @Nullable Bundle savedInstanceState){

        View vista;
        vista = inflater.inflate(R.layout.fragment1, container);
        // return vista;

        // Otra solucion
        initComponents(vista);
        return vista;
    }

    void initComponents(View view) {
        bt1 = view.findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Fragment 1", Toast.LENGTH_SHORT).show();
            }
        });
        bt2 = view.findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Fragment 1", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
