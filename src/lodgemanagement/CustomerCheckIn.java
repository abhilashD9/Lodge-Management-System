
package lodgemanagement;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.*;
import project.*;
import java.util.regex.*;

/**
 *
 * @author ASUS
 */
public class CustomerCheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCheckIn
     */
    public CustomerCheckIn() {
        initComponents();
        jTextField7.setEditable(false);
        jTextField9.setEditable(false);
        SimpleDateFormat myFormat= new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal= Calendar.getInstance();
        jTextField7.setText(myFormat.format(cal.getTime()));
    }
    String bed;
    String roomType;
    String roomNo;
    String price;
    
    public void roomDetails(){
        
        jComboBox4.removeAllItems();
        jTextField9.setText("");
        bed=(String)jComboBox2.getSelectedItem();
        roomType=(String)jComboBox3.getSelectedItem();
        try{
            ResultSet rs= Select.getData("select * from room where bedType='"+bed+"' and roomType='"+roomType+"' and status='Not Booked'");
            while(rs.next())
            {
                jComboBox4.addItem(rs.getString(1));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        adlabel1 = new javax.swing.JLabel();
        emaillabel1 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_mnumber = new javax.swing.JLabel();
        lbl_nationality = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_ID = new javax.swing.JLabel();
        lbl_add = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 280));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lodgemanagement/icons/Customer Registration & Check IN.png"))); // NOI18N
        jLabel1.setText("Customer CheckIn");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lodgemanagement/icons/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1191, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 86, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 114, 301, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 170, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 198, 301, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nationality");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 256, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 284, 301, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 341, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 369, 301, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 463, 301, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 431, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ID Proof");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 86, -1, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 114, 301, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 170, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 198, 301, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("CheckIn Date(Today)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 256, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 284, 301, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Bed Type");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 86, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 114, 300, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Room Type");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 170, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON AC" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 198, 300, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Room Number");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 256, -1, -1));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 284, 300, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Price");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 342, -1, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 369, 300, -1));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Allote Room");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 427, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1085, 427, -1, -1));

        adlabel1.setBackground(new java.awt.Color(102, 102, 102));
        adlabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        adlabel1.setForeground(new java.awt.Color(204, 0, 0));
        adlabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adlabel1KeyReleased(evt);
            }
        });
        getContentPane().add(adlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 170, 30));

        emaillabel1.setBackground(new java.awt.Color(102, 102, 102));
        emaillabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        emaillabel1.setForeground(new java.awt.Color(204, 0, 0));
        emaillabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emaillabel1KeyReleased(evt);
            }
        });
        getContentPane().add(emaillabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 170, 20));

        lbl_name.setBackground(new java.awt.Color(153, 153, 153));
        lbl_name.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 150, 30));

        lbl_mnumber.setBackground(new java.awt.Color(153, 153, 153));
        lbl_mnumber.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbl_mnumber.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_mnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 210, 30));

        lbl_nationality.setBackground(new java.awt.Color(153, 153, 153));
        lbl_nationality.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbl_nationality.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 180, 30));

        lbl_email.setBackground(new java.awt.Color(153, 153, 153));
        lbl_email.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 150, 30));

        lbl_ID.setBackground(new java.awt.Color(153, 153, 153));
        lbl_ID.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbl_ID.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 170, 30));

        lbl_add.setBackground(new java.awt.Color(153, 153, 153));
        lbl_add.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbl_add.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 170, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lodgemanagement/icons/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CustomerCheckIn().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
       
        roomNo=(String)jComboBox4.getSelectedItem();
        try{
            ResultSet rs= Select.getData("select * from room where roomNo='"+roomNo+"'");
            while(rs.next())
            {
                jTextField9.setText(rs.getString(4));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int cid=1;
        String name=jTextField1.getText();
        String mobileNumber=jTextField2.getText();
        String nationality=jTextField3.getText();
        String gender=(String)jComboBox1.getSelectedItem();
        String email=jTextField4.getText();
        String idProof=jTextField5.getText();
        String address=jTextField6.getText();
        String checkIN=jTextField7.getText();
         String bed=(String)jComboBox2.getSelectedItem();
          String roomType=(String)jComboBox3.getSelectedItem();
         String roomNo=(String)jComboBox4.getSelectedItem();
          String price= jTextField9.getText();
         
        String Query= "select max(cid) from customer";
        if(jTextField1.getText().trim().isEmpty() && jTextField2.getText().trim().isEmpty() && jTextField3.getText().trim().isEmpty() && jTextField4.getText().trim().isEmpty() && jTextField5.getText().trim().isEmpty() && jTextField6.getText().trim().isEmpty())
        {
            lbl_name.setText("Name is Empty!!");
             lbl_mnumber.setText("Mobile No is Empty!!");
              lbl_nationality.setText("Nationality is Empty!!");
             lbl_email.setText("Email is Empty!!");  
              lbl_ID.setText("ID Proof is Empty!!");
              lbl_add.setText("Address is Empty!!"); 
        }
        else if(jTextField1.getText().trim().isEmpty())
        {
            lbl_name.setText(" Name is Empty!!");
        }
        else if(jTextField2.getText().trim().isEmpty())
        {
             lbl_mnumber.setText("MobileNo. is Empty!!");
        }
        else if(jTextField3.getText().trim().isEmpty()){
              lbl_nationality.setText("Nationality is Empty!!");
        }
        else if(jTextField4.getText().trim().isEmpty()){
            lbl_email.setText("Email is Empty!!");
        }
        else if(jTextField5.getText().trim().isEmpty()){
            lbl_ID.setText("ID Proof is Empty!!");
            
        }
        else if(jTextField6.getText().trim().isEmpty()){
            lbl_add.setText("Address is Empty!!"); 
        }
        else
        try{
            ResultSet rs=Select.getData(Query);
            while(rs.next())
            {
                
                cid= rs.getInt(1);
                cid=cid+1;
                
                if(!price.equals(""))
                {
                    Query="update room set status='Booked' where roomNo='"+roomNo+"'";
                    InsertUpdateDelete.setData(Query, "");
                    Query="insert into customer(cid,name,mobileNumber,nationality,gender,email,idProof,address,checkIn,roomNo,bedType,roomType,pricePerDay) values("+cid+",'"+name+"','"+mobileNumber+"','"+nationality+"','"+gender+"','"+email+"','"+idProof+"','"+address+"','"+checkIN+"','"+roomNo+"','"+bed+"','"+roomType+"','"+price+"')";
                    InsertUpdateDelete.setData(Query,"Customer CheckedIn Successfully");
                    setVisible(false);
                    new CustomerCheckIn().setVisible(true);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
     


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        String mobileNumber=jTextField2.getText();
        int length= mobileNumber.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<10){
                jTextField2.setEditable(true);
            }
            else
            {
                jTextField2.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                jTextField2.setEditable(true);
            }else{
                jTextField2.setEditable(false);
            }
        }
        
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        lbl_name.setText(""); 
       
    }//GEN-LAST:event_jTextField1KeyReleased

    private void adlabel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adlabel1KeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_adlabel1KeyReleased

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        lbl_email.setText(""); 
        String PATTERN="^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{3,10}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(jTextField4.getText());
        if(!match.matches()){
            emaillabel1.setText("Invalid Email Address!!");
        }
        else{
            emaillabel1.setText(null);
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void emaillabel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emaillabel1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_emaillabel1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        lbl_mnumber.setText(""); 
        
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        lbl_add.setText(""); 
        
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        lbl_nationality.setText(""); 
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        lbl_ID.setText(""); 
    }//GEN-LAST:event_jTextField5KeyReleased

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
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adlabel1;
    private javax.swing.JLabel emaillabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_add;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_mnumber;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_nationality;
    // End of variables declaration//GEN-END:variables
}