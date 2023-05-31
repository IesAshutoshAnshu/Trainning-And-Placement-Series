/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import trandpl.dao.HrDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.HrPojo;

/**
 *
 * @author ashut
 */
public class AdminAddNewHrFrame extends javax.swing.JFrame {

        private String password;
        private String confrmPwd;
        
    public AdminAddNewHrFrame() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Admin Add New HR");
        lblName.setText(CurrentUser.getName());
        loadId();
    }
    private void loadId(){
        try
        {
            int hrId=HrDAO.getNewHrId();
            lblHrId.setText("Hr-"+hrId);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error In Generating HrID",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private boolean validateInputs(){
        password=String.valueOf(txtPwd.getPassword());
        confrmPwd=String.valueOf(txtCnfrmPwd.getPassword());
        int index=jcProff.getSelectedIndex();
        if(txtName.getText().isEmpty()||txtMail.getText().isEmpty()||txtMob.getText().isEmpty()||txtCompany.getText().isEmpty()||password.isEmpty()||confrmPwd.isEmpty()||index==0)
            return false;
        return true;
    }
    private boolean matchPasswords(){
        return password.equals(confrmPwd);
    }
    private void clearAll(){
        txtName.setText("");
        txtMail.setText("");
        txtCompany.setText("");
        txtMob.setText("");
        txtPwd.setText("");
        txtCnfrmPwd.setText("");
        jcProff.setSelectedIndex(0);
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
        jLabel2 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jcProff = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        txtCnfrmPwd = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        btnAddNewHr = new javax.swing.JButton();
        txtMob = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lblHrId = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 192, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 964, 144));

        btnLogOut.setBackground(new java.awt.Color(173, 192, 234));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 124, 41));

        btnBack.setBackground(new java.awt.Color(173, 192, 234));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 134, 42));

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        jLabel4.setText("Welcome ,");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 108, 42));

        lblName.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 281, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/addNewEmp.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 306, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setText("Hr Id :-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel6.setText("Company Name :-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 149, 32));

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 98, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 149, 30));

        txtName.setBackground(new java.awt.Color(173, 193, 234));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtName.setBorder(null);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 305, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        jLabel11.setText("Mobile No.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 110, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        jLabel12.setText("Proffession in");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 170, 40));

        txtMail.setBackground(new java.awt.Color(173, 192, 234));
        txtMail.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtMail.setBorder(null);
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 280, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 350, -1));

        jcProff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Profession", "Developer", "Technical", "Apptitude", "Digital Marketing", "Team Leader", "Performance managment" }));
        jPanel1.add(jcProff, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 330, 30));

        jLabel14.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        jLabel14.setText("Password");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 150, 30));

        jLabel15.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        jLabel15.setText("Confirm Password");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 220, 30));

        txtPwd.setBackground(new java.awt.Color(172, 192, 234));
        txtPwd.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtPwd.setBorder(null);
        jPanel1.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 290, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 350, 40));

        txtCnfrmPwd.setBackground(new java.awt.Color(172, 194, 234));
        txtCnfrmPwd.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtCnfrmPwd.setBorder(null);
        txtCnfrmPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnfrmPwdActionPerformed(evt);
            }
        });
        jPanel1.add(txtCnfrmPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 280, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jLabel17.setText("\n");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 350, 40));

        btnAddNewHr.setBackground(new java.awt.Color(173, 192, 234));
        btnAddNewHr.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAddNewHr.setText("Add New HR");
        btnAddNewHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddNewHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 240, 50));

        txtMob.setBackground(new java.awt.Color(173, 192, 234));
        txtMob.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtMob.setBorder(null);
        jPanel1.add(txtMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 280, 20));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 350, -1));

        lblHrId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblHrId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblHrId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 190, 30));

        txtCompany.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtCompany.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyActionPerformed(evt);
            }
        });
        jPanel1.add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 220, 30));

        jLabel10.setBackground(new java.awt.Color(243, 246, 254));
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 940, -1));

        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 690, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new AdminHrModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCnfrmPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnfrmPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnfrmPwdActionPerformed

    private void txtCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyActionPerformed

    private void btnAddNewHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewHrActionPerformed
        // TODO add your handling code here:
        if(validateInputs()==false){
            JOptionPane.showMessageDialog(null,"Please fill all the fields","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(matchPasswords()==false){
            JOptionPane.showMessageDialog(null,"Passwords do not match!","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            HrPojo hr=new HrPojo();
            hr.setUserId(txtMail.getText().trim().toUpperCase());
            hr.setHrId(lblHrId.getText().trim());
            hr.setHrName(txtName.getText().trim());
            hr.setCompanyName(txtCompany.getText().trim());
            hr.setPassword(password);
            hr.setProfession(jcProff.getSelectedItem().toString());
            hr.setPhone(txtMob.getText().trim());
            hr.setType("Hr");
            int result=HrDAO.addNewHr(hr);
            if(result==1){
                JOptionPane.showMessageDialog(null,"Record Added Successfully","Success!",JOptionPane.INFORMATION_MESSAGE);
                clearAll();
                return;
            }
            else if(result==-1){
                JOptionPane.showMessageDialog(null,"This Email Id Is Already Registered","Error!",JOptionPane.ERROR_MESSAGE);
                 return;
            }
            else{
                JOptionPane.showMessageDialog(null,"Cann't Add The Reacord","Error!",JOptionPane.ERROR_MESSAGE);
                return;
            }           
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnAddNewHrActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddNewHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewHr;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcProff;
    private javax.swing.JLabel lblHrId;
    private javax.swing.JLabel lblName;
    private javax.swing.JPasswordField txtCnfrmPwd;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMob;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables
}
