/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Encounter;
import static model.EncounterHistory.encounterHistory;
import model.Patient;
import static model.PatientDirectory.patientDirectory;
import model.VitalSign;

/**
 *
 * @author jhalaksurve
 */
public class AddEncounter extends javax.swing.JPanel {

    int flag = 0;
    /**
     * Creates new form AddEncounter
     */
    public AddEncounter() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPulseRate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRespirationRate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPatientAge = new javax.swing.JTextField();
        cbPatientGender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSymptoms = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrescription = new javax.swing.JTextArea();
        btnAddEncounter = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Adelle Sans Devanagari", 3, 18)); // NOI18N
        jLabel1.setText("Vital Signs");

        jLabel2.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        jLabel2.setText("Temperature");

        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        jLabel3.setText("Pulse Rate");

        jLabel4.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        jLabel4.setText("Respiration Rate");

        jLabel5.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        jLabel5.setText("Blood Pressure");

        jLabel6.setFont(new java.awt.Font("Adelle Sans Devanagari", 3, 18)); // NOI18N
        jLabel6.setText("Patient Details");

        jLabel7.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        jLabel7.setText("Patient Name");

        jLabel8.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        jLabel8.setText("Patient Age");

        cbPatientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        jLabel9.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        jLabel9.setText("Patient Gender");

        jLabel10.setFont(new java.awt.Font("Adelle Sans Devanagari", 3, 18)); // NOI18N
        jLabel10.setText("Doctor Notes");

        jLabel11.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        jLabel11.setText("Date of visit");

        jLabel12.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        jLabel12.setText("Symptoms");

        txtSymptoms.setColumns(20);
        txtSymptoms.setRows(5);
        jScrollPane1.setViewportView(txtSymptoms);

        jLabel13.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        jLabel13.setText("Prescription");

        txtPrescription.setColumns(20);
        txtPrescription.setRows(5);
        jScrollPane2.setViewportView(txtPrescription);

        btnAddEncounter.setBackground(new java.awt.Color(0, 153, 255));
        btnAddEncounter.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 14)); // NOI18N
        btnAddEncounter.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEncounter.setText("Add Encounter");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(234, 234, 234))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(txtPulseRate)
                                    .addComponent(txtRespirationRate)
                                    .addComponent(txtBloodPressure))
                                .addGap(221, 221, 221)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(94, 94, 94)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPatientName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPatientAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                            .addComponent(cbPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddEncounter)
                .addGap(393, 393, 393))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnAddEncounter)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    public  boolean isValidDate(String date)
    {
        String regex = "^(1[0-2]|0[1-9])/(3[01]"
                       + "|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence)date);
        return matcher.matches();
    }
    
    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void btnAddEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEncounterActionPerformed
        // TODO add your handling code here:
        
        if(txtTemperature.getText().trim().isEmpty() || txtPulseRate.getText().trim().isEmpty() || txtRespirationRate.getText().trim().isEmpty() || txtBloodPressure.getText().trim().isEmpty() || txtPatientName.getText().trim().isEmpty() || txtPatientAge.getText().trim().isEmpty() || txtDate.getText().trim().isEmpty() || txtSymptoms.getText().trim().isEmpty() || txtPrescription.getText().trim().isEmpty())
            JOptionPane.showMessageDialog(this,"Please enter all the details to continue!!");
        else{
            
        double temperature = Double.parseDouble(txtTemperature.getText());
        int pulseRate = Integer.parseInt(txtPulseRate.getText());
        int respirationRate = Integer.parseInt(txtRespirationRate.getText());
        int bloodPressure = Integer.parseInt(txtBloodPressure.getText());
        String patientName = txtPatientName.getText();
        int patientAge = Integer.parseInt(txtPatientAge.getText());
        char patientGender = cbPatientGender.getSelectedItem().toString().charAt(0);
        String date = txtDate.getText();
        String symptoms = txtSymptoms.getText();
        String prescription = txtPrescription.getText();
        
        VitalSign[] vs = new VitalSign[10] ;
        vs[4] = new VitalSign(temperature,pulseRate,respirationRate,bloodPressure);
        
        for(Patient p : patientDirectory){
            
        if(p.getPatientName().equalsIgnoreCase(txtPatientName.getText()))
             flag = 1;
        
        }
        
        if(isValidDate(date)){
        if(flag == 1){
        encounterHistory.add(new Encounter(vs,patientName,patientAge,patientGender,date,symptoms,prescription));
        
        
        
        JOptionPane.showMessageDialog(this,"New Encounter added");
        
        txtTemperature.setText("");
        txtPulseRate.setText("");
        txtRespirationRate.setText("");
        txtBloodPressure.setText("");
        txtPatientName.setText("");
        txtPatientAge.setText("");
        txtDate.setText("");
        txtSymptoms.setText("");
        txtPrescription.setText("");
        
        }
        else JOptionPane.showMessageDialog(this,"Patient does not exist!!");
        }
         else JOptionPane.showMessageDialog(this,"Please enter valid date");
        }
    }//GEN-LAST:event_btnAddEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JComboBox<String> cbPatientGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPatientAge;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextArea txtPrescription;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtRespirationRate;
    private javax.swing.JTextArea txtSymptoms;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
