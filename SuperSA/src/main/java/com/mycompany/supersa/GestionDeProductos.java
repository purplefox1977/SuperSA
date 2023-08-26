/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.supersa;

import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Loboplateado77
 */
public class GestionDeProductos extends javax.swing.JInternalFrame {
 TreeSet<Integer> numero = new TreeSet<>();
        
    /**
     * Creates new form GestionDeProductos
     */
    public GestionDeProductos() {
        initComponents();
        cargarCombo(); // secarga el combobox --> categoria enum
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBmodificarProducto = new javax.swing.JButton();
        jBagregarProducto = new javax.swing.JButton();
        jBeliminarProducto = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jTcodigo = new javax.swing.JTextField();
        jTdescripcion = new javax.swing.JTextField();
        jTprecio = new javax.swing.JTextField();
        jTstock = new javax.swing.JTextField();
        jCBRubro = new javax.swing.JComboBox<>();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Gestion de Productos");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Rubro");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Stock");

        jBmodificarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBmodificarProducto.setForeground(new java.awt.Color(0, 153, 204));
        jBmodificarProducto.setText("Modificar");
        jBmodificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarProductoActionPerformed(evt);
            }
        });

        jBagregarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBagregarProducto.setForeground(new java.awt.Color(0, 153, 204));
        jBagregarProducto.setText("Agregar");
        jBagregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarProductoActionPerformed(evt);
            }
        });

        jBeliminarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBeliminarProducto.setForeground(new java.awt.Color(204, 0, 102));
        jBeliminarProducto.setText("Eliminar");
        jBeliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarProductoActionPerformed(evt);
            }
        });

        jBsalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBsalir.setText("Salir");

        jCBRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBRubroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jBmodificarProducto)
                .addGap(67, 67, 67)
                .addComponent(jBagregarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jBeliminarProducto)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTcodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(jTdescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTprecio, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jTstock, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jTstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBmodificarProducto)
                    .addComponent(jBagregarProducto)
                    .addComponent(jBeliminarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBRubroActionPerformed
        // TODO add your handling code here:
        // seleccione la categoria deseada del combobox
        String categoria = jCBRubro.getSelectedItem().toString();
    }//GEN-LAST:event_jCBRubroActionPerformed

    private void jBagregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarProductoActionPerformed
        // TODO add your handling code here:
        try{
            int     codigo = Integer.parseInt(jTcodigo.getText());
            int     stock  = Integer.parseInt(jTstock.getText());
            double  precio = Double.parseDouble(jTprecio.getText());
            // que los campos no esten vascios
                if(jTdescripcion.getText().isEmpty()|| jCBRubro.toString().isEmpty()){
                    JOptionPane.showMessageDialog(this,"El campo no puede estar vacio");
                    return;
                }
            String  descripcion = jTdescripcion.getText();    
            String  rubro  = jCBRubro.getSelectedItem().toString();
        }catch(NumberFormatException nf){
                 JOptionPane.showMessageDialog(this," Ingrese un valor numerico");
        }
    }//GEN-LAST:event_jBagregarProductoActionPerformed

    private void jBmodificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarProductoActionPerformed
        // TODO add your handling code here:
       
        int codigo  = Integer.parseInt(jTcodigo.getText());
        //if (jTcodigo.equals(codigo)) {
        if (Menu.listaProductos.equals(codigo)) {
            int     stock  = Integer.parseInt(jTstock.getText());
            double  precio = Double.parseDouble(jTprecio.getText());
              
        }
    }//GEN-LAST:event_jBmodificarProductoActionPerformed

    private void jBeliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarProductoActionPerformed
        // TODO add your handling code here:
        
            int codigo  = Integer.parseInt(jTcodigo.getText());
            int stock   = Integer.parseInt(jTstock.getText());
            double precio  = Double.parseDouble(jTprecio.getText());
            String  descripcion = jTdescripcion.getText();    
            String  rubro  = jCBRubro.getSelectedItem().toString();
            
            //eliminar datos
                
            if (Menu.listaProductos.equals(codigo)) {
                jTcodigo.setText("");
                jTstock.setText("");
                jTprecio.setText("");
                jTdescripcion.getText();    
                jCBRubro.getSelectedItem();
               }
          
          
    }//GEN-LAST:event_jBeliminarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregarProducto;
    private javax.swing.JButton jBeliminarProducto;
    private javax.swing.JButton jBmodificarProducto;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCBRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTdescripcion;
    private javax.swing.JTextField jTprecio;
    private javax.swing.JTextField jTstock;
    // End of variables declaration//GEN-END:variables
    //cargo el combobox y luego lo inicializo
    public void cargarCombo(){

            jCBRubro.addItem("");
            Categoria[] categoriaList=Categoria.values();
            for( Categoria categoria: categoriaList){
            jCBRubro.addItem(String.valueOf(categoria));
        }
    }
//    private void buscarFilas(){
//        int  filas =Menu.listaProductos. jTProductos.getRowCount()-1;
//        for(int f = filas;f >=0;f--){
//            modelo.removeRow(f);    
//        }
//    }
    
}
