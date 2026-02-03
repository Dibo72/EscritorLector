import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;

public class EscritorLector {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("El sol salió temprano y llenó la mañana de luz." + "\n" +

                "A veces el silencio dice más que mil palabras." + "\n" +

                "Aprender algo nuevo cambia la forma de ver el mundo." + "\n" +

                "Un café caliente puede arreglar un día complicado." + "\n" +

                "Los pequeños detalles suelen marcar la diferencia.");
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter("archivo.txt"))) {
            for (String linea : lista) {
                escritor.write(linea);
                escritor.newLine();
            }
        }catch(Exception e){
            System.out.println(e);
        }

        try(BufferedReader lector = new BufferedReader(new FileReader("archivo.txt"))){
            String line;
            while ((line = lector.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}