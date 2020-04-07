package fr.android.moi.eko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    private Scanner x;
    //DatabaseHelper myDb;

    lecture lecteur = new lecture();




    public void openFile(){
        try{
            x = new Scanner("src/data.txt");
        }
        catch(Exception e){
            System.out.println("fichier introuvable");
        }

    }

    public void readFile(){
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();

            System.out.printf("%s %s %s\n", a, b, c);
        }
    }

    public void closefile(){
        x.close();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.e("dsqdq", "azeaze");

       // myDb = new DatabaseHelper(this);
    }

    public void myClickHandler(View view)
    {
        switch(view.getId())
        {
            case R.id.ButtonHome:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                openFile();
                readFile();
                closefile();
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

}
