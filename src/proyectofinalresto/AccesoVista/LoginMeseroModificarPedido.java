
package proyectofinalresto.AccesoVista;

import javax.swing.JOptionPane;
import proyectofinalresto.AccesoAInformacion.AccesoMesero;
import proyectofinalresto.Entidades.Mesero;


public class LoginMeseroModificarPedido extends javax.swing.JInternalFrame {

private RestoPrincipal rp;
    public LoginMeseroModificarPedido(RestoPrincipal rp) {
        this.rp=rp;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritoriologin = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextdni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        escritoriologin.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion.png"))); // NOI18N
        jLabel1.setText("Exclusivo personal de servicio");

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setText("Panel de Gestiones");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Identifiquese con su Documento: ");

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

        escritoriologin.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritoriologin.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritoriologin.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritoriologin.setLayer(jTextdni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritoriologin.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritoriologin.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritoriologinLayout = new javax.swing.GroupLayout(escritoriologin);
        escritoriologin.setLayout(escritoriologinLayout);
        escritoriologinLayout.setHorizontalGroup(
            escritoriologinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritoriologinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(27, 27, 27))
            .addGroup(escritoriologinLayout.createSequentialGroup()
                .addGroup(escritoriologinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritoriologinLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel2))
                    .addGroup(escritoriologinLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jButton1))
                    .addGroup(escritoriologinLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel3))
                    .addGroup(escritoriologinLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1))
                    .addGroup(escritoriologinLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jTextdni, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        escritoriologinLayout.setVerticalGroup(
            escritoriologinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritoriologinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jTextdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritoriologin, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritoriologin, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        String campoDni = jTextdni.getText();
        
        if(!(campoDni.equals(""))){
            int dniMese = Integer.parseInt(campoDni);
            AccesoMesero meseroData = new AccesoMesero();
           Mesero resultado = meseroData.buscarMeseroPorDni(dniMese);
           
           if(resultado != null){
            rp.abrirModificarpedido();
           }else{
           JOptionPane.showMessageDialog(this, "Dni ingresado no corresponde a ningun personal de servicio");
           jTextdni.setText("");
           }
        }else{
            JOptionPane.showMessageDialog(this,  "El campo no puede ir vacio!");
        }
        }catch(NumberFormatException nf){
        JOptionPane.showMessageDialog(this, "El campo lleva solo numeros!");
        jTextdni.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritoriologin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextdni;
    // End of variables declaration//GEN-END:variables
}
