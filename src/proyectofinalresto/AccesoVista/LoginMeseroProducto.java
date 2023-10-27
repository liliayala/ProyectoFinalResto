package proyectofinalresto.AccesoVista;

import javax.swing.JOptionPane;
import proyectofinalresto.AccesoAInformacion.AccesoMesero;
import proyectofinalresto.Entidades.Mesero;


public class LoginMeseroProducto extends javax.swing.JInternalFrame {

private RestoPrincipal rp;
    public LoginMeseroProducto(RestoPrincipal rp) {
        this.rp=rp;
        initComponents();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorioPanel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFielddni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        escritorioPanel.setBackground(new java.awt.Color(0, 153, 153));
        escritorioPanel.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("Panel de gestiones");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion.png"))); // NOI18N
        jLabel2.setText("Exclusivo personal de servicio");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Identifiquese con su Documento:");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir_1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        escritorioPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioPanel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioPanel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioPanel.setLayer(jTextFielddni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioPanel.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioPanel.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioPanelLayout = new javax.swing.GroupLayout(escritorioPanel);
        escritorioPanel.setLayout(escritorioPanelLayout);
        escritorioPanelLayout.setHorizontalGroup(
            escritorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(192, 192, 192)
                .addComponent(jButton2)
                .addGap(55, 55, 55))
            .addGroup(escritorioPanelLayout.createSequentialGroup()
                .addGroup(escritorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1))
                    .addGroup(escritorioPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2))
                    .addGroup(escritorioPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel3))
                    .addGroup(escritorioPanelLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jTextFielddni, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        escritorioPanelLayout.setVerticalGroup(
            escritorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGroup(escritorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(escritorioPanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton2)
                        .addGap(6, 6, 6))
                    .addGroup(escritorioPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jTextFielddni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try{
        String campoDni = jTextFielddni.getText();
        
        if(!(campoDni.equals(""))){
            int dniMese = Integer.parseInt(campoDni);
            AccesoMesero meseroData = new AccesoMesero();
           Mesero resultado = meseroData.buscarMeseroPorDni(dniMese);
           
           if(resultado != null){
           rp.abrirModificarproducto();
           }else{
           JOptionPane.showMessageDialog(this, "Dni ingresado no corresponde a ningun personal de servicio");
           jTextFielddni.setText("");
           }
        }else{
            JOptionPane.showMessageDialog(this,  "El campo no puede ir vacio!");
        }
        }catch(NumberFormatException nf){
        JOptionPane.showMessageDialog(this, "El campo lleva solo numeros!");
        jTextFielddni.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorioPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFielddni;
    // End of variables declaration//GEN-END:variables

    
}
