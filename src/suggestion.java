
import java.awt.Color;
import java.awt.Desktop;
//import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet ;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.MouseInputAdapter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author shruti
 */
public class suggestion extends javax.swing.JFrame {
/**
     * Creates new form suggestion
    */
    
    Connection con=null;
    PreparedStatement pst;
    DefaultTableModel model;
    ResultSet rs;
    public suggestion() {
        initComponents();
        setRecordsToTable();
       
       //tbl_sugg.getViewport().setBackground(Color.WHITE);
       LinkMouseListener linkMouseListener = new LinkMouseListener();
    tbl_sugg.addMouseListener(linkMouseListener);

    }
    
    bookingpage jtRowData = new bookingpage();
    @SuppressWarnings("empty-statement")
    public void setRecordsToTable()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/storehub","root","");
            pst=con.prepareStatement("SELECT * FROM vendor_database");
            rs = pst.executeQuery();
            while(rs.next()){
                String Name = rs.getString("name");
                String Location = rs.getString("location");
                String Personal = rs.getString("personal_slot");
                String Business = rs.getString("bussiness_slot");
                String Price = rs.getString("price");
                String url= getURLForName(Name);

                Object[] obj={Name,Location,Personal,Business,Price,url};
                model=(DefaultTableModel) tbl_sugg.getModel();
                model.addRow(obj);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
     private String getURLForName(String name) {
        switch (name) {
            case "stownest":
                return "https://www.stownest.com";
            case "storemygoods":
                return "https://www.storemygoods.com";
            case "safestore":
                return "https://safestore.in";
            case "your storage unit":
                return "https://www.yourstorageunits.com";
            default:
                return "offline business ";
        }
    }

    
    public void search(String str){
        model=(DefaultTableModel) tbl_sugg.getModel();
        TableRowSorter<DefaultTableModel> trs=new TableRowSorter<>(model);
        tbl_sugg.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
     private void openWebpage(String url) throws URISyntaxException {
    try {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            desktop.browse(new URI(url));
        } else {
            // Handle the case where Desktop API is not supported
            System.out.println("Desktop browsing is not supported on this platform.");
        }
    } catch (IOException | URISyntaxException ex) {
        ex.printStackTrace();
    }
}
    private class LinkMouseListener extends MouseInputAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        int row = tbl_sugg.rowAtPoint(e.getPoint());
        int col = tbl_sugg.columnAtPoint(e.getPoint());

        if (row >= 0 && col == 1) {
            // Open the link when the second column is clicked
            String url = (String) tbl_sugg.getValueAt(row, 0);
            System.out.println("Clicked URL: " + url);
            try {
                openWebpage(url);
            } catch (URISyntaxException ex) {
                Logger.getLogger(suggestion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void openWebpage(String url) throws URISyntaxException {
        System.out.println("Clicked URL: " + url);
        try {
          Desktop.getDesktop().browse(new URI(url));
      
        } catch (IOException ex) {
          System.err.println("Failed to open " + url + ". Error message: " + ex.getMessage());  
            ex.printStackTrace();
        }
    }
    }

    
    
    /*public void search(String str){
        model=(DefaultTableModel) tbl_sugg.getModel();
        TableRowSorter<DefaultTableModel> trs=new TableRowSorter<>(model);
        tbl_sugg.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sugg = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        loc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shruti\\Downloads\\home-solid-36.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 10, 144, 60));

        tbl_sugg.setBackground(new java.awt.Color(0, 0, 0));
        tbl_sugg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tbl_sugg.setForeground(new java.awt.Color(255, 255, 255));
        tbl_sugg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Personal", "Business", "Price(sq/m)", "website"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_sugg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_sugg.setFocusable(false);
        tbl_sugg.setGridColor(new java.awt.Color(51, 51, 51));
        tbl_sugg.setRowHeight(35);
        tbl_sugg.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbl_sugg.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbl_sugg.setShowHorizontalLines(true);
        tbl_sugg.getTableHeader().setReorderingAllowed(false);
        tbl_sugg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_suggMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sugg);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 1428, 540));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 166, 38));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 160, 38));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Private", "Business" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 137, 38));

        loc.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 18)); // NOI18N
        loc.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        loc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                locFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                locFocusLost(evt);
            }
        });
        loc.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                locInputMethodTextChanged(evt);
            }
        });
        loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locActionPerformed(evt);
            }
        });
        loc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                locKeyReleased(evt);
            }
        });
        jPanel1.add(loc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 160, 38));

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1812, 1020);
    }// </editor-fold>//GEN-END:initComponents

    private void locKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_locKeyReleased
        // TODO add your handling code here:
         String searchString=loc.getText();
        search(searchString);
    }//GEN-LAST:event_locKeyReleased

    private void tbl_suggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_suggMouseClicked
        // TODO add your handling code here:
        int viewRow = tbl_sugg.getSelectedRow();
    int modelRow = tbl_sugg.convertRowIndexToModel(viewRow); // Convert to model row index

    if (modelRow >= 0) {
         int col = tbl_sugg.columnAtPoint(evt.getPoint());
        if (col == 5) {
            // Assuming the URL is in the 6th column (0-based index)
            String url = (String) model.getValueAt(modelRow, 5);
            try {
                openWebpage(url);
            } catch (URISyntaxException ex) {
                Logger.getLogger(suggestion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{

        String Name = model.getValueAt(modelRow, 0).toString();
        String Location = model.getValueAt(modelRow, 1).toString();
        String Price = model.getValueAt(modelRow, 4).toString();

        jtRowData.setVisible(true);
        jtRowData.pack();
        jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jtRowData.txtbname.setText(Name);
        jtRowData.txtloc.setText(Location);
        jtRowData.txtprice.setText(Price);
    }
    }     
                  
          
    }//GEN-LAST:event_tbl_suggMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // home page code:
        newhomepage menu =new newhomepage();
        menu.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void locInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_locInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_locInputMethodTextChanged

    private void locFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_locFocusGained
        // TODO add your handling code here:
        if(loc.getText().equals("Search Location"))
        {
            loc.setText("");
            loc.setForeground(Color.gray);
        }
    }//GEN-LAST:event_locFocusGained

    private void locFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_locFocusLost
        // TODO add your handling code here:
        if(loc.getText().equals(""))
        {
            loc.setText("Search Location");
            loc.setForeground(Color.gray);
        }
    }//GEN-LAST:event_locFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locActionPerformed

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
            java.util.logging.Logger.getLogger(suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suggestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loc;
    private javax.swing.JTable tbl_sugg;
    // End of variables declaration//GEN-END:variables

  

}