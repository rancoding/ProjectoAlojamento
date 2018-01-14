/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento.application;

import projectoalojamento.Repository;

/**
 *
 * @author Gustavo Vieira
 */
public class JPRegister extends javax.swing.JPanel {

    private Application frame;
    private JPAfterLogin jpal;
    private JPAfterLoginOwner jpalo;
    private Repository repo;
    
    /**
     * Creates new form JPRegister
     */
    public JPRegister(Application frame,Repository repo, Object language) {
        initComponents();
        this.frame = frame;
        this.frame.setSize(500,472);
        this.registerLanguageBox.setSelectedItem(language);
        this.repo=repo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        registerPanel = new javax.swing.JPanel();
        registerTopBarPanel = new javax.swing.JPanel();
        registerLanguageBox = new javax.swing.JComboBox();
        registerLogoPanel = new javax.swing.JPanel();
        registerInfoPanel = new javax.swing.JPanel();
        registerErrorPanel = new javax.swing.JPanel();
        registerErrorLabel = new javax.swing.JLabel();
        registerInfoTitlePanel = new javax.swing.JPanel();
        registerTitleLabel = new javax.swing.JLabel();
        registerUserInfoPanel = new javax.swing.JPanel();
        registerUsernameField = new javax.swing.JTextField();
        registerNameField = new javax.swing.JTextField();
        registerAddressField = new javax.swing.JTextField();
        registerLocationBox = new javax.swing.JComboBox();
        registerCitizenIdField = new javax.swing.JTextField();
        registerNIFField = new javax.swing.JTextField();
        registerPhoneNumberField = new javax.swing.JTextField();
        registerProfileBox = new javax.swing.JComboBox();
        registerClientAccountButton = new javax.swing.JRadioButton();
        registerOwnerAccountButton = new javax.swing.JRadioButton();
        registerButtonPanel = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();
        registerPasswordField = new javax.swing.JPasswordField();

        registerLanguageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PT", "EN" }));

        javax.swing.GroupLayout registerTopBarPanelLayout = new javax.swing.GroupLayout(registerTopBarPanel);
        registerTopBarPanel.setLayout(registerTopBarPanelLayout);
        registerTopBarPanelLayout.setHorizontalGroup(
            registerTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(452, Short.MAX_VALUE))
        );
        registerTopBarPanelLayout.setVerticalGroup(
            registerTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registerLogoPanelLayout = new javax.swing.GroupLayout(registerLogoPanel);
        registerLogoPanel.setLayout(registerLogoPanelLayout);
        registerLogoPanelLayout.setHorizontalGroup(
            registerLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        registerLogoPanelLayout.setVerticalGroup(
            registerLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        registerErrorLabel.setText(" ");

        javax.swing.GroupLayout registerErrorPanelLayout = new javax.swing.GroupLayout(registerErrorPanel);
        registerErrorPanel.setLayout(registerErrorPanelLayout);
        registerErrorPanelLayout.setHorizontalGroup(
            registerErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerErrorPanelLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(registerErrorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerErrorPanelLayout.setVerticalGroup(
            registerErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerErrorPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(registerErrorLabel)
                .addContainerGap())
        );

        registerTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registerTitleLabel.setText("REGISTAR UMA CONTA");

        javax.swing.GroupLayout registerInfoTitlePanelLayout = new javax.swing.GroupLayout(registerInfoTitlePanel);
        registerInfoTitlePanel.setLayout(registerInfoTitlePanelLayout);
        registerInfoTitlePanelLayout.setHorizontalGroup(
            registerInfoTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerInfoTitlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerTitleLabel)
                .addGap(175, 175, 175))
        );
        registerInfoTitlePanelLayout.setVerticalGroup(
            registerInfoTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerInfoTitlePanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(registerTitleLabel)
                .addContainerGap())
        );

        registerUsernameField.setText(" Utilizador");

        registerNameField.setText(" Nome");

        registerAddressField.setText(" Morada");

        registerLocationBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Localidade 1", "Localidade 2" }));

        registerCitizenIdField.setText(" Nº Cartão Cidadão");

        registerNIFField.setText(" NIF");

        registerPhoneNumberField.setText(" Nº Telemóvel");

        registerProfileBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perfil Privado", "Perfil Público" }));

        buttonGroup1.add(registerClientAccountButton);
        registerClientAccountButton.setText("Conta Cliente");

        buttonGroup1.add(registerOwnerAccountButton);
        registerOwnerAccountButton.setText("Conta Dono");

        registerButton.setText("Registar");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerButtonPanelLayout = new javax.swing.GroupLayout(registerButtonPanel);
        registerButtonPanel.setLayout(registerButtonPanelLayout);
        registerButtonPanelLayout.setHorizontalGroup(
            registerButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerButtonPanelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(registerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerButtonPanelLayout.setVerticalGroup(
            registerButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addContainerGap())
        );

        registerPasswordField.setText("jPasswordField1");

        javax.swing.GroupLayout registerUserInfoPanelLayout = new javax.swing.GroupLayout(registerUserInfoPanel);
        registerUserInfoPanel.setLayout(registerUserInfoPanelLayout);
        registerUserInfoPanelLayout.setHorizontalGroup(
            registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerUserInfoPanelLayout.createSequentialGroup()
                .addGroup(registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(registerUserInfoPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerUserInfoPanelLayout.createSequentialGroup()
                                .addComponent(registerUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addComponent(registerNameField)
                            .addGroup(registerUserInfoPanelLayout.createSequentialGroup()
                                .addGroup(registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(registerAddressField)
                                    .addComponent(registerCitizenIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registerNIFField)
                                    .addComponent(registerLocationBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(registerUserInfoPanelLayout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addGroup(registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registerPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerClientAccountButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerOwnerAccountButton)
                            .addComponent(registerProfileBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(registerButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registerUserInfoPanelLayout.setVerticalGroup(
            registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerUserInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerUsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(registerPasswordField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerAddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(registerLocationBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerCitizenIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(registerNIFField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerPhoneNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(registerProfileBox))
                .addGap(5, 5, 5)
                .addGroup(registerUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerClientAccountButton)
                    .addComponent(registerOwnerAccountButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout registerInfoPanelLayout = new javax.swing.GroupLayout(registerInfoPanel);
        registerInfoPanel.setLayout(registerInfoPanelLayout);
        registerInfoPanelLayout.setHorizontalGroup(
            registerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerInfoPanelLayout.createSequentialGroup()
                .addGroup(registerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(registerErrorPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerUserInfoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerInfoTitlePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        registerInfoPanelLayout.setVerticalGroup(
            registerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerInfoPanelLayout.createSequentialGroup()
                .addComponent(registerInfoTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerUserInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerErrorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(registerLogoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerTopBarPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addComponent(registerTopBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerLogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        // Dentro do button 
        // Se for Cliente //
        //this.jpal = new JPAfterLogin(this.frame, this.registerLanguageBox.getSelectedItem());   
        //this.frame.changePanel(this.jpal);
        
        // Se for Dono //
        this.jpalo = new JPAfterLoginOwner(this.frame, this.repo,this.registerLanguageBox.getSelectedItem());   
        this.frame.changePanel(this.jpalo);
    }//GEN-LAST:event_registerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField registerAddressField;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registerButtonPanel;
    private javax.swing.JTextField registerCitizenIdField;
    private javax.swing.JRadioButton registerClientAccountButton;
    private javax.swing.JLabel registerErrorLabel;
    private javax.swing.JPanel registerErrorPanel;
    private javax.swing.JPanel registerInfoPanel;
    private javax.swing.JPanel registerInfoTitlePanel;
    private javax.swing.JComboBox registerLanguageBox;
    private javax.swing.JComboBox registerLocationBox;
    private javax.swing.JPanel registerLogoPanel;
    private javax.swing.JTextField registerNIFField;
    private javax.swing.JTextField registerNameField;
    private javax.swing.JRadioButton registerOwnerAccountButton;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPasswordField registerPasswordField;
    private javax.swing.JTextField registerPhoneNumberField;
    private javax.swing.JComboBox registerProfileBox;
    private javax.swing.JLabel registerTitleLabel;
    private javax.swing.JPanel registerTopBarPanel;
    private javax.swing.JPanel registerUserInfoPanel;
    private javax.swing.JTextField registerUsernameField;
    // End of variables declaration//GEN-END:variables
}
