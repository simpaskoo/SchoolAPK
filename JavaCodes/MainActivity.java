package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton PrepareAddButton;
    public FloatingActionButton addActivity;
    public CardView cardMain;
    public LinearLayout linerLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collector);

        PrepareAddButton = (FloatingActionButton) findViewById(R.id.floatingActionButton10);
        PrepareAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open_activity_new_event();
            }
        });

        CardView.LayoutParams params = new CardView().LayoutParams(
                CardView.LayoutParams.WRAP_CONTENT,
                CardView.LayoutParams.WRAP_CONTENT);
        Button  btn = new Button(this);
        btn.setText("Your text from edittext");
        layout.addView(btn, params);

        addActivity = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        cardMain.findViewById(R.id.cardMain);
        linerLayout.findViewById(R.id.linerLayout);

        addActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CardView newCard = new CardView(MainActivity.this);
                /*newCard.setLayoutParams(cardMain.getLayoutParams());
                linerLayout.addView(newCard, linerLayout.getChildCount()-1);*/


            }
        });

    }

    public void Open_activity_new_event() {
        Intent intent = new Intent(this, event_new_event.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }
}