package expresEatUI.adminUI;

import expresseatapp.empleado;
import expresseatapp.usuario;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Franklin Rangel
 */
public class empleadosUI extends javax.swing.JFrame {
    Connection conn = expresseatapp.BDConnection.getConnection();
    expresseatapp.BDempleado GE = new expresseatapp.BDempleado(conn);
    expresseatapp.BDempleado EMP = new expresseatapp.BDempleado(conn);
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form geUI
     */
    public empleadosUI() {
        initComponents();
    
        modelo.setColumnIdentifiers(new Object[]{"ID", "Nombre", "Apellido", "Usuario", "Rol"});
        List<empleado> listaEmps = GE.getEmps();
        for (empleado emp : listaEmps){
            usuario usu =  GE.getUsuario(emp.getUsu());
            boolean admin = usu.getAdmin();
            
            if(emp.getID() != 0){
                if(admin){
                    modelo.addRow(new Object[]{emp.getID(), emp.getNom(), emp.getApe(), usu.getUsuario(), "Administrador"});
                } else {
                    modelo.addRow(new Object[]{emp.getID(), emp.getNom(), emp.getApe(), usu.getUsuario(), "Empleado"});
                }
           
        }
        tablaEmp.setModel(modelo);
        }
        
        expresseatapp.icono.establecerIcono(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmp = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        rolcb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        aptxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        utxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        enviarBtn = new javax.swing.JButton();
        contxt = new javax.swing.JPasswordField();
        salirBtn = new javax.swing.JButton();
        editarBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Empleados");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        tablaEmp.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        tablaEmp.setForeground(new java.awt.Color(0, 0, 51));
        tablaEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Usuario", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEmp);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Gestion Empleados");

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("Crear & Editar");

        idtxt.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        idtxt.setForeground(new java.awt.Color(0, 0, 51));
        idtxt.setText("0");

        rolcb.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        rolcb.setForeground(new java.awt.Color(0, 0, 51));
        rolcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));
        rolcb.setSelectedIndex(-1);

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Rol:");

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Nombre:");

        nomtxt.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        nomtxt.setForeground(new java.awt.Color(0, 0, 51));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Apellido:");

        aptxt.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        aptxt.setForeground(new java.awt.Color(0, 0, 51));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Usuario:");

        utxt.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        utxt.setForeground(new java.awt.Color(0, 0, 51));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Contraseña:");

        enviarBtn.setBackground(new java.awt.Color(0, 153, 0));
        enviarBtn.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        enviarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviar-mensaje.png"))); // NOI18N
        enviarBtn.setText("Enviar");
        enviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(rolcb, 0, 1, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(124, 124, 124))
                            .addComponent(nomtxt)
                            .addComponent(aptxt)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(utxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contxt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(enviarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rolcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(utxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enviarBtn)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        salirBtn.setBackground(new java.awt.Color(255, 0, 0));
        salirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa.png"))); // NOI18N
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        editarBtn.setBackground(new java.awt.Color(204, 102, 0));
        editarBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        editarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        editarBtn.setText("Editar");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        eliminarBtn.setBackground(new java.awt.Color(255, 0, 0));
        eliminarBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        eliminarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72)
                        .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(editarBtn)
                                .addGap(63, 63, 63)
                                .addComponent(eliminarBtn)
                                .addGap(74, 74, 74)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editarBtn)
                            .addComponent(eliminarBtn)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        // TODO add your handling code here:
        inicioAdmin inicio = new inicioAdmin();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirBtnActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
        // TODO add your handling code here:
        int filSel = tablaEmp.getSelectedRow();
        
        try {
            int ID = (Integer) tablaEmp.getValueAt(filSel, 0);
            String nom = (String) tablaEmp.getValueAt(filSel, 1);
            String ape = (String) tablaEmp.getValueAt(filSel, 2);
            String usu = (String) tablaEmp.getValueAt(filSel, 3);
            String rol = (String) tablaEmp.getValueAt(filSel, 4);

            
            
            String id_str = Integer.toString(ID);
            
            empleado empdts = GE.getEmpleado(ID); //recibe idempleado para buscar id usario
            usuario nusu = GE.getUsuario(empdts.getUsu()); //recibe el id de usario dado por empdts
        
            idtxt.setText(id_str);
            nomtxt.setText(nom);
            aptxt.setText(ape);
            utxt.setText(usu);
            contxt.setText(nusu.getContra());
            
            rolcb.setSelectedItem(rol);
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Hubuo un problema al seleccionar un empleado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editarBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        // logica eliminar
        int filSel = tablaEmp.getSelectedRow();
        int idSel = (Integer) modelo.getValueAt(filSel, 0);
        
        String nom = (String) modelo.getValueAt(filSel, 1);

        try {
            int conf = JOptionPane.showInternalConfirmDialog(null, "Seguro que quieres eliminar a: " + nom, " ", JOptionPane.YES_NO_OPTION);
            if(conf == JOptionPane.YES_OPTION){
                empleado empdts = GE.getEmpleado(idSel); //recibe idempleado para buscar id usario
                usuario idusu = GE.getUsuario(empdts.getUsu()); //recibe el id de usario dado por empdts
                boolean borro = GE.eliminarEmp(idSel);
                if (borro){
                    GE.eliminarUsu(idusu.getUsuarioID());//elimina el usuario
                    modelo.removeRow(filSel);
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Hubo un error al eliminar!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void enviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnActionPerformed
        // logica para editar o crear
        int filSel = tablaEmp.getSelectedRow();
        
        int empID = Integer.parseInt(idtxt.getText());
        
        String usuarioTxt = utxt.getText();
        String nom = nomtxt.getText();
        String ape = aptxt.getText();
        String con = contxt.getText();
        boolean rol = false;
        
        if(rolcb.getSelectedItem().equals("Empleado")){
            rol = false;
        } else if(rolcb.getSelectedItem().equals("Administrador")){
            rol = true;
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecionar un rol", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        //verifica si el id existe
        if(GE.getEmpleado(empID) == null){
            //logica para crear
            usuario usu = new usuario(0, usuarioTxt, con, rol);
            boolean usuCreado = GE.crearUsu(usu);
            if(usuCreado){
                //si el usuario se creo procede a crear el empleado
                empleado emp = new empleado(0, GE.getUltUsuario(), nom, ape);
                GE.crearEmp(emp);
                if(usu.getAdmin()){
                    modelo.addRow(new Object [] {emp.getID(), emp.getNom(), emp.getApe(), usu.getUsuario(), "Administrador"});
                } else {
                    modelo.addRow(new Object [] {emp.getID(), emp.getNom(), emp.getApe(), usu.getUsuario(), "Empleado"});
                }
                JOptionPane.showMessageDialog(null, "Empleado agregado con exito!", " ", JOptionPane.INFORMATION_MESSAGE);
            } else {  
                //si el usuario no se creo
                JOptionPane.showMessageDialog(null, "Error al crear empleado!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            //logica para editar
            empleado busqIDusu = EMP.getEmpleado(empID);
            int idusuario = busqIDusu.getUsu();
            
            empleado emp = new empleado(empID, idusuario, nom, ape);
            boolean edito = GE.editarEmp(emp);
            if(edito){
                //si se edito el empleado procede a editar el usuario
                usuario usu = new usuario(idusuario, usuarioTxt, con, rol);
                GE.editarUsu(usu);
                modelo.setValueAt(emp.getID(), filSel, 0);
                modelo.setValueAt(emp.getNom(), filSel, 1);
                modelo.setValueAt(emp.getApe(), filSel, 2);
                modelo.setValueAt(usu.getUsuario(), filSel, 3);
                if(usu.getAdmin()){
                    modelo.setValueAt("Administrador", filSel, 4);
                } else {
                    modelo.setValueAt("Empleado", filSel, 4);
                }
                JOptionPane.showMessageDialog(null, "Empleado editado con exito!", " ", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al editar empleado!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        utxt.setText("");
        idtxt.setText("");
        rolcb.setSelectedIndex(-1);
        nomtxt.setText("");
        aptxt.setText("");
        contxt.setText("");
    }//GEN-LAST:event_enviarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(empleadosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleadosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleadosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleadosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empleadosUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aptxt;
    private javax.swing.JPasswordField contxt;
    private javax.swing.JButton editarBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JButton enviarBtn;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomtxt;
    private javax.swing.JComboBox<String> rolcb;
    private javax.swing.JButton salirBtn;
    private javax.swing.JTable tablaEmp;
    private javax.swing.JTextField utxt;
    // End of variables declaration//GEN-END:variables
}
