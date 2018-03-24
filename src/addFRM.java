import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * addFRM.java
 *
 * Created on 13 Dec, 2015, 6:21:18 PM
 */

/**
 *
 * @author Comp11
 */
public class addFRM extends javax.swing.JFrame {

    /** Creates new form addFRM */
    public addFRM() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aTF = new javax.swing.JTextField();
        bTF = new javax.swing.JTextField();
        cTF = new javax.swing.JTextField();
        dTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bmm = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dCB = new javax.swing.JComboBox();
        mCB = new javax.swing.JComboBox();
        yrTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add A New Item");

        panel1.setBackground(new java.awt.Color(198, 218, 247));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images (6).jpg"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Add a New Item to Physics Lab");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setText("Item Name");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Price(in Rs.)");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel5.setText("Lifetime(in yrs)");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel6.setText("Date of Purchase");

        aTF.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        aTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aTFFocusLost(evt);
            }
        });
        aTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aTFActionPerformed(evt);
            }
        });

        bTF.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        bTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bTFFocusLost(evt);
            }
        });
        bTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTFActionPerformed(evt);
            }
        });

        cTF.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        cTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cTFFocusLost(evt);
            }
        });
        cTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTFActionPerformed(evt);
            }
        });

        dTF.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        dTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dTFFocusLost(evt);
            }
        });
        dTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dTFActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bmm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bmm.setText("<html>Back to<br> Main Menu");
        bmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmmActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel9.setText("Qty. Purchased");

        dCB.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        dCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mCB.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        mCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        mCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCBActionPerformed(evt);
            }
        });

        yrTF.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        yrTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yrTFFocusLost(evt);
            }
        });
        yrTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yrTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel7.setText("/");

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel10.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(bmm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(bTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(cTF, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(dTF, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(mCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addGap(10, 10, 10)
                                .addComponent(yrTF)))))
                .addGap(72, 72, 72)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jLabel9)
                    .addContainerGap(697, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(bTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(dTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yrTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bmm)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(221, 221, 221))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(258, 258, 258)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(402, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aTFActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_aTFActionPerformed

    private void bTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTFActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_bTFActionPerformed

    private void bmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmmActionPerformed
 myFrame2 frame2=new myFrame2();
            addFRM.this.setVisible(false);
            frame2.setVisible(true);        // TODO add your handling code here:
}//GEN-LAST:event_bmmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String a=aTF.getText();
String str2=bTF.getText();
String c=cTF.getText();
String str4=dTF.getText();
String yr=yrTF.getText();
if(a.isEmpty()==true || str2.isEmpty()==true || c.isEmpty()==true || str4.isEmpty()==true || yr.isEmpty()==true )
{
    JOptionPane.showMessageDialog(null,"Please fill all the details");
}

else
{
int b = Integer.parseInt(str2);
int d = Integer.parseInt(str4);
int amt = b*d;
    try {
Class.forName("com.mysql.jdbc.Driver");
System.out.print("\nConnecting to database...");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kashyap", "root", "kvalwar");
System.out.println(" SUCCESS!\n");
Statement stmt = con.createStatement();
ResultSet rs = null;
String query = "SELECT * FROM lab";
rs = stmt.executeQuery(query);
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
String dt=(String) dCB.getSelectedItem();
String mo=(String) mCB.getSelectedItem();

String date= yr+"/"+mo+"/"+dt;
//2014/08/06 15:59:48
String sql = "INSERT INTO lab(ItemName,Price,life,number,date,amount)VALUES("+"'"+a+"',"+b+",'"+c+"',"+d+",'"+date+"',"+amt+");";
stmt.executeUpdate(sql);
JOptionPane.showMessageDialog(this,"Record successfully Submitted");
rs.close();
stmt.close();
con.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(this,e.getMessage());
e.printStackTrace();
}
}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dTFActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_dTFActionPerformed

    private void aTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aTFFocusLost
String a=aTF.getText();
if(!bmm.getModel().isPressed()){
if(!a.matches("[a-zA-Z]*")){
     JOptionPane.showMessageDialog(null,"Please type only characters in ItemName field");
     aTF.setText("");
     aTF.requestFocus();
    }}        // TODO add your handling code here:
    }//GEN-LAST:event_aTFFocusLost

    private void bTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bTFFocusLost
String a=aTF.getText();
        String b=bTF.getText();
        if(!bmm.getModel().isPressed()){
            
 if(!b.matches("[0-9]*")){
     JOptionPane.showMessageDialog(null,"Please type only numbers in Price field");
     bTF.setText("");
     bTF.requestFocus();
    }
        }//TODO add your handling code here:
    }//GEN-LAST:event_bTFFocusLost

    private void cTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTFActionPerformed

    private void cTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cTFFocusLost
String a=aTF.getText();
        String b=bTF.getText();
        String c=cTF.getText();
        if(!bmm.getModel().isPressed()){
             {

     if(!c.matches("[0-9]*") && !c.equalsIgnoreCase("consumable")){
     JOptionPane.showMessageDialog(null,"Please type numbers or consumable in lifetime field");
     cTF.setText("");
     cTF.requestFocus();
    }
        }}        // TODO add your handling code here:
    }//GEN-LAST:event_cTFFocusLost

    private void dTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dTFFocusLost
String a=aTF.getText();
        String b=bTF.getText();
        String c=cTF.getText();
String d=dTF.getText();
if(!bmm.getModel().isPressed()){

 if(!d.matches("[0-9]*")){
     JOptionPane.showMessageDialog(null,"Please type only numbers in qty. purchased field");
     dTF.setText("");
    dTF.requestFocus();
    }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_dTFFocusLost

    private void mCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mCBActionPerformed

    private void yrTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yrTFFocusLost
String e = yrTF.getText();
if(!bmm.getModel().isPressed()){

 if(!e.matches("[0-9]*") || e.length()!=4){
     
     JOptionPane.showMessageDialog(null,"Please type only 4 digit year");
     yrTF.setText("");
    yrTF.requestFocus();
    }
}     
// TODO add your handling code here:
    }//GEN-LAST:event_yrTFFocusLost

    private void yrTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yrTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yrTFActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addFRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aTF;
    private javax.swing.JTextField bTF;
    private javax.swing.JButton bmm;
    private javax.swing.JTextField cTF;
    private javax.swing.JComboBox dCB;
    private javax.swing.JTextField dTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox mCB;
    private java.awt.Panel panel1;
    private javax.swing.JTextField yrTF;
    // End of variables declaration//GEN-END:variables

}