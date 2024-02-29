package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication2.R;

public class MainActivity extends AppCompatActivity {
    private Button uploadButton;
    private Button downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Initialize buttons
        uploadButton = findViewById(R.id.Upload);
        downloadButton = findViewById(R.id.Download);
// Set onClickListeners for buttons
        uploadButton.setOnClickListener(view -> {
// Display uploading toast message
            Toast.makeText(MainActivity.this, "Uploading....", Toast.LENGTH_SHORT).show();
// Add your uploading logic here
        });
        downloadButton.setOnClickListener(view -> {
// Display downloading toast message
            Toast.makeText(MainActivity.this, "Downloading.....", Toast.LENGTH_SHORT).show();
// Add your downloading logic here
        });

    }
}