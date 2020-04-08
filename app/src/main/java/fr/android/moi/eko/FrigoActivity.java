package fr.android.moi.eko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FrigoActivity extends AppCompatActivity {
    private Scanner x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frigo);
        readFile();
    }

    public void myClickHandler2(View view)
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
            case R.id.ButtonAjouter:
                Intent intent4 = new Intent(getApplicationContext(), AjoutActivity.class);
                startActivity(intent4);
                break;
        }
    }

    public void readFile()
    {
        TextView editproduit1 = (TextView) findViewById(R.id.produit1);
        String text = "";
        try{
            x = new Scanner(this.getAssets().open("data.txt"));
            while(x.hasNext()){
                String a = x.next();
                String b = x.next();
                String c = x.next();
                text = text + a + " " + b + " " + c + " " ;
            }

            /*InputStream is =this.getAssets().open("data.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();*/
        }
        catch(Exception e){
            Log.e("ad", "aza");

    }




        editproduit1.setText(text);
    }
}
