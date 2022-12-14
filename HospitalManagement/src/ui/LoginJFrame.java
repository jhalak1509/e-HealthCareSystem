/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorDirectory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import static model.DoctorDirectory.doctorDirectory;
import static model.PatientDirectory.patientDirectory;
import static model.PersonDirectory.personDirectory;

/**
 *
 * @author jhalaksurve
 */
public class LoginJFrame extends javax.swing.JFrame {
    
    
    
    
    /**
     * Creates new form NewLoginJFrame
     */
    public LoginJFrame() {
        initComponents();
       
        }
        

    static boolean isValid(String email) {
      String regex = "^(.+)@(.+)$";
     
      return email.matches(regex);
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
        jLabel1 = new javax.swing.JLabel();
        cbUserType = new javax.swing.JComboBox<>();
        lblPassword = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblUserId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 14)); // NOI18N
        jLabel1.setText("User Type");

        cbUserType.setBackground(new java.awt.Color(102, 153, 255));
        cbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor", "System Admin", "Hospital Admin", "Community Admin" }));
        cbUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUserTypeActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 14)); // NOI18N
        lblPassword.setText("Password");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(51, 51, 255));
        btnLogin.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblUserId.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 14)); // NOI18N
        lblUserId.setText("User Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(cbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblUserId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(215, 215, 215))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserId)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnLogin)
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUserTypeActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        //PatientDirectory p = new PatientDirectory();
        
        if(txtUserId.getText().trim().isEmpty() || txtPassword.getText().trim().isEmpty())
           JOptionPane.showMessageDialog(this,"Please enter all the details to continue!!");
       /*else if(txtUserId.getText().trim().isEmpty())
           JOptionPane.showMessageDialog(this,"Please enter the user email.");
       else if(txtUserId.getText().trim().isEmpty())
           JOptionPane.showMessageDialog(this,"Please enter the user password.");
       else{*/
        //if(isValid(txtUserId.getText())){
        else{
        PersonDirectory p1 = new PersonDirectory();
        p1.addNewPerson(10,"Jhalak","jhalaksurve@gmail.com","jhalak123","System Admin");
        
        if(cbUserType.getSelectedItem().toString().equals("System Admin")){
        for(Person temp:p1.getPersonDirectory())
        {
            if(txtUserId.getText().equals(temp.getPersonEmail()) && txtPassword.getText().equals(temp.getPersonPassword()) && cbUserType.getSelectedItem().toString().equals(temp.getRole())){
                
                    this.dispose();
                    SystemAdminDashboard sd = new SystemAdminDashboard();
                    sd.setVisible(true);
                }
            else JOptionPane.showMessageDialog(this,"Incorrect details");
            }
        }
        
        PersonDirectory p2 = new PersonDirectory();
        p2.addNewPerson(11,"Ashish","ashishshethia@gmail.com","ashish123","Hospital Admin");

        
        if(cbUserType.getSelectedItem().toString().equals("Hospital Admin")){
        for(Person temp:p2.getPersonDirectory())
        {
            if(txtUserId.getText().equals(temp.getPersonEmail()) && txtPassword.getText().equals(temp.getPersonPassword()) && cbUserType.getSelectedItem().toString().equals(temp.getRole())){
                
                    this.dispose();
                    HospitalAdminDashboard hd = new HospitalAdminDashboard();
                    hd.setVisible(true);
                }
            else JOptionPane.showMessageDialog(this,"Incorrect details");
            }
        }
        
        PersonDirectory p3 = new PersonDirectory();
        p3.addNewPerson(12,"Harsh","harshpatil@gmail.com","harsh123","Community Admin");
    
        if(cbUserType.getSelectedItem().toString().equals("Community Admin")){
        for(Person temp:p3.getPersonDirectory())
        {
            if(txtUserId.getText().equals(temp.getPersonEmail()) && txtPassword.getText().equals(temp.getPersonPassword()) && cbUserType.getSelectedItem().toString().equals(temp.getRole())){
                
                    this.dispose();
                    CommunityAdminDashboard cd = new CommunityAdminDashboard();
                    cd.setVisible(true);
                }
            else JOptionPane.showMessageDialog(this,"Incorrect details");
            }
        }
       
        if(cbUserType.getSelectedItem().toString().equals("Patient")){
        for(Patient temp:patientDirectory)
        {
            //System.out.println(temp.getPatientEmail());
            if(txtUserId.getText().equals(temp.getPatientEmail()) && txtPassword.getText().equals(temp.getPatientPassword()) && cbUserType.getSelectedItem().toString().equals("Patient")){
                
                    this.dispose();
                    PatientDashboard pd = new PatientDashboard();
                    pd.setVisible(true);
                    
                    PatientDashboard.txtPatientName.setText(temp.getPatientName());
                    PatientDashboard.txtPatientAge.setText(String.valueOf(temp.getPatientAge()));
                    PatientDashboard.txtPatientGender.setText(String.valueOf(temp.getGender()));
                }
            else JOptionPane.showMessageDialog(this,"Incorrect details");
            }
        }
        if(cbUserType.getSelectedItem().toString().equals("Doctor")){
        for(Doctor temp:doctorDirectory)
        {
            if(txtUserId.getText().equals(temp.getDoctorEmail()) && txtPassword.getText().equals(temp.getDoctorPassword()) && cbUserType.getSelectedItem().toString().equals("Doctor")){
                
                    this.dispose();
                    DoctorDashboard dd = new DoctorDashboard();
                    dd.setVisible(true);
                }
            else JOptionPane.showMessageDialog(this,"Incorrect details");
            }
        }
        //}else JOptionPane.showMessageDialog(this,"The email id is not valid!!");
        } 
        
    }//GEN-LAST:event_btnLoginActionPerformed
    //else JOptionPane.showMessageDialog(this,"Please enter correct email id.");
      // }
    
    
    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
                
        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cbUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
