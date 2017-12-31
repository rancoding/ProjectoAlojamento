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
public class JPRatingList extends javax.swing.JPanel {

    private Application frame;
    private JPProfile jpp;
    /**
     * Creates new form JPRatingList
     */
    public JPRatingList(Application frame, Object language) {
        initComponents();
        this.frame = frame;
        this.ratingListLanguageBox.setSelectedItem(language);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ratingListPanel = new javax.swing.JPanel();
        ratingListLanguageBox = new javax.swing.JComboBox();
        ratingListNameLabel = new javax.swing.JLabel();
        ratingListLogoPanel = new javax.swing.JPanel();
        ratingListRatingPanel = new javax.swing.JPanel();
        ratingListRatingContainerPanel = new javax.swing.JPanel();
        ratingListRatingScrollPane = new javax.swing.JScrollPane();
        ratingList = new javax.swing.JList();
        ratingListInfoPanel = new javax.swing.JPanel();
        ratingListTitleField = new javax.swing.JTextField();
        ratingListRatingField = new javax.swing.JTextField();
        ratingListMessageScrollPane = new javax.swing.JScrollPane();
        ratingListMessageArea = new javax.swing.JTextArea();
        ratingListExtraInfoPanel = new javax.swing.JPanel();
        ratingListOwnerField = new javax.swing.JTextField();
        ratingListNDaysField = new javax.swing.JTextField();
        ratingListDateField = new javax.swing.JTextField();
        ratingListPropertyReferenceField = new javax.swing.JTextField();
        ratingListBackButton = new javax.swing.JButton();

        ratingListLanguageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PT", "EN" }));

        ratingListNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ratingListNameLabel.setText("Gustavo Moreira Vieira");

        javax.swing.GroupLayout ratingListPanelLayout = new javax.swing.GroupLayout(ratingListPanel);
        ratingListPanel.setLayout(ratingListPanelLayout);
        ratingListPanelLayout.setHorizontalGroup(
            ratingListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ratingListLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ratingListNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ratingListPanelLayout.setVerticalGroup(
            ratingListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ratingListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratingListLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ratingListNameLabel))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ratingListLogoPanelLayout = new javax.swing.GroupLayout(ratingListLogoPanel);
        ratingListLogoPanel.setLayout(ratingListLogoPanelLayout);
        ratingListLogoPanelLayout.setHorizontalGroup(
            ratingListLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ratingListLogoPanelLayout.setVerticalGroup(
            ratingListLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        ratingListRatingContainerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Avaliações"));

        ratingList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ratingListRatingScrollPane.setViewportView(ratingList);

        javax.swing.GroupLayout ratingListRatingContainerPanelLayout = new javax.swing.GroupLayout(ratingListRatingContainerPanel);
        ratingListRatingContainerPanel.setLayout(ratingListRatingContainerPanelLayout);
        ratingListRatingContainerPanelLayout.setHorizontalGroup(
            ratingListRatingContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingListRatingContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ratingListRatingScrollPane)
                .addContainerGap())
        );
        ratingListRatingContainerPanelLayout.setVerticalGroup(
            ratingListRatingContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ratingListRatingContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ratingListRatingScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        ratingListTitleField.setEditable(false);
        ratingListTitleField.setText(" Titulo");

        ratingListRatingField.setEditable(false);
        ratingListRatingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ratingListRatingField.setText("7.9");
        ratingListRatingField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));

        ratingListMessageArea.setEditable(false);
        ratingListMessageArea.setColumns(20);
        ratingListMessageArea.setRows(5);
        ratingListMessageArea.setText("Item 1 seleccionado");
        ratingListMessageScrollPane.setViewportView(ratingListMessageArea);

        ratingListOwnerField.setEditable(false);
        ratingListOwnerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ratingListOwnerField.setText("DonoXPTO");

        ratingListNDaysField.setEditable(false);
        ratingListNDaysField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ratingListNDaysField.setText("5 Dias");

        ratingListDateField.setEditable(false);
        ratingListDateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ratingListDateField.setText("14/07/2018");

