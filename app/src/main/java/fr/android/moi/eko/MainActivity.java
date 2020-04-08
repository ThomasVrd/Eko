package fr.android.moi.eko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    private Scanner x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //openFile();
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //closefile();
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



    public void openFile(){
        try{
            x = new Scanner("C:\\Users\\marie\\AndroidStudioProjects\\Eko\\data.txt");
        }
        catch(Exception e){
            System.out.println("fichier introuvable");
        }

    }

    public void readFile() throws IOException {

        String text= "";
        TextView editRead = (TextView) findViewById(R.id.editRead);
        try{
           // InputStream is = new FileInputStream("/")
            InputStream is =this.getAssets().open("data.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        editRead.setText(text);
       /* x = new Scanner("C:\\Users\\marie\\AndroidStudioProjects\\Eko\\data.txt");
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();

            //System.out.printf("%s %s %s\n", a, b, c);
        }*/
    }

    public void closefile(){
        x.close();
    }

}
