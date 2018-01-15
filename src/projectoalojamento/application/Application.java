/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento.application;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import projectoalojamento.Repository;
import property.PropertyType;
import property.location.County;
import user.Client;
import user.Owner;
import user.User;

/**
 *
 * @author Gustavo Vieira
 */
public class Application extends javax.swing.JFrame implements Runnable {

    private JPanel visiblePanel;
    private JPLogin jpl;
    private JPRegister jpr;
    private JPPropertySearch jpps;
    private JPAddProperty jpap;
    private static int threadCounter = -1;
    
    /**
     * Creates new form Application
     */
    public Application() {
        initComponents();
        
        if(threadCounter == -1)
        {
            System.out.println("Chamou");
            Repository.deserialize();
            threadCounter = 1;
        }
        
        this.visiblePanel = this.framePanel;
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
          /* 
        Client c1 = new Client("g","g","Fuck this", "111111111",123456789,962111111,"Rua Dr. Ramiro Barros Lima", "Esposende", new Date(), false);
        Repository.getRepo().getUsers().add(c1);
        Owner o1 = new Owner("g","g","Vagina", "111111111",123456789,962111111,"Rua Dr. Ramiro Barros Lima", "Esposende", new Date(), false);
        Owner o2 = new Owner("e","e","Gustavo Vieira", "111111111",123456789,962111111,"Rua Dr. Ramiro Barros Lima", "Esposende", new Date(), false);
        Repository.getRepo().getUsers().add(o1);
        Repository.getRepo().getUsers().add(o2);
        
        County co1 = new County("Santa Cruz das Flores");
        County co2 = new County("Corvo");
        County co3 = new County("Castelo de Paiva");
        County co4 = new County("Espinho");
        County co5 = new County("Estarreja");
        County co6 = new County("Santa Maria da Feira");
        County co7 = new County("Ílhavo");
        County co8 = new County("Mealhada");
        County co9 = new County("Murtosa");
        County co10 = new County("Oliveira de Azeméis");
        
        Repository.getRepo().getCounties().add(co1);
        Repository.getRepo().getCounties().add(co2);
        Repository.getRepo().getCounties().add(co3);
        Repository.getRepo().getCounties().add(co4);
        Repository.getRepo().getCounties().add(co5);
        Repository.getRepo().getCounties().add(co6);
        Repository.getRepo().getCounties().add(co7);
        Repository.getRepo().getCounties().add(co8);
        Repository.getRepo().getCounties().add(co9);
        Repository.getRepo().getCounties().add(co10);
        
        PropertyType pt1 = new PropertyType("Casa", "Uma casa");
        PropertyType pt2 = new PropertyType("Apartamento", "Um apartamento");
        Repository.getRepo().getPropertiesTypes().add(pt1);
        Repository.getRepo().getPropertiesTypes().add(pt2);
        */
        List<User> users = Repository.getRepo().getUsers();
        for(User u : users)
        {
            System.out.println("User: " + u.getUsername() + " Pass: " + u.getPassword());
        }
        
        System.out.println(Repository.getRepo().getUsers().size());
        
        this.changeTextToSelectedLanguage();
        
        /*Date[] dates = {
            
        };
        
        int count = 0;
        
        for(Map.Entry<Property, County> m : Repository.getRepo().getProperties().entrySet()) {
            for(Booking b : m.getKey().getBookings()) {
                dates[count] = b.getStartingDate();
                count++;
                
                long difference = b.getEndingDate().getTime() - b.getStartingDate().getTime();
                Date d = new Date();
                for(int i = 1; i <= difference; i++) {
                    d.setTime(b.getStartingDate().getTime() + i);
                    dates[count] = d;
                    count++;
                }
            }
        }
        
        for(Date d : dates)
        {
            System.out.println("Date: " + d.getTime());
        }
        
        startingDatePicker.getMonthView().setUnselectableDates(dates);
        startingDatePicker.getMonthView().setLowerBound(new Date());
        
        Date d = new Date();
        
        this.startingDatePicker.setDate(d);
        d.setTime(this.startingDatePicker.getDate().getTime() + 86400000);
        this.endingDatePicker.setDate(d);
        */
        this.setDefaultCloseOperation(Application.DISPOSE_ON_CLOSE);
        
        this.addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e)
            {
                threadCounter --;
                
                if(threadCounter == 0)
                {
                    System.out.println("Guardou");
                    Repository.serialize();
                }
            }
        });
    }

    /**
     *
     * @param panel
     */
    public void changePanel(JPanel panel) {
        this.visiblePanel.setVisible(false);
        this.visiblePanel = panel;
        this.setContentPane(this.visiblePanel);
        this.visiblePanel.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        framePanel = new javax.swing.JPanel();
        frameTopBarPanel = new javax.swing.JPanel();
        languageBox = new javax.swing.JComboBox();
        registerButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        frameLogoPanel = new javax.swing.JPanel();
        frameInfoPanel = new javax.swing.JPanel();
        startingDatePicker = new org.jdesktop.swingx.JXDatePicker();
        endingDatePicker = new org.jdesktop.swingx.JXDatePicker();
        propertyTypeBox = new javax.swing.JComboBox();
        searchButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        NClientsSpinner = new javax.swing.JSpinner();
        afterLoginNClientsLabel = new javax.swing.JLabel();
        frameErrorPanel = new javax.swing.JPanel();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frameTopBarPanel.setPreferredSize(new java.awt.Dimension(1000, 45));

        languageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PT", "EN" }));
        languageBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                languageBoxItemStateChanged(evt);
            }
        });

        registerButton.setText("Registo");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameTopBarPanelLayout = new javax.swing.GroupLayout(frameTopBarPanel);
        frameTopBarPanel.setLayout(frameTopBarPanelLayout);
        frameTopBarPanelLayout.setHorizontalGroup(
            frameTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(languageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton)
                .addContainerGap())
        );
        frameTopBarPanelLayout.setVerticalGroup(
            frameTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameTopBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameTopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(languageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerButton)
                    .addComponent(loginButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frameLogoPanel.setPreferredSize(new java.awt.Dimension(1000, 60));

        javax.swing.GroupLayout frameLogoPanelLayout = new javax.swing.GroupLayout(frameLogoPanel);
        frameLogoPanel.setLayout(frameLogoPanelLayout);
        frameLogoPanelLayout.setHorizontalGroup(
            frameLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        frameLogoPanelLayout.setVerticalGroup(
            frameLogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        startingDatePicker.setToolTipText("Data inicial disponível em reserva");
        startingDatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startingDatePickerActionPerformed(evt);
            }
        });

        endingDatePicker.setToolTipText("Data final disponível em reserva");

        propertyTypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quarto", "Apartamento" }));
        propertyTypeBox.setToolTipText("Tipo de Alojamento");
        propertyTypeBox.setMaximumSize(new java.awt.Dimension(150, 30));
        propertyTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyTypeBoxActionPerformed(evt);
            }
        });

        searchButton.setText("Pesquisar");
        searchButton.setMaximumSize(new java.awt.Dimension(100, 30));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Localidade" }));

        afterLoginNClientsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        afterLoginNClientsLabel.setText("Nº Viajantes");

        javax.swing.GroupLayout frameInfoPanelLayout = new javax.swing.GroupLayout(frameInfoPanel);
        frameInfoPanel.setLayout(frameInfoPanelLayout);
        frameInfoPanelLayout.setHorizontalGroup(
            frameInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startingDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endingDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NClientsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afterLoginNClientsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(propertyTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameInfoPanelLayout.setVerticalGroup(
            frameInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startingDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(propertyTypeBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(endingDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1)
                    .addComponent(NClientsSpinner)
                    .addComponent(afterLoginNClientsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        errorLabel.setForeground(new java.awt.Color(240, 240, 240));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setText(" ");

        javax.swing.GroupLayout frameErrorPanelLayout = new javax.swing.GroupLayout(frameErrorPanel);
        frameErrorPanel.setLayout(frameErrorPanelLayout);
        frameErrorPanelLayout.setHorizontalGroup(
            frameErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameErrorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameErrorPanelLayout.setVerticalGroup(
            frameErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameErrorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout framePanelLayout = new javax.swing.GroupLayout(framePanel);
        framePanel.setLayout(framePanelLayout);
        framePanelLayout.setHorizontalGroup(
            framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameTopBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(frameLogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(frameInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(frameErrorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        framePanelLayout.setVerticalGroup(
            framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePanelLayout.createSequentialGroup()
                .addComponent(frameTopBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frameLogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frameInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(frameErrorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(framePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(framePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void propertyTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyTypeBoxActionPerformed

    }//GEN-LAST:event_propertyTypeBoxActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        Application a = new Application();
        
        a.jpl = new JPLogin(a, this.languageBox.getSelectedItem());
        a.changePanel(a.jpl);
        
        Thread t = new Thread(a);
        t.start();
        
        threadCounter++;
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        Application a = new Application();
        
        a.jpr = new JPRegister(a, this.languageBox.getSelectedItem());
        a.changePanel(a.jpr);
        
        Thread t = new Thread(a);
        t.start();
        
        threadCounter++;
    }//GEN-LAST:event_registerButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        this.jpps = new JPPropertySearch(this, new Client(),this.languageBox.getSelectedItem());
        this.changePanel(this.jpps);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void languageBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_languageBoxItemStateChanged
        // TODO add your handling code here:
        changeTextToSelectedLanguage();
    }//GEN-LAST:event_languageBoxItemStateChanged

    private void startingDatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startingDatePickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startingDatePickerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    /**
     *
     */
    private void changeTextToSelectedLanguage() {
        
        if(this.languageBox.getSelectedIndex() == 0)
        {
            this.loginButton.setText("Login");
            this.registerButton.setText("Registo");
            this.afterLoginNClientsLabel.setText("Nº Viajantes");
            this.searchButton.setText("Pesquisar");
        }
        else
        {
            this.loginButton.setText("Login");
            this.registerButton.setText("Sign up");
            this.afterLoginNClientsLabel.setText("Nº Travelers");
            this.searchButton.setText("Search");
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner NClientsSpinner;
    private javax.swing.JLabel afterLoginNClientsLabel;
    private org.jdesktop.swingx.JXDatePicker endingDatePicker;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel frameErrorPanel;
    private javax.swing.JPanel frameInfoPanel;
    private javax.swing.JPanel frameLogoPanel;
    private javax.swing.JPanel framePanel;
    private javax.swing.JPanel frameTopBarPanel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox languageBox;
    private javax.swing.JButton loginButton;
    private javax.swing.JComboBox propertyTypeBox;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton searchButton;
    private org.jdesktop.swingx.JXDatePicker startingDatePicker;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
    }
}
