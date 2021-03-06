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
public class JPMessage extends javax.swing.JPanel {

    /**
     * Creates new form JPMessage
     */
    public JPMessage() {
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

        jButton1 = new javax.swing.JButton();
        messagePanel = new javax.swing.JPanel();
        messageTopBarPanel = new javax.swing.JPanel();
        messageLanguageBox = new javax.swing.JComboBox();
        messageNameLabel = new javax.swing.JLabel();
        messageLogoPanel = new javax.swing.JPanel();
        messageInfoPanel = new javax.swing.JPanel();
        messageInfoButtonPanel = new javax.swing.JPanel();
        messageSendButton = new javax.swing.JButton();
        messageBackButton = new javax.swing.JButton();
        messageInfoReceiverPanel = new javax.swing.JPanel();
        messageReceiverField = new javax.swing.JTextField();
        messageInfoSubjectPanel = new javax.swing.JPanel();
        messageSubjectField = new javax.swing.JTextField();
        messageInfoMessagePanel = new javax.swing.JPanel();
        messageScrollPane = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        messageLanguageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PT", "EN" }));

        messageNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        messageNameLabel.setText("Gustavo Moreira Vieira");

        javax.swing.GroupLayout messageTopBarPanelLayout = new javax.swing.GroupLayout(messageTopBarPanel);
        messageTopBarPanel.setLayout(messageTopBarPanelLayout);
        messageTopBarPanelLayout.setHorizontalGroup(
            messageTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messageTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(messageNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        messageTopBarPanelLayout.setVerticalGroup(
            messageTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messageTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(messageTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageLanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageNameLabel))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout messageLogoPanelLayout = new javax.swing.GroupLayout(messageLogoPanel);
        messageLogoPanel.setLayout(messageLogoPanelLayout);
        messageLogoPanelLayout.setHorizontalGroup(
            messageLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        messageLogoPanelLayout.setVerticalGroup(
            messageLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        messageSendButton.setText("Enviar");

        messageBackButton.setText("Voltar");

        javax.swing.GroupLayout messageInfoButtonPanelLayout = new javax.swing.GroupLayout(messageInfoButtonPanel);
        messageInfoButtonPanel.setLayout(messageInfoButtonPanelLayout);
        messageInfoButtonPanelLayout.setHorizontalGroup(
            messageInfoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messageInfoButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageSendButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(messageBackButton)
                .addContainerGap())
        );
        messageInfoButtonPanelLayout.setVerticalGroup(
            messageInfoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messageInfoButtonPanelLayout.createSequentialGroup()
                .addGroup(messageInfoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageSendButton)
                    .addComponent(messageBackButton))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        messageReceiverField.setEditable(false);
        messageReceiverField.setText(" Para: DonoXPTO");

        javax.swing.GroupLayout messageInfoReceiverPanelLayout = new javax.swing.GroupLayout(messageInfoReceiverPanel);
        messageInfoReceiverPanel.setLayout(messageInfoReceiverPanelLayout);
        messageInfoReceiverPanelLayout.setHorizontalGroup(
            messageInfoReceiverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messageInfoReceiverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageReceiverField)
                .addContainerGap())
        );
        messageInfoReceiverPanelLayout.setVerticalGroup(
            messageInfoReceiverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messageReceiverField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        messageSubjectField.setText(" Assunto:");

        javax.swing.GroupLayout messageInfoSubjectPanelLayout = new javax.swing.GroupLayout(messageInfoSubjectPanel);
        messageInfoSubjectPanel.setLayout(messageInfoSubjectPanelLayout);
        messageInfoSubjectPanelLayout.setHorizontalGroup(
            messageInfoSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messageInfoSubjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageSubjectField)
                .addContainerGap())
        );
        messageInfoSubjectPanelLayout.setVerticalGroup(
            messageInfoSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messageSubjectField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        messageArea.setColumns(20);
        messageArea.setRows(5);
        messageArea.setText(" A sua mensagem aqui...");
        messageScrollPane.setViewportView(messageArea);

        javax.swing.GroupLayout messageInfoMessagePanelLayout = new javax.swing.GroupLayout(messageInfoMessagePanel);
        messageInfoMessagePanel.setLayout(messageInfoMessagePanelLayout);
        messageInfoMessagePanelLayout.setHorizontalGroup(
            messageInfoMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messageInfoMessagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        messageInfoMessagePanelLayout.setVerticalGroup(
            messageInfoMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messageInfoMessagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout messageInfoPanelLayout = new javax.swing.GroupLayout(messageInfoPanel);
        messageInfoPanel.setLayout(messageInfoPanelLayout);
        messageInfoPanelLayout.setHorizontalGroup(
            messageInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messageInfoButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(messageInfoReceiverPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(messageInfoSubjectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(messageInfoMessagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        messageInfoPanelLayout.setVerticalGroup(
            messageInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messageInfoPanelLayout.createSequentialGroup()
                .addComponent(messageInfoReceiverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageInfoSubjectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageInfoMessagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageInfoButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout messagePanelLayout = new javax.swing.GroupLayout(messagePanel);
        messagePanel.setLayout(messagePanelLayout);
        messagePanelLayout.setHorizontalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messageTopBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(messageLogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(messageInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        messagePanelLayout.setVerticalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanelLayout.createSequentialGroup()
                .addComponent(messageTopBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JButton messageBackButton;
    private javax.swing.JPanel messageInfoButtonPanel;
    private javax.swing.JPanel messageInfoMessagePanel;
    private javax.swing.JPanel messageInfoPanel;
    private javax.swing.JPanel messageInfoReceiverPanel;
    private javax.swing.JPanel messageInfoSubjectPanel;
    private javax.swing.JComboBox messageLanguageBox;
    private javax.swing.JPanel messageLogoPanel;
    private javax.swing.JLabel messageNameLabel;
    private javax.swing.JPanel messagePanel;
    private javax.swing.JTextField messageReceiverField;
    private javax.swing.JScrollPane messageScrollPane;
    private javax.swing.JButton messageSendButton;
    private javax.swing.JTextField messageSubjectField;
    private javax.swing.JPanel messageTopBarPanel;
    // End of variables declaration//GEN-END:variables
}
