package main;

import interfaces.IAbstractFactory;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FabricaMainGui extends javax.swing.JFrame {
    private IAbstractFactory selectedFactory;

    public FabricaMainGui() {
        initComponents();
        this.refreshPlugins();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FabricaMainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FabricaMainGui().setVisible(true);
            }
        });
    }
    
    private void isCarroPronto(){
        if(!this.ligarMotorButton.isEnabled() && !this.tocarSomButton.isEnabled() && !this.alinharRodaButton.isEnabled()) {
            this.TextArea.setText(this.TextArea.getText() + "Carro com roda alinhada, motor ligado e som tocando" + "\n");
        }
    }
    
    private void refreshPlugins() {
        int op;
        this.selectedFactory = null;
        this.TextArea.setText("");
        String text = "";
        File currentDir = new File(System.getProperty("user.dir"));
        currentDir = currentDir.getParentFile();
        currentDir = new File(currentDir + "/plugins");
        String []plugins = currentDir.list();
        int i;
        URL[] jars = new URL[plugins.length];
        for (i = 0; i < plugins.length; i++) {
            try {
                jars[i] = (new File("./plugins/" + plugins[i])).toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(FabricaMainGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        URLClassLoader ulc = new URLClassLoader(jars);
        text = "-- Selecione uma fábrica de carro --";
        this.TextArea.setText(TextArea.getText() + text + "\n");
        for(i = 0; i < plugins.length ; i++) {
            plugins[i] = plugins[i].split("\\.")[0];
        }
        this.ListaCarros.setListData(plugins);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FabricarCarroButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaCarros = new javax.swing.JList<>();
        alinharRodaButton = new javax.swing.JButton();
        ligarMotorButton = new javax.swing.JButton();
        tocarSomButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FabricarCarroButton.setText("Fabricar carro");
        FabricarCarroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FabricarCarroButtonActionPerformed(evt);
            }
        });

        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        ListaCarros.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        ListaCarros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Plugin 1", "Plugin 2", "..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListaCarros);

        alinharRodaButton.setText("Alinhar roda");
        alinharRodaButton.setEnabled(false);
        alinharRodaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alinharRodaButtonActionPerformed(evt);
            }
        });

        ligarMotorButton.setText("Ligar Motor");
        ligarMotorButton.setEnabled(false);
        ligarMotorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ligarMotorButtonActionPerformed(evt);
            }
        });

        tocarSomButton.setText("Tocar som");
        tocarSomButton.setEnabled(false);
        tocarSomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tocarSomButtonActionPerformed(evt);
            }
        });

        TextArea.setEditable(false);
        TextArea.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jScrollPane1.setViewportView(TextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alinharRodaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ligarMotorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tocarSomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addComponent(FabricarCarroButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alinharRodaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ligarMotorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tocarSomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FabricarCarroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FabricarCarroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FabricarCarroButtonActionPerformed
        int op = ListaCarros.getSelectedIndex();
        String plugin = ListaCarros.getSelectedValue();
        if("".equals(plugin) || op == -1) {
            this.TextArea.setText("-- Selecione uma fábrica de carro --");
            return;
        }
        this.TextArea.setText(""); 
        URL[] jar = new URL[1];
        try {
            File currentDir = new File(System.getProperty("user.dir"));
            currentDir = currentDir.getParentFile();
            currentDir = new File(currentDir + "/plugins");
            String[] plugins = currentDir.list();
            for (String plugin1 : plugins) {
                if (plugin1.split("\\.")[0].equals(plugin)) {
                    plugin = plugin1;
                }
            }
            jar[0] = (new File(currentDir + "/" + plugin.split("\\.")[0] + "." + plugin.split("\\.")[1])).toURL();
            currentDir = null;
        } catch (MalformedURLException ex) {
            Logger.getLogger(FabricaMainGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        URLClassLoader ulc = new URLClassLoader(jar);
        String factoryName = plugin.split("\\.")[0];
        IAbstractFactory factory = null;
        try {
            try {
                factory = (IAbstractFactory) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, ulc).newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(FabricaMainGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FabricaMainGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.selectedFactory = factory;
        this.alinharRodaButton.setEnabled(true);
        this.ligarMotorButton.setEnabled(true);
        this.tocarSomButton.setEnabled(true);
    }//GEN-LAST:event_FabricarCarroButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        this.refreshPlugins();
        this.alinharRodaButton.setEnabled(false);
        this.ligarMotorButton.setEnabled(false);
        this.tocarSomButton.setEnabled(false);
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void alinharRodaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alinharRodaButtonActionPerformed
        this.TextArea.setText(TextArea.getText() + this.selectedFactory.createRoda().alinhar() + "\n");
        this.alinharRodaButton.setEnabled(false);
        this.isCarroPronto();
    }//GEN-LAST:event_alinharRodaButtonActionPerformed

    private void ligarMotorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ligarMotorButtonActionPerformed
        this.TextArea.setText(TextArea.getText() + this.selectedFactory.createMotor().ligar() + "\n");
        this.ligarMotorButton.setEnabled(false);
        this.isCarroPronto();
    }//GEN-LAST:event_ligarMotorButtonActionPerformed

    private void tocarSomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tocarSomButtonActionPerformed
        this.TextArea.setText(TextArea.getText() + this.selectedFactory.createSom().tocar() + "\n");
        this.tocarSomButton.setEnabled(false);
        this.isCarroPronto();
    }//GEN-LAST:event_tocarSomButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FabricarCarroButton;
    private javax.swing.JList<String> ListaCarros;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JEditorPane TextArea;
    private javax.swing.JButton alinharRodaButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton ligarMotorButton;
    private javax.swing.JButton tocarSomButton;
    // End of variables declaration//GEN-END:variables
}
