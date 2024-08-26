package expresEatUI.empleadoUI;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

public class ordenesUI extends javax.swing.JFrame {

    private int dato;
    private int fil = 0;
    private int filTtl = 1;
    

    
    Connection conn = expresseatapp.BDConnection.getConnection();
    expresseatapp.BDmenu menu = new expresseatapp.BDmenu(conn);
    
    public ordenesUI() {
        initComponents();
        expresseatapp.icono.establecerIcono(this);

        ordenVacia();
    }
    public void setDato(int Dato){
        this.dato = Dato;
    }
    public int getDato(){
        return dato;
    }
    public void ordenVacia(){
        //crear nueva orden en blanco
        LocalDateTime fecha = LocalDateTime.now();
        expresseatapp.BDordenes GO = new expresseatapp.BDordenes(conn);
        int ultID = GO.getUltimoOrdenId(); // obtiene ultimo id
        //crea la orden
        
        if (ultID != 0){
            expresseatapp.ordenes ord = new expresseatapp.ordenes(0, 0, fecha, 0);
            boolean creado = GO.crearOrden(ord);

            if(creado){
                 jLabel6.setText(Integer.toString(ultID));
            }
        } 
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtCtd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        verBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JButton();
        verBtn1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();
        jLTotal = new javax.swing.JLabel();
        jLTotal1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        factura = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordenes");
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 600));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Creacion de Ordenes");

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtID.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N

        txtCtd.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        txtCtd.setText("1");
        txtCtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCtdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Cantidad:");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("ID Producto");

        verBtn.setBackground(new java.awt.Color(204, 102, 0));
        verBtn.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        verBtn.setForeground(new java.awt.Color(0, 0, 51));
        verBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo.png"))); // NOI18N
        verBtn.setText("Ver Productos");
        verBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Agregar Productos");

        agregarBtn.setBackground(new java.awt.Color(0, 153, 0));
        agregarBtn.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        agregarBtn.setForeground(new java.awt.Color(0, 0, 51));
        agregarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-mas.png"))); // NOI18N
        agregarBtn.setText("Agregar a Factura");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        verBtn1.setBackground(new java.awt.Color(255, 0, 0));
        verBtn1.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        verBtn1.setForeground(new java.awt.Color(0, 0, 51));
        verBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        verBtn1.setText("Eliminar");
        verBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCtd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(verBtn1)
                .addGap(18, 18, 18)
                .addComponent(verBtn)
                .addGap(18, 18, 18)
                .addComponent(agregarBtn)
                .addGap(33, 33, 33))
        );

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));

        guardarBtn.setBackground(new java.awt.Color(0, 153, 0));
        guardarBtn.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        guardarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar-el-archivo.png"))); // NOI18N
        guardarBtn.setText("Guardar Factura");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        jLTotal.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLTotal.setForeground(new java.awt.Color(255, 0, 0));
        jLTotal.setText("0");

        jLTotal1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLTotal1.setForeground(new java.awt.Color(255, 0, 0));
        jLTotal1.setText("TOTAL:");

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Factura No.");

        factura.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        factura.setForeground(new java.awt.Color(0, 0, 51));
        factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Ctd.", "Valor Unt.", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(factura);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(77, 77, 77)))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(guardarBtn)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLTotal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTotal1)
                    .addComponent(jLTotal)
                    .addComponent(guardarBtn))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLTotal.getAccessibleContext().setAccessibleParent(jPanel1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
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

    private void verBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBtnActionPerformed
        // TODO add your handling code here:
        expresEatUI.empleadoUI.menuUI menu = new expresEatUI.empleadoUI.menuUI();
        menu.setVisible(true);
    }//GEN-LAST:event_verBtnActionPerformed
    
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        // agrega producto a la factura
        
        int id, ctd, nfilas;
        String producto, id_str, ctd_str;
        float precio, total;
        float ttl = 0;
        id_str = txtID.getText();
        id = Integer.parseInt(id_str);
        
        ctd_str = txtCtd.getText();
        ctd = Integer.parseInt(ctd_str);
        
        expresseatapp.menu MENU = menu.getProducto(id);
        expresseatapp.BDordenes GO = new expresseatapp.BDordenes(conn);
        
        if (MENU != null) {
            id = MENU.getMenuID();
            producto = MENU.getProducto();
            precio = MENU.getPrecio();
            
            total = precio * ctd;
            
            nfilas = fil;
            
            for (int i = 0; i < nfilas; i++){
                Object ttlObj = factura.getValueAt(i, 4);
                if (ttlObj != null){
                    float ttlsum = Float.parseFloat(ttlObj.toString());
                    ttl += ttlsum;
                }
            }
            
            ttl += total;
            
            jLTotal.setText(Float.toString(ttl));
            

            // Establece los valores en la fila actual
            factura.setValueAt(id, fil, 0);
            factura.setValueAt(producto, fil, 1);
            factura.setValueAt(ctd_str, fil, 2);
            factura.setValueAt(precio, fil, 3);
            factura.setValueAt(total, fil, 4);
            factura.setValueAt("Total", filTtl, 0);
            factura.setValueAt(ttl, filTtl, 4);
            
            fil++;
            filTtl++;
            
            
            //crea el detalle
            expresseatapp.detalles det = new expresseatapp.detalles(0, Integer.parseInt(jLabel6.getText()), id, ctd);
            GO.crearDet(det);
        } else {
            JOptionPane.showMessageDialog(this, "ID ingresado no fue encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void txtCtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCtdActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        // boton para editar orden
        int idusu = getDato();   //obtine el id de usuario
        float total = 0;
        LocalDateTime fecha = LocalDateTime.now();
        total = Float.parseFloat(jLTotal.getText()); // obtine el valor de total
        
        expresseatapp.BDordenes GO = new expresseatapp.BDordenes(conn);
        
        //obtiene el id de empleado
        expresseatapp.empleado emp = GO.getEmpNom(idusu);
        int empID = emp.getID(); 
        
        
        expresseatapp.ordenes edit = new expresseatapp.ordenes(Integer.parseInt(jLabel6.getText()), empID, fecha, total);
        
        boolean edito = GO.editarOrden(edit);
        // si fue editado se realiza la condicion para limpiar todo
        if (edito) {
            jLTotal.setText("0");
            DefaultTableModel modelo = (DefaultTableModel) factura.getModel();
            modelo.setRowCount(0); // Elimina todas las filas
            //recrea las filas
            for (int i = 0; i < 20; i++) {
                modelo.addRow(new Object[]{null, null, null, null, null});
            }           
            txtID.setText("");
            fil = 0;
            filTtl = 1;
            ordenVacia();
            
            
            //JOptionPane.showMessageDialog(this, emp.getNom()); //muestra el nombre de empleado
            JOptionPane.showMessageDialog(this, "Factura guardada y enviada con exito ", "Factura Guardada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al enviar factura! vuelva a intentar mas tarde", "ERROR", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void verBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBtn1ActionPerformed
    // elimina el producto seleccionado
    expresseatapp.BDordenes eli = new expresseatapp.BDordenes(conn);
        
    int iTable = factura.getSelectedRow();

    if (iTable >= 0) {
        
        try {
            // eliminar la fila
            int idpro = (Integer) factura.getValueAt(iTable, 0);
            int idord = Integer.parseInt(jLabel6.getText());

            // elimina el detalle en la bd
            eli.eliminarDet(idord, idpro);
            
            // Obtiene el modelo de la tabla y elimina la fila
            DefaultTableModel modelo = (DefaultTableModel) factura.getModel();
            modelo.removeRow(iTable);
            
            fil--;
            filTtl--;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hubo un error al eliminar!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
        
        
        
        
    }//GEN-LAST:event_verBtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        expresEatUI.login logout = new expresEatUI.login();
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(ordenesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ordenesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ordenesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ordenesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ordenesUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JTable factura;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLTotal1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCtd;
    private javax.swing.JTextField txtID;
    private javax.swing.JButton verBtn;
    private javax.swing.JButton verBtn1;
    // End of variables declaration//GEN-END:variables
}
