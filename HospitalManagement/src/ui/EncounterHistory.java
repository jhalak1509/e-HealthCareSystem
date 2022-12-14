/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import static model.DoctorDirectory.doctorDirectory;
import model.Encounter;
import static model.EncounterHistory.encounterHistory;
import model.Hospital;

/**
 *
 * @author jhalaksurve
 */
public class EncounterHistory extends javax.swing.JPanel {

    /**
     * Creates new form EncounterHistory
     */
    public EncounterHistory() {
        initComponents();
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounterHistory = new javax.swing.JTable();
        lblSymptoms = new javax.swing.JLabel();
        lblPrescription = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSymptoms = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPrescription = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(153, 204, 255));

        tblEncounterHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Gender", "Date", "Symptoms", "Prescription Given"
            }
        ));
        tblEncounterHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEncounterHistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEncounterHistory);

        lblSymptoms.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblSymptoms.setText("Symptoms");

        lblPrescription.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblPrescription.setText("Prescription");

        txtSymptoms.setColumns(20);
        txtSymptoms.setRows(5);
        jScrollPane2.setViewportView(txtSymptoms);

        txtPrescription.setColumns(20);
        txtPrescription.setRows(5);
        jScrollPane3.setViewportView(txtPrescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSymptoms)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(lblPrescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSymptoms)
                        .addComponent(lblPrescription))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblEncounterHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEncounterHistoryMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblEncounterHistory.getSelectedRow();
        if (selectedRowIndex<0){
        JOptionPane.showMessageDialog(this, "Select the row you want to DELETE");
        return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEncounterHistory.getModel();
        Encounter selectedEncounter;  
         selectedEncounter = (Encounter) model.getValueAt(selectedRowIndex, 0);
         txtSymptoms.setText(selectedEncounter.getSymptoms());
         txtPrescription.setText(selectedEncounter.getPrescription());
         
         
    }//GEN-LAST:event_tblEncounterHistoryMouseClicked

    private void populateTable(){
    
        DefaultTableModel model = (DefaultTableModel) tblEncounterHistory.getModel();
        model.setRowCount(0);
        
        for(Encounter e : encounterHistory){
        
            Object[] row = new Object[10];
            
            row[0] = e;
            row[1] = e.getPatientAge();
            row[2] = e.getPatientGender();
            row[3] = e.getDate();
            //row[4] = e.getVitalSigns();
            row[4] = e.getSymptoms();
            row[5] = e.getPrescription();
            
            model.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblPrescription;
    private javax.swing.JLabel lblSymptoms;
    private javax.swing.JTable tblEncounterHistory;
    private javax.swing.JTextArea txtPrescription;
    private javax.swing.JTextArea txtSymptoms;
    // End of variables declaration//GEN-END:variables
}
