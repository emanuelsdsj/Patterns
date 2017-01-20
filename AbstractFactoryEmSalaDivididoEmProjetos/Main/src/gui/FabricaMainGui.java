package gui;

import interfaces.IAbstractFactory;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Main;

public class FabricaMainGui extends javax.swing.JFrame {
    private IAbstractFactory selectedFactory;

    public FabricaMainGui() {
        initComponents();
        this.refreshPlugins();
    }
    
    private void isCarroProntoParaUso(){
        if(!ligarMotorButton.isEnabled() && !tocarSomButton.isEnabled() && !alinharRodaButton.isEnabled()) {
            TextArea.setText(TextArea.getText() + "Carro pronto para uso" + "\n");
        }
    }
    
    private void refreshPlugins() {
        ListaCarros.removeAll();
        TextArea.setText("");
        int op;
        String text = "";
        File currentDir = new File(System.getProperty("user.dir"));
        currentDir = currentDir.getParentFile();
        currentDir = new File(currentDir + "/plugins");
        String []plugins = currentDir.list();
        int i;
        URL[] jars = new URL[plugins.length];
        for (i = 0; i < plugins.length; i++)
        {
            try {
                jars[i] = (new File("./plugins/" + plugins[i])).toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(FabricaMainGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        URLClassLoader ulc = new URLClassLoader(jars);
        text = "-- Selecione um tipo de fábrica de carro --";
        TextArea.setText(TextArea.getText() + text + "\n");
        for(i = 0; i < plugins.length ; i++) {
            plugins[i] = plugins[i].split("\\.")[0];
        }
        ListaCarros.setListData(plugins); 
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

        jScrollPane1.setViewportView(TextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FabricarCarroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alinharRodaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ligarMotorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tocarSomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alinharRodaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ligarMotorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tocarSomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FabricarCarroButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FabricarCarroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FabricarCarroButtonActionPerformed
        Main main = new Main();
        TextArea.setText(""); 
        int op = ListaCarros.getSelectedIndex();
        String plugin = ListaCarros.getSelectedValue();
        URL[] jar = new URL[1];
        try {
            File currentDir = new File(System.getProperty("user.dir"));
            currentDir = currentDir.getParentFile();
            currentDir = new File(currentDir + "/plugins");
            jar[0] = (new File(currentDir + "/" + plugin + ".jar")).toURL();
        } catch (MalformedURLException ex) {
            Logger.getLogger(FabricaMainGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        URLClassLoader ulc = new URLClassLoader(jar);
        String factoryName = plugin.split("\\.")[0];
        System.out.println("factory = " + jar[0]);
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
        selectedFactory = factory;
        alinharRodaButton.setEnabled(true);
        ligarMotorButton.setEnabled(true);
        tocarSomButton.setEnabled(true);
    }//GEN-LAST:event_FabricarCarroButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        this.refreshPlugins();
        alinharRodaButton.setEnabled(false);
        ligarMotorButton.setEnabled(false);
        tocarSomButton.setEnabled(false);
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void alinharRodaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alinharRodaButtonActionPerformed
        TextArea.setText(TextArea.getText() + this.selectedFactory.createRoda().alinhar() + "\n");
        alinharRodaButton.setEnabled(false);
        this.isCarroProntoParaUso();
    }//GEN-LAST:event_alinharRodaButtonActionPerformed

    private void ligarMotorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ligarMotorButtonActionPerformed
        TextArea.setText(TextArea.getText() + this.selectedFactory.createMotor().ligar() + "\n");
        ligarMotorButton.setEnabled(false);
        this.isCarroProntoParaUso();
    }//GEN-LAST:event_ligarMotorButtonActionPerformed

    private void tocarSomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tocarSomButtonActionPerformed
        TextArea.setText(TextArea.getText() + this.selectedFactory.createSom().tocar() + "\n");
        tocarSomButton.setEnabled(false);
        this.isCarroProntoParaUso();
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
