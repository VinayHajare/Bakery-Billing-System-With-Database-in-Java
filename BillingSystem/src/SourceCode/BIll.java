/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SourceCode;

import java.awt.print.PrinterException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class BIll extends javax.swing.JFrame {
    public BIll() {
        initComponents();
        billHeder();
        fillCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        name = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AMRAPALI CAKES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 29, 272, 44));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel2.setText("Product Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 135, 130, 35));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel3.setText("Price ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 222, 130, 35));
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 225, 182, 35));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 299, 130, 35));
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 302, 182, 35));

        jButton1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book21.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 124, -1));

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane1.setViewportView(bill);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 290, 290));

        jButton2.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-download-100.png"))); // NOI18N
        jButton2.setText("Print");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 126, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel5.setText("Bill");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 52, -1));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total Amount");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 431, -1, 39));
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 434, 183, 39));

        name.setEditable(true);
        name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 190, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BG.png"))); // NOI18N
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 960, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     void billHeder(){
         total.setText("0");
         bill.setText("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*="+"\n"
                     +"\tAmrapali Cakes"+"\n"
                     +"Contact No - 7218913737 / 9404963640"+"\n"
                     +"Adress - Amrapali Cakes,Near Ashoka nagari"+"\n"+"                 bank,Vallabhnagar, Pimpri, Pune "+"\n"
                     +"=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*="+"\n"
                     +"Product \t      Quantity \t    Price \n"); 
     }
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //add button action
        if(name.getSelectedItem().toString().equals("")|| price.getText().equals("")|| quantity.getText().equals(""))
        {
        JOptionPane.showMessageDialog(this,"Please fill all fields","Invalid Data",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        bill.setText(
        bill.getText()+name.getSelectedItem().toString()+"        "+quantity.getText()+"\t    "+price.getText()+"\n"
        );
        int Price = Integer.parseInt(price.getText());
        int Quantity = Integer.parseInt(quantity.getText());
        int Total = Price * Quantity ;
        int past = Integer.parseInt(total.getText());
        Total += past;
        String TOTAL =  String.valueOf(Total);
        total.setText(TOTAL);
        quantity.setText("");
        price.setText("");
        
        try{
        //checking if the product already in the database if not then add it to the database
        String PR_NAME = (name.getSelectedItem().toString()).toUpperCase();
        String PR_PRICE = String.valueOf(Price);
        String STATUS = "AVAILABLE";
       
        String sql = "SELECT * FROM PRODUCT WHERE PR_NAME = '"+PR_NAME+"' ";
        String sql1 = "INSERT INTO PRODUCT(PR_NAME,PR_PRICE,PR_STATUS) VALUES('"+PR_NAME+"','"+PR_PRICE+"','"+STATUS+"')";
        Connection con = Connect.dbConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if(!(rs.next()))
        {
            st.executeUpdate(sql1);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Database Connection failed !!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Print button action 
         try {
        
        bill.setText(bill.getText()+"=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*="+"\n"
                     +"Total Amount :- \t   "+total.getText()
                     +"\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*="+"\n"
                     +"\tThank You . ..  Visit Again");
        bill.print();
        //after printing setting the bill for new cutomer
        billHeder();

        
       } catch (PrinterException e) {
       
           System.out.println(e);
       
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        //Fetching the price on selection
        try{
            String pr_name = name.getSelectedItem().toString();
            String sql = "SELECT PR_PRICE FROM PRODUCT WHERE PR_NAME = '"+pr_name+"' ";
            Connection con = Connect.dbConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                price.setText(rs.getString("PR_PRICE"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Database connection failed !","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nameActionPerformed

    private void fillCombo()
    {
        //method to fill JComboBox
        try
        {
         Connection con  = Connect.dbConnection();
         Statement st = con.createStatement();
         String sql = "SELECT * FROM PRODUCT";
         ResultSet rs = st.executeQuery(sql);
         while(rs.next())
         {
            String pr_name = rs.getString("PR_NAME");
            name.addItem(pr_name);
         }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Database connection failed !","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BIll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bill;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
