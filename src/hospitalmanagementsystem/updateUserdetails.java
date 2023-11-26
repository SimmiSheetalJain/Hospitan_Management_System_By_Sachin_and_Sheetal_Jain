/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sheetal
 */
public class updateUserdetails extends javax.swing.JFrame{
 Random ran;
   long first;
     JLabel userid;
    /**
     * Creates new form AddUsre
     */
    public updateUserdetails() {
        
        initComponents();
        this.setSize(560,520);
       this.setLocation(420,150);
       this.setResizable(false);
       this.setTitle("HMS - Update User Details");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        searchUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(102, 102, 102));
        l1.setText("User ID :");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        l2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(102, 102, 102));
        l2.setText("User Name :");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        l3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(102, 102, 102));
        l3.setText("User Type :");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        l4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(102, 102, 102));
        l4.setText("Sex :");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 200, 50, -1));

        l5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(102, 102, 102));
        l5.setText("DOB :");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 242, -1, 30));

        l6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(102, 102, 102));
        l6.setText(" Email :");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 282, 70, 30));

        l7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l7.setForeground(new java.awt.Color(102, 102, 102));
        l7.setText("Contact :");
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        l8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l8.setForeground(new java.awt.Color(102, 102, 102));
        l8.setText("Education :");
        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 119, 161, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setToolTipText("");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 159, 161, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setToolTipText("");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 239, 161, 30));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setToolTipText("");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 161, 30));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.setToolTipText("");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 282, 161, 30));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.setToolTipText("");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 322, 161, 30));

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10th", "12th", "Graduate", "Post Graduate", "Diploma" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 161, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Sheetal Data\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\rsz_update_details.png")); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 160, 60));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Sheetal Data\\NetBeansProjects\\HospitalManagementSystem\\src\\Prject Icons\\back.png")); // NOI18N
        jButton2.setText(" ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 50));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon("D:\\Sheetal Data\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\search.png")); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 110, 30));

        searchUser.setText(" ");
        getContentPane().add(searchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Sheetal Data\\NetBeansProjects\\HospitalManagementSystem\\src\\Prject Icons\\add new patient background.jpg")); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         
                 
                new AdminLog().setVisible(true);
               this.setVisible(false);
            
                 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                   Pattern patt2 = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.-]*@gmail[.]com");
                    Pattern pattmob = Pattern.compile("(0/91)?[6-9][0-9]{9}");
                    Matcher gmatch = patt2.matcher(jTextField5.getText());
                    Matcher mobmatch = pattmob.matcher(jTextField6.getText());
                     if (jTextField1.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please file all Fields");
                    }else if (jTextField2.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please file all Fields");
                    } else if (jTextField4.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please file all Fields");
                    } else if (jTextField3.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please file all Fields");
                    } else if (jTextField5.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please Give Email ID");
                    } else if (jTextField6.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please give contact number");
                    }else if(cb1.getSelectedItem().equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Select Qualification");
                    }
                    else if (!gmatch.matches()) {
                        JOptionPane.showMessageDialog(null, "Enter mail id in correct format!!", null, JOptionPane.ERROR_MESSAGE);
                        jTextField5.setText("");
                    } 
                     else if (!mobmatch.matches()) {
                        JOptionPane.showMessageDialog(null, "Please enter phone valid contact number !!!!", null, JOptionPane.ERROR_MESSAGE);
                        jTextField6.setText("");
                    }else
                     
                         try{
                       Conn con = new Conn();
                       String j=jTextField1.getText();
                       String k=jTextField2.getText();
                       String l=jTextField3.getText();
                       String m=jTextField4.getText();
                       String n=jTextField5.getText();
                       String o=jTextField6.getText();
                       //String Usid = searchUser.getText();
                       String p = (String)cb1.getSelectedItem(); 
                       
                       String update="Update usersdetails set name='"+j+"',emp_type = '"+k
                                      +"',sex ='"+l+"',dob='"+m+"',email='"+n+"', contact='"+o
                                      +"',education='"+p+"' where id="+searchUser.getText();
                       con.s.executeUpdate(update);
                        JOptionPane.showMessageDialog(null, "Details Sucessfully updated", null, JOptionPane.INFORMATION_MESSAGE);
                         }
                     catch(Exception ae)
                     {
                         ae.printStackTrace();
                         System.out.println(ae);
                     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
               if(searchUser.getText().equals(""))
               {
                    JOptionPane.showMessageDialog(null, "No User Id Entered!!", null, JOptionPane.ERROR_MESSAGE);
               }
                 else
                {
                     Conn con = new Conn();
                  String pid = searchUser.getText();
                  ResultSet rs = con.s.executeQuery("Select * From usersdetails Where id ="+pid);
                  if(rs.next())
                  {
                      jTextField1.setText(rs.getString(3));
                      jTextField2.setText(rs.getString(2));
                      jTextField3.setText(rs.getString(4));
                      jTextField4.setText(rs.getString(5));
                      jTextField5.setText(rs.getString(7));
                      jTextField6.setText(rs.getString(6));
                      cb1.setSelectedItem(rs.getString(9));
                      searchUser.setEditable(false);
                   }
                  else
                  {
                       JOptionPane.showMessageDialog(null, "Wrong User ID Entered!!", null, JOptionPane.ERROR_MESSAGE);
                  }
                 }
        }
        catch(Exception ae)
        {
            ae.getStackTrace();
            System.out.println(ae);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(AddUsre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUsre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUsre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUsre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new AddUsre().setVisible(true);
            }
        });
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JTextField searchUser;
    // End of variables declaration//GEN-END:variables

     

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/hospitalmanagementsystem/WinIcon.png")));
    }
 }