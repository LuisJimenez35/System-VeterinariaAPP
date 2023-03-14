/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PanelAdministrador;

import Datos.Alimento;
import Datos.ArrayNuevos;
import Datos.Limpieza;
import Datos.MedPreven;
import Datos.MediRece;
import Datos.ToysDat;
import Medicamentos.Accesorios.MedicamentosPreventivos;
import javax.swing.JOptionPane;
import java.lang.Integer;
import proyectofinal.VprincipalMedicamenros;

/**
 *
 * @author xerkl
 */
public class RegistrarInventario extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarInventario
     */
    public RegistrarInventario() {
        initComponents();
        
    }
    public void agregar(){
        String Nombre = txtNombreProducto.getText();
        String Descripcion = txtDescripcionProducto.getText();
        int precio = Integer.parseInt(txtPrecio.getText());
        if (Combo1.getSelectedItem().equals("Medicamentos Preventivos")) {
            MedPreven agregarMD = new MedPreven();
            agregarMD.setNombre(Nombre);
            agregarMD.setValor(Descripcion);
            agregarMD.setPrecio(precio);
            ArrayNuevos.NuevosMedicamentos.add(agregarMD);
            txtNombreProducto.setText(null);
            txtDescripcionProducto.setText(null);
            txtPrecio.setText(null);
            JOptionPane.showMessageDialog(rootPane, "Producto agregado");
        }
        else if (Combo1.getSelectedItem().equals("Alimentos")) {
           Alimento agregarAlimento = new Alimento();

            agregarAlimento.setNombre(Nombre);
            agregarAlimento.setValor(Descripcion);
            agregarAlimento.setPrecio(precio);
            ArrayNuevos.NuevoAlimento.add(agregarAlimento);
            txtNombreProducto.setText(null);
            txtDescripcionProducto.setText(null);
            txtPrecio.setText(null);
            JOptionPane.showMessageDialog(rootPane, "Producto agregado"); 
        }
        else if (Combo1.getSelectedItem().equals("Limpieza/Higiene")) {
            Limpieza agregarL = new Limpieza();
            agregarL.setNombre(Nombre);
            agregarL.setValor(Descripcion);
            agregarL.setPrecio(precio);txtNombreProducto.setText(null);
            txtDescripcionProducto.setText(null);
            txtPrecio.setText(null);
            JOptionPane.showMessageDialog(rootPane, "Producto agregado"); 
            
            
        }
        else if (Combo1.getSelectedItem().equals("Juguetes")) {
            ToysDat agregarT = new ToysDat();
            agregarT.setNombre(Nombre);
            agregarT.setValor(Descripcion);
            agregarT.setPrecio(precio);
            txtNombreProducto.setText(null);
            txtDescripcionProducto.setText(null);
            txtPrecio.setText(null);
            JOptionPane.showMessageDialog(rootPane, "Producto agregado");
        }
        else if (Combo1.getSelectedItem().equals("Medicamentos Recetados")) {
            MediRece agregarMR = new MediRece();
            agregarMR.setNombre(Nombre);
            agregarMR.setPrecio(precio);
            txtNombreProducto.setText(null);
            txtDescripcionProducto.setText(null);
            txtPrecio.setText(null);
            JOptionPane.showMessageDialog(rootPane, "Producto agregado");
            
            
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtDescripcionProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        Combo1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de inventario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del producto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción del producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Añadir a:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 157, -1));
        getContentPane().add(txtDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 157, 20));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 157, -1));

        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicamentos Preventivos", "Alimentos", "Limpieza/Higiene", "Juegetes", "Medicamentos Recetados" }));
        Combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo1ActionPerformed(evt);
            }
        });
        getContentPane().add(Combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 157, -1));

        jButton1.setText("AñadirProducto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, 42));

        jLabel7.setText("®MyPets");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN Volcer.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/abstract-technology-futuristic-hexagon-overlapping-pattern-with-blue-light-effect-on-dark-blue-background-free-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VprincipalMedicamenros k = new VprincipalMedicamenros();
        k.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        Botones bim = new Botones();
        bim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(RegistrarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
