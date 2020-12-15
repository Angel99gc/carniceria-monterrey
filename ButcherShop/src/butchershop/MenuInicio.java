/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package butchershop;

import java.io.File;
import butchershop.Excel;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
/**
 *
 * @author Angel
 */
public class MenuInicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public MenuInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jButton1.setText("Cuenta diaria");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jButton2.setText("Administrar Cuentas");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jButton3.setText("Agregar Res");
        jButton3.setEnabled(false);

        jButton4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jButton4.setText("Agregar Cerdo");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //BOTON PARA INICIAR DIA.
        try{
            Date fecha = new Date();
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
            String fechaHoy = dateFormat.format(fecha); 
            //cargando.setVisible(true);
            Excel documento = this.newDocument(fechaHoy);
            //cargando.setVisible(false);
            if(documento!=null){

                IniciarDia ventaDiaria = new IniciarDia(this, documento);
                ventaDiaria.setVisible(true);
                this.setVisible(false);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: "+e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //Funciones utilizadas en la vista 

    

     /*
    *Crea el documento a editar.
    *@param:
    *@return: boolean exist - True si existe y False si No existe
    */
    public Excel newDocument(String fechaHoy){
        try{    
            
            List meses = Arrays.asList("1.Enero", "2.Febrero", "3.Marzo", "4.Abril", "5.Mayo", "6.Junio","7.Julio","8.Agosto","9.Septiembre", "10.Octubre", "11.Noviembre","12.Diciembre");
            int indexMes = Integer.parseInt(fechaHoy.split("-")[1]) - 1;
            File f = new File("C:/Users/Angel/Desktop/"+ fechaHoy.split("-")[2] +"/"+ meses.get(indexMes) +".xlsx");
            if(f.exists()){
                Excel documento = new Excel("C:/Users/Angel/Desktop/"+ fechaHoy.split("-")[2] +"/"+ meses.get(indexMes) +".xlsx", fechaHoy);
                return documento;
            }else{
                JOptionPane.showMessageDialog(this, "Papi el archivo base del mes en Excel no existe. Llame al 87070795" );
                return null;
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(this, "Error de tipo: "+ e.toString());
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}