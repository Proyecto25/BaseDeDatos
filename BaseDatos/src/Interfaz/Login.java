package Interfaz;

import java.awt.Color;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblOlvidar = new javax.swing.JLabel();
        lblImgUser = new javax.swing.JLabel();
        lblImgContra = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblContra = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        panelLogo = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso");
        setName("FrameLogin"); // NOI18N
        setPreferredSize(new java.awt.Dimension(340, 500));
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(48, 57, 74));
        panelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelFondo.setLayout(new java.awt.BorderLayout());

        panelContenido.setBackground(new java.awt.Color(48, 57, 74));

        txtUsuario.setBackground(new java.awt.Color(48, 57, 74));
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setSelectionColor(new java.awt.Color(48, 134, 149));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseExited(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02.icono_entrar_off.png"))); // NOI18N
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02.icono_entrar_on.png"))); // NOI18N
        btnEntrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02.icono_entrar_on.png"))); // NOI18N
        btnEntrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02.icono_entrar_on.png"))); // NOI18N
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        lblOlvidar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblOlvidar.setForeground(new java.awt.Color(255, 255, 255));
        lblOlvidar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOlvidar.setText("Olvidó su usario?");
        lblOlvidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOlvidarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOlvidarMouseExited(evt);
            }
        });

        lblImgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/03.icono_usuario2.png"))); // NOI18N

        lblImgContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/04.icono_contra.png"))); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblContra.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblContra.setForeground(new java.awt.Color(255, 255, 255));
        lblContra.setText("Contraseña");

        txtContra.setBackground(new java.awt.Color(48, 57, 74));
        txtContra.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtContra.setForeground(new java.awt.Color(255, 255, 255));
        txtContra.setBorder(null);
        txtContra.setCaretColor(new java.awt.Color(255, 255, 255));
        txtContra.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContra.setSelectionColor(new java.awt.Color(48, 134, 149));
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtContraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtContraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblImgUser)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContra)
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblImgContra)
                                .addGap(18, 18, 18)
                                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lblOlvidar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnEntrar)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblUsuario)
                .addGap(12, 12, 12)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgUser)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblContra)
                .addGap(6, 6, 6)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgContra)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblOlvidar)
                .addGap(34, 34, 34)
                .addComponent(btnEntrar)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        panelFondo.add(panelContenido, java.awt.BorderLayout.CENTER);

        panelLogo.setBackground(new java.awt.Color(48, 57, 74));

        lblUser.setBackground(new java.awt.Color(48, 57, 74));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/01.icono_usuario2.png"))); // NOI18N
        lblUser.setToolTipText("");
        lblUser.setOpaque(true);
        lblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUserMouseExited(evt);
            }
        });
        panelLogo.add(lblUser);

        panelFondo.add(panelLogo, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        Principal v2 = new Principal();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void lblOlvidarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlvidarMouseEntered
        this.lblOlvidar.setForeground(new Color(197,109,45));
    }//GEN-LAST:event_lblOlvidarMouseEntered

    private void lblOlvidarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlvidarMouseExited
        this.lblOlvidar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_lblOlvidarMouseExited

    private void txtUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseEntered
        this.txtUsuario.setBackground(new Color(58, 68, 85));
    }//GEN-LAST:event_txtUsuarioMouseEntered

    private void txtContraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMouseEntered
        this.txtContra.setBackground(new Color(58, 68, 85));
    }//GEN-LAST:event_txtContraMouseEntered

    private void txtUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseExited
        this.txtUsuario.setBackground(new Color(48,57,74));
    }//GEN-LAST:event_txtUsuarioMouseExited

    private void txtContraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMouseExited
        this.txtContra.setBackground(new Color(48,57,74));
    }//GEN-LAST:event_txtContraMouseExited

    private void lblUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseEntered
        this.lblUser.setBackground(new Color(58, 68, 85));
    }//GEN-LAST:event_lblUserMouseEntered

    private void lblUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseExited
        this.lblUser.setBackground(new Color(48,57,74));
    }//GEN-LAST:event_lblUserMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblImgContra;
    private javax.swing.JLabel lblImgUser;
    private javax.swing.JLabel lblOlvidar;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
