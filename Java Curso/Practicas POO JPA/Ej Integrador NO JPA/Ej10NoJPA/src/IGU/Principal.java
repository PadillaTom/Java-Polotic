package IGU;

import Logica.Controladora;

public class Principal extends javax.swing.JFrame {
    // *** Globals ***
    Controladora myController;
    
    public Principal(Controladora ctrl) {
        this.myController = ctrl;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelTitle = new javax.swing.JLabel();
        LabelSubtitle = new javax.swing.JLabel();
        AddNewAlumno = new javax.swing.JButton();
        ViewAlumnosActuales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        LabelTitle.setText("Bienvenidos a la Gestion Alumnos");

        LabelSubtitle.setText("Elija la Opcion que desea realizar: ");

        AddNewAlumno.setText("Nuevo Alumno");
        AddNewAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewAlumnoActionPerformed(evt);
            }
        });

        ViewAlumnosActuales.setText("Ver Alumnos Actuales");
        ViewAlumnosActuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAlumnosActualesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(LabelTitle)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewAlumnosActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddNewAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSubtitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(LabelTitle)
                .addGap(51, 51, 51)
                .addComponent(LabelSubtitle)
                .addGap(41, 41, 41)
                .addComponent(AddNewAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewAlumnosActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void ViewAlumnosActualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAlumnosActualesActionPerformed
        // Llamar VerAlumnos:
        VerAlumnos alumnosScreen = new VerAlumnos(myController);
        alumnosScreen.setVisible(true);
        alumnosScreen.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_ViewAlumnosActualesActionPerformed

    private void AddNewAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewAlumnoActionPerformed
        // Llamar NuevoAlumno:
        NuevoAlumno nuevoAlumnoScreen = new NuevoAlumno(myController);
        nuevoAlumnoScreen.setVisible(true);
        nuevoAlumnoScreen.setLocationRelativeTo(null);
        
        //Cerrar Ventana una vez abierto:
        this.dispose();        
    }//GEN-LAST:event_AddNewAlumnoActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewAlumno;
    private javax.swing.JLabel LabelSubtitle;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JButton ViewAlumnosActuales;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
