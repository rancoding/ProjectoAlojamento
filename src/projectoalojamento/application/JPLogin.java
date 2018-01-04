/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento.application;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Gustavo Vieira
 */
public class JPLogin extends javax.swing.JPanel {

    private Application frame;
    private JPAfterLogin jpal;
    private JPAfterLoginOwner jpalo;
    
    /**
     * Creates new form JPLogin
     */
    public JPLogin(Application frame, Object language) {
        initComponents();
        this.frame = frame;
        this.frame.setSize(530,360);
        this.loginLanguageBox.setSelectedItem(language);
        // N iniciar paineis
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
        loginPanel = new javax.swing.JPanel();
        loginTopBarPanel = new javax.swing.JPanel();
        loginLanguageBox = new javax.swing.JComboBox();
        logoPanel = new javax.swing.JPanel();
        loginInfoPanel = new javax.swing.JPanel();
        loginTitlePanel = new javax.swing.JPanel();
        loginTitleLabel = new javax.swing.JLabel();
        loginUserPassPanel = new javax.swing.JPanel();
        loginUserField = new javax.swing.JTextField();
        loginClientAccountButton = new javax.swing.JRadioButton();
        loginOwnerAccountButton = new javax.swing.JRadioButton();
        loginAdminAccountButton = new javax.swing.JRadioButton();
        loginPassField = new javax.swing.JPasswordField();
        loginButtonPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        loginErrorPanel = new javax.swing.JPanel();
        loginErrorLabel = new javax.swing.JLabel();

        loginLanguageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PT", "EN" }));
        loginLanguageBox.setToolTipText("");
        loginLanguageBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                loginLanguageBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout loginTopBarPanelLayout = new javax.swing.GroupLayout(loginTopBarPanel);
        loginTopBarPanel.setLayout(loginTopBarPanelLayout);
        loginTopBarPanelLayout.setHorizontalGroup(
            loginTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(452, Short.MAX_VALUE))
        );
        loginTopBarPanelLayout.setVerticalGroup(
            loginTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        loginTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitleLabel.setText("INICIAR SESSÃO");

        javax.swing.GroupLayout loginTitlePanelLayout = new javax.swing.GroupLayout(loginTitlePanel);
        loginTitlePanel.setLayout(loginTitlePanelLayout);
        loginTitlePanelLayout.setHorizontalGroup(
            loginTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginTitlePanelLayout.setVerticalGroup(
            loginTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        loginUserField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginUserField.setText("Utilizador");

        buttonGroup1.add(loginClientAccountButton);
        loginClientAccountButton.setText("Conta Cliente");

        buttonGroup1.add(loginOwnerAccountButton);
        loginOwnerAccountButton.setText("Conta Dono");

        buttonGroup1.add(loginAdminAccountButton);
        loginAdminAccountButton.setText("Conta Administrador");

        loginPassField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginPassField.setText("Password");

        javax.swing.GroupLayout loginUserPassPanelLayout = new javax.swing.GroupLayout(loginUserPassPanel);
        loginUserPassPanel.setLayout(loginUserPassPanelLayout);
        loginUserPassPanelLayout.setHorizontalGroup(
            loginUserPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginUserPassPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(loginUserPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginUserPassPanelLayout.createSequentialGroup()
                        .addComponent(loginClientAccountButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginOwnerAccountButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginAdminAccountButton))
                    .addGroup(loginUserPassPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(loginUserPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginUserField)
                            .addComponent(loginPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        loginUserPassPanelLayout.setVerticalGroup(
            loginUserPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginUserPassPanelLayout.createSequentialGroup()
                .addComponent(loginUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(loginPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginUserPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginClientAccountButton)
                    .addComponent(loginOwnerAccountButton)
                    .addComponent(loginAdminAccountButton)))
        );

        loginButton.setText("ENTRAR");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginButtonPanelLayout = new javax.swing.GroupLayout(loginButtonPanel);
        loginButtonPanel.setLayout(loginButtonPanelLayout);
        loginButtonPanelLayout.setHorizontalGroup(
            loginButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginButtonPanelLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginButtonPanelLayout.setVerticalGroup(
            loginButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addContainerGap())
        );

        loginErrorLabel.setForeground(new java.awt.Color(240, 240, 240));
        loginErrorLabel.setText(" ");

        javax.swing.GroupLayout loginErrorPanelLayout = new javax.swing.GroupLayout(loginErrorPanel);
        loginErrorPanel.setLayout(loginErrorPanelLayout);
        loginErrorPanelLayout.setHorizontalGroup(
            loginErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginErrorPanelLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(loginErrorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginErrorPanelLayout.setVerticalGroup(
            loginErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginErrorPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(loginErrorLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout loginInfoPanelLayout = new javax.swing.GroupLayout(loginInfoPanel);
        loginInfoPanel.setLayout(loginInfoPanelLayout);
        loginInfoPanelLayout.setHorizontalGroup(
            loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginInfoPanelLayout.createSequentialGroup()
                .addGroup(loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loginErrorPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButtonPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginTitlePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginUserPassPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginInfoPanelLayout.setVerticalGroup(
            loginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginInfoPanelLayout.createSequentialGroup()
                .addComponent(loginTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(loginUserPassPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginErrorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginTopBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(loginTopBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        // Dentro do button    
        // Para Login User //
        //this.jpal = new JPAfterLogin(this.frame, this.loginLanguageBox.getSelectedItem());   
        //this.frame.changePanel(this.jpal);
        
        // Para Login Owner 
        this.jpalo = new JPAfterLoginOwner(this.frame, this.loginLanguageBox.getSelectedItem());
        this.frame.changePanel(this.jpalo);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginLanguageBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_loginLanguageBoxItemStateChanged
        // TODO add your handling code here:
        if(this.loginLanguageBox.getSelectedItem() == "EN")
        {
            this.loginTitleLabel.setText("SIGN IN");
        }
    }//GEN-LAST:event_loginLanguageBoxItemStateChanged
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton loginAdminAccountButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginButtonPanel;
    private javax.swing.JRadioButton loginClientAccountButton;
    private javax.swing.JLabel loginErrorLabel;
    private javax.swing.JPanel loginErrorPanel;
    private javax.swing.JPanel loginInfoPanel;
    private javax.swing.JComboBox loginLanguageBox;
    private javax.swing.JRadioButton loginOwnerAccountButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField loginPassField;
    private javax.swing.JLabel loginTitleLabel;
    private javax.swing.JPanel loginTitlePanel;
    private javax.swing.JPanel loginTopBarPanel;
    private javax.swing.JTextField loginUserField;
    private javax.swing.JPanel loginUserPassPanel;
    private javax.swing.JPanel logoPanel;
    // End of variables declaration//GEN-END:variables
}
