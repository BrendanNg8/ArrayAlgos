package TextFiles;
import java.io.*;
import java.util.Scanner;

public class Text {
    
    public static void main(String[] args) throws IOException { 
        File pokemon = new File("pokemon.csv");

        Scanner scanner = new Scanner(pokemon);
        String[] lines = new String[10];
        int i = 0;
        while (scanner.hasNext() && i < 10) {
            lines[i] = scanner.nextLine();
            i++;
        }

    }
   
}
