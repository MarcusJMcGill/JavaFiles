// Chromebook-20-0001

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//Add support for lists that don't start at 0. ex: Chromebook-20-0050  -> Chromebook-20-1000

public class Main {
    static String item = "Chromebook-20"; // ex:"Chromebook-20"
    static String fileName = "Chromebooks";
    static int copiesOfLabels = 2;
    static int totalLabels = 1096;

    //static String filePath = "C:\\Programming\\labels.csv";
    static String filePath = "/Users/laptop/Desktop/" + fileName + ".csv";


    public static void main(String[] args) throws IOException{
        Path file = Path.of(filePath);

        Formatcsv formatcsv;
        formatcsv = new Formatcsv(item, copiesOfLabels, totalLabels);
        Files.writeString(file, formatcsv.getFormattedLabels());

    }

}
