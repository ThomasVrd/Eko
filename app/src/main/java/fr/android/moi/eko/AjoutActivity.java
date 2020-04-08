package fr.android.moi.eko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AjoutActivity extends AppCompatActivity {

   EditText editNom, editMarque, editQuantite, editDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout);
    }

    public void myClickHandler3(View view)
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
            case R.id.ButtonAjout:
                ajouter();
                Intent intent4 = new Intent(getApplicationContext(), FrigoActivity.class);
                startActivity(intent4);
                break;
        }
    }

    public void ajouter()
    {
        editNom = (EditText) findViewById(R.id.EditTextNom);
        editMarque = (EditText) findViewById(R.id.EditTextMarque);
        editQuantite = (EditText) findViewById(R.id.EditTextQuantite);
        editDate = (EditText) findViewById(R.id.EditTextDate);
        String nom = editNom.getText().toString();
        String marque = editMarque.getText().toString();
        String quantite = editQuantite.getText().toString();
        String date = editDate.getText().toString();

        try{
            File file = new File("entrees.txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Bonjour");
            bw.close();
            fw.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }

    }
}
