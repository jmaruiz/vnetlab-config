package configurator;
import java.io.*;
import java.util.Arrays;

public class Parser {
    public static void main(String [] args) {

        // This will reference one line at a time
        String line;
        Boolean parseObject = false;
        Object currentItem = new NetworkItem(null, null);

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader("network1.cfg");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                if (parseObject) {
                    String[] lineRead = line.split(":");
                    if (lineRead[0].contains("}")) {
                        System.out.println("Object ended.");
                        parseObject = false;
                    } else {
                        //currentItem.setos(lineRead[1]);
                    }
                } else {
                    String[] lineRead = line.split(" ");
                    if (lineRead.length == 3) {
                        if (lineRead[2].contains("{")) {
                            NetworkItem item = new NetworkItem(lineRead[0], lineRead[1]);
                            parseObject = true;
                            currentItem = item;
                        } else {

                        }
                    } else if (lineRead.length == 2 && lineRead[0].contains("partial_solution")){
                        System.out.println("END FOUND");
                    } else if (line.trim().equals("")) {
                        System.out.println("Blank line.");
                    } else {
                        System.out.println("Length incorrect. Actual length: " + lineRead.length);
                    }
                }
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
