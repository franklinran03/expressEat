/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package expresEatUI.adminUI;

import java.sql.Connection;

/**
 *
 * @author Franklin Rangel
 */
public class inicioAdmin extends javax.swing.JFrame {
    
    Connection conn = expresseatapp.BDConnection.getConnection();
    expresseatapp.BDordenes GO = new expresseatapp.BDordenes(conn);
    
    public inicioAdmin() {
        initComponents();
        expresseatapp.icono.establecerIcono(this);
    }
    
    private int dato;
    
    public void setDato(int Dato){
        this.dato = Dato;
        expresseatapp.empleado emp = GO.getEmpNom(Dato);
        nombre.setText(emp.getNom() + " " + emp.getApe()); //muestra nombre del administrador
    }
    
    public int getDato(){
        return dato;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menuBtn = new javax.swing.JButton();
        ordenesBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        csBtn = new javax.swing.JButton();
        empBtn = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Bienvenido");

        nombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 0, 0));

        menuBtn.setBackground(new java.awt.Color(255, 255, 0));
        menuBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        menuBtn.setForeground(new java.awt.Color(0, 0, 51));
        menuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        menuBtn.setText("Menu");
        menuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnActionPerformed(evt);
            }
        });

        ordenesBtn.setBackground(new java.awt.Color(255, 255, 0));
        ordenesBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        ordenesBtn.setForeground(new java.awt.Color(0, 0, 51));
        ordenesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/orden.png"))); // NOI18N
        ordenesBtn.setText("Ordenes");
        ordenesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenesBtnActionPerformed(evt);
            }
        });

        salirBtn.setBackground(new java.awt.Color(255, 51, 0));
        salirBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        salirBtn.setForeground(new java.awt.Color(0, 0, 51));
        salirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/encendido.png"))); // NOI18N
        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        csBtn.setBackground(new java.awt.Color(255, 51, 0));
        csBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        csBtn.setForeground(new java.awt.Color(0, 0, 51));
        csBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        csBtn.setText("Cerrar Sesion");
        csBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csBtnActionPerformed(evt);
            }
        });

        empBtn.setBackground(new java.awt.Color(255, 255, 0));
        empBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        empBtn.setForeground(new java.awt.Color(0, 0, 51));
        empBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grupo.png"))); // NOI18N
        empBtn.setText("Empleados");
        empBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(nombre))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(csBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ordenesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(menuBtn)
                .addGap(18, 18, 18)
                .addComponent(ordenesBtn)
                .addGap(18, 18, 18)
                .addComponent(empBtn)
                .addGap(18, 18, 18)
                .addComponent(csBtn)
                .addGap(18, 18, 18)
                .addComponent(salirBtn)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
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

        getAccessibleContext().setAccessibleName("Inicio");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        // salir
        this.dispose();
    }//GEN-LAST:event_salirBtnActionPerformed

    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnActionPerformed
        // redireciona al menu
        menuAdminUI menu = new menuAdminUI();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuBtnActionPerformed

    private void ordenesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenesBtnActionPerformed
        // ver ordenes
        ordenesAUI ord = new ordenesAUI();
        ord.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ordenesBtnActionPerformed

    private void csBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csBtnActionPerformed
        // cerrar sesion
        expresEatUI.login logout = new expresEatUI.login();
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_csBtnActionPerformed

    private void empBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empBtnActionPerformed
        // gestionar empleados
        empleadosUI emps = new empleadosUI();
        emps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_empBtnActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton csBtn;
    private javax.swing.JButton empBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton menuBtn;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton ordenesBtn;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables
}
