/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento.application;

import java.util.List;
import projectoalojamento.Repository;
import property.booking.Booking;
import user.Client;
import user.Owner;
import user.User;

/**
 *
 * @author Gustavo Vieira
 */
public class JPBookingList extends javax.swing.JPanel {

    private Application frame;
    private JPProfile jpp;
    private JPRating jpr;
    private User user;
    private List<Booking> bookings;
    private Booking booking;
    
    /**
     * Creates new form JPBookingList
     */
    public JPBookingList(Application frame, User user, List<Booking> bookings, Object language) {
        initComponents();
        this.frame = frame;
        this.user = user;
        this.bookings = bookings;
        this.bookingListLanguageBox.setSelectedItem(language);
        this.setInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookingListPanel = new javax.swing.JPanel();
        bookingListTopBarPanel = new javax.swing.JPanel();
        bookingListLanguageBox = new javax.swing.JComboBox();
        bookingListNameLabel = new javax.swing.JLabel();
        bookingListLogoPanel = new javax.swing.JPanel();
        bookingListInfoPanel = new javax.swing.JPanel();
        bookingListInfoListPanel = new javax.swing.JPanel();
        bookingListScrollPane = new javax.swing.JScrollPane();
        bookingList = new javax.swing.JList();
        bookingListInfoDataPanel = new javax.swing.JPanel();
        bookingListReferenceField = new javax.swing.JTextField();
        bookingListFinalPriceField = new javax.swing.JTextField();
        bookingListPaymentTypeBox = new javax.swing.JComboBox();
        bookingListStartingDateField = new javax.swing.JTextField();
        bookingListEndingDateField = new javax.swing.JTextField();
        bookingListPaidCheckBox = new javax.swing.JCheckBox();
        bookingListConfirmedCheckBox = new javax.swing.JCheckBox();
        bookingListNClientsField = new javax.swing.JTextField();
        bookingListRatingCheckBox = new javax.swing.JCheckBox();
        bookingListOwnerField = new javax.swing.JTextField();
        bookingListPropertyReferenceField = new javax.swing.JTextField();
        bookingListButtonPanel = new javax.swing.JPanel();
        bookingListRatingButton = new javax.swing.JButton();
        bookingListBackButton = new javax.swing.JButton();
        bookingListEditButton = new javax.swing.JButton();

        bookingListLanguageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PT", "EN" }));

        bookingListNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bookingListNameLabel.setText("Gustavo Moreira Vieira");
        bookingListNameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingListNameLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bookingListTopBarPanelLayout = new javax.swing.GroupLayout(bookingListTopBarPanel);
        bookingListTopBarPanel.setLayout(bookingListTopBarPanelLayout);
        bookingListTopBarPanelLayout.setHorizontalGroup(
            bookingListTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingListTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingListLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookingListNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bookingListTopBarPanelLayout.setVerticalGroup(
            bookingListTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingListTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookingListTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingListLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingListNameLabel))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bookingListLogoPanelLayout = new javax.swing.GroupLayout(bookingListLogoPanel);
        bookingListLogoPanel.setLayout(bookingListLogoPanelLayout);
        bookingListLogoPanelLayout.setHorizontalGroup(
            bookingListLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bookingListLogoPanelLayout.setVerticalGroup(
            bookingListLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        bookingListInfoListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Reservas"));

        bookingList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        bookingListScrollPane.setViewportView(bookingList);

        javax.swing.GroupLayout bookingListInfoListPanelLayout = new javax.swing.GroupLayout(bookingListInfoListPanel);
        bookingListInfoListPanel.setLayout(bookingListInfoListPanelLayout);
        bookingListInfoListPanelLayout.setHorizontalGroup(
            bookingListInfoListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingListInfoListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingListScrollPane)
                .addContainerGap())
        );
        bookingListInfoListPanelLayout.setVerticalGroup(
            bookingListInfoListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingListInfoListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        bookingListReferenceField.setEditable(false);
        bookingListReferenceField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bookingListReferenceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookingListReferenceField.setText("Referência: 10");

        bookingListFinalPriceField.setEditable(false);
        bookingListFinalPriceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookingListFinalPriceField.setText("120,000.00€");

        bookingListPaymentTypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Pagamento", "Cartão" }));
        bookingListPaymentTypeBox.setEnabled(false);

        bookingListStartingDateField.setEditable(false);
        bookingListStartingDateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookingListStartingDateField.setText("14/07/2017");

        bookingListEndingDateField.setEditable(false);
        bookingListEndingDateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookingListEndingDateField.setText("19/07/2017");

        bookingListPaidCheckBox.setSelected(true);
        bookingListPaidCheckBox.setText("Pago");
        bookingListPaidCheckBox.setEnabled(false);

        bookingListConfirmedCheckBox.setSelected(true);
        bookingListConfirmedCheckBox.setText("Confirmado");
        bookingListConfirmedCheckBox.setEnabled(false);

        bookingListNClientsField.setEditable(false);
        bookingListNClientsField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookingListNClientsField.setText("5 Clientes");

        bookingListRatingCheckBox.setText("Contém avaliação");
        bookingListRatingCheckBox.setEnabled(false);

        bookingListOwnerField.setEditable(false);
        bookingListOwnerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookingListOwnerField.setText("DonoXPTO");
        bookingListOwnerField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        bookingListPropertyReferenceField.setEditable(false);
        bookingListPropertyReferenceField.setForeground(new java.awt.Color(204, 0, 0));
        bookingListPropertyReferenceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookingListPropertyReferenceField.setText("Referência Alojamento: 123");
        bookingListPropertyReferenceField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        bookingListRatingButton.setText("Voltar");
        bookingListRatingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingListRatingButtonActionPerformed(evt);
            }
        });

        bookingListBackButton.setText("Avaliar");
        bookingListBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingListBackButtonActionPerformed(evt);
            }
        });

        bookingListEditButton.setText("Editar");
        bookingListEditButton.setEnabled(false);

        javax.swing.GroupLayout bookingListButtonPanelLayout = new javax.swing.GroupLayout(bookingListButtonPanel);
        bookingListButtonPanel.setLayout(bookingListButtonPanelLayout);
        bookingListButtonPanelLayout.setHorizontalGroup(
            bookingListButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingListButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingListBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookingListEditButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingListRatingButton)
                .addContainerGap())
        );
        bookingListButtonPanelLayout.setVerticalGroup(
            bookingListButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingListButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bookingListButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingListRatingButton)
                    .addComponent(bookingListBackButton)
                    .addComponent(bookingListEditButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout bookingListInfoDataPanelLayout = new javax.swing.GroupLayout(bookingListInfoDataPanel);
        bookingListInfoDataPanel.setLayout(bookingListInfoDataPanelLayout);
        bookingListInfoDataPanelLayout.setHorizontalGroup(
            bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingListInfoDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookingListInfoDataPanelLayout.createSequentialGroup()
                        .addComponent(bookingListReferenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bookingListInfoDataPanelLayout.createSequentialGroup()
                        .addGroup(bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bookingListStartingDateField)
                            .addGroup(bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bookingListOwnerField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bookingListNClientsField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bookingListPaymentTypeBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookingListPropertyReferenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingListPaidCheckBox)
                            .addComponent(bookingListRatingCheckBox)
                            .addComponent(bookingListEndingDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)))
                .addGroup(bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookingListInfoDataPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bookingListConfirmedCheckBox))
                    .addComponent(bookingListFinalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(bookingListButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bookingListInfoDataPanelLayout.setVerticalGroup(
            bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingListInfoDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bookingListReferenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingListFinalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookingListConfirmedCheckBox)
                    .addGroup(bookingListInfoDataPanelLayout.createSequentialGroup()
                        .addGroup(bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookingListStartingDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingListEndingDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookingListPaymentTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingListPaidCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookingListNClientsField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingListRatingCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bookingListInfoDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookingListOwnerField)
                            .addComponent(bookingListPropertyReferenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookingListButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout bookingListInfoPanelLayout = new javax.swing.GroupLayout(bookingListInfoPanel);
        bookingListInfoPanel.setLayout(bookingListInfoPanelLayout);
        bookingListInfoPanelLayout.setHorizontalGroup(
            bookingListInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingListInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingListInfoListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(bookingListInfoDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bookingListInfoPanelLayout.setVerticalGroup(
            bookingListInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingListInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingListInfoListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingListInfoDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bookingListPanelLayout = new javax.swing.GroupLayout(bookingListPanel);
        bookingListPanel.setLayout(bookingListPanelLayout);
        bookingListPanelLayout.setHorizontalGroup(
            bookingListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingListTopBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookingListLogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookingListInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bookingListPanelLayout.setVerticalGroup(
            bookingListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingListPanelLayout.createSequentialGroup()
                .addComponent(bookingListTopBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingListLogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingListInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookingListRatingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingListRatingButtonActionPerformed
        // TODO add your handling code here:
        this.jpp = new JPProfile(this.frame, this.user, this.bookingListLanguageBox.getSelectedItem());
        this.frame.changePanel(this.jpp);
    }//GEN-LAST:event_bookingListRatingButtonActionPerformed

    private void bookingListBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingListBackButtonActionPerformed
        // TODO add your handling code here:
        this.jpr = new JPRating(this.frame, (Client) this.user, this.bookings, this.bookingListLanguageBox.getSelectedItem());
        this.frame.changePanel(this.jpr);
    }//GEN-LAST:event_bookingListBackButtonActionPerformed

    private void bookingListNameLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingListNameLabelMouseClicked
        // TODO add your handling code here:
        this.jpp = new JPProfile(this.frame, this.user, this.bookingListLanguageBox.getSelectedItem());
        this.frame.changePanel(this.jpp);
    }//GEN-LAST:event_bookingListNameLabelMouseClicked

    private void changeButtons() {
        
        if(this.user instanceof Client)
        {
            this.bookingListEditButton.setText("Editar");
            this.bookingListRatingButton.setText("Avaliar");
            this.bookingListConfirmedCheckBox.setEnabled(false);
            this.bookingListOwnerField.setText(this.user.getName());
            this.bookingListOwnerField.setText(Repository.getRepo().getBookingOwnerName(booking));
        }
        else
        {
            if(this.user instanceof Owner)
            {
                if(this.bookingListLanguageBox.getSelectedIndex() == 0)
                {
                    this.bookingListEditButton.setText("Rejeitar");
                    this.bookingListRatingButton.setText("Confirmar");
                }
                else
                {
                    this.bookingListEditButton.setText("Refuse");
                    this.bookingListRatingButton.setText("Accept");
                }
                    
                this.bookingListConfirmedCheckBox.setEnabled(true);
                this.bookingListOwnerField.setText(this.booking.getClient().getName());
            }
        }
    }
    
    private void setInfo() {
        this.bookingListNameLabel.setText(this.user.getName());
        this.bookingList.setListData(Repository.getRepo().getBookingsByClient((Client) this.user).toArray());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList bookingList;
    private javax.swing.JButton bookingListBackButton;
    private javax.swing.JPanel bookingListButtonPanel;
    private javax.swing.JCheckBox bookingListConfirmedCheckBox;
    private javax.swing.JButton bookingListEditButton;
    private javax.swing.JTextField bookingListEndingDateField;
    private javax.swing.JTextField bookingListFinalPriceField;
    private javax.swing.JPanel bookingListInfoDataPanel;
    private javax.swing.JPanel bookingListInfoListPanel;
    private javax.swing.JPanel bookingListInfoPanel;
    private javax.swing.JComboBox bookingListLanguageBox;
    private javax.swing.JPanel bookingListLogoPanel;
    private javax.swing.JTextField bookingListNClientsField;
    private javax.swing.JLabel bookingListNameLabel;
    private javax.swing.JTextField bookingListOwnerField;
    private javax.swing.JCheckBox bookingListPaidCheckBox;
    private javax.swing.JPanel bookingListPanel;
    private javax.swing.JComboBox bookingListPaymentTypeBox;
    private javax.swing.JTextField bookingListPropertyReferenceField;
    private javax.swing.JButton bookingListRatingButton;
    private javax.swing.JCheckBox bookingListRatingCheckBox;
    private javax.swing.JTextField bookingListReferenceField;
    private javax.swing.JScrollPane bookingListScrollPane;
    private javax.swing.JTextField bookingListStartingDateField;
    private javax.swing.JPanel bookingListTopBarPanel;
    // End of variables declaration//GEN-END:variables
}
