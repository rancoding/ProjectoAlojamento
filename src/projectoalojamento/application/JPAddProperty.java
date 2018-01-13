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
public class JPAddProperty extends javax.swing.JPanel {

    /**
     * Creates new form JPAddProperty
     */
    public JPAddProperty() {
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

        addPropertyPanel = new javax.swing.JPanel();
        addPropertyTopBarPanel = new javax.swing.JPanel();
        addPropertyLanguageBox = new javax.swing.JComboBox<>();
        addPropertyNickLabel = new javax.swing.JLabel();
        addPropertyMessageButton = new javax.swing.JButton();
        addPropertyTitlePanel = new javax.swing.JPanel();
        addPropertyInfoPanel = new javax.swing.JPanel();
        addPropertyErrorPanel = new javax.swing.JPanel();
        addPropertyInformationPanel = new javax.swing.JPanel();
        addPropertyDescriptionTextField = new javax.swing.JTextField();
        addPropertyLocationTextField = new javax.swing.JTextField();
        addPropertyTypeBox = new javax.swing.JComboBox<>();
        addPropertyDivisionsBox = new javax.swing.JComboBox<>();
        addPropertyDiscountLabel = new javax.swing.JLabel();
        addPropertyDiscountTextField = new javax.swing.JTextField();
        addPropertyPercentageLabel = new javax.swing.JLabel();
        addPropertyPriceTextField = new javax.swing.JTextField();
        addPropertyCoinTypeLabel = new javax.swing.JLabel();
        addPropertyAddPicturesButton = new javax.swing.JButton();
        addPropertyButton = new javax.swing.JButton();
        addPropertyExtraSearchInfoPanel = new javax.swing.JPanel();
        addPropertyNClientsSpinner = new javax.swing.JSpinner();
        addPropertyNRoomsSpinner = new javax.swing.JSpinner();
        addPropertyNBathroomsSpinner = new javax.swing.JSpinner();
        addPropertyNBedsSpinner = new javax.swing.JSpinner();
        addPropertyNClientsLabel = new javax.swing.JLabel();
        addPropertyNRoomsLabel = new javax.swing.JLabel();
        addPropertyNBathroomssLabel = new javax.swing.JLabel();
        addPropertyNBedsLabel = new javax.swing.JLabel();
        addPropertyBedTypeBox = new javax.swing.JComboBox();
        addPropertyInfoExtraInfoPanel = new javax.swing.JPanel();
        addPropertyDiscountsCheckBox = new javax.swing.JCheckBox();
        addPropertyExtrasCheckBox = new javax.swing.JCheckBox();
        addPropertyRatingsCheckBox = new javax.swing.JCheckBox();
        addPropertyPetsCheckBox = new javax.swing.JCheckBox();
        addPropertyKitchenCheckBox = new javax.swing.JCheckBox();
        addPropertyWashingMachineCheckBox = new javax.swing.JCheckBox();
        addPropertyWifiCheckBox = new javax.swing.JCheckBox();
        addPropertyBreakfastCheckBox = new javax.swing.JCheckBox();
        addPropertyPoolCheckBox = new javax.swing.JCheckBox();

        addPropertyLanguageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PT", "EN" }));

        addPropertyNickLabel.setText("Rafael Morais");

        addPropertyMessageButton.setText("jButton7");
        addPropertyMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPropertyMessageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPropertyTopBarPanelLayout = new javax.swing.GroupLayout(addPropertyTopBarPanel);
        addPropertyTopBarPanel.setLayout(addPropertyTopBarPanelLayout);
        addPropertyTopBarPanelLayout.setHorizontalGroup(
            addPropertyTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPropertyTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPropertyLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addPropertyMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addPropertyNickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        addPropertyTopBarPanelLayout.setVerticalGroup(
            addPropertyTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPropertyTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPropertyTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addPropertyLanguageBox)
                    .addGroup(addPropertyTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addPropertyNickLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPropertyMessageButton)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addPropertyTitlePanelLayout = new javax.swing.GroupLayout(addPropertyTitlePanel);
        addPropertyTitlePanel.setLayout(addPropertyTitlePanelLayout);
        addPropertyTitlePanelLayout.setHorizontalGroup(
            addPropertyTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        addPropertyTitlePanelLayout.setVerticalGroup(
            addPropertyTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout addPropertyErrorPanelLayout = new javax.swing.GroupLayout(addPropertyErrorPanel);
        addPropertyErrorPanel.setLayout(addPropertyErrorPanelLayout);
        addPropertyErrorPanelLayout.setHorizontalGroup(
            addPropertyErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        addPropertyErrorPanelLayout.setVerticalGroup(
            addPropertyErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        addPropertyDescriptionTextField.setText("jTextField2");

        addPropertyLocationTextField.setText("jTextField3");

        addPropertyTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apartamento", "Casa" }));

        addPropertyDivisionsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T1", "T2", "T3", "T4", "T5" }));

        addPropertyDiscountLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addPropertyDiscountLabel.setText("Desconto:");

        addPropertyDiscountTextField.setText("jTextField4");

        addPropertyPercentageLabel.setText("%");

        addPropertyPriceTextField.setText("jTextField5");

        addPropertyCoinTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addPropertyCoinTypeLabel.setText("€");

        addPropertyAddPicturesButton.setText("Adicionar Fotos");

        addPropertyButton.setText("Adicionar Alojamento");

        addPropertyExtraSearchInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Informação Extra"));

        addPropertyNRoomsSpinner.setToolTipText("Número mínimo de quartos do alojamento");

        addPropertyNBathroomsSpinner.setToolTipText("Número mínimo de quartos de banho do alojamento");

        addPropertyNBedsSpinner.setToolTipText("Número mínimo de camas do alojamento");

        addPropertyNClientsLabel.setText("Nº Pessoas");

        addPropertyNRoomsLabel.setText("Nº Quartos");

        addPropertyNBathroomssLabel.setText("Nº Quartos de Banho");

        addPropertyNBedsLabel.setText("Nº Camas");

        addPropertyBedTypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Cama" }));

        addPropertyInfoExtraInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Extras"));

        addPropertyDiscountsCheckBox.setText("Contém descontos");

        addPropertyExtrasCheckBox.setText("Contém extras");

        addPropertyRatingsCheckBox.setText("Contém avaliações");

        addPropertyPetsCheckBox.setText("Animais de Estimação");

        addPropertyKitchenCheckBox.setText("Cozinha");

        addPropertyWashingMachineCheckBox.setText("Máquina de Lavar");

        addPropertyWifiCheckBox.setText("Wi-fi");

        addPropertyBreakfastCheckBox.setText("Pequeno Almoço");

        addPropertyPoolCheckBox.setText("Piscina");

        javax.swing.GroupLayout addPropertyInfoExtraInfoPanelLayout = new javax.swing.GroupLayout(addPropertyInfoExtraInfoPanel);
        addPropertyInfoExtraInfoPanel.setLayout(addPropertyInfoExtraInfoPanelLayout);
        addPropertyInfoExtraInfoPanelLayout.setHorizontalGroup(
            addPropertyInfoExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPropertyInfoExtraInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPropertyInfoExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPropertyPetsCheckBox)
                    .addComponent(addPropertyWashingMachineCheckBox)
                    .addGroup(addPropertyInfoExtraInfoPanelLayout.createSequentialGroup()
                        .addGroup(addPropertyInfoExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPropertyDiscountsCheckBox)
                            .addComponent(addPropertyKitchenCheckBox)
                            .addComponent(addPropertyWifiCheckBox))
                        .addGap(16, 16, 16)
                        .addGroup(addPropertyInfoExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPropertyPoolCheckBox)
                            .addComponent(addPropertyBreakfastCheckBox)
                            .addGroup(addPropertyInfoExtraInfoPanelLayout.createSequentialGroup()
                                .addComponent(addPropertyExtrasCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(addPropertyRatingsCheckBox)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        addPropertyInfoExtraInfoPanelLayout.setVerticalGroup(
            addPropertyInfoExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPropertyInfoExtraInfoPanelLayout.createSequentialGroup()
                .addGroup(addPropertyInfoExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPropertyDiscountsCheckBox)
                    .addComponent(addPropertyExtrasCheckBox)
                    .addComponent(addPropertyRatingsCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPropertyPetsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPropertyInfoExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPropertyKitchenCheckBox)
                    .addComponent(addPropertyBreakfastCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPropertyWashingMachineCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPropertyInfoExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPropertyWifiCheckBox)
                    .addComponent(addPropertyPoolCheckBox))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addPropertyExtraSearchInfoPanelLayout = new javax.swing.GroupLayout(addPropertyExtraSearchInfoPanel);
        addPropertyExtraSearchInfoPanel.setLayout(addPropertyExtraSearchInfoPanelLayout);
        addPropertyExtraSearchInfoPanelLayout.setHorizontalGroup(
            addPropertyExtraSearchInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPropertyExtraSearchInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPropertyExtraSearchInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addPropertyNClientsSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(addPropertyNRoomsSpinner)
                    .addComponent(addPropertyNBathroomsSpinner)
                    .addComponent(addPropertyNBedsSpinner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPropertyExtraSearchInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addPropertyExtraSearchInfoPanelLayout.createSequentialGroup()
                        .addGroup(addPropertyExtraSearchInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPropertyNBathroomssLabel)
                            .addComponent(addPropertyNRoomsLabel))
                        .addGap(262, 262, 262))
                    .addGroup(addPropertyExtraSearchInfoPanelLayout.createSequentialGroup()
                        .addGroup(addPropertyExtraSearchInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPropertyExtraSearchInfoPanelLayout.createSequentialGroup()
                                .addComponent(addPropertyNClientsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addPropertyBedTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addPropertyNBedsLabel))
                        .addGap(18, 18, 18)))
                .addComponent(addPropertyInfoExtraInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        addPropertyExtraSearchInfoPanelLayout.setVerticalGroup(
            addPropertyExtraSearchInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPropertyExtraSearchInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPropertyExtraSearchInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addPropertyInfoExtraInfoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addPropertyExtraSearchInfoPanelLayout.createSequentialGroup()
                        .addGroup(addPropertyExtraSearchInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPropertyNClientsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPropertyNClientsLabel)
                            .addComponent(addPropertyBedTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPropertyExtraSearchInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPropertyNRoomsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPropertyNRoomsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPropertyExtraSearchInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPropertyNBathroomsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPropertyNBathroomssLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPropertyExtraSearchInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPropertyNBedsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPropertyNBedsLabel))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addPropertyInformationPanelLayout = new javax.swing.GroupLayout(addPropertyInformationPanel);
        addPropertyInformationPanel.setLayout(addPropertyInformationPanelLayout);
        addPropertyInformationPanelLayout.setHorizontalGroup(
            addPropertyInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPropertyInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPropertyInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPropertyInformationPanelLayout.createSequentialGroup()
                        .addComponent(addPropertyAddPicturesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(addPropertyInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPropertyDescriptionTextField)
                            .addGroup(addPropertyInformationPanelLayout.createSequentialGroup()
                                .addComponent(addPropertyTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addPropertyDivisionsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(addPropertyDiscountLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addPropertyDiscountTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addPropertyPercentageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(254, 254, 254)
                                .addComponent(addPropertyPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addPropertyCoinTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addPropertyLocationTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPropertyInformationPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addPropertyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addPropertyExtraSearchInfoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        addPropertyInformationPanelLayout.setVerticalGroup(
            addPropertyInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPropertyInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPropertyInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addPropertyInformationPanelLayout.createSequentialGroup()
                        .addComponent(addPropertyLocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(addPropertyDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPropertyInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addPropertyTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPropertyDivisionsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPropertyPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPropertyCoinTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPropertyPercentageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPropertyDiscountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPropertyDiscountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addPropertyAddPicturesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(addPropertyExtraSearchInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addPropertyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout addPropertyInfoPanelLayout = new javax.swing.GroupLayout(addPropertyInfoPanel);
        addPropertyInfoPanel.setLayout(addPropertyInfoPanelLayout);
        addPropertyInfoPanelLayout.setHorizontalGroup(
            addPropertyInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPropertyInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addPropertyErrorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addPropertyInfoPanelLayout.setVerticalGroup(
            addPropertyInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPropertyInfoPanelLayout.createSequentialGroup()
                .addComponent(addPropertyInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPropertyErrorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout addPropertyPanelLayout = new javax.swing.GroupLayout(addPropertyPanel);
        addPropertyPanel.setLayout(addPropertyPanelLayout);
        addPropertyPanelLayout.setHorizontalGroup(
            addPropertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPropertyTopBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addPropertyTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addPropertyInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addPropertyPanelLayout.setVerticalGroup(
            addPropertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPropertyPanelLayout.createSequentialGroup()
                .addComponent(addPropertyTopBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPropertyTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPropertyInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPropertyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPropertyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPropertyMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPropertyMessageButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPropertyMessageButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPropertyAddPicturesButton;
    private javax.swing.JComboBox addPropertyBedTypeBox;
    private javax.swing.JCheckBox addPropertyBreakfastCheckBox;
    private javax.swing.JButton addPropertyButton;
    private javax.swing.JLabel addPropertyCoinTypeLabel;
    private javax.swing.JTextField addPropertyDescriptionTextField;
    private javax.swing.JLabel addPropertyDiscountLabel;
    private javax.swing.JTextField addPropertyDiscountTextField;
    private javax.swing.JCheckBox addPropertyDiscountsCheckBox;
    private javax.swing.JComboBox<String> addPropertyDivisionsBox;
    private javax.swing.JPanel addPropertyErrorPanel;
    private javax.swing.JPanel addPropertyExtraSearchInfoPanel;
    private javax.swing.JCheckBox addPropertyExtrasCheckBox;
    private javax.swing.JPanel addPropertyInfoExtraInfoPanel;
    private javax.swing.JPanel addPropertyInfoPanel;
    private javax.swing.JPanel addPropertyInformationPanel;
    private javax.swing.JCheckBox addPropertyKitchenCheckBox;
    private javax.swing.JComboBox<String> addPropertyLanguageBox;
    private javax.swing.JTextField addPropertyLocationTextField;
    private javax.swing.JButton addPropertyMessageButton;
    private javax.swing.JSpinner addPropertyNBathroomsSpinner;
    private javax.swing.JLabel addPropertyNBathroomssLabel;
    private javax.swing.JLabel addPropertyNBedsLabel;
    private javax.swing.JSpinner addPropertyNBedsSpinner;
    private javax.swing.JLabel addPropertyNClientsLabel;
    private javax.swing.JSpinner addPropertyNClientsSpinner;
    private javax.swing.JLabel addPropertyNRoomsLabel;
    private javax.swing.JSpinner addPropertyNRoomsSpinner;
    private javax.swing.JLabel addPropertyNickLabel;
    private javax.swing.JPanel addPropertyPanel;
    private javax.swing.JLabel addPropertyPercentageLabel;
    private javax.swing.JCheckBox addPropertyPetsCheckBox;
    private javax.swing.JCheckBox addPropertyPoolCheckBox;
    private javax.swing.JTextField addPropertyPriceTextField;
    private javax.swing.JCheckBox addPropertyRatingsCheckBox;
    private javax.swing.JPanel addPropertyTitlePanel;
    private javax.swing.JPanel addPropertyTopBarPanel;
    private javax.swing.JComboBox<String> addPropertyTypeBox;
    private javax.swing.JCheckBox addPropertyWashingMachineCheckBox;
    private javax.swing.JCheckBox addPropertyWifiCheckBox;
    // End of variables declaration//GEN-END:variables
}
