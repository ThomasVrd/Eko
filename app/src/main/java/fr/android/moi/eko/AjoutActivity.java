package fr.android.moi.eko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AjoutActivity extends AppCompatActivity {

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
                //ajouter pour bdd
                Intent intent4 = new Intent(getApplicationContext(), FrigoActivity.class);
                startActivity(intent4);
                break;
        }
    }
}
