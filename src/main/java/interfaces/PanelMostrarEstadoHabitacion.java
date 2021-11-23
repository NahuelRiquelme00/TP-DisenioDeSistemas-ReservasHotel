/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces;

import dao.HabitacionDAO;
import daoImpl.HabitacionDAOImpl;
import entidades.Habitacion;
import gestores.GestorDeAlojamientos;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import misc.GroupableTableHeader;
import misc.ColumnGroup;

/**
 *
 * @author Federico Pacheco
 */
public class PanelMostrarEstadoHabitacion extends javax.swing.JPanel {

    /**
     * Creates new form PanelMostrarEstadoHabitacion
     */
    public PanelMostrarEstadoHabitacion() {
        initComponents();
        configurarTabla();
    }

    private void configurarTabla() {
        
   //buscarHabitacionesAgrupadasPorTipoHabitacion();estos son las columnas
   //buscarTipoHabitacion();estos son los grupos
   
   //http://www.java2s.com/Code/Java/Swing-Components/GroupableGroupHeaderExample.htm
   
   String[] habitaciones = new String[]{"H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "H11", "H12", "H13", "H14", "H15", "H16", "H17", "H18", "H19", "H20", "H21", "H22", "H23", "H24", "H25", "H26", "H27", "H28", "H29", "H30", "H31", "H32", "H33", "H34", "H35", "H36", "H37", "H38", "H39", "H40", "H41", "H42", "H43", "H44", "H45", "H46", "H47", "H48"};
   
   modeloTabla.addColumn("Fecha");
   
   for(String h : habitaciones) {
       modeloTabla.addColumn(h);
   }
    

    TableColumnModel cm = tablaEstadoHabitaciones.getColumnModel();
    ColumnGroup g_individualEstandar = new ColumnGroup("Individual Estándar");
    
    for(int i=1; i<=10; i++){
    g_individualEstandar.add(cm.getColumn(i));
    }
    
    ColumnGroup g_dobleEstandar = new ColumnGroup("Doble Estándar");
    for(int i=11; i<=28; i++){
    g_dobleEstandar.add(cm.getColumn(i));
    }
    
    ColumnGroup g_dobleSuperior = new ColumnGroup("Doble Superior");
    for(int i=29; i<=36; i++){
    g_dobleSuperior.add(cm.getColumn(i));
    }
    
    ColumnGroup g_superiorFamilyPlan = new ColumnGroup("Superior Family Plan");
    for(int i=37; i<=46; i++){
    g_superiorFamilyPlan.add(cm.getColumn(i));
    }
    
    ColumnGroup g_suiteDoble = new ColumnGroup("Suite Doble");
    for(int i=47; i<=48; i++){
    g_suiteDoble.add(cm.getColumn(i));
    }
    
    GroupableTableHeader header = (GroupableTableHeader)tablaEstadoHabitaciones.getTableHeader();
    header.addColumnGroup(g_individualEstandar);
    header.addColumnGroup(g_dobleEstandar);
    header.addColumnGroup(g_dobleSuperior);
    header.addColumnGroup(g_superiorFamilyPlan);
    header.addColumnGroup(g_suiteDoble);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelRangoFechas = new javax.swing.JPanel();
        lblFechaDesde = new javax.swing.JLabel();
        lblFechaHasta = new javax.swing.JLabel();
        dpFechaDesde = new com.toedter.calendar.JDateChooser();
        dpFechaHasta = new com.toedter.calendar.JDateChooser();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        lblOcupada = new javax.swing.JLabel();
        lblDisponible = new javax.swing.JLabel();
        lblFueraDeServicio = new javax.swing.JLabel();
        lblReservada = new javax.swing.JLabel();
        cuadOcupada = new javax.swing.JLabel();
        cuadReservada = new javax.swing.JLabel();
        cuadDisponible = new javax.swing.JLabel();
        cuadFueraDeServicio = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        panelDatosHabitaciones = new javax.swing.JScrollPane();
        tablaEstadoHabitaciones = new javax.swing.JTable() {
            protected JTableHeader createDefaultTableHeader() {
                return new GroupableTableHeader(columnModel);
            }
        };

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelRangoFechas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelRangoFechas.setLayout(new java.awt.GridBagLayout());

        lblFechaDesde.setText("Fecha desde");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 24, 0, 0);
        panelRangoFechas.add(lblFechaDesde, gridBagConstraints);

        lblFechaHasta.setText("Fecha hasta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 110, 0, 0);
        panelRangoFechas.add(lblFechaHasta, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 85;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 12, 16, 0);
        panelRangoFechas.add(dpFechaDesde, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 85;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 18, 16, 0);
        panelRangoFechas.add(dpFechaHasta, gridBagConstraints);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 181, 16, 20);
        panelRangoFechas.add(buscar, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Rango de fechas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Datos de las habitaciones");

        cancelar.setText("Cancelar");

        lblOcupada.setText("Ocupada");

        lblDisponible.setText("Disponible");

        lblFueraDeServicio.setText("Fuera de servicio");

        lblReservada.setText("Reservada");

        cuadOcupada.setBackground(new java.awt.Color(255, 0, 0));
        cuadOcupada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cuadOcupada.setForeground(new java.awt.Color(255, 0, 0));
        cuadOcupada.setText("■");

        cuadReservada.setBackground(new java.awt.Color(255, 255, 0));
        cuadReservada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cuadReservada.setForeground(new java.awt.Color(255, 255, 0));
        cuadReservada.setText("■");

        cuadDisponible.setBackground(new java.awt.Color(99, 219, 24));
        cuadDisponible.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cuadDisponible.setForeground(new java.awt.Color(99, 219, 24));
        cuadDisponible.setText("■");

        cuadFueraDeServicio.setBackground(new java.awt.Color(0, 0, 255));
        cuadFueraDeServicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cuadFueraDeServicio.setForeground(new java.awt.Color(0, 0, 255));
        cuadFueraDeServicio.setText("■");

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        modeloTabla = new DefaultTableModel();
        tablaEstadoHabitaciones.setModel(modeloTabla);
        tablaEstadoHabitaciones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaEstadoHabitaciones.setCellSelectionEnabled(true);
        panelDatosHabitaciones.setViewportView(tablaEstadoHabitaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(panelRangoFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(panelDatosHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cuadOcupada)
                        .addGap(6, 6, 6)
                        .addComponent(lblOcupada)
                        .addGap(26, 26, 26)
                        .addComponent(cuadReservada)
                        .addGap(6, 6, 6)
                        .addComponent(lblReservada)
                        .addGap(24, 24, 24)
                        .addComponent(cuadDisponible)
                        .addGap(6, 6, 6)
                        .addComponent(lblDisponible)
                        .addGap(32, 32, 32)
                        .addComponent(cuadFueraDeServicio)
                        .addGap(6, 6, 6)
                        .addComponent(lblFueraDeServicio)
                        .addGap(491, 491, 491)
                        .addComponent(siguiente)
                        .addGap(11, 11, 11)
                        .addComponent(cancelar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(panelRangoFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(panelDatosHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cuadOcupada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblOcupada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cuadReservada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblReservada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cuadDisponible))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblDisponible))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cuadFueraDeServicio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblFueraDeServicio))
                    .addComponent(siguiente)
                    .addComponent(cancelar)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
        LocalDate ldFechaDesde = null, ldFechaHasta = null;
        
        System.out.println(dpFechaDesde.getDate());
        System.out.println(dpFechaHasta.getDate());
        
        if (dpFechaDesde.getDate() != null)
            ldFechaDesde = dpFechaDesde.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        if (dpFechaHasta.getDate() != null)
            ldFechaHasta = dpFechaHasta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        if (ldFechaDesde == null || ldFechaHasta == null)
        {
            JOptionPane.showMessageDialog(null, "Complete las fechas restantes.", "", JOptionPane.INFORMATION_MESSAGE);
        
            if (ldFechaDesde == null)
                lblFechaDesde.setForeground(Color.RED);
            if (ldFechaHasta == null)
                lblFechaHasta.setForeground(Color.RED);
        }
            else if (ldFechaDesde.isBefore(LocalDate.now()))
        {
            JOptionPane.showMessageDialog(null, "\"Fecha desde\" debe ser de hoy en adelante.", "Error", JOptionPane.ERROR_MESSAGE);
            lblFechaDesde.setForeground(Color.RED);
        }
        else if (ldFechaDesde.isAfter(ldFechaHasta))
        {
            JOptionPane.showMessageDialog(null, "Rango de fechas inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            lblFechaHasta.setForeground(Color.RED);
        }
        else
        {
            GestorDeAlojamientos gesAl = GestorDeAlojamientos.getInstance();
            
            Object[][] datos = gesAl.llenarGrilla(ldFechaDesde, ldFechaHasta); // ¿Como llenar la tabla? xd
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        
        
    }//GEN-LAST:event_siguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel cuadDisponible;
    private javax.swing.JLabel cuadFueraDeServicio;
    private javax.swing.JLabel cuadOcupada;
    private javax.swing.JLabel cuadReservada;
    private com.toedter.calendar.JDateChooser dpFechaDesde;
    private com.toedter.calendar.JDateChooser dpFechaHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDisponible;
    private javax.swing.JLabel lblFechaDesde;
    private javax.swing.JLabel lblFechaHasta;
    private javax.swing.JLabel lblFueraDeServicio;
    private javax.swing.JLabel lblOcupada;
    private javax.swing.JLabel lblReservada;
    private javax.swing.JScrollPane panelDatosHabitaciones;
    private javax.swing.JPanel panelRangoFechas;
    private javax.swing.JButton siguiente;
    private javax.swing.JTable tablaEstadoHabitaciones;
    private javax.swing.table.DefaultTableModel modeloTabla;
    // End of variables declaration//GEN-END:variables
