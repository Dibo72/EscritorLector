import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;

public class EscritorLector {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Juan" + "\n" + "Pepe" + "\n" + "Felpe" + "\n" + "Carlos" + "\n" + "Ramon");
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter("nombres.txt"))) {
            for (String linea : lista) {
                escritor.write(linea);
                escritor.newLine();
            }
        }catch(Exception e){
            System.out.println(e);
        }

        try(BufferedReader lector = new BufferedReader(new FileReader("nombres.txt"))){
            String line;
            while ((line = lector.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}