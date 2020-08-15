
package tec;

import java.io.*;
import java.io.IOException;



public class TecFrame extends javax.swing.JFrame {

    public TecFrame() {
        initComponents();
        File archivo;//Estas lineas de codigo crean el archivo txt
            try{
                archivo =new File("C:\\Users\\alann\\Documents\\NetBeansProjects\\TEC\\src\\Registro\\archivo.txt");//lo crea en el lugar asignado
                if (archivo.createNewFile()){//si se crea correctamentre pasa esto
                    System.out.println("Se creo el archivo");
                }
            }catch(IOException e){//si no se crea el archivo manda esto
                System.err.println("No se pudo crear el archivo");
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new java.awt.Button();
        jComboBox2 = new javax.swing.JComboBox();
        button3 = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 688));
        getContentPane().setLayout(null);

        button2.setLabel("Visualizar Tec");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2);
        button2.setBounds(780, 370, 220, 60);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Baños", "Edif 3. Salón Actividades Extraescolares", "Edif 4. Aulas, Departamento de ciencias básicas", "Edif 5. Aulas, Departamento de ciencias básicas", "Edif 6. Aulas, Departamento de metal mecánica", "Edif 7. Departamento de ciencias económico administrativas", "Edif 8. Sindicato, Consultorio médico, Departamento de vinculación", "Edif 9. Sala de usos múltiples 1, Baños H y Mm Sala audiovisual", "Edif 10. CESAIT. Aulas, laboratorio de matemáticas, Departamento de ciencias básicas, Baño M", "Edif 11. Departamento de desarrollo académico, Laboratorio de física", "Edif 13.Departamento de metal mecánica", "Edif 14. Centro de información, Sala magna", "Edif 15. Departamento de eléctrica y electrónica", "Edif 16. Cafetería, Departamento de mantenimiento, Departamento de recursos materiales y servicios", "Edif 17. Sala de usos múltiples 2, Laboratorio de química ambiental", "Edif 18. Laboratorio de química, Departamento de ingeniería química", "Edif 19. Aulas, departamento del S.G.A, S.G.C, Baños H y M", "Edif 20. Aulas", "Edif 21. Laboratorio de invernadero, Departamento de idiomas y aulas, cubículos de ciencias básicas", "Edif 23. Centro de cómputo, Tutorías", "Edif 24 y 25. Laboratorios de Ingeniería Civil", "Edif 26. Laboratorio de alimentos, Subestación y Almacén", "Edif 27. Aulas, oficina incubadora de empresas", "Edif 28. Laboratorio de biología, Departamento de ingeniería boiquímica", "Edif 29. Laboratorio de dibujo, Ingeniería civil, Laboratorio de idiomas, Gimnasio", "Edif 30. Edificio administrativo", "Edif 33. Departamento de actividades extraescolares", "Edif 34. Aulas, departamento de ingeniería industrial", "Edif 35. Departamento de ingeniería industrial y Logística", "Edif 37. Departamento de ciencias de la tierra, Ingeniería en Sistemas Computacionales, Ingeniería civil, Posgrado", "Edif 38. Departamento de bioquímica  " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(780, 260, 570, 20);

        button3.setLabel("Generar ruta. ");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3);
        button3.setBounds(780, 290, 220, 60);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1318, 982, 34, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DOCUMENTACIÓN 2/WhatsApp_Image_2017-04-02_at_01 (1).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 10, 740, 700);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("Tecnológico Nacional de México");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(790, 10, 480, 60);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Instituto Tecnológico de Tehuacán");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(780, 80, 500, 30);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel5.setText("Elegir destino");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(780, 210, 160, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        Mapa_Del_Tec mapa = new Mapa_Del_Tec();
        mapa.show();        //Muestra una ventana
    }//GEN-LAST:event_button2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // no sirve de nada, pero ya no se puede quitar
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        
        if (jComboBox2.getSelectedIndex()==0){//COn esto se da la funcion al combobox
            Baños_Ac baños= new  Baños_Ac();
            baños.show();
        } // TODO add your handling code here:
        if (jComboBox2.getSelectedIndex()==1){//COn esto se da la funcion al combobox
            Ofic_extraes_Ac extra= new  Ofic_extraes_Ac();
            extra.show();
        }
        if (jComboBox2.getSelectedIndex()==2){//COn esto se da la funcion al combobox
            Edif_4 edif= new  Edif_4 ();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==3){//COn esto se da la funcion al combobox
            Edificio_5 edificio= new Edificio_5();
            edificio.show();
        }
        if (jComboBox2.getSelectedIndex()==4){//COn esto se da la funcion al combobox
            Edif_6 edifi= new  Edif_6();
            edifi.show();
        }
      
        if (jComboBox2.getSelectedIndex()==5){//COn esto se da la funcion al combobox
            Dept_licenciaturas_Ac edif= new  Dept_licenciaturas_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==6){//COn esto se da la funcion al combobox
            Sindicato edif= new  Sindicato();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==7){//COn esto se da la funcion al combobox
            Sala_usos_mult_Ac edif= new  Sala_usos_mult_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==8){//COn esto se da la funcion al combobox
            CESAIT_Ac edif= new  CESAIT_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==9){//COn esto se da la funcion al combobox
            Desarrollo_Ac edif= new  Desarrollo_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==10){//COn esto se da la funcion al combobox
            Metal_mecanica edif= new  Metal_mecanica();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==11){//COn esto se da la funcion al combobox
            Centro_de_informacion_Ac edif= new Centro_de_informacion_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==12){//COn esto se da la funcion al combobox
            Electrónica_Ac edif= new Electrónica_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==13){//COn esto se da la funcion al combobox
            Cafete_Ac edif= new Cafete_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==14){//COn esto se da la funcion al combobox
            Sala_de_usos_múltiples_2 edif= new Sala_de_usos_múltiples_2();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==15){//COn esto se da la funcion al combobox
            Laborat_de_química edif= new Laborat_de_química();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==16){//COn esto se da la funcion al combobox
            SGA_SGC edif= new SGA_SGC();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==17){//COn esto se da la funcion al combobox
            Edif_20_Aulas_Ac edif= new  Edif_20_Aulas_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==18){//COn esto se da la funcion al combobox
            Invernadero_Ac edif= new  Invernadero_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==19){//COn esto se da la funcion al combobox
            Centro_cómputo edif= new  Centro_cómputo();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==20){//COn esto se da la funcion al combobox
            Lab_ingenie_civil_Ac edif= new  Lab_ingenie_civil_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==21){//COn esto se da la funcion al combobox
            Lab_alimentos_Ac edif= new  Lab_alimentos_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==22){//COn esto se da la funcion al combobox
            Ofic_incubadora_Ac edif= new  Ofic_incubadora_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==23){//COn esto se da la funcion al combobox
            Lab_biología_Ac edif= new  Lab_biología_Ac();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==24){//COn esto se da la funcion al combobox
            Lab_dibujo_Ac edif= new  Lab_dibujo_Ac ();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==25){//COn esto se da la funcion al combobox
            Edif_adminis_Ac edif= new  Edif_adminis_Ac ();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==26){//COn esto se da la funcion al combobox
            Dep_act_extra_Ac edif= new  Dep_act_extra_Ac ();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==27){//COn esto se da la funcion al combobox
            Edfi_34 edif= new  Edfi_34 ();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==28){//COn esto se da la funcion al combobox
            Industrial edif= new  Industrial ();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==29){//COn esto se da la funcion al combobox
            Edif_37 edif= new  Edif_37();
            edif.show();
        }
        if (jComboBox2.getSelectedIndex()==30){//COn esto se da la funcion al combobox
            Bioquimica_Ac edif= new  Bioquimica_Ac();
            
            edif.show();
        }
    }//GEN-LAST:event_button3ActionPerformed

    /**Esto se puso solo
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
            java.util.logging.Logger.getLogger(TecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TecFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
