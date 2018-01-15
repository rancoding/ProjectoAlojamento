/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento.application;

import projectoalojamento.Repository;
import user.Client;
import user.Owner;
import user.User;

/**
 *
 * @author Gustavo Vieira
 */
public class JPProfile extends javax.swing.JPanel {

    private Application frame;
    private JPRatingList jprl;
    private JPBookingList jpbl;
    private JPAutoRegister jpar;
    private User user;
    private JPAfterLoginOwner jpalo;
    private JPAddProperty jpap;
    
    /**
     * Creates new form JPProfile
     */
    public JPProfile(Application frame, User user, Object language) {
        initComponents();
        this.frame = frame;
        this.user = user;
        this.profileNameLabel.setText(this.user.getName());
        this.profileLanguageBox.setSelectedItem(language);
        setInfo();
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
        jButton1 = new javax.swing.JButton();
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
                .addComponent(profileNameLabel)
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
        profileBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBookingButtonActionPerformed(evt);
            }
        });

        profileRatingButton.setText("Avaliações");
        profileRatingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileRatingButtonActionPerformed(evt);
            }
        });

        profileAutoRegisterButton.setText("Auto-Registo");
        profileAutoRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileAutoRegisterButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profileButtonPanelLayout = new javax.swing.GroupLayout(profileButtonPanel);
        profileButtonPanel.setLayout(profileButtonPanelLayout);
        profileButtonPanelLayout.setHorizontalGroup(
            profileButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileBookingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileRatingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileAutoRegisterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        profileButtonPanelLayout.setVerticalGroup(
            profileButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileBookingButton)
                    .addComponent(profileRatingButton)
                    .addComponent(profileAutoRegisterButton)
                    .addComponent(jButton1))
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

    private void profileBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBookingButtonActionPerformed
        // TODO add your handling code here:
        this.jpbl = new JPBookingList(this.frame, (Client)this.user, this.profileLanguageBox.getSelectedItem());
        this.frame.changePanel(this.jpbl);
    }//GEN-LAST:event_profileBookingButtonActionPerformed

    private void profileRatingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileRatingButtonActionPerformed
        // TODO add your handling code here:
        this.jprl = new JPRatingList(this.frame, (Client)this.user, this.profileLanguageBox.getSelectedItem());
        this.frame.changePanel(this.jprl);
    }//GEN-LAST:event_profileRatingButtonActionPerformed

    private void profileAutoRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileAutoRegisterButtonActionPerformed
        // TODO add your handling code here:
        this.jpar = new JPAutoRegister(this.frame, this.user, this.profileLanguageBox.getSelectedItem());
        this.frame.changePanel(this.jpar);
    }//GEN-LAST:event_profileAutoRegisterButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int count = Repository.getRepo().nPropertiesByOwner((Owner)this.user);
        if(count>0){
            this.jpalo = new JPAfterLoginOwner(this.frame, (Owner)this.user, this.profileLanguageBox.getSelectedItem());
            this.frame.changePanel(this.jpalo);
        }
        else{
            this.jpap = new JPAddProperty(this.frame, (Owner)this.user, this.profileLanguageBox.getSelectedItem());
            this.frame.changePanel(this.jpap);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void setInfo() {
        this.profileNameLabel.setText(this.user.getName());
        this.profileUserField.setText(this.user.getUsername());
        this.profilePasswordField.setText(this.user.getPassword());
        this.profileNameField.setText(this.user.getName());
        this.profileAddressField.setText(this.user.getAddress());
        this.profileLocationBox.setSelectedItem(this.user.getCounty()); // Nao deve dar, nao ta como County no User
        this.profileCitizenIdField.setText(this.user.getCitizenID());
        this.profileNIFField.setText(String.valueOf(this.user.getNIF()));
        this.profilePhoneNumberField.setText(String.valueOf(this.user.getPhoneNumber()));
        
        if(this.user.isPrivateProfile())
        {
            this.profileBox.setSelectedIndex(0);
        }
        else
        {
            this.profileBox.setSelectedIndex(1);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
