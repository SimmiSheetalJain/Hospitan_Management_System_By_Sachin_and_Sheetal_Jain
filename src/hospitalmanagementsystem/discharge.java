/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sheetal
 */
public class discharge extends javax.swing.JFrame {
JLabel disdate;
    /**
     * Creates new form discharge
     */
    public discharge() {
        disdate = new JLabel();
        disdate.setBounds(360,0,160,20);
        currentdatetime();
        this.add(disdate);
        initComponents();
        setSize(540,650);
        setLocation(400,20);
        setResizable(false);
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

        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Dischage Patient");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 13, -1, 42));

        l1.setBackground(new java.awt.Color(0, 102, 102));
        l1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l1.setText("Patient ID : ");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 61, -1, -1));

        l3.setBackground(new java.awt.Color(0, 102, 102));
        l3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l3.setText(" Name : ");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 138, -1, -1));

        l4.setBackground(new java.awt.Color(0, 102, 102));
        l4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l4.setText("Father's Name : ");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 172, -1, -1));

        l14.setBackground(new java.awt.Color(0, 102, 102));
        l14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l14.setText("Illness : ");
        getContentPane().add(l14, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 502, -1, -1));

        l5.setBackground(new java.awt.Color(0, 102, 102));
        l5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l5.setText("D.O.B : ");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 207, -1, 14));

        l7.setBackground(new java.awt.Color(0, 102, 102));
        l7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l7.setText(" Gender : ");
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 264, -1, -1));

        l9.setBackground(new java.awt.Color(0, 102, 102));
        l9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l9.setText("Address : ");
        getContentPane().add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 327, -1, -1));

        l8.setBackground(new java.awt.Color(0, 102, 102));
        l8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l8.setText("Blood Group : ");
        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 298, -1, -1));

        l10.setBackground(new java.awt.Color(0, 102, 102));
        l10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l10.setText("Email : ");
        getContentPane().add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 356, -1, -1));

        l12.setBackground(new java.awt.Color(0, 102, 102));
        l12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l12.setText("Phone no. 2 : ");
        getContentPane().add(l12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 428, -1, -1));

        l11.setBackground(new java.awt.Color(0, 102, 102));
        l11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l11.setText("Phone no. 1 : ");
        getContentPane().add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 391, -1, -1));

        l6.setBackground(new java.awt.Color(0, 102, 102));
        l6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l6.setText("Age : ");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 230, -1, 20));

        jLabel14.setText(" ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 393, -1, -1));

        l2.setBackground(new java.awt.Color(0, 102, 102));
        l2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l2.setText("Admitted On : ");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 104, -1, -1));

        l13.setBackground(new java.awt.Color(0, 102, 102));
        l13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l13.setText("Illness Type : ");
        getContentPane().add(l13, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 464, -1, -1));

        searchbar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(searchbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 61, 137, 29));

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 101, 259, -1));

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 135, 259, -1));

        t3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 169, 259, -1));

        t4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 198, 259, -1));

        t5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 227, 259, -1));

        t6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 261, 259, -1));

        t7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 295, 259, -1));

        t8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 324, 259, -1));

        t9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 353, 259, -1));

        t10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 259, -1));

        t11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 425, 259, -1));

        t12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 461, 259, -1));

        t13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 496, 259, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Sheetal Data\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\search.png")); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 61, 112, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Discharge");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, 33));

        jButton3.setText("Back ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(searchbar.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Search a patient to dischage!!", "Blank Field", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Conn con = new Conn();
            ResultSet rs;
            try{
            
            String searchedP = searchbar.getText();
            String q1 = "Select * From dischargedpatient where patient_id ='"+searchbar.getText()+"'";
             rs = con.s.executeQuery(q1);
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"This patient has been discharged on :"+rs.getString(15), "Blank Field", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    
                     
                   String q2 = "Select * From patient where patient_id ='"+searchbar.getText()+"'";
                   rs = con.s.executeQuery(q2);
                   if(rs.next())
                   {
                       String q3 = "Select * From assigned_room where patient_id ='"+searchbar.getText()+"'";
                       rs = con.s.executeQuery(q3);
                      if(rs.next())    
                      {
                          rs = con.s.executeQuery(q2);
                     if(rs.next())
                       {
                       t1.setText(rs.getString(13));
                       t2.setText(rs.getString(2));
                       t3.setText(rs.getString(3));
                       t4.setText(rs.getString(4));
                       t5.setText(rs.getString(14));
                       t6.setText(rs.getString(5));
                       t7.setText(rs.getString(6));
                       t8.setText(rs.getString(7));
                       t9.setText(rs.getString(8));
                       t10.setText(rs.getString(9));
                       t11.setText(rs.getString(10));
                       t12.setText(rs.getString(11));
                       t13.setText(rs.getString(12));
                       searchbar.setEditable(false);
                       t1.setEditable(false);
                       t2.setEditable(false);
                       t3.setEditable(false);
                       t4.setEditable(false);
                       t5.setEditable(false);
                       t6.setEditable(false);
                       t7.setEditable(false);
                       t8.setEditable(false);
                       t9.setEditable(false);
                       t10.setEditable(false);
                       t11.setEditable(false);
                       t12.setEditable(false);
                       t13.setEditable(false);
                       }
                      } 
                       else
                      {
                          JOptionPane.showMessageDialog(null,"This patient has not been admitted.", "Not Admitted", JOptionPane.ERROR_MESSAGE);
                      }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Wrong Patient ID.", "", JOptionPane.ERROR_MESSAGE);
                   }
                   }
                catch(Exception exc)
                   {
                exc.printStackTrace();
                System.out.println(exc);
                   }    
               
            }
               }
            catch(Exception exc)
            {
                exc.printStackTrace();
                System.out.println(exc);
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Homepage().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Conn con = new Conn();
            ResultSet rs;
            
         if(searchbar.getText().equals(""))
         {
             JOptionPane.showMessageDialog(null,"Search a patient to discharge", "No Patient Searched", JOptionPane.ERROR_MESSAGE);
         }
         else
         {
             try{
             String pid = searchbar.getText();
             String s1 = t1.getText();
             String s2 = t2.getText();
             String s3 = t3.getText();
             String s4 = t4.getText();
             String s5 = t5.getText();
             String s6 = t6.getText();
             String s7 = t7.getText();
             String s8 = t8.getText();
             String s9 = t9.getText();
             String s10 = t10.getText();
             String s11 = t11.getText();
             String s12 = t12.getText();
             String s13 = t11.getText();
             String s14 = disdate.getText();
             String wrq = "Select * From assigned_room where patient_id='"+searchbar.getText()+"'";
             String w = new String();
             String r = new String();
             rs = con.s.executeQuery(wrq);
             if(rs.next()){
              w = rs.getString(2);
              r = rs.getString(3);
             }
             String s15 ="Ward:"+w+" Room:"+r;
             String dq1 ="insert into dischargedpatient values('"+pid+"','"+s2+"','"+s3+"','"+s4+"','"+s6+"','"+s7
                                                                 +"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12
                                                                 +"','"+s13+"','"+s1+"','"+s5+"','"+s14+"','"+s15+"')";
                      con.s.executeUpdate(dq1);
             String dg2 ="delete from patient where patient_id='"+searchbar.getText()+"'";   
             String dg3 ="Update room set RoomStatus = 'Available' where wardno='"+w+"' and roomno='"+r+"'";
             String dg4 ="delete from assigned_room where patient_id='"+searchbar.getText()+"'";   
                
             con.s.executeUpdate(dg2);
             con.s.executeUpdate(dg3);
             con.s.executeUpdate(dg4);
             JOptionPane.showMessageDialog(null,"Patient Discharged!!", "Discharged", JOptionPane.ERROR_MESSAGE);
                     }
             catch(Exception exc)
            {
                exc.printStackTrace();
                System.out.println(exc);
            }
         }
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(discharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(discharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(discharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(discharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new discharge().setVisible(true);
            }
        });
    }
    
     private void currentdatetime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
         
        disdate.setText("Date: "+dtf.format(now));

    }
    private void setIconImage(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/hospitalmanagementsystem/WinIcon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField searchbar;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
