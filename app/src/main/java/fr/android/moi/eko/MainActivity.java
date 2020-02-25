package fr.android.moi.eko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton homeButton;
    ImageButton recettesButton;
    ImageButton donnerButton;
    ImageButton frigoButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeButton = (ImageButton) findViewById(R.id.imageButton2);
        recettesButton = (ImageButton) findViewById(R.id.imageButton5);
        donnerButton = (ImageButton) findViewById(R.id.imageButton4);
        frigoButton = (ImageButton) findViewById(R.id.imageButton6);


        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                setContentView(R.layout.activity_donner);
            }
        });

        donnerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                setContentView(R.layout.activity_donner);
            }
        });

        recettesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                setContentView(R.layout.activity_donner);
            }
        });
        frigoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                setContentView(R.layout.activity_donner);
            }
        });

    }

}
