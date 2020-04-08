package fr.android.moi.eko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.Scanner;

public class RecettesActivity extends AppCompatActivity{

    private Scanner x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recettes);

        final Button buttonEntrees = findViewById(R.id.ButtonEntrees);
        buttonEntrees.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showRecettes("entrees");
            }
        });
        final Button buttonPlats = findViewById(R.id.ButtonPlats);
        buttonPlats.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showRecettes("plats");
            }
        });
        final Button buttonDesserts = findViewById(R.id.ButtonDesserts);
        buttonDesserts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showRecettes("desserts");
            }
        });
        final Button buttonTout = findViewById(R.id.ButtonTous);
        buttonTout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showRecettes("tout");
            }
        });
    }

    public void myClickHandler1(View view)
    {
        switch(view.getId())
        {
            case R.id.ButtonHome:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
            case R.id.ButtonDonner:
                /*Log.i("clique", "ok");
                Intent intent1 = new Intent(getApplicationContext(), DonnerActivity.class);
                Log.i("lance activity 1", "ok");
                startActivity(intent1);
                Log.i("lance activity 2", "ok");
                break;*/
            case R.id.ButtonRecettes:
                Intent intent2 = new Intent(getApplicationContext(), RecettesActivity.class);
                startActivity(intent2);
                break;
            case R.id.ButtonFrigo:
                Intent intent3 = new Intent(getApplicationContext(), FrigoActivity.class);
                startActivity(intent3);
                break;
        }
    }

   /* public void Click (View view)
    {
        switch(view.getId())
        {
            case R.id.buttonEntrees:
                showRecettes("entrees");
                break;
            case R.id.buttonPlats:
                showRecettes("plats");
                break;
            case R.id.buttonDesserts:
                showRecettes("desserts");
                break;
            case R.id.buttonTous:
                showRecettes("tout");
                break;
        }
    }*/

    public void showRecettes(String type)
    {
        TextView textRecettes = (TextView) findViewById(R.id.textRecettes);
        String text = "";
        try
        {
            x = new Scanner(this.getAssets().open("entrees.txt"));
            while(x.hasNext())
            {
                String a = x.nextLine();
                text = text + a + "\n";
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }

        textRecettes.setText(text);
    }
}
