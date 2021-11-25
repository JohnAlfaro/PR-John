package vistas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.OrdenDAO;
import modelo.Ventas;
import modelo.VentasDAO;
import org.json.JSONArray;
import org.json.JSONObject;

public final class OrdenesCola extends javax.swing.JInternalFrame {

    OrdenDAO odao = new OrdenDAO();

    VentasDAO vdao = new VentasDAO();
    Ventas venta = new Ventas();

    DefaultTableModel modeloOrden = new DefaultTableModel();
    DefaultTableModel modeloVentas = new DefaultTableModel();

    public OrdenesCola() throws IOException, InterruptedException {
        initComponents();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOrden = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtTotalPagar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnPreparar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnEntregar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Lista de Ordenes En Cola");
        setPreferredSize(new java.awt.Dimension(630, 341));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ORDEN", "CLIENTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaOrdenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaOrden);

        jLabel1.setText("ORDENES EN COLA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(205, 205, 205))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setText("ESTADO");

        jLabel4.setText("CLIENTE");

        txtCliente.setEditable(false);

        txtTotalPagar.setEditable(false);

        jLabel6.setText("TOTAL A PAGAR");

        txtEstado.setEditable(false);

        jLabel7.setText("ORDEN SELECCIONADA");

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PROD.", "PRODUCTO", "CANTIDAD", "PRECIO", "TOT."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaVentas);

        jLabel8.setText("PRODUCTOS");

        btnPreparar.setText("PREPARAR");
        btnPreparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrepararActionPerformed(evt);
            }
        });

        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnEntregar.setText("ENTREGAR");
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(173, 173, 173)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnEntregar))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnFinalizar)
                                            .addComponent(btnPreparar))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCliente))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel7)))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPreparar)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizar)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        cambioEstado("finished");
        limpiar();
        try {
            actualizarTabla();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(OrdenesCola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void tablaOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaOrdenMouseClicked
        int fila = tablaOrden.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila primero");
        } else {
            String idOrden = tablaOrden.getValueAt(fila, 0).toString();
            String cliente = tablaOrden.getValueAt(fila, 1).toString();

            txtCliente.setText(cliente);
            txtEstado.setText("En Cola");

            try {
                listarVentas(idOrden);
            } catch (IOException | InterruptedException ex) {
                Logger.getLogger(OrdenesCola.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tablaOrdenMouseClicked

    private void btnPrepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrepararActionPerformed
        cambioEstado("prepared");
        limpiar();
        try {
            actualizarTabla();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(OrdenesCola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrepararActionPerformed

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        cambioEstado("complete");
        limpiar();
        try {
            actualizarTabla();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(OrdenesCola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEntregarActionPerformed

    void limpiar() {
        txtCliente.setText("");
        txtEstado.setText("");
        txtTotalPagar.setText("");
    }

    void cambioEstado(String estado) {
        int fila = tablaOrden.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila primero");
        } else {
            String idOrden = tablaOrden.getValueAt(fila, 0).toString();
            odao.actualizaEstado(idOrden, estado);
        }
    }

    void listar() throws IOException, InterruptedException {
        modeloOrden = (DefaultTableModel) tablaOrden.getModel();
        JSONObject jsonobject = odao.listar();
        JSONArray ordenesJS = jsonobject.getJSONArray("items");
        Object[] ob = new Object[2];

        int cont = 0;

        while (cont < ordenesJS.length()) {
            JSONObject ordenJS = ordenesJS.getJSONObject(cont);
            JSONArray productosJS = ordenJS.getJSONArray("items");

            if (ordenJS.getString("state").equals("pending")) {

                ob[0] = ordenJS.getString("id");
                ob[1] = ordenJS.get("user");

                modeloOrden.addRow(ob);
            }

            cont++;
        }

        tablaOrden.setModel(modeloOrden);
    }

    void listarVentas(String idOrden) throws IOException, InterruptedException {
        for (int i = 0; i < modeloVentas.getRowCount(); i++) {
            modeloVentas.removeRow(i);
            i = i - 1;
        }
        modeloVentas = (DefaultTableModel) tablaVentas.getModel();
        JSONObject jsonobject = odao.listar();
        JSONArray ordenesJS = jsonobject.getJSONArray("items");
        Object[] ob = new Object[5];

        float total = 0;
        int cont = 0;
        int cont2;

        while (cont < ordenesJS.length()) {
            JSONObject ordenJS = ordenesJS.getJSONObject(cont);
            JSONArray productosJS = ordenJS.getJSONArray("items");

            if (ordenJS.getString("id").equals(idOrden)) {

                cont2 = 0;

                while (cont2 < productosJS.length()) {
                    JSONObject productoJS = productosJS.getJSONObject(cont2);

                    String idProd = productoJS.getString("id");

                    if (idProd.equals("63dc592c-c1b7-4c7c-b85f-7bb64a0e63c5")) {
                        idProd = "acf82485-6c79-4968-8067-4c3b1aefe6b8";

                    }
                    int cantidad = productoJS.getInt("qty");

                    Ventas ventas = vdao.buscarVentasPorOrden(idProd, cantidad);

                    ob[0] = ventas.getProducto().getId();
                    ob[1] = ventas.getProducto().getNombre();
                    ob[2] = ventas.getCantidad();
                    ob[3] = ventas.getProducto().getPrecio();
                    ob[4] = ventas.getTotalVenta();

                    total = total + ventas.getTotalVenta();

                    modeloVentas.addRow(ob);
                    cont2++;
                }

            }

            cont++;
        }
        txtTotalPagar.setText("" + total);
        tablaVentas.setModel(modeloVentas);

    }

    void actualizarTabla() throws IOException, InterruptedException {
        for (int i = 0; i < modeloOrden.getRowCount(); i++) {
            modeloOrden.removeRow(i);
            i = i - 1;
        }
        for (int i = 0; i < modeloVentas.getRowCount(); i++) {
            modeloVentas.removeRow(i);
            i = i - 1;
        }
        listar();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntregar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnPreparar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaOrden;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
