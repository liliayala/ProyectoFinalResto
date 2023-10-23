
package proyectofinalresto.AccesoVista;

import javax.swing.JOptionPane;
import proyectofinalresto.AccesoAInformacion.AccesoAdmi;
import proyectofinalresto.Entidades.Administrador;

public class ValidarAdmi extends javax.swing.JInternalFrame {

private RestoPrincipal rp; 
    public ValidarAdmi(RestoPrincipal rp) {
        this.rp=rp;
        initComponents();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorioAdmi = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        escritorioAdmi.setBackground(new java.awt.Color(0, 153, 153));
        escritorioAdmi.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Panel de Pedidos");

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Exclusivo de Administración");

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Identifiquese con su  ID personal");

        jTextid.setBackground(new java.awt.Color(255, 255, 255));
        jTextid.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        escritorioAdmi.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioAdmi.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioAdmi.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioAdmi.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioAdmi.setLayer(jTextid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioAdmi.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioAdmiLayout = new javax.swing.GroupLayout(escritorioAdmi);
        escritorioAdmi.setLayout(escritorioAdmiLayout);
        escritorioAdmiLayout.setHorizontalGroup(
            escritorioAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioAdmiLayout.createSequentialGroup()
                .addGroup(escritorioAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioAdmiLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel4))
                    .addGroup(escritorioAdmiLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jTextid, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(escritorioAdmiLayout.createSequentialGroup()
                .addGroup(escritorioAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioAdmiLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(escritorioAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(escritorioAdmiLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(10, 10, 10))))
                    .addGroup(escritorioAdmiLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jButton1)))
                .addGap(0, 166, Short.MAX_VALUE))
        );
        escritorioAdmiLayout.setVerticalGroup(
            escritorioAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioAdmiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioAdmi)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioAdmi)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
        
        String campoID = jTextid.getText();
        
        if( !campoID.isEmpty()){
           
            int idAdmi = Integer.parseInt(campoID);
            AccesoAdmi admiData = new AccesoAdmi();
           Administrador resultado = admiData.buscarAdministradorPorCodigo(idAdmi);
           
           if(resultado != null){
             JOptionPane.showMessageDialog(this, "Validación Exitosa!");
            rp.abrirGestion();

            
           }else{
           JOptionPane.showMessageDialog(this, "Los Datos ingresados no corresponden al personal de Administración, verifique sus datos");
           jTextid.setText("");
           }
        }else{
            JOptionPane.showMessageDialog(this,  "El campo no puede ir vacio!");
        }
        }catch(NumberFormatException nf){
        JOptionPane.showMessageDialog(this, "El campo lleva solo numeros!");
        jTextid.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorioAdmi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextid;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
       
    }
}
