package interfaz;

import entidades.*;

public class FormMenu extends javax.swing.JFrame {

    private Curso curso;

    public FormMenu() {
        initComponents();
        curso = new Curso("LC3");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNuevoAlumno = new javax.swing.JMenuItem();
        menuBuscarAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opcPromedios = new javax.swing.JMenuItem();
        opcListado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Alumno");

        menuNuevoAlumno.setText("Cargar Alumno");
        menuNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(menuNuevoAlumno);

        menuBuscarAlumno.setText("Buscar Alumno");
        menuBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(menuBuscarAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");

        opcPromedios.setText("Promedios");
        opcPromedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcPromediosActionPerformed(evt);
            }
        });
        jMenu2.add(opcPromedios);

        opcListado.setText("Listado");
        opcListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcListadoActionPerformed(evt);
            }
        });
        jMenu2.add(opcListado);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoAlumnoActionPerformed
        FormAltaAlumno ventana = new FormAltaAlumno(curso, null);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuNuevoAlumnoActionPerformed

    private void menuBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarAlumnoActionPerformed
        FormBusqueda b = new FormBusqueda(curso);
        b.setVisible(true);
    }//GEN-LAST:event_menuBuscarAlumnoActionPerformed

    private void opcPromediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcPromediosActionPerformed
        FormReportes r = new FormReportes(curso);
        r.setVisible(true);
    }//GEN-LAST:event_opcPromediosActionPerformed

    private void opcListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcListadoActionPerformed
        FormListado f = new FormListado(curso);
        f.setVisible(true);
    }//GEN-LAST:event_opcListadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuBuscarAlumno;
    private javax.swing.JMenuItem menuNuevoAlumno;
    private javax.swing.JMenuItem opcListado;
    private javax.swing.JMenuItem opcPromedios;
    // End of variables declaration//GEN-END:variables
}
