package TextFiles;
import java.util.Scanner;
import java.io.*;
public class pokeImages {
    private static File file = new File("pokemon.csv");
    private static String[] lines = new String[152];

    public static int readFile() throws IOException 
    {
        Scanner scanner = new Scanner(file);
        int i = 0;
        while (scanner.hasNext()) { 
            lines[i] = scanner.nextLine();
            i++;
        }
        System.out.println("Read in "+i+" lines.");
        scanner.close();
        return i;

    }
    public static void main(String[] args) throws IOException {
        System.out.println(readFile());
    }
}
