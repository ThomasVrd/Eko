package fr.android.moi.eko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*homeButton = (ImageButton) findViewById(R.id.imageButton2);
        recettesButton = (ImageButton) findViewById(R.id.imageButton5);
        donnerButton = (ImageButton) findViewById(R.id.imageButton4);
        frigoButton = (ImageButton) findViewById(R.id.imageButton6);


        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                setContentView(R.layout.activity_donner2);
            }
        });

        donnerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, DonnerActivity.class);
                startActivity(intent);
            }
        });

        recettesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                setContentView(R.layout.activity_donner2);
            }
        });
        frigoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                setContentView(R.layout.activity_donner2);
            }
        });*/

    }

    public void myClickHandler(View view)
    {
        switch(view.getId())
        {
            case R.id.ButtonHome:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
            case R.id.ButtonDonner:
                Log.i("clique", "ok");
                Intent intent1 = new Intent(getApplicationContext(), DonnerActivity.class);
                Log.i("lance activity 1", "ok");
                startActivity(intent1);
                Log.i("lance activity 2", "ok");
                break;
            case R.id.ButtonRecettes:
                //Intent intent2 = new Intent(MainActivity.this, DonnerActivity.class);
                //startActivity(intent2);
                break;
            case R.id.ButtonFrigo:
                //Intent intent3 = new Intent(MainActivity.this, DonnerActivity.class);
                //startActivity(intent3);
                break;
        }
    }

}
