
//import static com.sun.source.tree.EnhancedForLoopTree.DeclarationKind.PATTERN;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.AWTEvent;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author RIYA
 */
public class bookingpage extends javax.swing.JFrame {

    Connection con=null ;
    ResultSet rs ;
    PreparedStatement pst =null;
    
    
    public bookingpage() {
        initComponents();
        
    }
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpanel = new javax.swing.JPanel();
        mainpanel = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        PHNO = new javax.swing.JLabel();
        EMID = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtph = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        LOC = new javax.swing.JLabel();
        STTYPE = new javax.swing.JLabel();
        DAFROM = new javax.swing.JLabel();
        DATO = new javax.swing.JLabel();
        PRICE = new javax.swing.JLabel();
        txtbname = new javax.swing.JTextField();
        txtloc = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        pybutton = new javax.swing.JButton();
        rstbutton = new javax.swing.JButton();
        bckbutton = new javax.swing.JButton();
        numvalid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdatefr1 = new com.toedter.calendar.JDateChooser();
        txtdateto = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgpanel.setBackground(new java.awt.Color(51, 51, 51));
        bgpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bgpanel.setPreferredSize(new java.awt.Dimension(1024, 768));
        bgpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainpanel.setBackground(new java.awt.Color(0, 0, 0));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("NAME:");
        mainpanel.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 110, 98, 36));

        PHNO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PHNO.setForeground(new java.awt.Color(255, 255, 255));
        PHNO.setText("PHONE NO:");
        mainpanel.add(PHNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 212, 110, 36));

        EMID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EMID.setForeground(new java.awt.Color(255, 255, 255));
        EMID.setText("EMAIL ID:");
        mainpanel.add(EMID, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 315, 98, 36));

        txtname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnameKeyTyped(evt);
            }
        });
        mainpanel.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 111, 229, 36));

        txtph.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtph.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphActionPerformed(evt);
            }
        });
        txtph.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtphKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtphKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtphKeyTyped(evt);
            }
        });
        mainpanel.add(txtph, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 213, 229, 36));

        txtemail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });
        mainpanel.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 316, 229, 36));

        LOC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LOC.setForeground(new java.awt.Color(255, 255, 255));
        LOC.setText("WAREHOUSE NAME:");
        mainpanel.add(LOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 61, -1, 37));

        STTYPE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        STTYPE.setForeground(new java.awt.Color(255, 255, 255));
        STTYPE.setText("LOCATION:");
        mainpanel.add(STTYPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 129, 150, 37));

        DAFROM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DAFROM.setForeground(new java.awt.Color(255, 255, 255));
        DAFROM.setText("DATE FROM:");
        mainpanel.add(DAFROM, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 118, 37));

        DATO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DATO.setForeground(new java.awt.Color(255, 255, 255));
        DATO.setText("DATE TO:");
        mainpanel.add(DATO, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 118, 40));

        PRICE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PRICE.setForeground(new java.awt.Color(255, 255, 255));
        PRICE.setText("PRICE:");
        mainpanel.add(PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 77, 36));

        txtbname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtbname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbnameActionPerformed(evt);
            }
        });
        mainpanel.add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 251, 37));

        txtloc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtloc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mainpanel.add(txtloc, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 251, 37));

        txtprice.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        mainpanel.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 250, 35));

        pybutton.setBackground(new java.awt.Color(255, 51, 0));
        pybutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pybutton.setText("TO PAYMENT GATWAY-->");
        pybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pybuttonActionPerformed(evt);
            }
        });
        mainpanel.add(pybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 410, 306, 48));

        rstbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rstbutton.setText("RESET");
        rstbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstbuttonActionPerformed(evt);
            }
        });
        mainpanel.add(rstbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 464, 111, -1));

        bckbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bckbutton.setText("BACK");
        bckbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckbuttonActionPerformed(evt);
            }
        });
        mainpanel.add(bckbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 464, 111, -1));

        numvalid.setForeground(new java.awt.Color(255, 255, 255));
        mainpanel.add(numvalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 220, -1));

        jLabel3.setText("jLabel3");
        mainpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));
        mainpanel.add(txtdatefr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 250, 40));
        mainpanel.add(txtdateto, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 250, 40));

        bgpanel.add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 1010, 517));

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOKING RECIPIENT");
        bgpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 420, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shruti\\Downloads\\home-solid-36.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        bgpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 20, 144, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1812, 1020));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bckbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckbuttonActionPerformed
        // back button code:
        suggestion menu = new suggestion();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bckbuttonActionPerformed

    private void rstbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstbuttonActionPerformed
        // code to reset
        txtname.setText(null);
        txtph.setText(null);
        txtemail.setText(null);
        txtloc.setText(null);
        txtdatefr1.setDate(null);
        txtdateto.setDate(null);
        txtprice.setText(null);
        txtbname.setText(null);
    }//GEN-LAST:event_rstbuttonActionPerformed

    private void pybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pybuttonActionPerformed
        //payment button code:
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
       // String date = dateFormat.format(txtdatefr1.getDate());
        
             if("".equals(txtname.getText())){
              JOptionPane.showMessageDialog(new JFrame(),"Enter name","Error",JOptionPane.ERROR_MESSAGE);
          }else if("".equals(txtph.getText())){
             JOptionPane.showMessageDialog (new JFrame(),"Enter phone number","Error",JOptionPane.ERROR_MESSAGE);
          }else if("".equals(txtemail.getText())){
             JOptionPane.showMessageDialog(new JFrame(),"Enter email","Error",JOptionPane.ERROR_MESSAGE);
          }else if("".equals(txtbname.getText())){
        JOptionPane.showMessageDialog(new JFrame(),"Enter Warehouse name","Error",JOptionPane.ERROR_MESSAGE);
    }else if("".equals(txtloc.getText())){
             JOptionPane.showMessageDialog(new JFrame(),"Enter location","Error",JOptionPane.ERROR_MESSAGE);
          }else if("".equals(txtdatefr1.getDate())){
        JOptionPane.showMessageDialog(new JFrame(),"Enter dates","Error",JOptionPane.ERROR_MESSAGE);
    }else if("".equals(txtdateto.getDate())){
             JOptionPane.showMessageDialog(new JFrame(),"Enter dates","Error",JOptionPane.ERROR_MESSAGE);
          }else if("".equals(txtprice.getText())){
        JOptionPane.showMessageDialog(new JFrame(),"Enter price","Error",JOptionPane.ERROR_MESSAGE);
    }else if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-z0-9]+[.]{1}+[a-zA-z0-9]+$",txtemail.getText()))){
            JOptionPane.showMessageDialog (new JFrame(),"Enter valid email id!","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!(Pattern.matches("^[0-9]+$",txtph.getText()))){
            JOptionPane.showMessageDialog (new JFrame(),"Enter valid phone number","Error",JOptionPane.ERROR_MESSAGE);
        }
          else{
            paymentpage menu = new paymentpage();
            menu.setVisible(true);
            setVisible(false);  
          } 
             
            /* String phone=txtph.getText();
             if(phone.matches("^[0-9]*$")&&phone.length()==10)
             {
               //JOptionPane.showMessageDialog(null,"correct");
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"invalid");
             }*/
             
             
             
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String query="INSERT INTO `bookingpage_data`(`name`, `phoneno`, `email`, `location`, `storetype`, `datefrom`, `dateto`, `price`) VALUES (?,?,?,?,?,?,?,?)";

            con =DriverManager.getConnection("jdbc:mysql://localhost/storehub","root","");
            pst=con.prepareStatement(query);
            pst.setString(1,txtname.getText());
            pst.setString(2,txtph.getText());
            pst.setString(3,txtemail.getText());
            pst.setString(4,txtbname.getText());
            pst.setString(5,txtloc.getText());
            String date = sdf.format(txtdatefr1.getDate());
            pst.setString(6, date);
            String date1 = sdf.format(txtdateto.getDate());
            
            pst.setString(7,date1);
            pst.setString(8,txtprice.getText());

            pst.executeUpdate();
            // JOptionPane.showMessageDialog(null,"BOOKED SUCCESSFULLY");
            
            /*if(txtname.equals("")&&txtph.equals("")&&txtemail.equals("")&&txtdatefr.equals("")&&txtdateto.equals("")&&txtbname.equals("")&&txtloc.equals("")&&txtprice.equals(""))
            {
                JoptionPane.showMessageDialog(this,"please fill all details");
                        }*/
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_pybuttonActionPerformed

    private void txtbnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbnameActionPerformed

    private void txtphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // home page code:
        newhomepage menu =new newhomepage();
        menu.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
            txtname.setEditable(true);
        }else{
            txtname.setEditable(false);
            numvalid.setText("Please enter correct name");
        }
    }//GEN-LAST:event_txtnameKeyTyped

    private void txtphKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphKeyTyped
        // phone number validation code here:
        
           // }else{
                //    if(evt)
                    
        
    }//GEN-LAST:event_txtphKeyTyped

    private void txtphKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphKeyReleased
        // phone validation code here:
    }//GEN-LAST:event_txtphKeyReleased

    private void txtphKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphKeyPressed
        // phone number validation:
        
    }//GEN-LAST:event_txtphKeyPressed

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        // email validation:
        /*String PATTERN="^[a-zA-Z0-9){0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern p=Pattern.compile(PATTERN);
        Matcher match=p.matcher(txtemail.getText());
        if(!match.matches())
        {
            emvalid.setText("invalid email");
        }*/
        
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtemailKeyTyped

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed
    
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
            java.util.logging.Logger.getLogger(bookingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookingpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DAFROM;
    private javax.swing.JLabel DATO;
    private javax.swing.JLabel EMID;
    private javax.swing.JLabel LOC;
    private javax.swing.JLabel PHNO;
    private javax.swing.JLabel PRICE;
    private javax.swing.JLabel STTYPE;
    private javax.swing.JButton bckbutton;
    private javax.swing.JPanel bgpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel numvalid;
    private javax.swing.JButton pybutton;
    private javax.swing.JButton rstbutton;
    public javax.swing.JTextField txtbname;
    private com.toedter.calendar.JDateChooser txtdatefr1;
    private com.toedter.calendar.JDateChooser txtdateto;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtloc;
    public javax.swing.JTextField txtname;
    public javax.swing.JTextField txtph;
    public javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables

}
