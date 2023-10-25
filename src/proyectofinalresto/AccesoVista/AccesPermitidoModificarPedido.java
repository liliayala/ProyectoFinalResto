package proyectofinalresto.AccesoVista;

import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalresto.AccesoAInformacion.AccesoPedido;
import proyectofinalresto.Entidades.Mesa;
import proyectofinalresto.Entidades.Mesero;
import proyectofinalresto.Entidades.Pedido;
import proyectofinalresto.Entidades.Producto;


public class AccesPermitidoModificarPedido extends javax.swing.JInternalFrame {

    public AccesPermitidoModificarPedido() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextpedido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextmesero = new javax.swing.JTextField();
        jTextproducto = new javax.swing.JTextField();
        jTextestado = new javax.swing.JTextField();
        jTextmesa = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCamEstado = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMinimumSize(new java.awt.Dimension(100, 50));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("RESTO EXQUISITO ");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Panel de modificaciones  Pedidos");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese ID Pedido:");

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextpedido.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID Mesa");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID Mesero");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID Producto");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Estado");

        jTextmesero.setEditable(false);

        jTextproducto.setEditable(false);

        jTextestado.setForeground(new java.awt.Color(0, 0, 0));

        jTextmesa.setEditable(false);
        jTextmesa.setForeground(new java.awt.Color(0, 0, 0));

        jButtonConfirmar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonConfirmar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButtonConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonCamEstado.setBackground(new java.awt.Color(0, 153, 153));
        jButtonCamEstado.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButtonCamEstado.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCamEstado.setText("Cambiar Estado");
        jButtonCamEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCamEstadoActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(0, 153, 153));
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Reset");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir_1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonConfirmar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextestado, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jTextmesa)
                            .addComponent(jTextmesero)
                            .addComponent(jTextproducto))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jButtonCamEstado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(200, 200, 200))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextpedido)
                        .addGap(50, 50, 50)
                        .addComponent(jButton1)
                        .addGap(131, 131, 131))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(144, 144, 144))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox1))
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextmesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButtonCamEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButtonCamEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCamEstadoActionPerformed

        jTextestado.setEditable(true);

    }//GEN-LAST:event_jButtonCamEstadoActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        jCheckBox1.setSelected(false);
        try {
            String estado = jTextestado.getText();

            int id = Integer.parseInt(jTextpedido.getText());
            if (!estado.isEmpty() && id != -1) {
                AccesoPedido accesopedido = new AccesoPedido();
                Pedido pedido = new Pedido();
                if (estado.equals("pendiente") || estado.equals("cancelado") || estado.equals("entregado")) {
                    accesopedido.modificarEstado(estado, id);
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Formato agrego en estado incorrecto");
                }

            } else {
                JOptionPane.showMessageDialog(this, "El campo no puede ir vacio");
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "No puede contener letras");
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jCheckBox1.setSelected(false);
        try {
            String idpedi = jTextpedido.getText();
            if(!idpedi.isEmpty()){
                int id = Integer.parseInt(idpedi);
                AccesoPedido accespedido = new AccesoPedido();
                Pedido pedido = accespedido.buscarPedido(id);
                if(pedido!=null){
                    jTextmesa.setText(pedido.getMesa().getIdMesa()+"");
                    jTextmesero.setText(pedido.getMesero().getIdMesero()+"");
                    jTextproducto.setText(pedido.getProducto().getIdProducto()+"");
                    jTextestado.setText(pedido.getEstado());

                }
            }else{
                JOptionPane.showMessageDialog(this, "El campo no puede ir vacio");
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "El campo no puede llevar letras");
        } catch (NullPointerException np){
            JOptionPane.showMessageDialog(this, "id ingresdo inexistente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
                    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCamEstado;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextestado;
    private javax.swing.JTextField jTextmesa;
    private javax.swing.JTextField jTextmesero;
    private javax.swing.JTextField jTextpedido;
    private javax.swing.JTextField jTextproducto;
    // End of variables declaration//GEN-END:variables
private void limpiarCampos(){
jTextestado.setText("");
jTextmesa.setText("");
jTextmesero.setText("");
jTextpedido.setText("");
jTextproducto.setText("");


}


}




