package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class event_summary extends AppCompatActivity {
    FloatingActionButton settingsButton, editButton, infoButton, deleteButton;
    Boolean aBoolean = true;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        settingsButton = findViewById(R.id.settingsButton);
        editButton = findViewById(R.id.editButton);
        infoButton = findViewById(R.id.infoButton);
        deleteButton = findViewById(R.id.deleteButton);

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aBoolean) {
                    editButton.show();
                    infoButton.show();
                    deleteButton.show();
                    aBoolean = false;
                }else {
                    editButton.hide();
                    infoButton.hide();
                    deleteButton.hide();
                    aBoolean = true;
                }

            }
        });
    }
}
