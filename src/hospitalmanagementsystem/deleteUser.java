/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.awt.Font;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sheetal
 */
public class deleteUser extends javax.swing.JFrame {
 
    /**
     * Creates new form AddUsre
     */
    public deleteUser(){
        initComponents();
       
       this.setSize(520,430);
       this.setLocation(380,150);
       this.setResizable(false);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setTitle("HMS-DeleteUSer");
       setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        searchbar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(102, 102, 102));
        l1.setText("User ID :");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 78, -1, -1));

        l2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(102, 102, 102));
        l2.setText("User Name :");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 106, -1, -1));

        l3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(102, 102, 102));
        l3.setText("User Type :");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 136, -1, -1));

        l4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(102, 102, 102));
        l4.setText("Sex :");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 166, -1, -1));

        l5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(102, 102, 102));
        l5.setText("DOB :");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 202, -1, 14));

        l6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(102, 102, 102));
        l6.setText(" Email :");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 222, -1, -1));

        l7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l7.setForeground(new java.awt.Color(102, 102, 102));
        l7.setText("Contact :");
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 250, -1, -1));

        l8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l8.setForeground(new java.awt.Color(102, 102, 102));
        l8.setText("Education :");
        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 281, -1, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 110, 161, -1));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 140, 161, -1));

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 196, 161, -1));

        jTextField4.setEditable(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 170, 161, -1));

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 222, 161, 22));

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 253, 161, 22));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Sheetal Data\\NetBeansProjects\\HospitalManagementSystem\\src\\Prject Icons\\back.png")); // NOI18N
        jButton2.setText(" ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 50));

        searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarActionPerformed(evt);
            }
        });
        getContentPane().add(searchbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 160, -1));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon("D:\\Sheetal Data\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\search.png")); // NOI18N
        jButton4.setText(" Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 140, 40));

        jTextField7.setEditable(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 160, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Sheetal Data\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\button_delete_blue.png")); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Sheetal Data\\NetBeansProjects\\HospitalManagementSystem\\src\\Prject Icons\\add new patient background.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(searchbar.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null, "No User Id Entered", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
              try{
                  Conn con = new Conn();
                  String pid = searchbar.getText();
                  ResultSet rs = con.s.executeQuery("Select * From usersdetails Where id ="+pid);
                  if(rs.next())
                  {
                      jTextField1.setText(rs.getString(3));
                      jTextField2.setText(rs.getString(2));
                      jTextField3.setText(rs.getString(4));
                      jTextField4.setText(rs.getString(5));
                      jTextField5.setText(rs.getString(7));
                      jTextField6.setText(rs.getString(6));
                      jTextField7.setText(rs.getString(9));
                      
                      
                      
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null, "User does not exist!!", "Error", JOptionPane.ERROR_MESSAGE);
                  }
              }
              catch(Exception ae)
              {
                  ae.getStackTrace();
                  System.out.println(ae);
              }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         
            new AdminLog().setVisible(true);
            setVisible(false);
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          // TODO add your handling code here:
          try{
              if(jTextField1.getText().equals(""))
              {
                   JOptionPane.showMessageDialog(null, "Search a user to delete!!", "ERROR Message", JOptionPane.ERROR_MESSAGE);
              }
              else
              {
                  int a = JOptionPane.showConfirmDialog(null, "Do you really want to delete this user?","Deletion Confirmation",JOptionPane.YES_NO_OPTION);
                  if(a==0){
              Conn con = new Conn();
         String delete = "DELETE FROM usersdetails where id="+searchbar.getText();
         con.s.executeUpdate(delete);
         String deletepass="DELETE FROM users where UserID="+searchbar.getText();
         con.s.executeUpdate(deletepass);
         JOptionPane.showMessageDialog(null, "User successfully deleted", "Deletion Message", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("deleteuser.jpg")));
         jTextField1.setText("");
         jTextField2.setText("");
         jTextField4.setText("");
         jTextField3.setText("");
         jTextField5.setText("");
         jTextField6.setText("");
         jTextField7.setText("");
                  }
                  else
                  {
                      
                  }
              }
          }
          catch(Exception ae)
          {
           ae.printStackTrace();
           System.out.println(ae);
          }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

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
            java.util.logging.Logger.getLogger(userView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new userView().setVisible(true);
            }
        });
    }
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/hospitalmanagementsystem/WinIcon.png")));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JTextField searchbar;
    // End of variables declaration//GEN-END:variables
}
