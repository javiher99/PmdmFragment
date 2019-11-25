package com.example.PmdmFragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Button bt1, bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Fragmento1
        // bt1 = findViewById(R.id.bt1);
        // bt2 = findViewById(R.id.bt2);

        // Fragmento2
        // bt3 = findViewById(R.id.bt3);

        // bt1.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        Toast.makeText(MainActivity.this, "Fragment1", Toast.LENGTH_SHORT).show();
        //    }
        // });

        // bt2.setOnClickListener(new View.OnClickListener() {
        //   @Override
        //    public void onClick(View v) {
        //        Toast.makeText(MainActivity.this, "Fragment1", Toast.LENGTH_SHORT).show();
        //    }
        // });

        // if(bt3 != null) { // Si el b3 no existe porque fragment2 no esta cargado
        //    bt3.setOnClickListener(new View.OnClickListener() {
        //        @Override
        //        public void onClick(View v) {
        //            Toast.makeText(MainActivity.this, "Fragment2", Toast.LENGTH_SHORT).show();
        //        }
        //    });
        // }

    }


}
