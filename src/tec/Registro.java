
package tec;
//Se importa esto para escribir en el archivo creado el TecFrame
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {
    int Condición;

    public Registro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Sexo");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15-20", "21-25", "26-30", "31-35", "36-40", "41-45", "46-50", "51-55", "56-60" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Registrarse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(171, 171, 171))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String nombre = (jTextField1.getText());//Aquí irá el nombre
            String sexo = "Mas";//se definen las vairables a usar
            String edad="10";
            if (jComboBox4.getSelectedIndex()==0){//Elige la opcion del combobox
                sexo=" Masculino";
            }
            else if(jComboBox4.getSelectedIndex()==1){
                sexo=" Femenino";
            }
       
            if (jComboBox3.getSelectedIndex()==0){
                edad="  15-20";
            }
            else if(jComboBox3.getSelectedIndex()==1){
                edad="  16-20";
            }
            if (jComboBox3.getSelectedIndex()==2){
                edad=" 21-25";
            }
            else if(jComboBox3.getSelectedIndex()==3){
                edad=" 26-30";
            }
            if (jComboBox3.getSelectedIndex()==4){
                edad=" 31-35";
            }
            else if(jComboBox3.getSelectedIndex()==5){
                edad=" 36-40";
            }
            if (jComboBox3.getSelectedIndex()==6){
                edad=" 41-45";
            }
            else if(jComboBox3.getSelectedIndex()==7){
                edad=" 46-50";
            }
            if (jComboBox3.getSelectedIndex()==8){
                edad=" 51-55";
            }
            else if(jComboBox3.getSelectedIndex()==9){
                edad=" 66-60";
            }
       
        if (jTextField1.getText().equals("")){//Esto revisa si se deja en blanco la casilla nombre y si si, manda el mensaje de abajo
            JOptionPane.showMessageDialog(null,"No puede dejar en blanco la casilla: NOMBRE");
        }
        else{//si no hace todo esto
            try{
                File archivo =new File("C:\\Users\\alann\\Documents\\NetBeansProjects\\TEC\\src\\Registro\\archivo.txt");//gusrda los datos en el archivo indicado
                FileWriter escribir=new FileWriter(archivo,true);//Escribe
                escribir.write("Nombre: "+nombre+"    Género: "+sexo+"   Edad: "+edad+"/n");
                //Condición=1;
                //escribir.write("Nombre: "+nombre);
                //escribir.write(" Género: "+sexo);
                //escribir.write(" Edad: "+edad);
                escribir.write("\n");//Este salto de line no funciona
                escribir.close();
                System.out.println("Si se escribió");//si se escribe correctamente manda esto
            }catch(Exception e){
                System.out.println("Error al escribir");//si no, mandara esto
            }
            dispose();//cierra la pagina de registro para abrir la del mapa
            TecFrame buscar = new TecFrame();//abre el mapap
            buscar.show();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
