package Interfaz;

import ConexionBaseDatos.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Principal extends javax.swing.JFrame {
    Conexion conn = new Conexion();
    Connection con;
    static String nomUsuario;
    Pago pago = new Pago();
    Clientes clientes = new Clientes();
    Empleados empleados = new Empleados();
    Inventario inventario = new Inventario();
    Traslados traslados = new Traslados();
    Vehiculos vehiculos = new Vehiculos();
    Reportes reportes = new Reportes();
    RedimensionarImg red = new RedimensionarImg();
    ImageIcon imagen[] = new ImageIcon[9];
    public Principal(String usuario) {
        initComponents();
        nomUsuario = usuario;
    }

    private void inicio(){
        this.setExtendedState(MAXIMIZED_BOTH);
        this.escritorio.add(pago);
        this.escritorio.add(clientes);
        this.escritorio.add(empleados);
        this.escritorio.add(inventario);
        this.escritorio.add(traslados);
        this.escritorio.add(vehiculos);
        this.escritorio.add(reportes);
        btnPagos.setSize(170, 110);
        btnClientes.setSize(170, 110);
        btnEmpleados.setSize(170, 110);
        btnInventario.setSize(170, 110);
        btnVehiculos.setSize(170, 110);
        panelOpciones1.setSize(170,110);
        lblUsuario.setText("Usuario: "+nomUsuario);
        imagen[0] = new ImageIcon(getClass().getResource("/Imagenes/05.icono_btn_pagos.png"));
        imagen[1] = new ImageIcon(getClass().getResource("/Imagenes/06.icono_btn_empleados.png"));
        imagen[2] = new ImageIcon(getClass().getResource("/Imagenes/07.icono_btn_traslados.png"));
        imagen[3] = new ImageIcon(getClass().getResource("/Imagenes/08.icono_btn_inventario.png"));
        imagen[4] = new ImageIcon(getClass().getResource("/Imagenes/09.icono_btn_vehiculos.png"));
        imagen[5] = new ImageIcon(getClass().getResource("/Imagenes/10.icono_usuario3.png"));
        imagen[6] = new ImageIcon(getClass().getResource("/Imagenes/11.icono_btn_reportes.png"));
        imagen[7] = new ImageIcon(getClass().getResource("/Imagenes/12.icono_btn_clientes.png"));
        imagen[8] = new ImageIcon(getClass().getResource("/Imagenes/13.iconoCerrarSesion.png"));
        red.escalarImagen(btnPagos, imagen[0]);
        red.escalarImagen(btnEmpleados, imagen[1]);
        red.escalarImagen(btnInventario, imagen[3]);
        red.escalarImagen(btnVehiculos, imagen[4]);
        red.escalarImagen(btnIconoUsuario, imagen[5]);
        red.escalarImagen(btnReportes, imagen[6]);
        red.escalarImagen(btnClientes, imagen[7]);
        red.escalarImagen(btnIconoCerrarSesion, imagen[8]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        panelOpciones1 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        btnIconoUsuario = new javax.swing.JButton();
        btnIconoCerrarSesion = new javax.swing.JButton();
        panelOpciones2 = new javax.swing.JPanel();
        btnPagos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnVehiculos = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        panelContenido = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tren de Aseo");
        setBackground(new java.awt.Color(0, 102, 0));
        setName("framePrincipal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelSuperior.setBackground(new java.awt.Color(71, 80, 98));
        panelSuperior.setPreferredSize(new java.awt.Dimension(239, 100));
        panelSuperior.setLayout(new java.awt.BorderLayout());

        panelOpciones1.setBackground(new java.awt.Color(54, 68, 97));

        lblFecha.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("FECHA");

        lblUsuario.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("Usuario: ");

        lblHora.setBackground(new java.awt.Color(255, 255, 255));
        lblHora.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("HORA");

        lblCerrarSesion.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCerrarSesion.setText("Cerrar Sesión");
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });

        btnIconoUsuario.setToolTipText("Ver Usuario");
        btnIconoUsuario.setBorder(null);
        btnIconoUsuario.setBorderPainted(false);
        btnIconoUsuario.setContentAreaFilled(false);
        btnIconoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIconoUsuario.setFocusPainted(false);
        btnIconoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIconoUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIconoUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIconoUsuarioMouseExited(evt);
            }
        });

        btnIconoCerrarSesion.setToolTipText("Cerrar Sesión");
        btnIconoCerrarSesion.setBorder(null);
        btnIconoCerrarSesion.setBorderPainted(false);
        btnIconoCerrarSesion.setContentAreaFilled(false);
        btnIconoCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIconoCerrarSesion.setFocusPainted(false);
        btnIconoCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIconoCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIconoCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIconoCerrarSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelOpciones1Layout = new javax.swing.GroupLayout(panelOpciones1);
        panelOpciones1.setLayout(panelOpciones1Layout);
        panelOpciones1Layout.setHorizontalGroup(
            panelOpciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpciones1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelOpciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelOpciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIconoCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOpciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOpciones1Layout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        panelOpciones1Layout.setVerticalGroup(
            panelOpciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOpciones1Layout.createSequentialGroup()
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelOpciones1Layout.createSequentialGroup()
                        .addGroup(panelOpciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOpciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOpciones1Layout.createSequentialGroup()
                                .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addGroup(panelOpciones1Layout.createSequentialGroup()
                                .addComponent(btnIconoCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );

        panelSuperior.add(panelOpciones1, java.awt.BorderLayout.WEST);

        panelOpciones2.setBackground(new java.awt.Color(61, 71, 90));
        panelOpciones2.setLayout(new java.awt.GridLayout(1, 7));

        btnPagos.setBackground(new java.awt.Color(54, 68, 97));
        btnPagos.setToolTipText("Realizar Pagos");
        btnPagos.setBorder(null);
        btnPagos.setBorderPainted(false);
        btnPagos.setContentAreaFilled(false);
        btnPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagos.setFocusPainted(false);
        btnPagos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPagos.setMaximumSize(new java.awt.Dimension(70, 70));
        btnPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPagosMouseExited(evt);
            }
        });
        btnPagos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                btnPagosComponentResized(evt);
            }
        });
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });
        panelOpciones2.add(btnPagos);

        btnClientes.setBackground(new java.awt.Color(54, 68, 97));
        btnClientes.setToolTipText("Gestionar Clientes");
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setFocusPainted(false);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });
        btnClientes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                btnClientesComponentResized(evt);
            }
        });
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        panelOpciones2.add(btnClientes);

        btnEmpleados.setBackground(new java.awt.Color(54, 68, 97));
        btnEmpleados.setToolTipText("Gestionar Empleados");
        btnEmpleados.setBorder(null);
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados.setFocusPainted(false);
        btnEmpleados.setMaximumSize(new java.awt.Dimension(70, 70));
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEmpleadosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseReleased(evt);
            }
        });
        btnEmpleados.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                btnEmpleadosComponentResized(evt);
            }
        });
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        panelOpciones2.add(btnEmpleados);

        btnInventario.setBackground(new java.awt.Color(54, 68, 97));
        btnInventario.setToolTipText("Gestionar Inventario");
        btnInventario.setBorder(null);
        btnInventario.setBorderPainted(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.setFocusPainted(false);
        btnInventario.setMaximumSize(new java.awt.Dimension(70, 70));
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInventarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInventarioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInventarioMouseReleased(evt);
            }
        });
        btnInventario.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                btnInventarioComponentResized(evt);
            }
        });
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        panelOpciones2.add(btnInventario);

        btnVehiculos.setBackground(new java.awt.Color(54, 68, 97));
        btnVehiculos.setToolTipText("Gestionar Vehículos");
        btnVehiculos.setBorder(null);
        btnVehiculos.setBorderPainted(false);
        btnVehiculos.setContentAreaFilled(false);
        btnVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVehiculos.setFocusPainted(false);
        btnVehiculos.setMaximumSize(new java.awt.Dimension(70, 70));
        btnVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVehiculosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVehiculosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVehiculosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVehiculosMouseReleased(evt);
            }
        });
        btnVehiculos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                btnVehiculosComponentResized(evt);
            }
        });
        btnVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosActionPerformed(evt);
            }
        });
        panelOpciones2.add(btnVehiculos);

        btnReportes.setBackground(new java.awt.Color(54, 68, 97));
        btnReportes.setToolTipText("Ver Reporte de Pagos");
        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setFocusPainted(false);
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReportesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReportesMouseReleased(evt);
            }
        });
        btnReportes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                btnReportesComponentResized(evt);
            }
        });
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        panelOpciones2.add(btnReportes);

        panelSuperior.add(panelOpciones2, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelSuperior, java.awt.BorderLayout.NORTH);

        panelContenido.setBackground(new java.awt.Color(48, 57, 74));

        escritorio.setBackground(new java.awt.Color(54, 68, 97));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(escritorio)
                .addGap(20, 20, 20))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(escritorio)
                .addGap(20, 20, 20))
        );

        getContentPane().add(panelContenido, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarInternal(JInternalFrame internal){
        internal.setVisible(true);
        try {  
            internal.setMaximum(true);
        }catch(PropertyVetoException e) {}
        internal.show();
    }
    
    private void btnPagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagosMouseEntered
        red.escalarImagen2(btnPagos,new ImageIcon(getClass().getResource("/Imagenes/05.icono_btn_pagos.png")));
    }//GEN-LAST:event_btnPagosMouseEntered

    private void btnPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagosMouseExited
        red.escalarImagen(btnPagos,new ImageIcon(getClass().getResource("/Imagenes/05.icono_btn_pagos.png")));
    }//GEN-LAST:event_btnPagosMouseExited

    private void btnPagosComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnPagosComponentResized
        red.escalarImagen(btnPagos,new ImageIcon(getClass().getResource("/Imagenes/05.icono_btn_pagos.png")));
    }//GEN-LAST:event_btnPagosComponentResized

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
        this.clientes.setVisible(false);
        this.empleados.setVisible(false);
        this.inventario.setVisible(false);
        this.reportes.setVisible(false);
        this.traslados.setVisible(false);
        this.vehiculos.setVisible(false);
        this.mostrarInternal(pago);
    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseEntered
        red.escalarImagen2(btnEmpleados,new ImageIcon(getClass().getResource("/Imagenes/06.icono_btn_empleados.png")));
    }//GEN-LAST:event_btnEmpleadosMouseEntered

    private void btnEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseExited
        red.escalarImagen(btnEmpleados,new ImageIcon(getClass().getResource("/Imagenes/06.icono_btn_empleados.png")));
    }//GEN-LAST:event_btnEmpleadosMouseExited

    private void btnEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMousePressed
        this.btnEmpleados.setOpaque(true);
    }//GEN-LAST:event_btnEmpleadosMousePressed

    private void btnEmpleadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseReleased
        this.btnEmpleados.setOpaque(false);
    }//GEN-LAST:event_btnEmpleadosMouseReleased

    private void btnEmpleadosComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnEmpleadosComponentResized
        red.escalarImagen(btnEmpleados,new ImageIcon(getClass().getResource("/Imagenes/06.icono_btn_empleados.png")));
    }//GEN-LAST:event_btnEmpleadosComponentResized

    private void btnInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseEntered
        red.escalarImagen2(btnInventario,new ImageIcon(getClass().getResource("/Imagenes/08.icono_btn_inventario.png")));
    }//GEN-LAST:event_btnInventarioMouseEntered

    private void btnInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseExited
        red.escalarImagen(btnInventario,new ImageIcon(getClass().getResource("/Imagenes/08.icono_btn_inventario.png")));
    }//GEN-LAST:event_btnInventarioMouseExited

    private void btnInventarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMousePressed
        this.btnInventario.setOpaque(true);
    }//GEN-LAST:event_btnInventarioMousePressed

    private void btnInventarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseReleased
        this.btnInventario.setOpaque(false);
    }//GEN-LAST:event_btnInventarioMouseReleased

    private void btnInventarioComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnInventarioComponentResized
        red.escalarImagen(btnInventario,new ImageIcon(getClass().getResource("/Imagenes/08.icono_btn_inventario.png")));
    }//GEN-LAST:event_btnInventarioComponentResized

    private void btnVehiculosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehiculosMouseEntered
        red.escalarImagen2(btnVehiculos,new ImageIcon(getClass().getResource("/Imagenes/09.icono_btn_vehiculos.png")));
    }//GEN-LAST:event_btnVehiculosMouseEntered

    private void btnVehiculosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehiculosMouseExited
        red.escalarImagen(btnVehiculos,new ImageIcon(getClass().getResource("/Imagenes/09.icono_btn_vehiculos.png")));
    }//GEN-LAST:event_btnVehiculosMouseExited

    private void btnVehiculosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehiculosMousePressed
        this.btnVehiculos.setOpaque(true);
    }//GEN-LAST:event_btnVehiculosMousePressed

    private void btnVehiculosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehiculosMouseReleased
        this.btnVehiculos.setOpaque(false);
    }//GEN-LAST:event_btnVehiculosMouseReleased

    private void btnVehiculosComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnVehiculosComponentResized
        red.escalarImagen(btnVehiculos,new ImageIcon(getClass().getResource("/Imagenes/09.icono_btn_vehiculos.png")));
    }//GEN-LAST:event_btnVehiculosComponentResized

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this, "Salir de la Aplicación.\n¿Desea continuar?", "Cerrar", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/Salir.png"))) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }else{
            this.setDefaultCloseOperation(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Fehca del sistema
        Date sistemaFech = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMM yyyy");
        this.lblFecha.setText(formato.format(sistemaFech));

        //Hora del sistema
        Timer tiempo = new Timer(100, new Principal.horas());
        tiempo.start();
        inicio();
    }//GEN-LAST:event_formWindowOpened

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        cerrarSesion();
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void btnIconoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIconoUsuarioMouseClicked
       
    }//GEN-LAST:event_btnIconoUsuarioMouseClicked

    private void btnIconoCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIconoCerrarSesionMouseClicked
        cerrarSesion();
    }//GEN-LAST:event_btnIconoCerrarSesionMouseClicked

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        this.pago.setVisible(false);
        this.clientes.setVisible(false);
        this.inventario.setVisible(false);
        this.reportes.setVisible(false);
        this.traslados.setVisible(false);
        this.vehiculos.setVisible(false);
        this.mostrarInternal(empleados);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        this.pago.setVisible(false);
        this.empleados.setVisible(false);
        this.clientes.setVisible(false);
        this.reportes.setVisible(false);
        this.traslados.setVisible(false);
        this.vehiculos.setVisible(false);
        this.mostrarInternal(inventario);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosActionPerformed
        this.pago.setVisible(false);
        this.empleados.setVisible(false);
        this.inventario.setVisible(false);
        this.reportes.setVisible(false);
        this.traslados.setVisible(false);
        this.clientes.setVisible(false);
        this.mostrarInternal(vehiculos);
    }//GEN-LAST:event_btnVehiculosActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        this.pago.setVisible(false);
        this.empleados.setVisible(false);
        this.inventario.setVisible(false);
        this.clientes.setVisible(false);
        this.traslados.setVisible(false);
        this.vehiculos.setVisible(false);
        this.mostrarInternal(reportes);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnReportesComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnReportesComponentResized
        red.escalarImagen(btnReportes,new ImageIcon(getClass().getResource("/Imagenes/11.icono_btn_reportes.png")));
    }//GEN-LAST:event_btnReportesComponentResized

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        red.escalarImagen2(btnReportes,new ImageIcon(getClass().getResource("/Imagenes/11.icono_btn_reportes.png")));
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
       red.escalarImagen(btnReportes,new ImageIcon(getClass().getResource("/Imagenes/11.icono_btn_reportes.png")));
    }//GEN-LAST:event_btnReportesMouseExited

    private void btnReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMousePressed
        this.btnReportes.setOpaque(true);
    }//GEN-LAST:event_btnReportesMousePressed

    private void btnReportesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseReleased
        this.btnReportes.setOpaque(false);
    }//GEN-LAST:event_btnReportesMouseReleased

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        this.pago.setVisible(false);
        this.empleados.setVisible(false);
        this.inventario.setVisible(false);
        this.reportes.setVisible(false);
        this.traslados.setVisible(false);
        this.vehiculos.setVisible(false);
        this.mostrarInternal(clientes);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnClientesComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnClientesComponentResized
        red.escalarImagen(btnClientes,new ImageIcon(getClass().getResource("/Imagenes/12.icono_btn_clientes.png")));
    }//GEN-LAST:event_btnClientesComponentResized

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        red.escalarImagen2(btnClientes,new ImageIcon(getClass().getResource("/Imagenes/12.icono_btn_clientes.png")));
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        red.escalarImagen(btnClientes,new ImageIcon(getClass().getResource("/Imagenes/12.icono_btn_clientes.png")));
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnIconoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIconoUsuarioMouseEntered
        red.escalarImagen2(btnIconoUsuario,new ImageIcon(getClass().getResource("/Imagenes/10.icono_usuario3.png")));
    }//GEN-LAST:event_btnIconoUsuarioMouseEntered

    private void btnIconoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIconoUsuarioMouseExited
        red.escalarImagen(btnIconoUsuario,new ImageIcon(getClass().getResource("/Imagenes/10.icono_usuario3.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_btnIconoUsuarioMouseExited

    private void btnIconoCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIconoCerrarSesionMouseEntered
        red.escalarImagen2(btnIconoCerrarSesion,new ImageIcon(getClass().getResource("/Imagenes/13.iconoCerrarSesion.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_btnIconoCerrarSesionMouseEntered

    private void btnIconoCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIconoCerrarSesionMouseExited
        red.escalarImagen(btnIconoCerrarSesion,new ImageIcon(getClass().getResource("/Imagenes/13.iconoCerrarSesion.png")));
    }//GEN-LAST:event_btnIconoCerrarSesionMouseExited

    private void cerrarSesion(){
        if (JOptionPane.showConfirmDialog(this, "Desea cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/btnCerrarSesion.png"))) == JOptionPane.YES_OPTION) {
            this.dispose();
            new Login().setVisible(true);
        }
    }
    
    class horas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date sistemaHora = new Date();
            String pmAm = "hh:mm a";
            SimpleDateFormat formato = new SimpleDateFormat(pmAm);
            Calendar now = Calendar.getInstance();
            lblHora.setText(String.format(formato.format(sistemaHora), now));
        }
    }
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(nomUsuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnIconoCerrarSesion;
    private javax.swing.JButton btnIconoUsuario;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnVehiculos;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelOpciones1;
    private javax.swing.JPanel panelOpciones2;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
}
