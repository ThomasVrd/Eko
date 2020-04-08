package fr.android.moi.eko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
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
        TextView produit1 = (TextView) findViewById(R.id.textView2);
        TextView produit2 = (TextView) findViewById(R.id.textView3);
        TextView produit3 = (TextView) findViewById(R.id.textView4);
        ImageView imgp1 = (ImageView) findViewById(R.id.imageView2);
        ImageView imgp2 = (ImageView) findViewById(R.id.imageView3);
        ImageView imgp3 = (ImageView) findViewById(R.id.imageView5);

        String[] text = new String[]{"", "", ""};
        String[] img = new String[]{"", "", ""};
        int i=0;
        try{
            x = new Scanner(this.getAssets().open("data.txt"));
            while(x.hasNext()){
                String a = x.next();
                String b = x.next();
                String c = x.next();

                text[i] = text[i] + a + " " + b + " " + c + "\n  " ;
                //img[i] = d; mettre le lien de l'image
                i++;

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




        produit1.setText(text[0]);
        produit2.setText(text[1]);
        produit3.setText(text[2]);

        imgp1.setImageResource(R.drawable.tomate);
        imgp2.setImageResource(R.drawable.carotte);
        imgp3.setImageResource(R.drawable.poulet);


    }
}
