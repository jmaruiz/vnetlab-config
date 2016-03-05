/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author joser
 */
public class MainWindow1 extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow1
     */
    public MainWindow1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        newVm = new javax.swing.JButton();
        newHub = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        consoleLbl = new javax.swing.JLabel();
        scroller = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("Open a configuration file...");
        fileChooser.setFileFilter(new configFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newVm.setText("New VM");
        newVm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newVmActionPerformed(evt);
            }
        });

        newHub.setText("New Hub");
        newHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newHubActionPerformed(evt);
            }
        });

        jLabel1.setText("Console:");

        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPanel.setPreferredSize(new java.awt.Dimension(500, 400));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        scroller.setViewportView(mainPanel);

        deleteButton.setText("Delete Item");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroller, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(consoleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newVm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newHub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newVm)
                    .addComponent(newHub)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroller, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(consoleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    HashMap<String, NetworkItem> itemsMap = new HashMap<>();
    HashMap<String, JButton> buttonsMap = new HashMap<>();
    ImageIcon vmIcon = new javax.swing.ImageIcon(getClass().getResource("/configurator/images/vm.jpg"));
    ImageIcon hubIcon = new javax.swing.ImageIcon(getClass().getResource("/configurator/images/hub.jpg"));
    
    public void createNetItem(String type, String name) {
        NetworkItem item = new NetworkItem(type, name);
        itemsMap.put(name, item);
        publishItem(item);
    }
    
    public void publishItem(NetworkItem item) {
        mainPanel.setLayout(new FlowLayout(1, 1, 1));
        JButton button = new JButton(item.name);
        buttonsMap.put(item.name, button);
        NetworkItem net = itemsMap.get(item.name);
        button.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
            System.out.println(net.name);
            EditWindow editor = new EditWindow();
            editor.changeName(net.name); editor.changeOs(net.os); 
            editor.changeVer(net.ver); editor.changeSrc(net.src); 
            editor.changeEth0(net.eth0); editor.changeEth1(net.eth1);
            editor.changeEth2(net.eth2); editor.changeInf(net.inf);
            editor.changeSubnet(net.subnet); editor.changeMask(net.netmask);
            editor.setNetItem(net);
            editor.setVisible(true);
          }
        });
        if (item.type.equals("vm")) { button.setIcon(vmIcon); }
        else if (item.type.equals("hub")) { button.setIcon(hubIcon); }
        mainPanel.add(button);
        mainPanel.revalidate();
        validate();
    }
    
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
              // What to do with the file, e.g. display it in a TextArea
              itemsMap = Parser.parse(new FileReader( file.getAbsolutePath() ));
              for (NetworkItem item : itemsMap.values()) {
                  publishItem(item);
              }
            } catch (IOException ex) {
              System.out.println("problem accessing file " + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void newVmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newVmActionPerformed
        JFrame frame = new JFrame("Create a new vm");
        String name = JOptionPane.showInputDialog(frame, "Enter a name:");
        name = name.replaceAll("\\s+","");
        consoleLbl.setText("");
        if (name != null && !name.equals("")){
            if (itemsMap.get(name) != null) {
                consoleLbl.setText("ERROR - network item with that name already exists!");
            } else {
                createNetItem("vm", name);
            }
        }
    }//GEN-LAST:event_newVmActionPerformed

    private void newHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newHubActionPerformed
        JFrame frame = new JFrame("Create a new hub");
        String name = JOptionPane.showInputDialog(frame, "Enter a name:");
        name = name.replaceAll("\\s+","");
        consoleLbl.setText("");
        if (name != null && !name.equals("")){
            if (itemsMap.get(name) != null) {
                consoleLbl.setText("ERROR - network item with that name already exists!");
            } else {
                createNetItem("hub", name);
            }
        }
    }//GEN-LAST:event_newHubActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JFrame frame = new JFrame("About Configurator");
        String aboutString = 
            "This app was created and programmed for CSET 3600 (University of Toledo)\n"
          + "Group 4 consists of the following:\n"
          + "Jose Ruiz\nEdison Williams\nJeff Wang\nAlex Borger\nCharles Hempstead\n";
        JOptionPane.showMessageDialog(frame, aboutString);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        Writer writer = new Writer();
        String finalstr;
        finalstr = "";
        
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            
            for (NetworkItem item : itemsMap.values()) {
                item.os = "Linux"; item.ver = "7.5"; item.src = "/srv/VMLibrary/JeOS"; // test purposes to add variables
                finalstr += item.generateString();
            }
            
            try {
                configurator.Writer.writeCfg(finalstr, new File(file.getAbsolutePath() ));
            } catch (IOException ex) {
                Logger.getLogger(MainWindow1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
        
        
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        JFrame frame = new JFrame("Delete an item");
        String name = JOptionPane.showInputDialog(frame, "Enter the name of the network item you want to delete:");
        name = name.replaceAll("\\s+","");
        consoleLbl.setText("");
        if (name != null && !name.equals("")){
            if (itemsMap.get(name) != null) {
                mainPanel.remove(buttonsMap.get(name));
                mainPanel.revalidate();
                mainPanel.repaint();
                itemsMap.remove(name);
                consoleLbl.setText(name + " has been successfully removed");
            } else {
                consoleLbl.setText("ERROR - network item with that name does not exist!");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel consoleLbl;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton newHub;
    private javax.swing.JButton newVm;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JScrollPane scroller;
    // End of variables declaration//GEN-END:variables

}
