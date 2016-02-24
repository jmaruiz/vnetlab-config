/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;
import java.io.*;

/**
 *
 * @author joser
 */
public class Writer {
    public static void main(String[] args) throws IOException {
	File fout = new File("testout.cfg");
	FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
 
	for (int i = 0; i < 10; i++) {
		bw.write("else");
		bw.newLine();
	}
 
	bw.close();
    }
    
    public static void writeCfg(String input, File file) throws IOException {
        if (!file.getAbsolutePath().contains(".cfg")) {
            file = new File(file.getAbsolutePath() + ".cfg");
        }
        FileOutputStream fos = new FileOutputStream(file);
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        
	bw.write(input);
        //bw.newLine();
	bw.close();
    }
}
