package configurator;
import java.io.*;
import java.util.*;

public class Parser {

    public static void main(String [] args){
        FileReader fileReader;
        try {
            fileReader = new FileReader("network1.cfg");
            Parser.parse(fileReader);
        } catch (FileNotFoundException ex) {
            System.out.println("Issue opening file, " + ex.getMessage());
        }
    }
    
    public static HashMap<String, NetworkItem> parse(FileReader file) {
        // This will reference one line at a time
        String line, param, value, curType, curName;
        String[] lineRead;
        HashMap<String, NetworkItem> itemsMap = new HashMap<>();
        NetworkItem curMapItem = new NetworkItem(null, null);
        Boolean findObjects = true;

        try {
            // FileReader reads text files in the default encoding.

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(file);

            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                if (findObjects) {
                    lineRead = line.split(" ");
                    if (lineRead.length == 3) {
                        if (lineRead[2].contains("{")) {
                            curType = lineRead[0];
                            curName = lineRead[1];
                            NetworkItem item = new NetworkItem(curType, curName);
                            itemsMap.put(curName, item);
                            curMapItem = itemsMap.get(curName);
                            findObjects = false;
                        } else {

                        }
                    } else if (lineRead.length == 2 && lineRead[0].contains("partial_solution")){
                        //System.out.println("END FOUND");
                    } else if (line.trim().equals("")) {
                        //System.out.println("Blank line.");
                    } else {
                        //System.out.println("Length incorrect. Actual length: " + lineRead.length);
                    }
                } else {
                    //System.out.println(line.trim());
                    lineRead = line.trim().split(":");
                   if (lineRead.length == 2) {
                        param = lineRead[0].trim();
                        value = lineRead[1].trim();
                        try {
                            switch(param) {
                                case "os":
                                    curMapItem.os = value;
                                    break;
                                case "ver":
                                    curMapItem.ver = value;
                                    break;
                                case "src":
                                    curMapItem.src = value;
                                    break;
                                case "eth0":
                                    curMapItem.eth0 = value;
                                    break;
                                case "eth1":
                                    curMapItem.eth1 = value;
                                    break;
                                case "eth2":
                                    curMapItem.eth2 = value;
                                    break;
                                case "inf":
                                    curMapItem.inf = value;
                                    break;
                                case "subnet":
                                    curMapItem.subnet = value;
                                    break;
                                case "netmask":
                                    curMapItem.netmask = value;
                                    break;
                                default:
                                    System.out.println("Unknown Parameter Error.");
                            }
                        } catch(NullPointerException e) {
                            System.out.println("The object you're trying to access doesn't exist.");
                        }
                   } else if (lineRead.length == 1 && lineRead[0].contains("}")) {
                       findObjects = true;
                   }
                }
            }   
            
            // Always close files.
            bufferedReader.close();
            printMap(itemsMap);
            return itemsMap;
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    } 
    
    public static void printMap(Map map) {
        map.keySet().stream().forEach((name) -> {
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " " + value);
        });
    }
}
