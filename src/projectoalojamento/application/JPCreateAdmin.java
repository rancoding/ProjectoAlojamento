/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento.application;

/**
 *
 * @author Rafael
 */
public class JPCreateAdmin extends javax.swing.JPanel {

    /**
     * Creates new form JPCreateAdmin
     */
    public JPCreateAdmin() {
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

        createAdminRegisterPanel = new javax.swing.JPanel();
        createAdminPanel = new javax.swing.JPanel();
        createAdminTopBarPanel = new javax.swing.JPanel();
        createAdminLanguageBox = new javax.swing.JComboBox<>();
        createAdminNickLabel = new javax.swing.JLabel();
        createAdminLogoPanel = new javax.swing.JPanel();
        createAdminInfoPanel = new javax.swing.JPanel();
        createAdminUserInfoPanel = new javax.swing.JPanel();
        createAdminUsernameField = new javax.swing.JTextField();
        createAdminPasswordField = new javax.swing.JTextField();
        createAdminNameField = new javax.swing.JTextField();
        createAdminAddressField = new javax.swing.JTextField();
        createAdminLocationBox = new javax.swing.JComboBox();
        createAdminCitizenIdField = new javax.swing.JTextField();
        createAdminNIFField = new javax.swing.JTextField();
        createAdminPhoneNumberField = new javax.swing.JTextField();
        createAdminDivisionBox = new javax.swing.JComboBox();
        createAdminButton = new javax.swing.JButton();
        createAdminInfoTitlePanel = new javax.swing.JPanel();
        createAdminTitleLabel = new javax.swing.JLabel();
        createAdminErrorPanel = new javax.swing.JPanel();
        createAdminErrorLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout createAdminRegisterPanelLayout = new javax.swing.GroupLayout(createAdminRegisterPanel);
        createAdminRegisterPanel.setLayout(createAdminRegisterPanelLayout);
        createAdminRegisterPanelLayout.setHorizontalGroup(
            createAdminRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        createAdminRegisterPanelLayout.setVerticalGroup(
            createAdminRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        createAdminLanguageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PT", "EN" }));
        createAdminLanguageBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAdminLanguageBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createAdminTopBarPanelLayout = new javax.swing.GroupLayout(createAdminTopBarPanel);
        createAdminTopBarPanel.setLayout(createAdminTopBarPanelLayout);
        createAdminTopBarPanelLayout.setHorizontalGroup(
            createAdminTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAdminTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createAdminLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createAdminNickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        createAdminTopBarPanelLayout.setVerticalGroup(
            createAdminTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAdminTopBarPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(createAdminTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createAdminLanguageBox)
                    .addComponent(createAdminNickLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout createAdminLogoPanelLayout = new javax.swing.GroupLayout(createAdminLogoPanel);
        createAdminLogoPanel.setLayout(createAdminLogoPanelLayout);
        createAdminLogoPanelLayout.setHorizontalGroup(
            createAdminLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        createAdminLogoPanelLayout.setVerticalGroup(
            createAdminLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        createAdminUsernameField.setText(" Utilizador");

        createAdminPasswordField.setText(" Password");

        createAdminNameField.setText(" Nome");

        createAdminAddressField.setText(" Morada");

        createAdminLocationBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Localidade 1", "Localidade 2" }));

        createAdminCitizenIdField.setText(" Nº Cartão Cidadão");

        createAdminNIFField.setText(" NIF");

        createAdminPhoneNumberField.setText(" Nº Telemóvel");

        createAdminDivisionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Division 1", "Division 2" }));

        createAdminButton.setText("Registar");

        javax.swing.GroupLayout createAdminUserInfoPanelLayout = new javax.swing.GroupLayout(createAdminUserInfoPanel);
        createAdminUserInfoPanel.setLayout(createAdminUserInfoPanelLayout);
        createAdminUserInfoPanelLayout.setHorizontalGroup(
            createAdminUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAdminUserInfoPanelLayout.createSequentialGroup()
                .addGroup(createAdminUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(createAdminUserInfoPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(createAdminUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(createAdminUserInfoPanelLayout.createSequentialGroup()
                                .addComponent(createAdminCitizenIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createAdminNIFField))
                            .addComponent(createAdminNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAdminUserInfoPanelLayout.createSequentialGroup()
                                .addComponent(createAdminUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createAdminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createAdminUserInfoPanelLayout.createSequentialGroup()
                                .addComponent(createAdminAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createAdminLocationBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(createAdminUserInfoPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createAdminPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createAdminDivisionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(createAdminUserInfoPanelLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(createAdminButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        createAdminUserInfoPanelLayout.setVerticalGroup(
            createAdminUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAdminUserInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(createAdminUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createAdminPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(createAdminUsernameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAdminNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAdminUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createAdminAddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(createAdminLocationBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAdminUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createAdminCitizenIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(createAdminNIFField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAdminUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createAdminPhoneNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(createAdminDivisionBox))
                .addGap(18, 18, 18)
                .addComponent(createAdminButton)
                .addGap(34, 34, 34))
        );

        createAdminTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createAdminTitleLabel.setText("REGISTAR UM ADMIN");

        javax.swing.GroupLayout createAdminInfoTitlePanelLayout = new javax.swing.GroupLayout(createAdminInfoTitlePanel);
        createAdminInfoTitlePanel.setLayout(createAdminInfoTitlePanelLayout);
        createAdminInfoTitlePanelLayout.setHorizontalGroup(
            createAdminInfoTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAdminInfoTitlePanelLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(createAdminTitleLabel)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        createAdminInfoTitlePanelLayout.setVerticalGroup(
            createAdminInfoTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAdminInfoTitlePanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(createAdminTitleLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout createAdminErrorPanelLayout = new javax.swing.GroupLayout(createAdminErrorPanel);
        createAdminErrorPanel.setLayout(createAdminErrorPanelLayout);
        createAdminErrorPanelLayout.setHorizontalGroup(
            createAdminErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAdminErrorPanelLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(createAdminErrorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createAdminErrorPanelLayout.setVerticalGroup(
            createAdminErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAdminErrorPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(createAdminErrorLabel)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout createAdminInfoPanelLayout = new javax.swing.GroupLayout(createAdminInfoPanel);
        createAdminInfoPanel.setLayout(createAdminInfoPanelLayout);
        createAdminInfoPanelLayout.setHorizontalGroup(
            createAdminInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAdminInfoTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(createAdminInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createAdminErrorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(createAdminInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(createAdminInfoPanelLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(createAdminUserInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
        );
        createAdminInfoPanelLayout.setVerticalGroup(
            createAdminInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAdminInfoPanelLayout.createSequentialGroup()
                .addComponent(createAdminInfoTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(createAdminErrorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(createAdminInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(createAdminInfoPanelLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(createAdminUserInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout createAdminPanelLayout = new javax.swing.GroupLayout(createAdminPanel);
        createAdminPanel.setLayout(createAdminPanelLayout);
        createAdminPanelLayout.setHorizontalGroup(
            createAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAdminTopBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(createAdminLogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(createAdminInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        createAdminPanelLayout.setVerticalGroup(
            createAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAdminPanelLayout.createSequentialGroup()
                .addComponent(createAdminTopBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAdminLogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAdminInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 476, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createAdminLanguageBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAdminLanguageBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createAdminLanguageBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField createAdminAddressField;
    private javax.swing.JButton createAdminButton;
    private javax.swing.JTextField createAdminCitizenIdField;
    private javax.swing.JComboBox createAdminDivisionBox;
    private javax.swing.JLabel createAdminErrorLabel;
    private javax.swing.JPanel createAdminErrorPanel;
    private javax.swing.JPanel createAdminInfoPanel;
    private javax.swing.JPanel createAdminInfoTitlePanel;
    private javax.swing.JComboBox<String> createAdminLanguageBox;
    private javax.swing.JComboBox createAdminLocationBox;
    private javax.swing.JPanel createAdminLogoPanel;
    private javax.swing.JTextField createAdminNIFField;
    private javax.swing.JTextField createAdminNameField;
    private javax.swing.JLabel createAdminNickLabel;
    private javax.swing.JPanel createAdminPanel;
    private javax.swing.JTextField createAdminPasswordField;
    private javax.swing.JTextField createAdminPhoneNumberField;
    private javax.swing.JPanel createAdminRegisterPanel;
    private javax.swing.JLabel createAdminTitleLabel;
    private javax.swing.JPanel createAdminTopBarPanel;
    private javax.swing.JPanel createAdminUserInfoPanel;
    private javax.swing.JTextField createAdminUsernameField;
    // End of variables declaration//GEN-END:variables
}
