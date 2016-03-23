/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author joser
 */
public class EditWindow extends javax.swing.JFrame {

    /**
     * Creates new form EditWindow
     */
    public EditWindow(MainWindow1 main) {
        initComponents();
        mainWindow = main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JLabel();
        verField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        osField = new javax.swing.JTextField();
        eth0Field = new javax.swing.JTextField();
        eth1Field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        eth2Field = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        srcField = new javax.swing.JTextField();
        eth0Con = new javax.swing.JButton();
        eth1Con = new javax.swing.JButton();
        eth2Con = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Network Item:");

        nameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        verField.setToolTipText("");

        jLabel3.setText("Ver:");

        jLabel4.setText("OS:");

        jLabel5.setText("eth0:");

        jLabel6.setText("eth1:");

        jLabel7.setText("eth2:");

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Src:");

        eth0Con.setText("Connect");
        eth0Con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eth0ConActionPerformed(evt);
            }
        });

        eth1Con.setText("Connect");
        eth1Con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eth1ConActionPerformed(evt);
            }
        });

        eth2Con.setText("Connect");
        eth2Con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eth2ConActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verField)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(osField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eth1Field)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eth1Con))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eth2Field)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eth2Con))
                            .addComponent(srcField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eth0Field, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eth0Con)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(osField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(srcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(eth0Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eth0Con))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(eth1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eth1Con))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(eth2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eth2Con))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton)
                    .addComponent(delete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    VM netItem = null;
    MainWindow1 mainWindow = null;
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        mainWindow.setConsole("");
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        setNetItemProps();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void eth0ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eth0ConActionPerformed
        connect(netItem, "eth0");
    }//GEN-LAST:event_eth0ConActionPerformed

    private void eth1ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eth1ConActionPerformed
        connect(netItem, "eth1");
    }//GEN-LAST:event_eth1ConActionPerformed

    private void eth2ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eth2ConActionPerformed
        connect(netItem, "eth2");
    }//GEN-LAST:event_eth2ConActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        JFrame frame = new JFrame("Confirm Delete");
        Integer deleted = JOptionPane.showConfirmDialog(frame, "Are you sure?", "Confirm delete.", JOptionPane.YES_NO_OPTION);
        if (deleted == 0){
            if (mainWindow.deleteItem(netItem.name)){
                this.dispose();
            } else { System.out.println("Netitem not detected, can't delete."); }
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(EditWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditWindow(null).setVisible(true);
            }
        });
    }
    
    public void setNetItem(VM net) {
        netItem = net;
    }
    
    public void changeName(String newText) {
        nameField.setText(newText);
    }
    public void changeOs(String newText) {
        osField.setText(newText);
    }
    public void changeVer(String newText) {
        verField.setText(newText);
    }
    public void changeSrc(String newText) {
        srcField.setText(newText);
    }
    public void changeEth0(String newText) {
        eth0Field.setText(newText);
    }
    public void changeEth1(String newText) {
        eth1Field.setText(newText);
    }
    public void changeEth2(String newText) {
        eth2Field.setText(newText);
    }
    
    public void setNetItemProps() {
        netItem.ver = this.verField.getText();
        netItem.src = this.srcField.getText();
        netItem.os = this.osField.getText();
        netItem.eth0 = this.eth0Field.getText();
        netItem.eth1 = this.eth1Field.getText();
        netItem.eth2 = this.eth2Field.getText();
        
        mainWindow.setConsole(netItem.name + " has been updated.");
        this.dispose();
    }
    
    public void connect(VM item, String port) {
        HashMap itemSet = mainWindow.getVmItems();
        JFrame frame = new JFrame("Connect a port to a hub.");
        String name = JOptionPane.showInputDialog(frame, "Enter the name of the hub you want to connect to:");
        if (name != null && !name.equals("")){
            name = name.replaceAll("\\s+","");
            NetworkItem hub = (NetworkItem) itemSet.get(name);
            if (hub.type.equals("hub")) {
                String add = item.addConn(port, "v2." + hub.internal);
                mainWindow.setConsole(add);
                this.dispose();
            } else {
                mainWindow.setConsole("ERROR: hub with the name " + name + " does not exist.");
                this.dispose();
            }
        } else if (name != null && name.equals("")) {
            String remove = item.removeConn(port);
            mainWindow.setConsole(remove);
            this.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton delete;
    private javax.swing.JButton eth0Con;
    private javax.swing.JTextField eth0Field;
    private javax.swing.JButton eth1Con;
    private javax.swing.JTextField eth1Field;
    private javax.swing.JButton eth2Con;
    private javax.swing.JTextField eth2Field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nameField;
    private javax.swing.JTextField osField;
    private javax.swing.JTextField srcField;
    private javax.swing.JTextField verField;
    // End of variables declaration//GEN-END:variables
}
