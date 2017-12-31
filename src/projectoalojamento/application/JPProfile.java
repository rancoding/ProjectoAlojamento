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
public class JPProfile extends javax.swing.JPanel {

    /**
     * Creates new form JPProfile
     */
    public JPProfile() {
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

        profilePanel = new javax.swing.JPanel();
        profileTopBarPanel = new javax.swing.JPanel();
        profileLanguageBox = new javax.swing.JComboBox();
        profileNameLabel = new javax.swing.JLabel();
        profileLogoPanel = new javax.swing.JPanel();
        profileInfoPanel = new javax.swing.JPanel();
        profileInfoErrorPanel = new javax.swing.JPanel();
        profileErrorLabel = new javax.swing.JLabel();
        profileButtonPanel = new javax.swing.JPanel();
        profileBookingButton = new javax.swing.JButton();
        profileRatingButton = new javax.swing.JButton();
        profileAutoRegisterButton = new javax.swing.JButton();
        profileInfoUserPanel = new javax.swing.JPanel();
        profileInfoContainerPanel = new javax.swing.JPanel();
        profileEditButton = new javax.swing.JButton();
        profileUserField = new javax.swing.JTextField();
        profileNameField = new javax.swing.JTextField();
        profileAddressField = new javax.swing.JTextField();
        profileLocationBox = new javax.swing.JComboBox();
        profileCitizenIdField = new javax.swing.JTextField();
        profileNIFField = new javax.swing.JTextField();
        profilePhoneNumberField = new javax.swing.JTextField();
        profileBox = new javax.swing.JComboBox();
        profilePasswordField = new javax.swing.JPasswordField();

        profileLanguageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PT", "EN" }));

        profileNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        profileNameLabel.setText("Gustavo Moreira Vieira");

        javax.swing.GroupLayout profileTopBarPanelLayout = new javax.swing.GroupLayout(profileTopBarPanel);
        profileTopBarPanel.setLayout(profileTopBarPanelLayout);
        profileTopBarPanelLayout.setHorizontalGroup(
            profileTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profileNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        profileTopBarPanelLayout.setVerticalGroup(
            profileTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileNameLabel))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout profileLogoPanelLayout = new javax.swing.GroupLayout(profileLogoPanel);
        profileLogoPanel.setLayout(profileLogoPanelLayout);
        profileLogoPanelLayout.setHorizontalGroup(
            profileLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        profileLogoPanelLayout.setVerticalGroup(
            profileLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        profileErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileErrorLabel.setText(" ");

        javax.swing.GroupLayout profileInfoErrorPanelLayout = new javax.swing.GroupLayout(profileInfoErrorPanel);
        profileInfoErrorPanel.setLayout(profileInfoErrorPanelLayout);
        profileInfoErrorPanelLayout.setHorizontalGroup(
            profileInfoErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        profileInfoErrorPanelLayout.setVerticalGroup(
            profileInfoErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileInfoErrorPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(profileErrorLabel)
                .addContainerGap())
        );

        profileBookingButton.setText("Reservas");

        profileRatingButton.setText("Avaliações");

        profileAutoRegisterButton.setText("Auto-Registo");

        javax.swing.GroupLayout profileButtonPanelLayout = new javax.swing.GroupLayout(profileButtonPanel);
        profileButtonPanel.setLayout(profileButtonPanelLayout);
        profileButtonPanelLayout.setHorizontalGroup(
            profileButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileBookingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileRatingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profileAutoRegisterButton)
                .addContainerGap())
        );
        profileButtonPanelLayout.setVerticalGroup(
            profileButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileBookingButton)
                    .addComponent(profileRatingButton)
                    .addComponent(profileAutoRegisterButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        profileInfoContainerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Informação"));

        profileEditButton.setText("Editar");

        profileUserField.setEditable(false);
        profileUserField.setText(" Username");

        profileNameField.setText(" Nome");

        profileAddressField.setText(" Morada");

        profileLocationBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Localidade" }));

        profileCitizenIdField.setText(" Nº Cartão de Cidadão");

        profileNIFField.setText(" NIF");

        profilePhoneNumberField.setText(" Nº Telemóvel");

        profileBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perfil Privado", "Perfil Público" }));

        profilePasswordField.setText("Password");

        javax.swing.GroupLayout profileInfoContainerPanelLayout = new javax.swing.GroupLayout(profileInfoContainerPanel);
        profileInfoContainerPanel.setLayout(profileInfoContainerPanelLayout);
        profileInfoContainerPanelLayout.setHorizontalGroup(
            profileInfoContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileInfoContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileInfoContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileInfoContainerPanelLayout.createSequentialGroup()
                        .addComponent(profileCitizenIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profileNIFField))
                    .addGroup(profileInfoContainerPanelLayout.createSequentialGroup()
                        .addComponent(profilePhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profileBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(profileInfoContainerPanelLayout.createSequentialGroup()
                        .addGroup(profileInfoContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profileInfoContainerPanelLayout.createSequentialGroup()
                                .addComponent(profileAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profileLocationBox, 0, 200, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profileInfoContainerPanelLayout.createSequentialGroup()
                                .addComponent(profileUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profilePasswordField))
                            .addComponent(profileNameField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileInfoContainerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(profileEditButton)))
                .addContainerGap())
        );
        profileInfoContainerPanelLayout.setVerticalGroup(
            profileInfoContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileInfoContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileInfoContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profileUserField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(profilePasswordField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileInfoContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileLocationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileInfoContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profileCitizenIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(profileNIFField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileInfoContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profilePhoneNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(profileBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profileEditButton))
        );

        javax.swing.GroupLayout profileInfoUserPanelLayout = new javax.swing.GroupLayout(profileInfoUserPanel);
        profileInfoUserPanel.setLayout(profileInfoUserPanelLayout);
        profileInfoUserPanelLayout.setHorizontalGroup(
            profileInfoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileInfoUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileInfoContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        profileInfoUserPanelLayout.setVerticalGroup(
            profileInfoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileInfoUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileInfoContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout profileInfoPanelLayout = new javax.swing.GroupLayout(profileInfoPanel);
        profileInfoPanel.setLayout(profileInfoPanelLayout);
        profileInfoPanelLayout.setHorizontalGroup(
            profileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileInfoErrorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileInfoUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        profileInfoPanelLayout.setVerticalGroup(
            profileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileInfoPanelLayout.createSequentialGroup()
                .addComponent(profileInfoUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profileButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileInfoErrorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileTopBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileLogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addComponent(profileTopBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileLogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField profileAddressField;
    private javax.swing.JButton profileAutoRegisterButton;
    private javax.swing.JButton profileBookingButton;
    private javax.swing.JComboBox profileBox;
    private javax.swing.JPanel profileButtonPanel;
    private javax.swing.JTextField profileCitizenIdField;
    private javax.swing.JButton profileEditButton;
    private javax.swing.JLabel profileErrorLabel;
    private javax.swing.JPanel profileInfoContainerPanel;
    private javax.swing.JPanel profileInfoErrorPanel;
    private javax.swing.JPanel profileInfoPanel;
    private javax.swing.JPanel profileInfoUserPanel;
    private javax.swing.JComboBox profileLanguageBox;
    private javax.swing.JComboBox profileLocationBox;
    private javax.swing.JPanel profileLogoPanel;
    private javax.swing.JTextField profileNIFField;
    private javax.swing.JTextField profileNameField;
    private javax.swing.JLabel profileNameLabel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JPasswordField profilePasswordField;
    private javax.swing.JTextField profilePhoneNumberField;
    private javax.swing.JButton profileRatingButton;
    private javax.swing.JPanel profileTopBarPanel;
    private javax.swing.JTextField profileUserField;
    // End of variables declaration//GEN-END:variables
}
