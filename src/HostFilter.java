import java.io.*;
import java.util.ArrayList;

public class HostFilter {
    public static void main(String[] args) {
        extractUrl("C:/Users/Roland/Desktop/test.txt", " ");
    }

    static void extractUrl(String source, String dest) {
        try {
            String ligne;
            BufferedReader fichier = new BufferedReader( new FileReader( source ));
            //BufferedWriter fichierCopier = new BufferedWriter( new FileWriter(dest));

            while ( (ligne = fichier.readLine() )!= null ){
                ligne+=ligne;
                if(ligne.contains(".orange.")){
                    System.out.println(ligne);
                }
            }
            fichier.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
