package proyectofinalresto.AccesoVista;

import javax.swing.JOptionPane;

public class RestoPrincipal extends javax.swing.JFrame {
  
    public RestoPrincipal() {
        initComponents();
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopMain = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopMain.setBackground(new java.awt.Color(0, 51, 51));
        desktopMain.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 102)));
        desktopMain.setForeground(new java.awt.Color(0, 255, 204));
        desktopMain.setPreferredSize(new java.awt.Dimension(1280, 780));

        javax.swing.GroupLayout desktopMainLayout = new javax.swing.GroupLayout(desktopMain);
        desktopMain.setLayout(desktopMainLayout);
        desktopMainLayout.setHorizontalGroup(
            desktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1398, Short.MAX_VALUE)
        );
        desktopMainLayout.setVerticalGroup(
            desktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/service_restaurant_icon_146861.png"))); // NOI18N
        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resto.png"))); // NOI18N
        jMenuItem2.setText("Generar Pedido");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(0, 0, 0));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/databasesearch_basededato_12920.png"))); // NOI18N
        jMenu3.setText("Solicitudes y Modificaciones");
        jMenu3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion.png"))); // NOI18N
        jMenuItem3.setText("Modificaciones Producto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion.png"))); // NOI18N
        jMenuItem1.setText("Moficicaciones Pedido");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopMain, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      desktopMain.removeAll();
      desktopMain.repaint();
      ValidarAdmi crearPedido = new ValidarAdmi(this);
      crearPedido.setVisible(true);
      desktopMain.add(crearPedido);
      desktopMain.moveToFront(crearPedido);  
    }//GEN-LAST:event_jMenuItem2ActionPerformed
//perfecto!
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      desktopMain.removeAll();
      desktopMain.repaint();
      LoginMeseroModificarPedido verificarMesero = new LoginMeseroModificarPedido(this);
      verificarMesero.setVisible(true);
      desktopMain.add(verificarMesero);
      desktopMain.moveToFront(verificarMesero);  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
      desktopMain.removeAll();
      desktopMain.repaint();
      AccesoModificacionPermitido verificarMesero = new AccesoModificacionPermitido();
      verificarMesero.setVisible(true);
      desktopMain.add(verificarMesero);
      desktopMain.moveToFront(verificarMesero);  
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      desktopMain.removeAll();
      desktopMain.repaint();
      LoginMeseroProducto verificarMesero = new  LoginMeseroProducto(this);
      verificarMesero.setVisible(true);
      desktopMain.add(verificarMesero);
      desktopMain.moveToFront(verificarMesero);  
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestoPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopMain;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables

public void abrirGestion (){

desktopMain.removeAll();
desktopMain.repaint();
GenerarPedido acceso = new GenerarPedido();
acceso.setVisible(true);
desktopMain.add(acceso);
desktopMain.moveToFront(acceso);
}

public void abrirModificarpedido (){

desktopMain.removeAll();
desktopMain.repaint();
AccesPermitidoModificarPedido acceso = new AccesPermitidoModificarPedido();
acceso.setVisible(true);
desktopMain.add(acceso);
desktopMain.moveToFront(acceso);
}

public void abrirModificarproducto (){

desktopMain.removeAll();
desktopMain.repaint();
AccesoModificacionPermitido acceso = new AccesoModificacionPermitido();
acceso.setVisible(true);
desktopMain.add(acceso);
desktopMain.moveToFront(acceso);
}
}
