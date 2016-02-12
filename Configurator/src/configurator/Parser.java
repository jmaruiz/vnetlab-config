package configurator;
import java.io.*;
import java.util.*;

public class Parser {
    public static void main(String [] args) {

        // This will reference one line at a time
        String line;
        HashMap<String, Object> itemsMap = new HashMap<>();

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader("network1.cfg");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                String[] lineRead = line.split(" ");
                if (lineRead.length == 3) {
                    if (lineRead[2].contains("{")) {
                        NetworkItem item = new NetworkItem(lineRead[0], lineRead[1]);
                        itemsMap.put(lineRead[1], item);
                    } else {
                        
                    }
                } else if (lineRead.length == 2 && lineRead[0].contains("partial_solution")){
                    //System.out.println("END FOUND");
                } else if (line.trim().equals("")) {
                    //System.out.println("Blank line.");
                } else {
                    //System.out.println("Length incorrect. Actual length: " + lineRead.length);
                }
            }   
            
            // Always close files.
            bufferedReader.close();
            printMap(itemsMap);
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    } 
    
    public static void printMap(Map map) {
       for (Object name: map.keySet()){
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " " + value);  
        }
    }
}
