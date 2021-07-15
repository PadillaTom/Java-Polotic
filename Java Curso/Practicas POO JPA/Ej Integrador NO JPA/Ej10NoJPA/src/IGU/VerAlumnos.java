package IGU;

import Logica.Alumno;
import Logica.Controladora;


public class VerAlumnos extends javax.swing.JFrame {
    Controladora myController;
    
    public VerAlumnos(Controladora ctrl) {
        this.myController = ctrl;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelTitle = new javax.swing.JLabel();
        LabelDato1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        LabelDato2 = new javax.swing.JLabel();
        LabelDato3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        NextBtn = new javax.swing.JButton();
        PrevBtn1 = new javax.swing.JButton();
        showIndex = new javax.swing.JTextField();
        menuPrincipalBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        LabelTitle.setText("Ver Alumnos");

        LabelDato1.setText("DNI: ");

        txtDni.setEditable(false);

        txtApellido.setEditable(false);

        LabelDato2.setText("Apellido: ");

        LabelDato3.setText("Nombre: ");

        txtNombre.setEditable(false);

        NextBtn.setText(">>");
        NextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBtnActionPerformed(evt);
            }
        });

        PrevBtn1.setText("<<");
        PrevBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevBtn1ActionPerformed(evt);
            }
        });

        showIndex.setEditable(false);
        showIndex.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        showIndex.setText("0");

        menuPrincipalBtn.setText("Menu Principal");
        menuPrincipalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(PrevBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(showIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(NextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(LabelTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelDato3)
                            .addComponent(LabelDato1)
                            .addComponent(LabelDato2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDni)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(menuPrincipalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(LabelTitle)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDato1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDato2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDato3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrevBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(menuPrincipalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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

    private void menuPrincipalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalBtnActionPerformed
        // Back to Main Screen:
        Principal backToMain = new Principal(myController);
        backToMain.setVisible(true);
        backToMain.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuPrincipalBtnActionPerformed

    private void NextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBtnActionPerformed
        // Tomar Index :
        int myIndex = Integer.parseInt(showIndex.getText());
        myIndex = myIndex +1;
        
        if( myIndex<4 ){
            showIndex.setText(Integer.toString(myIndex));       
        
            // Pedir Alumno por dicho Index:
            Alumno myAlumno = myController.traerAlumno(myIndex);

            // Mostramos la data: SetText()
            txtDni.setText(Integer.toString(myAlumno.getDni()));
            txtApellido.setText(myAlumno.getApellido());
            txtNombre.setText(myAlumno.getNombre()); 
        }
    }//GEN-LAST:event_NextBtnActionPerformed

    private void PrevBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevBtn1ActionPerformed
        // Tomar Index :
        int myIndex = Integer.parseInt(showIndex.getText());
        myIndex = myIndex -1;
        
        if(myIndex >= 0){        
            showIndex.setText(Integer.toString(myIndex));
            // Pedir Alumno por dicho Index:
            Alumno myAlumno = myController.traerAlumno(myIndex);

            // Mostramos la data: SetText()
            txtDni.setText(Integer.toString(myAlumno.getDni()));
            txtApellido.setText(myAlumno.getApellido());
            txtNombre.setText(myAlumno.getNombre()); 
        }
    }//GEN-LAST:event_PrevBtn1ActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDato1;
    private javax.swing.JLabel LabelDato2;
    private javax.swing.JLabel LabelDato3;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JButton NextBtn;
    private javax.swing.JButton PrevBtn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menuPrincipalBtn;
    private javax.swing.JTextField showIndex;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
