import javax.swing.table.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * depPrint.java
 *
 * Created on 21 Dec, 2015, 9:13:52 PM
 */

/**
 *
 * @author Comp11
 */
public class depPrint extends javax.swing.JFrame {

    /** Creates new form depPrint */
    public depPrint() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mTF = new javax.swing.JTextField();
        cmTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        labTbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        depTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("List of all Items with Depreciation Value");

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel2.setText("Total Money Spent on Purchase( in Rupees)");

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel3.setText("Current Value of All Items(in Rupees)");

        mTF.setEditable(false);
        mTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        cmTF.setEditable(false);
        cmTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        labTbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labTbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price", "Lifetime", "Qty. Present", "Depreciation", "Current Price", "Date of Purchase"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        labTbl.setEnabled(false);
        jScrollPane1.setViewportView(labTbl);

        jLabel4.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("powered by KVS Co. Ltd.");

        jLabel5.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel5.setText("Total Depreciation(in rupees)");

        depTF.setEditable(false);
        depTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton1.setText("<html>Back to<br> Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(depTF)
                    .addComponent(cmTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(depTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
DefaultTableModel model= (DefaultTableModel) labTbl.getModel();
try{
                Class.forName("com.mysql.jdbc.Driver");
                System.out.print("\nConnecting to database...");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kashyap", "root", "kvalwar");
System.out.println(" SUCCESS!\n");
Statement stmt = con.createStatement();
String query = "SELECT * FROM lab;";
ResultSet rs = stmt.executeQuery(query);
while(rs.next()) {
String price = rs.getString(3);
String  qty= rs.getString(5);
String dep = rs.getString(6);
    String life = rs.getString(4);
String  date = rs.getString(7);
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
Date date1 = dateFormat.parse(date);
Date date2 = new Date();
Calendar c1=Calendar.getInstance();
c1.setTime(date1);
Calendar c2=Calendar.getInstance();
c2.setTime(date2);
double diff=c2.get(Calendar.DATE)-c1.get(Calendar.DATE)+(c2.get(Calendar.MONTH)-c1.get(Calendar.MONTH))*30+(c2.get(Calendar.YEAR)-c1.get(Calendar.YEAR))*365;
int year = (int)diff/365;
int i=1 ;
double price1=Double.parseDouble(price);
double pr=price1;
while(i<=year)
{
    pr=pr*0.95;
    ++i;
}
double cc=price1-pr;
double th=price1*0.05;
String depreciation="";
String curprice="";
if(life.equalsIgnoreCase("consumable")){
depreciation=(0+"");
curprice=(price1+"");
}
else if(pr>=th){
depreciation=(cc+"");
curprice=(pr+"");
}
else if(pr<th){
depreciation=((price1*0.95)+"");
curprice=((price1*0.05)+"");
}
model.addRow( new Object[ ]{rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5),depreciation, curprice,rs.getDate(7) });
}
String querystr=" SELECT SUM(Price) FROM lab;";
rs=stmt.executeQuery(querystr);
while (rs.next()){
int totprice=rs.getInt("SUM(Price)");
mTF.setText(totprice+"");
int rc=model.getRowCount();
double depri=0;
double cprice=0;
int i;
for(i=0;i<rc;i++){
String val=(String) model.getValueAt(i,4);
String pri=(String) model.getValueAt(i,5);
double pic=Double.parseDouble(val);
double pia=Double.parseDouble(pri);
depri=depri+pic;
cprice=cprice+pia;
cmTF.setText(cprice+"");
depTF.setText(depri+"");
}
}
rs.close();
stmt.close();
con.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(null,"Error in Connectivity");
}
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        myFrame2 frame2=new myFrame2();
        depPrint.this.setVisible(false);
        frame2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new depPrint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cmTF;
    private javax.swing.JTextField depTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labTbl;
    private javax.swing.JTextField mTF;
    // End of variables declaration//GEN-END:variables

}