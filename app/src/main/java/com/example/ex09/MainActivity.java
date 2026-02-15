package com.example.ex09;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText eT;
    Button clickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eT = findViewById(R.id.eT);
        clickme = findViewById(R.id.clickme);

    }

    public void clicked(View view) {
        String in = eT.getText().toString();
        int num = Integer.parseInt(in);
        Log.i("eT", "" + num);
        if (num % 7 != 0) {
            clickme.setText(in);
        }
        else clickme.setText("BOOM");

    }
}