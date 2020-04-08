package fr.android.moi.eko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.util.Scanner;

public class RecettesActivity extends AppCompatActivity{

    private Scanner x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recettes);
        showRecettes("tout");
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
                Log.i("lance activity 2", "ok");*/
                break;
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

    public void Click (View view)
    {
        switch(view.getId())
        {
            case R.id.ButtonEntrees:
                showRecettes("entrees");
                break;
            case R.id.ButtonPlats:
                showRecettes("plats");
                break;
            case R.id.ButtonDesserts:
                showRecettes("desserts");
                break;
            case R.id.ButtonTous:
                showRecettes("tout");
                break;
        }
    }

    public void showRecettes(String type)
    {
        TextView textNom1 = (TextView) findViewById(R.id.textNom1);
        TextView textNom2 = (TextView) findViewById(R.id.textNom2);
        TextView textNom3 = (TextView) findViewById(R.id.textNom3);
        TextView textNvx1 = (TextView) findViewById(R.id.textNvx1);
        TextView textNvx2 = (TextView) findViewById(R.id.textNvx2);
        TextView textNvx3 = (TextView) findViewById(R.id.textNvx3);
        TextView textTemps1 = (TextView) findViewById(R.id.textTemps1);
        TextView textTemps2 = (TextView) findViewById(R.id.textTemps2);
        TextView textTemps3 = (TextView) findViewById(R.id.textTemps3);
        TextView textNom4 = (TextView) findViewById(R.id.textNom4);
        TextView textNom5 = (TextView) findViewById(R.id.textNom5);
        TextView textNom6 = (TextView) findViewById(R.id.textNom6);
        TextView textNvx4 = (TextView) findViewById(R.id.textNvx4);
        TextView textNvx5 = (TextView) findViewById(R.id.textNvx5);
        TextView textNvx6 = (TextView) findViewById(R.id.textNvx6);
        TextView textTemps4 = (TextView) findViewById(R.id.textTemps4);
        TextView textTemps5 = (TextView) findViewById(R.id.textTemps5);
        TextView textTemps6 = (TextView) findViewById(R.id.textTemps6);
        TextView textNom7 = (TextView) findViewById(R.id.textNom7);
        TextView textNom8 = (TextView) findViewById(R.id.textNom8);
        TextView textNom9 = (TextView) findViewById(R.id.textNom9);
        TextView textNvx7 = (TextView) findViewById(R.id.textNvx7);
        TextView textNvx8 = (TextView) findViewById(R.id.textNvx8);
        TextView textNvx9 = (TextView) findViewById(R.id.textNvx9);
        TextView textTemps7 = (TextView) findViewById(R.id.textTemps7);
        TextView textTemps8 = (TextView) findViewById(R.id.textTemps8);
        TextView textTemps9 = (TextView) findViewById(R.id.textTemps9);
        String[] text = new String[30];
        String a = "";
        int i=0;
        try
        {
            x = new Scanner(this.getAssets().open("entrees.txt"));
            if(type.equals("entrees"))
            {
                a = x.nextLine();
                do
                {
                    a = x.nextLine();
                    text[i] = a + "\n ";
                    i++;
                }while(!x.nextLine().equals("Plats"));
            }
            if(type.equals("plats"))
            {
                a = x.nextLine();
                do
                {
                    a = x.nextLine();
                }while(!x.nextLine().equals("Plats"));
                do
                {
                    a = x.nextLine();
                    text[i] = a + "\n ";
                    i++;
                }while(!x.nextLine().equals("Desserts"));
            }
            if(type.equals("desserts"))
            {
                a = x.nextLine();
                do
                {
                    a = x.nextLine();
                }while(!x.nextLine().equals("Desserts"));
                a = x.nextLine();
                do
                {
                    a = x.nextLine();
                    text[i] = a + "\n ";
                    i++;
                }while(!x.nextLine().equals("fin"));
            }
            if(type.equals("tout"))
            {
                while(x.hasNext())
                {
                    a = x.nextLine();
                            if(!a.equals("..") && !a.equals("Entrées") && !a.equals("Plats") && !a.equals("Desserts") && !a.equals("fin"))
                            {
                                text[i] = a + "\n ";
                                i++;
                            }
                }
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }

        if(type.equals("tout"))
        {
            textNom1.setText(text[0]);
            textNvx1.setText(text[1]);
            textTemps1.setText(text[2]);
            textNom2.setText(text[3]);
            textNvx2.setText(text[4]);
            textTemps2.setText(text[5]);
            textNom3.setText(text[6]);
            textNvx3.setText(text[7]);
            textTemps3.setText(text[8]);
            textNom4.setText(text[9]);
            textNvx4.setText(text[10]);
            textTemps4.setText(text[11]);
            textNom5.setText(text[12]);
            textNvx5.setText(text[13]);
            textTemps5.setText(text[14]);
            textNom6.setText(text[15]);
            textNvx6.setText(text[16]);
            textTemps6.setText(text[17]);
            textNom7.setText(text[18]);
            textNvx7.setText(text[19]);
            textTemps7.setText(text[20]);
            textNom8.setText(text[21]);
            textNvx8.setText(text[22]);
            textTemps8.setText(text[23]);
            textNom9.setText(text[24]);
            textNvx9.setText(text[25]);
            textTemps9.setText(text[26]);
        }
        else
        {
            textNom1.setText(text[0]);
            textNvx1.setText(text[1]);
            textTemps1.setText(text[2]);
            textNom2.setText(text[3]);
            textNvx2.setText(text[4]);
            textTemps2.setText(text[5]);
            textNom3.setText(text[6]);
            textNvx3.setText(text[7]);
            textTemps3.setText(text[8]);
        }
    }
}
