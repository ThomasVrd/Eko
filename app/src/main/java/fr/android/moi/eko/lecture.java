package fr.android.moi.eko;
import java.io.*;
import java.util.*;

public class lecture {
    private Scanner x;

    public void openFile(){
        try{
            x = new Scanner("C:\\Users\\thoma\\Desktop\\wetransfer-deab99\\Eko2\\app\\src\\data.txt");
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
}
