/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Appointment;
import model.Doctor;
import model.DoctorDirectory;
import static model.DoctorDirectory.doctorDirectory;
import ui.ManageDoctors;
import model.AppointmentHistory;
import static model.AppointmentHistory.appointmentHistory;
import model.Patient;

/**
 *
 * @author jhalaksurve
 */
public class PatientDashboard extends javax.swing.JFrame {
    
    //DoctorDirectory dd = new DoctorDirectory();
    AppointmentHistory ah = new AppointmentHistory();
    Patient p;
    /**
     * Creates new form PatientDashboard
     */
    public PatientDashboard() {
        initComponents();
        
        populateTable();
    }

    public  boolean isValidDate(String date)
    {
        String regex = "^(1[0-2]|0[1-9])/(3[01]"
                       + "|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence)date);
        return matcher.matches();
    }
    
    public static boolean isTimeValid(String time) {
        String regex
                = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
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
        lblHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctorsNearby = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtPatientName = new javax.swing.JTextField();
        txtPatientAge = new javax.swing.JTextField();
        txtReason = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        txtHospitalName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        btnBookAppointment = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        lblPatientAge = new javax.swing.JLabel();
        lblPatientGender = new javax.swing.JLabel();
        lblReason = new javax.swing.JLabel();
        lblDoctorName = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        txtPatientGender = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lblHeading.setBackground(new java.awt.Color(153, 204, 255));
        lblHeading.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 24)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("List of Doctors Nearby");

        tblDoctorsNearby.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Specialization", "Hospital name", "City"
            }
        ));
        tblDoctorsNearby.setColumnSelectionAllowed(true);
        tblDoctorsNearby.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDoctorsNearby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorsNearbyMouseClicked(evt);
            }
        });
        tblDoctorsNearby.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDoctorsNearbyKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoctorsNearby);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 102, 255));
        btnSearch.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnSearch))
                            .addComponent(lblHeading))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        txtPatientAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientAgeActionPerformed(evt);
            }
        });

        btnBookAppointment.setBackground(new java.awt.Color(102, 102, 102));
        btnBookAppointment.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 12)); // NOI18N
        btnBookAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnBookAppointment.setText("Book Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(102, 102, 102));
        btnLogout.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblPatientName.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblPatientName.setText("Patient Name");

        lblPatientAge.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblPatientAge.setText("Patient Age");

        lblPatientGender.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblPatientGender.setText("Patient Gender");

        lblReason.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblReason.setText("Reason for visit");

        lblDoctorName.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblDoctorName.setText("Doctor Name");

        lblHospitalName.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblHospitalName.setText("Hospital Name");

        lblDate.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblDate.setText("Date");

        lblTime.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblTime.setText("Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLogout)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPatientName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTime)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblReason)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                        .addComponent(txtReason, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDoctorName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHospitalName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPatientAge)
                                            .addComponent(lblPatientGender))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPatientAge, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                            .addComponent(txtPatientGender))))
                                .addGap(17, 17, 17))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBookAppointment)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientAge))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientGender)
                    .addComponent(txtPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReason))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHospitalName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTime))
                .addGap(44, 44, 44)
                .addComponent(btnBookAppointment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientAgeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to logout","Select",JOptionPane.YES_NO_OPTION);
        if(a == 0){
        this.dispose();
        LoginJFrame login = new LoginJFrame();
        login.setVisible(true);
    }
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void tblDoctorsNearbyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDoctorsNearbyKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tblDoctorsNearbyKeyPressed

    private void tblDoctorsNearbyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoctorsNearbyMouseClicked
        // TODO add your handling code here:
        
        int selectedRowIndex = tblDoctorsNearby.getSelectedRow();
        if (selectedRowIndex<0){
        JOptionPane.showMessageDialog(this, "Select the row you want to DELETE");
        return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctorsNearby.getModel();
        Doctor selectedDoctor;  
         selectedDoctor= (Doctor) model.getValueAt(selectedRowIndex, 0);
         txtDoctorName.setText(selectedDoctor.getDoctorName());
         txtHospitalName.setText(selectedDoctor.getHospitalName());
        
         
        
    }//GEN-LAST:event_tblDoctorsNearbyMouseClicked

    
    
    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
        String patientName = txtPatientName.getText();
        int patientAge = Integer.parseInt(txtPatientAge.getText());
        char patientGender = txtPatientGender.getText().charAt(0);
        String reason = txtReason.getText();
        String doctorName = txtDoctorName.getText();
        String hospitalName = txtHospitalName.getText();
        String date = txtDate.getText();
        String time = txtTime.getText();
        
        if(patientName.isEmpty() || txtPatientAge.getText().isEmpty() || reason.isEmpty() || doctorName.isEmpty() || hospitalName.isEmpty() || hospitalName.isEmpty() || date.isEmpty() || time.isEmpty())
            JOptionPane.showMessageDialog(this,"Please enter all the details");
        else{
        if(isValidDate(date)){
            if(isTimeValid(time)){
        appointmentHistory.add(new Appointment(patientName,patientAge,patientGender,reason,doctorName,hospitalName,date,time));
        
        JOptionPane.showMessageDialog(this,"New Appointment added");
        
        txtPatientName.setText(" ");
        txtPatientAge.setText(" ");
        txtReason.setText(" ");
        txtDoctorName.setText(" ");
        txtHospitalName.setText(" ");
        txtDate.setText(" ");
        txtTime.setText(" ");
        }else
                JOptionPane.showMessageDialog(this,"Please enter time in 24 hours format");
        }else
            JOptionPane.showMessageDialog(this,"Please enter valid date in mm/dd/yyyy format");
    }//GEN-LAST:event_btnBookAppointmentActionPerformed
    }
    
     private void filter(String query){
        DefaultTableModel model = (DefaultTableModel) tblDoctorsNearby.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblDoctorsNearby.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }    
     
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
         String query = txtSearch.getText();
        filter(query);
    }//GEN-LAST:event_txtSearchKeyReleased

    
    
    
    private void populateTable(){
        
        //doctorDirectory.add(new Doctor("abc",1,"abc","abc","abc","abc","abc"));
       
        
        DefaultTableModel model = (DefaultTableModel) tblDoctorsNearby.getModel();
        model.setRowCount(0);
        
        for(Doctor temp : doctorDirectory){
        
            Object[] row = new Object[10];
            
            row[0] = temp;
            row[1] = temp.getDoctorSpecialization();
            row[2] = temp.getHospitalName();
            row[3] = temp.getDoctorCity();
            
            model.addRow(row);
        }
    }
    /**
     * @param args the command line arguments
     */
   //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
              //  new PatientDashboard().setVisible(true);
           // }
        //});
   // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblDoctorsNearby;
    private javax.swing.JTextField txtDate;
    public static javax.swing.JTextField txtDoctorName;
    public static javax.swing.JTextField txtHospitalName;
    public static javax.swing.JTextField txtPatientAge;
    public static javax.swing.JTextField txtPatientGender;
    public static javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtReason;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
