package IGU;

import Logica.ControladoraCliente;

public class PantallaCarga extends javax.swing.JFrame {
    ControladoraCliente clienteController;

    public PantallaCarga() {
        clienteController = new ControladoraCliente();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        mainTitle = new javax.swing.JLabel();
        dogImage = new javax.swing.JLabel();
        labelNumeroCliente = new javax.swing.JLabel();
        labelNombrePerro = new javax.swing.JLabel();
        labelRazaPerro = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelAlergico = new javax.swing.JLabel();
        labelAtencionEspecial = new javax.swing.JLabel();
        labelNombreDuenio = new javax.swing.JLabel();
        labelCelDuenio = new javax.swing.JLabel();
        labelObservaciones = new javax.swing.JLabel();
        txtNumCliente = new javax.swing.JTextField();
        txtNombrePerro = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtCelularDuenio = new javax.swing.JTextField();
        txtNombreDuenio = new javax.swing.JTextField();
        cmbAlergico = new javax.swing.JComboBox<>();
        cmbAtencionEspecial = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnAgregarCliente = new javax.swing.JButton();
        btnLimpiarFormulario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainTitle.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(153, 51, 255));
        mainTitle.setText("Peluqueria Canina");

        dogImage.setIcon(new javax.swing.ImageIcon("/Users/padillatom/PadillaTom/Asset 4.png")); // NOI18N

        labelNumeroCliente.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        labelNumeroCliente.setText("Cliente N°: ");

        labelNombrePerro.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        labelNombrePerro.setText("Nombre: ");

        labelRazaPerro.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        labelRazaPerro.setText("Raza: ");

        labelColor.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        labelColor.setText("Color: ");

        labelAlergico.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        labelAlergico.setText("Alergico:");

        labelAtencionEspecial.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        labelAtencionEspecial.setText("Atencion Especial: ");

        labelNombreDuenio.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        labelNombreDuenio.setText("Nombre Dueño:");

        labelCelDuenio.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        labelCelDuenio.setText("Cel. Dueño:");

        labelObservaciones.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        labelObservaciones.setText("Observaciones: ");

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alergico?", "Si", "No" }));

        cmbAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atencion Especial?", "Si", "No" }));

        txtObservaciones.setColumns(15);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        btnAgregarCliente.setText("Agregar Nuevo Cliente");
        btnAgregarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        btnLimpiarFormulario.setText("Limpiar Formulario");
        btnLimpiarFormulario.setBorderPainted(false);
        btnLimpiarFormulario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarFormularioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(mainTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelObservaciones)
                    .addComponent(labelNombrePerro)
                    .addComponent(labelNumeroCliente)
                    .addComponent(labelRazaPerro)
                    .addComponent(labelColor)
                    .addComponent(labelAlergico)
                    .addComponent(labelAtencionEspecial)
                    .addComponent(labelNombreDuenio)
                    .addComponent(labelCelDuenio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombrePerro)
                    .addComponent(txtRaza)
                    .addComponent(txtColor)
                    .addComponent(txtCelularDuenio)
                    .addComponent(txtNombreDuenio)
                    .addComponent(txtNumCliente)
                    .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addComponent(dogImage)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarFormulario)
                    .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(261, 261, 261))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(mainTitle)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(txtNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNumeroCliente)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombrePerro)
                            .addComponent(txtNombrePerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRazaPerro)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAlergico)
                            .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAtencionEspecial))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombreDuenio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelularDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCelDuenio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(dogImage, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObservaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiarFormulario)
                .addContainerGap(24, Short.MAX_VALUE))
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

// *** Limpiar Formulario ***
    private void btnLimpiarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarFormularioActionPerformed
        txtNumCliente.setText("");
        txtNombrePerro.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtencionEspecial.setSelectedIndex(0);
        txtNombreDuenio.setText("");
        txtCelularDuenio.setText("");
        txtObservaciones.setText("");        
    }//GEN-LAST:event_btnLimpiarFormularioActionPerformed
// *** Agregar Cliente ***
    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        int num_cliente = Integer.parseInt(txtNumCliente.getText());
        String nombre_perro = txtNombrePerro.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String alergico = (String )cmbAlergico.getSelectedItem();
        String atencion_especial = (String) cmbAtencionEspecial.getSelectedItem();
        String nombre_duenio = txtNombreDuenio.getText();
        String celular_duenio = txtCelularDuenio.getText();
        String observaciones = txtObservaciones.getText();        
        
        clienteController.altaCliente(num_cliente, nombre_perro, raza, color, alergico, atencion_especial, nombre_duenio, celular_duenio, observaciones);
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnLimpiarFormulario;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JLabel dogImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel labelAlergico;
    private javax.swing.JLabel labelAtencionEspecial;
    private javax.swing.JLabel labelCelDuenio;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelNombreDuenio;
    private javax.swing.JLabel labelNombrePerro;
    private javax.swing.JLabel labelNumeroCliente;
    private javax.swing.JLabel labelObservaciones;
    private javax.swing.JLabel labelRazaPerro;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JTextField txtCelularDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombrePerro;
    private javax.swing.JTextField txtNumCliente;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
