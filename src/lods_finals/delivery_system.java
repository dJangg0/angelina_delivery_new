/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lods_finals;

import java.sql.*;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dJangg0
 */
public class delivery_system extends javax.swing.JFrame {

    /**
     * Creates new form delivery_system
     */
//    String txtName[] = new String [100]; 
//    String txtQuantity[] = new String [100];
//    String txtPrice[] = new String [100];
//    String txtStore[] = new String [100];
    PreparedStatement pst;
    ResultSet rs;
    Connection con;

    public delivery_system() {
        initComponents();
        createConnection();
        displayTable();
        setLocationRelativeTo(null); // to center the frame
        enableTextField(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deliverbtn = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deliverBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtStoreName = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        deliverBtn.setText("Deliver");
        deliverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Type");

        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity");

        jLabel4.setText("Store Name");

        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deliverbtnLayout = new javax.swing.GroupLayout(deliverbtn);
        deliverbtn.setLayout(deliverbtnLayout);
        deliverbtnLayout.setHorizontalGroup(
            deliverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliverbtnLayout.createSequentialGroup()
                .addGroup(deliverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deliverbtnLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(deliverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83)
                        .addGroup(deliverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantity)
                            .addComponent(txtType)
                            .addComponent(txtStoreName, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(deliverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(deliverbtnLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deliverbtnLayout.setVerticalGroup(
            deliverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliverbtnLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(deliverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deliverbtnLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deliverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deliverbtnLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(deliverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(deliverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(deliverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deliverbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(deliverbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deliverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverBtnActionPerformed
//      try {
//            //enableTextfield(true);     // TODO add your handling code here:
//            String Name = jText1.getText(),
//                   Quantity = jText2.getText(),
//                   Price = jText3.getText(),
//                   store_name = jText4.getText();
//            
//                   int qty = Integer.parseInt(Quantity);
//                   int prc = Integer.parseInt(Price);               
//                   int total_price = qty*prc;
//            
//            pst = con.prepareStatement("INSERT INTO inventory(Name,Quantity,Price,Total,store_name) VALUES (?,?,?,?,?)");
//            pst.setString(1, Name);
//            pst.setString(2, Quantity);
//            pst.setString(3, Price);
//            pst.setInt(4, total_price);
//            pst.setString(5, store_name);
//            int k = pst.executeUpdate();
//            
//            if(k == 1 ){
//                JOptionPane.showMessageDialog(this, "Record Added Successfully!");
//                jText1.setText("");
//                jText2.setText("");
//                jText3.setText("");
//                jText4.setText("");
//                
//                displayTable();
//            }else{
//                JOptionPane.showMessageDialog(this, "Record Failed!");
//            }
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(delivery_system.class.getName()).log(Level.SEVERE, null, ex);
//        }        //         // TODO add your handling code here:
        deliver();
    }//GEN-LAST:event_deliverBtnActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        enableTextField(true);
        clearTextField();
    }//GEN-LAST:event_addBtnActionPerformed

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
            java.util.logging.Logger.getLogger(delivery_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delivery_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delivery_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delivery_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delivery_system().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deliverBtn;
    private javax.swing.JPanel deliverbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStoreName;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables

    public void createConnection() {
        String url = "jdbc:mysql://localhost:3306/angelina_bakeshop";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
    }

    public void enableTextField(Boolean b) {
        txtType.setEnabled(b);
        txtQuantity.setEnabled(b);
        txtStoreName.setEnabled(b);
    }
    public void clearTextField(){
        txtType.setText("");
        txtQuantity.setText("");
        txtStoreName.setText("");
    }

    public void displayTable() {

        int CC;

        try {
            pst = con.prepareStatement("SELECT * FROM inventory");
            rs = pst.executeQuery();
            ResultSetMetaData RSMD = (ResultSetMetaData) rs.getMetaData();
            CC = RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
            DFT.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();

                for (int i = 1; i <= CC; i++) {
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Quantity"));
                    //v2.add(rs.getString("Price"));
                }
                DFT.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(delivery_system.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        txtType.setText(DFT.getValueAt(selectedRow, 0).toString());
        txtQuantity.setText(DFT.getValueAt(selectedRow, 1).toString());
        //jText3.setText(DFT.getValueAt(selectedRow, 2).toString()); 
        txtStoreName.setText(DFT.getValueAt(selectedRow, 4).toString());
    }

    public void deliver() {
        boolean flag = false;
        String type = txtType.getText();
        int quantity = Integer.parseInt(txtQuantity.getText());
        String storeName = txtStoreName.getText();
        checkData(type, quantity);
        try {
            pst = con.prepareStatement("INSERT INTO transaction VALUES (DEFAULT, ?, ?, ?)");
            pst.setString(1, type);
            pst.setInt(2, quantity);
            pst.setString(3, storeName);
            System.out.println("Deliver successfully");
            pst.execute();
            pst.close();
            displayTable();
        } catch (SQLException ex) {
            Logger.getLogger(delivery_system.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void checkData(String type, int quantity) {
        boolean flag = false;
        boolean flag2 = false;
        try {
            pst = con.prepareStatement("SELECT * FROM transaction");
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("Name");
                int quantity1 = rs.getInt("Quantity");
                if (quantity < quantity1) {
                    flag2 = true;
                } else {
                    if (name.toLowerCase().equals(type.toLowerCase().trim())) {
                        flag = true;
                    }
                }
            }
            if (!flag2) {
                JOptionPane.showMessageDialog(null, "Error", "Error quantity", JOptionPane.ERROR_MESSAGE);
            }
            if (flag) {
                PreparedStatement pst1 = con.prepareStatement("UPDATE inventory SET Quantity = Quantity - " + quantity + " WHERE Name = '" + type + "'");
                pst1.execute();
                pst1.close();
            } else {
                JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(delivery_system.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//         public void addRecords(int addRec)
//    {
//     txtName[addRec] = jText1.getText();
//     txtQuantity[addRec] = jText2.getText();
//     txtPrice[addRec] = jText3.getText();
//     txtStore[addRec] = jText4.getText();
//    }
}//end bracket
