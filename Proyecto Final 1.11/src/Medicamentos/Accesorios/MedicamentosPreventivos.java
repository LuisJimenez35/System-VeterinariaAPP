/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Medicamentos.Accesorios;

import Datos.ArrayNuevos; 
import Datos.CarritodeCompras;
import Datos.MedPreven;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import proyectofinal.VprincipalMedicamenros;

/**
 *
 * @author LuisM
 */
public class MedicamentosPreventivos extends javax.swing.JFrame {

    /**
     * Creates new form MedicamentosPreventivos
     */
    DefaultTableModel modeloMD = new DefaultTableModel();
    public MedicamentosPreventivos() {
        this.setUndecorated(true);
        initComponents();
        medptab.setModel(modeloMD);
        modeloMD.addColumn("Marca");
        modeloMD.addColumn("Descripción");
        modeloMD.addColumn("Precio");
        cargarDatos();
    }
    public void cargarDatos(){
        if (ArrayNuevos.NuevosMedicamentos.size() == 0) {

        MedPreven m1 = new MedPreven();
        m1.setNombre("Balance");
        m1.setValor("Vitaminas y Minerales");
        m1.setPrecio(15000);
        
        MedPreven m2 = new MedPreven();
        m2.setNombre("BuddyTabs");
        m2.setValor("Enzimas Digestivas");
        m2.setPrecio(10000);
        
        MedPreven m3 = new MedPreven();
        m3.setNombre("Cardial");
        m3.setValor("B 2.5");
        m3.setPrecio(20000);
        
        MedPreven m4 = new MedPreven();
        m4.setNombre("Dolo-Vet");
        m4.setValor("Otico");
        m4.setPrecio(30000);
        
        MedPreven m5 = new MedPreven();
        m5.setNombre("Dolo-Vet");
        m5.setValor("Tabletas");
        m5.setPrecio(23000);
        ArrayNuevos.NuevosMedicamentos.add(m1);
        ArrayNuevos.NuevosMedicamentos.add(m2);
        ArrayNuevos.NuevosMedicamentos.add(m3);
        ArrayNuevos.NuevosMedicamentos.add(m4);
        ArrayNuevos.NuevosMedicamentos.add(m5);
        
        
        }
        modeloMD.setRowCount(0);
        
        
        for (int i = 0; i < ArrayNuevos.NuevosMedicamentos.size(); i++) {

           modeloMD.addRow(new Object[]{
           ArrayNuevos.NuevosMedicamentos.get(i).getNombre(),
           ArrayNuevos.NuevosMedicamentos.get(i).getValor(),
           ArrayNuevos.NuevosMedicamentos.get(i).getPrecio()
                 
        }); 
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        medptab = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Medicamentos Preventivos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        medptab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Marca", "Descripcion", "Precio"
            }
        ));
        jScrollPane1.setViewportView(medptab);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 360, 300));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN Volcer.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 70, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 2, 13)); // NOI18N
        jLabel4.setText("Volver");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 50, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 13)); // NOI18N
        jLabel5.setText("Agregar Producto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 130, -1));

        btnCarrito.setText("Agregar");
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Geometry_Texture_Blue_Light_Blue_White_background_586221_1280x791.jpg"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(580, 360));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        VprincipalMedicamenros vpmed = new VprincipalMedicamenros();
        vpmed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        
        int indice = medptab.getSelectedRow();
        String nombre = ArrayNuevos.NuevosMedicamentos.get(indice).getNombre();
        String valor = ArrayNuevos.NuevosMedicamentos.get(indice).getValor();
        int precio = ArrayNuevos.NuevosMedicamentos.get(indice).getPrecio();
        
        
        
        SpinnerNumberModel sModel = new SpinnerNumberModel(1, 0, 30, 1);
        JSpinner spinner = new JSpinner(sModel);
        int option = JOptionPane.showOptionDialog(null, spinner, "Seleccione las unidades que desea agregar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (option == JOptionPane.CANCEL_OPTION){
            System.out.println("El cliente canceló la operación");
        } 
        else if (option == JOptionPane.OK_OPTION){
            int cantidad = (Integer)spinner.getValue();
            int total = precio*cantidad;

            CarritodeCompras producto = new CarritodeCompras();
            //Instanciar objeto
            producto.setNombre(nombre);
            producto.setValor(valor);
            producto.setPrecio(total);
            producto.setCantidad(cantidad);
            ArrayNuevos.nuevosCarritodeCompras.add(producto);
            JOptionPane.showMessageDialog(null,"Su producto se agrego al carrito");
        }
    }//GEN-LAST:event_btnCarritoActionPerformed

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
            java.util.logging.Logger.getLogger(MedicamentosPreventivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicamentosPreventivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicamentosPreventivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicamentosPreventivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicamentosPreventivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medptab;
    // End of variables declaration//GEN-END:variables
}
