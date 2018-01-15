/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento.application;

import java.util.Date;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import projectoalojamento.Repository;
import property.Discount;
import property.Property;
import property.PropertyType;
import property.booking.Booking;
import property.location.County;
import user.Client;

/**
 *
 * @author Gustavo Vieira
 */
public class JPAfterLogin extends javax.swing.JPanel {

    private Application frame;
    private JPPropertySearch jpps;
    private JPProfile jpp;
    private Client client;
    private Date starting;
    private Date ending;
    private Map<Property, County> map;
    
    
    /**
     * Creates new form JPAfterLogin
     */
    public JPAfterLogin(Application frame, Client client, Object language) {
        initComponents();
        this.frame = frame;
        this.frame.setSize(1000, 253);
        this.client = client;
        this.afterLoginLanguageBox.setSelectedItem(language);
        this.changeTextToSelectedLanguage();
        
        
        this.map = Repository.getRepo().getProperties();
        this.afterLoginPropertyTypeBox.setModel(new DefaultComboBoxModel(Repository.getRepo().getPropertiesTypes().toArray()));
        this.afterLoginLocationBox.setModel(new DefaultComboBoxModel(Repository.getRepo().getCounties().toArray()));
        this.afterLoginNClientsSpinner.setModel(new SpinnerNumberModel(Repository.getRepo().getLowestNumberOfClients(), Repository.getRepo().getLowestNumberOfClients(), Repository.getRepo().getHighestNumberOfClients(), 1));
        
        this.afterLoginStartingDatePicker.getMonthView().setLowerBound(new Date());
        this.afterLoginStartingDatePicker.setDate(new Date());
        
        Date d1 = new Date();
        d1.setTime(new Date().getTime() + 86400000);
        this.afterLoginEndingDatePicker.getMonthView().setLowerBound(d1);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        afterLoginPanel = new javax.swing.JPanel();
        afterLoginTopBarPanel = new javax.swing.JPanel();
        afterLoginLanguageBox = new javax.swing.JComboBox();
        afterLoginNameLabel = new javax.swing.JLabel();
        afterLoginMessageButton = new javax.swing.JButton();
        afterLoginTicketButton = new javax.swing.JButton();
        afterLoginLogoPanel = new javax.swing.JPanel();
        afterLoginInfoPanel = new javax.swing.JPanel();
        afterLoginErrorPanel = new javax.swing.JPanel();
        afterLoginErrorLabel = new javax.swing.JLabel();
        afterLoginStartingDatePicker = new org.jdesktop.swingx.JXDatePicker();
        afterLoginEndingDatePicker = new org.jdesktop.swingx.JXDatePicker();
        afterLoginPropertyTypeBox = new javax.swing.JComboBox();
        afterLoginSearchButton = new javax.swing.JButton();
        afterLoginNClientsSpinner = new javax.swing.JSpinner();
        afterLoginNClientsLabel = new javax.swing.JLabel();
        afterLoginLocationBox = new javax.swing.JComboBox();

        afterLoginLanguageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PT", "EN" }));
        afterLoginLanguageBox.setToolTipText("");
        afterLoginLanguageBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                afterLoginLanguageBoxPropertyChange(evt);
            }
        });

        afterLoginNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        afterLoginNameLabel.setText("Gustavo Moreira Vieira");
        afterLoginNameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                afterLoginNameLabelMouseClicked(evt);
            }
        });

        afterLoginMessageButton.setText("Mensagens");

        afterLoginTicketButton.setText("Tickets");

        javax.swing.GroupLayout afterLoginTopBarPanelLayout = new javax.swing.GroupLayout(afterLoginTopBarPanel);
        afterLoginTopBarPanel.setLayout(afterLoginTopBarPanelLayout);
        afterLoginTopBarPanelLayout.setHorizontalGroup(
            afterLoginTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(afterLoginTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(afterLoginLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(afterLoginTicketButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afterLoginMessageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afterLoginNameLabel)
                .addContainerGap())
        );
        afterLoginTopBarPanelLayout.setVerticalGroup(
            afterLoginTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(afterLoginTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(afterLoginTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(afterLoginLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(afterLoginNameLabel)
                    .addComponent(afterLoginMessageButton)
                    .addComponent(afterLoginTicketButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout afterLoginLogoPanelLayout = new javax.swing.GroupLayout(afterLoginLogoPanel);
        afterLoginLogoPanel.setLayout(afterLoginLogoPanelLayout);
        afterLoginLogoPanelLayout.setHorizontalGroup(
            afterLoginLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        afterLoginLogoPanelLayout.setVerticalGroup(
            afterLoginLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        afterLoginErrorLabel.setForeground(new java.awt.Color(240, 240, 240));
        afterLoginErrorLabel.setText(" ");

        javax.swing.GroupLayout afterLoginErrorPanelLayout = new javax.swing.GroupLayout(afterLoginErrorPanel);
        afterLoginErrorPanel.setLayout(afterLoginErrorPanelLayout);
        afterLoginErrorPanelLayout.setHorizontalGroup(
            afterLoginErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, afterLoginErrorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(afterLoginErrorLabel)
                .addGap(480, 480, 480))
        );
        afterLoginErrorPanelLayout.setVerticalGroup(
            afterLoginErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, afterLoginErrorPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(afterLoginErrorLabel)
                .addContainerGap())
        );

        afterLoginStartingDatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afterLoginStartingDatePickerActionPerformed(evt);
            }
        });

        afterLoginEndingDatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afterLoginEndingDatePickerActionPerformed(evt);
            }
        });

        afterLoginPropertyTypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quarto", "Apartamento" }));

        afterLoginSearchButton.setText("Pesquisar");
        afterLoginSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afterLoginSearchButtonActionPerformed(evt);
            }
        });

        afterLoginNClientsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        afterLoginNClientsLabel.setText("Nº Viajantes");

        afterLoginLocationBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout afterLoginInfoPanelLayout = new javax.swing.GroupLayout(afterLoginInfoPanel);
        afterLoginInfoPanel.setLayout(afterLoginInfoPanelLayout);
        afterLoginInfoPanelLayout.setHorizontalGroup(
            afterLoginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(afterLoginErrorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(afterLoginInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(afterLoginLocationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afterLoginStartingDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afterLoginEndingDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afterLoginNClientsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afterLoginNClientsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afterLoginPropertyTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afterLoginSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        afterLoginInfoPanelLayout.setVerticalGroup(
            afterLoginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, afterLoginInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(afterLoginInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(afterLoginStartingDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(afterLoginEndingDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(afterLoginPropertyTypeBox)
                    .addComponent(afterLoginSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(afterLoginNClientsSpinner)
                    .addComponent(afterLoginNClientsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(afterLoginLocationBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(afterLoginErrorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout afterLoginPanelLayout = new javax.swing.GroupLayout(afterLoginPanel);
        afterLoginPanel.setLayout(afterLoginPanelLayout);
        afterLoginPanelLayout.setHorizontalGroup(
            afterLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(afterLoginTopBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(afterLoginLogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(afterLoginInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        afterLoginPanelLayout.setVerticalGroup(
            afterLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(afterLoginPanelLayout.createSequentialGroup()
                .addComponent(afterLoginTopBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afterLoginLogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afterLoginInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(afterLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(afterLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void afterLoginSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afterLoginSearchButtonActionPerformed
        // TODO add your handling code here:
        Property p = new Property();
        p.setPricePerNight(-1);
        p.getCharacteristics().setBathroomQuantity(-1);
        p.getCharacteristics().setRoomsQuantity(-1);
        Discount d = new Discount();
        p.setDiscount(d);
        p.getDiscount().setPercentage(-1);
        p.getCharacteristics().setBathroomQuantity(-1);
        
        p.getCharacteristics().setMinClients((int) this.afterLoginNClientsSpinner.getValue());

        County county = new County();
        if(this.afterLoginLocationBox.getSelectedIndex() != 0)
        {
            county = (County) this.afterLoginLocationBox.getSelectedItem();
        }

        if(this.afterLoginPropertyTypeBox.getSelectedIndex() != 0)
        {
            p.setPropertyType((PropertyType) this.afterLoginPropertyTypeBox.getSelectedItem());
        }

        Booking booking = new Booking();
        if(this.afterLoginStartingDatePicker.getDate() != null)
        {
            booking.setStartingDate(this.afterLoginStartingDatePicker.getDate());

            if(this.afterLoginEndingDatePicker.getDate() == null)
            {
                booking.setEndingDate(this.afterLoginEndingDatePicker.getDate());
            }

            p.getBookings().add(booking);
        }
        else
        {
            if(this.afterLoginEndingDatePicker.getDate() == null)
            {
                booking.setEndingDate(this.afterLoginEndingDatePicker.getDate());
                p.getBookings().add(booking);
            }
        }

        this.map = Repository.getRepo().listProperties(p, county, -1);

        if(this.map.isEmpty())
        {
            if(this.afterLoginLanguageBox.getSelectedIndex() == 0)
            {
                this.afterLoginErrorLabel.setText("Não foram encontrados alojamentos com os dados introduzidos");
            }
            else
            {
                this.afterLoginErrorLabel.setText("No properties were found with the given info");
            }
        }
        else
        {
            this.jpps = new JPPropertySearch(this.frame, this.client, this.map, (County) this.afterLoginLocationBox.getSelectedItem(), (PropertyType) this.afterLoginPropertyTypeBox.getSelectedItem(), (int) this.afterLoginNClientsSpinner.getValue(), this.starting, this.ending, this.afterLoginLanguageBox.getSelectedItem());
            this.frame.changePanel(this.jpps);
        }
    }//GEN-LAST:event_afterLoginSearchButtonActionPerformed

    private void afterLoginNameLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_afterLoginNameLabelMouseClicked
        // TODO add your handling code here:
        this.jpp = new JPProfile(this.frame, this.client, this.afterLoginLanguageBox.getSelectedItem());
        this.frame.changePanel(this.jpp);
    }//GEN-LAST:event_afterLoginNameLabelMouseClicked

    private void afterLoginLanguageBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_afterLoginLanguageBoxPropertyChange
        // TODO add your handling code here:
        this.changeTextToSelectedLanguage();
    }//GEN-LAST:event_afterLoginLanguageBoxPropertyChange

    private void afterLoginStartingDatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afterLoginStartingDatePickerActionPerformed
        // TODO add your handling code here:
        this.afterLoginEndingDatePicker.getMonthView().setLowerBound(this.afterLoginStartingDatePicker.getDate());
        
        if(this.afterLoginStartingDatePicker.getDate() != null)
        {
            Date[] dates = { this.afterLoginStartingDatePicker.getDate() };
            this.afterLoginEndingDatePicker.getMonthView().setUnselectableDates(dates);
        }
            
        this.starting = this.afterLoginStartingDatePicker.getDate();
    }//GEN-LAST:event_afterLoginStartingDatePickerActionPerformed

    private void afterLoginEndingDatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afterLoginEndingDatePickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_afterLoginEndingDatePickerActionPerformed

        //frame.changePanel(this.jpl);

    private void changeTextToSelectedLanguage() {
        
        if(this.afterLoginLanguageBox.getSelectedIndex() == 0)
        {
            this.afterLoginMessageButton.setText("Mensagens");
            this.afterLoginTicketButton.setText("Tickets");
            this.afterLoginNClientsLabel.setText("Nº Viajantes");
            this.afterLoginSearchButton.setText("Pesquisar");
        }
        else
        {
            this.afterLoginMessageButton.setText("Messages");
            this.afterLoginTicketButton.setText("Tickets");
            this.afterLoginNClientsLabel.setText("Nº of Travelers");
            this.afterLoginSearchButton.setText("Search");
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker afterLoginEndingDatePicker;
    private javax.swing.JLabel afterLoginErrorLabel;
    private javax.swing.JPanel afterLoginErrorPanel;
    private javax.swing.JPanel afterLoginInfoPanel;
    private javax.swing.JComboBox afterLoginLanguageBox;
    private javax.swing.JComboBox afterLoginLocationBox;
    private javax.swing.JPanel afterLoginLogoPanel;
    private javax.swing.JButton afterLoginMessageButton;
    private javax.swing.JLabel afterLoginNClientsLabel;
    private javax.swing.JSpinner afterLoginNClientsSpinner;
    private javax.swing.JLabel afterLoginNameLabel;
    private javax.swing.JPanel afterLoginPanel;
    private javax.swing.JComboBox afterLoginPropertyTypeBox;
    private javax.swing.JButton afterLoginSearchButton;
    private org.jdesktop.swingx.JXDatePicker afterLoginStartingDatePicker;
    private javax.swing.JButton afterLoginTicketButton;
    private javax.swing.JPanel afterLoginTopBarPanel;
    // End of variables declaration//GEN-END:variables
}
