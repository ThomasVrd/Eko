package fr.android.moi.eko;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.sql.Date;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String db_name = "Eko.db";
    public static final String table_name = "Frigo";
    public static final String Produit_ID = "ID";
    public static final String Produit_nom = "Nom";
    public static final String Produit_marque = "Marque";
    public static final String Produit_quantite = "Quantite";
    public static final String Produit_peremption = "Date";

    public DatabaseHelper(@Nullable Context context) {
        super(context, db_name, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + table_name + "(ID INTEGER PRIMARY KEY AUTOINCREMENT ,Nom TEXT, Marque TEXT, Quantite INTEGER, Date  DATE)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists" + table_name);
        onCreate(db);
    }
}
