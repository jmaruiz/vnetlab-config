/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

import java.io.File;

/**
 *
 * @author joser
 */
public class configFilter extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File file) {
        return file.isDirectory() || file.getAbsolutePath().endsWith(".cfg");
    }
    @Override
    public String getDescription() {
        return "Config files (*.cfg)";
    }
}
