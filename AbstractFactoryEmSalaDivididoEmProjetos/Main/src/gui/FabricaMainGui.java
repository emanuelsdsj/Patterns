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

    public FabricaMainGui() {
        initComponents();
        this.refreshPlugins();
    }
    
    private void refreshPlugins() {
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
        text = "-- Escolha sua opção --";
        TextArea.setText(TextArea.getText() + text + "\n");
        for(i = 0; i < plugins.length ; i++) {
            plugins[i] = plugins[i].split("\\.")[0];
        }
        ListaCarros.setListData(plugins); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        FabricarCarroButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaCarros = new javax.swing.JList<>();
        alinharRoda = new javax.swing.JButton();
        ligarMotor = new javax.swing.JButton();
        tocarSom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

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

        alinharRoda.setText("Alinhar roda");

        ligarMotor.setText("Ligar Motor");

        tocarSom.setText("Tocar som");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alinharRoda, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ligarMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tocarSom, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(alinharRoda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ligarMotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tocarSom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        String text = main.usarFabrica(factory);
        TextArea.setText(TextArea.getText() + text + "\n");
    }//GEN-LAST:event_FabricarCarroButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
         this.refreshPlugins();
    }//GEN-LAST:event_RefreshButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FabricarCarroButton;
    private javax.swing.JList<String> ListaCarros;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton alinharRoda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton ligarMotor;
    private javax.swing.JButton tocarSom;
    // End of variables declaration//GEN-END:variables
}