        ratingListPropertyReferenceField.setEditable(false);
        ratingListPropertyReferenceField.setForeground(new java.awt.Color(153, 0, 0));
        ratingListPropertyReferenceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ratingListPropertyReferenceField.setText("Referência Alojamento: 123");
        ratingListPropertyReferenceField.setBorder(null);

        javax.swing.GroupLayout ratingListExtraInfoPanelLayout = new javax.swing.GroupLayout(ratingListExtraInfoPanel);
        ratingListExtraInfoPanel.setLayout(ratingListExtraInfoPanelLayout);
        ratingListExtraInfoPanelLayout.setHorizontalGroup(
            ratingListExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingListExtraInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ratingListOwnerField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingListNDaysField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingListDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingListPropertyReferenceField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        ratingListExtraInfoPanelLayout.setVerticalGroup(
            ratingListExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ratingListExtraInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ratingListExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ratingListPropertyReferenceField)
                    .addComponent(ratingListDateField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ratingListExtraInfoPanelLayout.createSequentialGroup()
                        .addGroup(ratingListExtraInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ratingListOwnerField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(ratingListNDaysField))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        ratingListBackButton.setText("Voltar");
        ratingListBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingListBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ratingListInfoPanelLayout = new javax.swing.GroupLayout(ratingListInfoPanel);
        ratingListInfoPanel.setLayout(ratingListInfoPanelLayout);
        ratingListInfoPanelLayout.setHorizontalGroup(
            ratingListInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ratingListExtraInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ratingListInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ratingListInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ratingListMessageScrollPane)
                    .addGroup(ratingListInfoPanelLayout.createSequentialGroup()
                        .addComponent(ratingListTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ratingListRatingField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ratingListInfoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ratingListBackButton)))
                .addContainerGap())
        );
        ratingListInfoPanelLayout.setVerticalGroup(
            ratingListInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingListInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ratingListInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ratingListRatingField)
                    .addComponent(ratingListTitleField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingListMessageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingListExtraInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingListBackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ratingListRatingPanelLayout = new javax.swing.GroupLayout(ratingListRatingPanel);
        ratingListRatingPanel.setLayout(ratingListRatingPanelLayout);
        ratingListRatingPanelLayout.setHorizontalGroup(
            ratingListRatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingListRatingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ratingListRatingContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(ratingListInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ratingListRatingPanelLayout.setVerticalGroup(
            ratingListRatingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingListRatingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ratingListRatingContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingListInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ratingListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ratingListLogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ratingListRatingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ratingListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingListLogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingListRatingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ratingListBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingListBackButtonActionPerformed
        // TODO add your handling code here:
        this.jpp = new JPProfile(this.frame, this.ratingListLanguageBox.getSelectedItem());
        this.frame.changePanel(this.jpp);
    }//GEN-LAST:event_ratingListBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ratingList;
    private javax.swing.JButton ratingListBackButton;
    private javax.swing.JTextField ratingListDateField;
    private javax.swing.JPanel ratingListExtraInfoPanel;
    private javax.swing.JPanel ratingListInfoPanel;
    private javax.swing.JComboBox ratingListLanguageBox;
    private javax.swing.JPanel ratingListLogoPanel;
    private javax.swing.JTextArea ratingListMessageArea;
    private javax.swing.JScrollPane ratingListMessageScrollPane;
    private javax.swing.JTextField ratingListNDaysField;
    private javax.swing.JLabel ratingListNameLabel;
    private javax.swing.JTextField ratingListOwnerField;
    private javax.swing.JPanel ratingListPanel;
    private javax.swing.JTextField ratingListPropertyReferenceField;
    private javax.swing.JPanel ratingListRatingContainerPanel;
    private javax.swing.JTextField ratingListRatingField;
    private javax.swing.JPanel ratingListRatingPanel;
    private javax.swing.JScrollPane ratingListRatingScrollPane;
    private javax.swing.JTextField ratingListTitleField;
    // End of variables declaration//GEN-END:variables
}
