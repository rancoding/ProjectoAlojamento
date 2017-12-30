/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento.application;

/**
 *
 * @author Gustavo Vieira
 */
public class JPAutoRegister extends javax.swing.JPanel {

    /**
     * Creates new form JPAutoRegister
     */
    public JPAutoRegister() {
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

        autoRegisterPanel = new javax.swing.JPanel();
        autoRegisterTopBarPanel = new javax.swing.JPanel();
        autoRegisterLanguageBox = new javax.swing.JComboBox();
        autoRegisterNameLabel = new javax.swing.JLabel();
        autoRegisterLogoPanel = new javax.swing.JPanel();
        autoRegisterInfoPanel = new javax.swing.JPanel();
        autoRegisterInfoTitlePanel = new javax.swing.JPanel();
        autoRegisterTitleLabel = new javax.swing.JLabel();
        autoRegisterButtonPanel = new javax.swing.JPanel();
        autoRegisterRegisterButton = new javax.swing.JButton();
        autoRegisterBackButton = new javax.swing.JButton();
        autoRegisterNameField = new javax.swing.JTextField();
        autoRegisterAddressField = new javax.swing.JTextField();
        autoRegisterLocationField = new javax.swing.JTextField();
        autoRegisterCitizenIdField = new javax.swing.JTextField();
        autoRegisterNIFField = new javax.swing.JTextField();
        autoRegisterPhoneNumberField = new javax.swing.JTextField();
        autoRegisterProfileBox = new javax.swing.JComboBox();
        autoRegisterInfoLabel = new javax.swing.JLabel();

        autoRegisterLanguageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PT", "EN" }));

        autoRegisterNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        autoRegisterNameLabel.setText("Gustavo Moreira Vieira");

        javax.swing.GroupLayout autoRegisterTopBarPanelLayout = new javax.swing.GroupLayout(autoRegisterTopBarPanel);
        autoRegisterTopBarPanel.setLayout(autoRegisterTopBarPanelLayout);
        autoRegisterTopBarPanelLayout.setHorizontalGroup(
            autoRegisterTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoRegisterTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(autoRegisterLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(autoRegisterNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        autoRegisterTopBarPanelLayout.setVerticalGroup(
            autoRegisterTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoRegisterTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(autoRegisterTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autoRegisterLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autoRegisterNameLabel))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout autoRegisterLogoPanelLayout = new javax.swing.GroupLayout(autoRegisterLogoPanel);
        autoRegisterLogoPanel.setLayout(autoRegisterLogoPanelLayout);
        autoRegisterLogoPanelLayout.setHorizontalGroup(
            autoRegisterLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        autoRegisterLogoPanelLayout.setVerticalGroup(
            autoRegisterLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        autoRegisterTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        autoRegisterTitleLabel.setText("AUTO-REGISTO");

        javax.swing.GroupLayout autoRegisterInfoTitlePanelLayout = new javax.swing.GroupLayout(autoRegisterInfoTitlePanel);
        autoRegisterInfoTitlePanel.setLayout(autoRegisterInfoTitlePanelLayout);
        autoRegisterInfoTitlePanelLayout.setHorizontalGroup(
            autoRegisterInfoTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoRegisterInfoTitlePanelLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(autoRegisterTitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        autoRegisterInfoTitlePanelLayout.setVerticalGroup(
            autoRegisterInfoTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, autoRegisterInfoTitlePanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(autoRegisterTitleLabel)
                .addContainerGap())
        );

        autoRegisterRegisterButton.setText("Registar");

        autoRegisterBackButton.setText("Voltar");

        javax.swing.GroupLayout autoRegisterButtonPanelLayout = new javax.swing.GroupLayout(autoRegisterButtonPanel);
        autoRegisterButtonPanel.setLayout(autoRegisterButtonPanelLayout);
        autoRegisterButtonPanelLayout.setHorizontalGroup(
            autoRegisterButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoRegisterButtonPanelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(autoRegisterRegisterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autoRegisterBackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        autoRegisterButtonPanelLayout.setVerticalGroup(
            autoRegisterButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoRegisterButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(autoRegisterButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autoRegisterRegisterButton)
                    .addComponent(autoRegisterBackButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        autoRegisterNameField.setEditable(false);
        autoRegisterNameField.setText(" Nome");

        autoRegisterAddressField.setEditable(false);
        autoRegisterAddressField.setText(" Morada");

        autoRegisterLocationField.setEditable(false);
        autoRegisterLocationField.setText(" Localidade");

        autoRegisterCitizenIdField.setEditable(false);
        autoRegisterCitizenIdField.setText(" Nº Cartão Cidadão");

        autoRegisterNIFField.setEditable(false);
        autoRegisterNIFField.setText(" NIF");

        autoRegisterPhoneNumberField.setEditable(false);
        autoRegisterPhoneNumberField.setText(" Nº Telemóvel");

        autoRegisterProfileBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perfil Privado", "Perfil Público" }));

        autoRegisterInfoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        autoRegisterInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autoRegisterInfoLabel.setText("O utilizador e a password da sua nova conta serão iguais aos da conta actual");

        javax.swing.GroupLayout autoRegisterInfoPanelLayout = new javax.swing.GroupLayout(autoRegisterInfoPanel);
        autoRegisterInfoPanel.setLayout(autoRegisterInfoPanelLayout);
        autoRegisterInfoPanelLayout.setHorizontalGroup(
            autoRegisterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(autoRegisterInfoTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(autoRegisterButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(autoRegisterInfoPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(autoRegisterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(autoRegisterInfoPanelLayout.createSequentialGroup()
                        .addComponent(autoRegisterPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autoRegisterProfileBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(autoRegisterNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(autoRegisterInfoPanelLayout.createSequentialGroup()
                        .addComponent(autoRegisterAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autoRegisterLocationField))
                    .addGroup(autoRegisterInfoPanelLayout.createSequentialGroup()
                        .addComponent(autoRegisterCitizenIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autoRegisterNIFField)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(autoRegisterInfoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        autoRegisterInfoPanelLayout.setVerticalGroup(
            autoRegisterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoRegisterInfoPanelLayout.createSequentialGroup()
                .addComponent(autoRegisterInfoTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autoRegisterNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(autoRegisterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(autoRegisterAddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(autoRegisterLocationField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(autoRegisterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(autoRegisterCitizenIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(autoRegisterNIFField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(autoRegisterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(autoRegisterPhoneNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(autoRegisterProfileBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(autoRegisterInfoLabel)
                .addGap(18, 18, 18)
                .addComponent(autoRegisterButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout autoRegisterPanelLayout = new javax.swing.GroupLayout(autoRegisterPanel);
        autoRegisterPanel.setLayout(autoRegisterPanelLayout);
        autoRegisterPanelLayout.setHorizontalGroup(
            autoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(autoRegisterTopBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(autoRegisterLogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(autoRegisterInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        autoRegisterPanelLayout.setVerticalGroup(
            autoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoRegisterPanelLayout.createSequentialGroup()
                .addComponent(autoRegisterTopBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autoRegisterLogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autoRegisterInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(autoRegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(autoRegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autoRegisterAddressField;
    private javax.swing.JButton autoRegisterBackButton;
    private javax.swing.JPanel autoRegisterButtonPanel;
    private javax.swing.JTextField autoRegisterCitizenIdField;
    private javax.swing.JLabel autoRegisterInfoLabel;
    private javax.swing.JPanel autoRegisterInfoPanel;
    private javax.swing.JPanel autoRegisterInfoTitlePanel;
    private javax.swing.JComboBox autoRegisterLanguageBox;
    private javax.swing.JTextField autoRegisterLocationField;
    private javax.swing.JPanel autoRegisterLogoPanel;
    private javax.swing.JTextField autoRegisterNIFField;
    private javax.swing.JTextField autoRegisterNameField;
    private javax.swing.JLabel autoRegisterNameLabel;
    private javax.swing.JPanel autoRegisterPanel;
    private javax.swing.JTextField autoRegisterPhoneNumberField;
    private javax.swing.JComboBox autoRegisterProfileBox;
    private javax.swing.JButton autoRegisterRegisterButton;
    private javax.swing.JLabel autoRegisterTitleLabel;
    private javax.swing.JPanel autoRegisterTopBarPanel;
    // End of variables declaration//GEN-END:variables
}