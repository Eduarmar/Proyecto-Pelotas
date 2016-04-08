
package UI;

import Models.Costura;
import Models.Cubierta;
import Models.Forma;
import Models.Lineas;
import Models.ListaDatos;
import Models.Material;
import Models.Medida;
import Models.Nucleo;
import Models.Pelota;
import Models.Textura;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class Pantalla extends javax.swing.JFrame {

    private ListaDatos listaDatos;
    DefaultTableModel modeloTablacobertura;
    DefaultTableModel modeloTablaForma;
    DefaultTableModel modelotablacortes;
    DefaultTableModel modelotablanucleo;
    DefaultTableModel modelotablacostura;
    DefaultTableModel modelotablalineas;
    DefaultTableModel modeloTablapelotas;
    
    
    
    public Pantalla() {
        initComponents();
        
        listaDatos = new ListaDatos();
        modelotablacostura   = (DefaultTableModel) tbcosturas.getModel();
        modelotablanucleo   = (DefaultTableModel) tbNucleos.getModel();
        modeloTablaForma   = (DefaultTableModel) tbFormas.getModel();
        modeloTablacobertura  = (DefaultTableModel) tbCoberturas.getModel();
        modelotablacortes = (DefaultTableModel) tbCortesLinea.getModel();
        modelotablalineas = (DefaultTableModel) tblineas.getModel();
        modeloTablapelotas = (DefaultTableModel) tbPelotas.getModel();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpPanelPrincipal = new javax.swing.JTabbedPane();
        tpPelota = new javax.swing.JTabbedPane();
        pnCrearPelota = new javax.swing.JPanel();
        tfMedida = new javax.swing.JTextField();
        tfNombrepelota = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbNucleo = new javax.swing.JComboBox();
        cbCobertura = new javax.swing.JComboBox();
        cbForma = new javax.swing.JComboBox();
        cbCostura = new javax.swing.JComboBox();
        cbLinea = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        btCrearPelota = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        pnChequear = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPelotas = new javax.swing.JTable();
        tpForma = new javax.swing.JTabbedPane();
        pnCrearForma = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfNombreForma = new javax.swing.JTextField();
        tfLargo = new javax.swing.JTextField();
        tfElipse = new javax.swing.JTextField();
        chbElipse = new javax.swing.JCheckBox();
        btCrearForma = new javax.swing.JButton();
        pnChequear1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFormas = new javax.swing.JTable();
        tpCobertura = new javax.swing.JTabbedPane();
        pncrearCobertura = new javax.swing.JPanel();
        tfVolumen = new javax.swing.JTextField();
        tfNombreCobertura = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfPresentacion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        spPeso = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cbColor = new javax.swing.JComboBox();
        tfSuperficie = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        spCorrugado = new javax.swing.JSpinner();
        btCrearCobretura = new javax.swing.JButton();
        pnChequearCobertura = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbCoberturas = new javax.swing.JTable();
        tpNucleo = new javax.swing.JTabbedPane();
        pnCrearNucleo = new javax.swing.JPanel();
        cbCubierta = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        spCapas = new javax.swing.JSpinner();
        btCrearNucleo = new javax.swing.JButton();
        tfNombreNucleo = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        pnChequearNucleo = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbNucleos = new javax.swing.JTable();
        tpCostura = new javax.swing.JTabbedPane();
        pnCrearCostura = new javax.swing.JPanel();
        tfNombreCostura = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tfAnchoPanel = new javax.swing.JTextField();
        tfLargoPanel = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        spCantPaneles = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        spPuntos = new javax.swing.JSpinner();
        jLabel35 = new javax.swing.JLabel();
        cbCubiertaPanel = new javax.swing.JComboBox();
        btCrearCostura = new javax.swing.JButton();
        pnChequearCostura = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbcosturas = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        tpLinea = new javax.swing.JTabbedPane();
        pnCrearLinea = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        cbTipoLinea = new javax.swing.JComboBox();
        spCortes = new javax.swing.JSpinner();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCortesLinea = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        btCrearLineas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblineas = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        tpEtiqueta = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador Pelotas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tpPanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        tpPanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4));
        tpPanelPrincipal.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tpPanelPrincipal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tpPanelPrincipal.setOpaque(true);
        tpPanelPrincipal.setPreferredSize(new java.awt.Dimension(200, 150));

        tpPelota.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        pnCrearPelota.setAutoscrolls(true);

        tfMedida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfNombrepelota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Nucleo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Cobertura");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Medida");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Forma");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Medida Central");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Costura");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Opcionales");

        cbForma.setToolTipText("");

        cbCostura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        cbLinea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("cm");

        btCrearPelota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCrearPelota.setText("Crear");
        btCrearPelota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCrearPelotaMouseClicked(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setText("Linea");

        javax.swing.GroupLayout pnCrearPelotaLayout = new javax.swing.GroupLayout(pnCrearPelota);
        pnCrearPelota.setLayout(pnCrearPelotaLayout);
        pnCrearPelotaLayout.setHorizontalGroup(
            pnCrearPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCrearPelotaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCrearPelota, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(pnCrearPelotaLayout.createSequentialGroup()
                .addGroup(pnCrearPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCrearPelotaLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCrearPelotaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(pnCrearPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnCrearPelotaLayout.createSequentialGroup()
                                .addGroup(pnCrearPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCrearPelotaLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCrearPelotaLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbCobertura, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)))
                                .addGroup(pnCrearPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCrearPelotaLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbForma, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnCrearPelotaLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnCrearPelotaLayout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCostura, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnCrearPelotaLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tfNombrepelota, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCrearPelotaLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        pnCrearPelotaLayout.setVerticalGroup(
            pnCrearPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCrearPelotaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnCrearPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombrepelota, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCrearPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(pnCrearPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnCrearPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCobertura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(pnCrearPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCostura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(btCrearPelota, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpPelota.addTab("Crear", pnCrearPelota);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Pelotas Creadas");

        tbPelotas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbPelotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Medida", "Cubierta", "Nucleo", "Lineas", "Costura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPelotas.setRowHeight(20);
        jScrollPane1.setViewportView(tbPelotas);
        if (tbPelotas.getColumnModel().getColumnCount() > 0) {
            tbPelotas.getColumnModel().getColumn(0).setResizable(false);
            tbPelotas.getColumnModel().getColumn(1).setResizable(false);
            tbPelotas.getColumnModel().getColumn(3).setResizable(false);
            tbPelotas.getColumnModel().getColumn(4).setResizable(false);
            tbPelotas.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout pnChequearLayout = new javax.swing.GroupLayout(pnChequear);
        pnChequear.setLayout(pnChequearLayout);
        pnChequearLayout.setHorizontalGroup(
            pnChequearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChequearLayout.createSequentialGroup()
                .addGroup(pnChequearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnChequearLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnChequearLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        pnChequearLayout.setVerticalGroup(
            pnChequearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChequearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tpPelota.addTab("Chequear", pnChequear);

        tpPanelPrincipal.addTab("Pelota", tpPelota);

        tpForma.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        pnCrearForma.setAutoscrolls(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Largo");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Elipse");

        tfNombreForma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfLargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfElipse.setEditable(false);
        tfElipse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        chbElipse.setText("Activar Elipse");
        chbElipse.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chbElipseStateChanged(evt);
            }
        });

        btCrearForma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCrearForma.setText("Crear");
        btCrearForma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCrearFormaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnCrearFormaLayout = new javax.swing.GroupLayout(pnCrearForma);
        pnCrearForma.setLayout(pnCrearFormaLayout);
        pnCrearFormaLayout.setHorizontalGroup(
            pnCrearFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCrearFormaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(pnCrearFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCrearFormaLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tfNombreForma, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCrearFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnCrearFormaLayout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfElipse, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnCrearFormaLayout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(tfLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addComponent(chbElipse, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCrearFormaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCrearForma, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        pnCrearFormaLayout.setVerticalGroup(
            pnCrearFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCrearFormaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnCrearFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombreForma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(pnCrearFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(pnCrearFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElipse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbElipse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(btCrearForma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        tpForma.addTab("Crear", pnCrearForma);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Formas Creadas");

        tbFormas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbFormas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Largo", "Elipse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFormas.setRowHeight(20);
        jScrollPane2.setViewportView(tbFormas);
        if (tbFormas.getColumnModel().getColumnCount() > 0) {
            tbFormas.getColumnModel().getColumn(0).setResizable(false);
            tbFormas.getColumnModel().getColumn(1).setResizable(false);
            tbFormas.getColumnModel().getColumn(2).setResizable(false);
            tbFormas.getColumnModel().getColumn(2).setHeaderValue("Cubierta");
        }

        javax.swing.GroupLayout pnChequear1Layout = new javax.swing.GroupLayout(pnChequear1);
        pnChequear1.setLayout(pnChequear1Layout);
        pnChequear1Layout.setHorizontalGroup(
            pnChequear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChequear1Layout.createSequentialGroup()
                .addGroup(pnChequear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnChequear1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnChequear1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        pnChequear1Layout.setVerticalGroup(
            pnChequear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChequear1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tpForma.addTab("Chequear", pnChequear1);

        tpPanelPrincipal.addTab("Forma", tpForma);

        tpCobertura.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        tfVolumen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfNombreCobertura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Material");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Volumen");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Textura");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Nombre");

        tfPresentacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Presentacion");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("gr");

        spPeso.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Peso");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Color");

        cbColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rojo", "Verde", "Azul", "Negro", "Magenta", "Amarillo", "Rosado" }));

        tfSuperficie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Superficie");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Corrugado");

        spCorrugado.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        btCrearCobretura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCrearCobretura.setText("Crear");
        btCrearCobretura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCrearCobreturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pncrearCoberturaLayout = new javax.swing.GroupLayout(pncrearCobertura);
        pncrearCobertura.setLayout(pncrearCoberturaLayout);
        pncrearCoberturaLayout.setHorizontalGroup(
            pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pncrearCoberturaLayout.createSequentialGroup()
                .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pncrearCoberturaLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tfNombreCobertura, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pncrearCoberturaLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pncrearCoberturaLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pncrearCoberturaLayout.createSequentialGroup()
                                .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pncrearCoberturaLayout.createSequentialGroup()
                                        .addComponent(spPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57)
                                .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pncrearCoberturaLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spCorrugado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pncrearCoberturaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCrearCobretura, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pncrearCoberturaLayout.createSequentialGroup()
                    .addGap(285, 285, 285)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(304, Short.MAX_VALUE)))
        );
        pncrearCoberturaLayout.setVerticalGroup(
            pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pncrearCoberturaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombreCobertura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spCorrugado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btCrearCobretura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(pncrearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pncrearCoberturaLayout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(346, Short.MAX_VALUE)))
        );

        tpCobertura.addTab("Crear", pncrearCobertura);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Coberturas Creadas");

        tbCoberturas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbCoberturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Material", "Textura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCoberturas.setRowHeight(20);
        jScrollPane4.setViewportView(tbCoberturas);
        if (tbCoberturas.getColumnModel().getColumnCount() > 0) {
            tbCoberturas.getColumnModel().getColumn(0).setResizable(false);
            tbCoberturas.getColumnModel().getColumn(1).setResizable(false);
            tbCoberturas.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout pnChequearCoberturaLayout = new javax.swing.GroupLayout(pnChequearCobertura);
        pnChequearCobertura.setLayout(pnChequearCoberturaLayout);
        pnChequearCoberturaLayout.setHorizontalGroup(
            pnChequearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChequearCoberturaLayout.createSequentialGroup()
                .addGroup(pnChequearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnChequearCoberturaLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnChequearCoberturaLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        pnChequearCoberturaLayout.setVerticalGroup(
            pnChequearCoberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChequearCoberturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tpCobertura.addTab("Chequear", pnChequearCobertura);

        tpPanelPrincipal.addTab("Cobertura", tpCobertura);

        tpNucleo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Cubierta");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Capas");

        spCapas.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        btCrearNucleo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCrearNucleo.setText("Crear");
        btCrearNucleo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCrearNucleoMouseClicked(evt);
            }
        });

        tfNombreNucleo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setText("Nombre");

        javax.swing.GroupLayout pnCrearNucleoLayout = new javax.swing.GroupLayout(pnCrearNucleo);
        pnCrearNucleo.setLayout(pnCrearNucleoLayout);
        pnCrearNucleoLayout.setHorizontalGroup(
            pnCrearNucleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCrearNucleoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCrearNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(pnCrearNucleoLayout.createSequentialGroup()
                .addGroup(pnCrearNucleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCrearNucleoLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(pnCrearNucleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCrearNucleoLayout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(cbCubierta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnCrearNucleoLayout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(tfNombreNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnCrearNucleoLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(spCapas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        pnCrearNucleoLayout.setVerticalGroup(
            pnCrearNucleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCrearNucleoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnCrearNucleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombreNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnCrearNucleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCubierta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCrearNucleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spCapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(btCrearNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        tpNucleo.addTab("Crear", pnCrearNucleo);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setText("Nucleos Creadas");

        tbNucleos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbNucleos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cubierta", "Capas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNucleos.setRowHeight(20);
        jScrollPane5.setViewportView(tbNucleos);
        if (tbNucleos.getColumnModel().getColumnCount() > 0) {
            tbNucleos.getColumnModel().getColumn(0).setResizable(false);
            tbNucleos.getColumnModel().getColumn(1).setResizable(false);
            tbNucleos.getColumnModel().getColumn(1).setHeaderValue("AnchoPanel");
            tbNucleos.getColumnModel().getColumn(2).setResizable(false);
            tbNucleos.getColumnModel().getColumn(2).setHeaderValue("LargoPanel");
        }

        javax.swing.GroupLayout pnChequearNucleoLayout = new javax.swing.GroupLayout(pnChequearNucleo);
        pnChequearNucleo.setLayout(pnChequearNucleoLayout);
        pnChequearNucleoLayout.setHorizontalGroup(
            pnChequearNucleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChequearNucleoLayout.createSequentialGroup()
                .addGroup(pnChequearNucleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnChequearNucleoLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnChequearNucleoLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        pnChequearNucleoLayout.setVerticalGroup(
            pnChequearNucleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChequearNucleoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tpNucleo.addTab("Chequear", pnChequearNucleo);

        tpPanelPrincipal.addTab("Nucleo", tpNucleo);

        tpCostura.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        tfNombreCostura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("Nombre");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Paneles");

        tfAnchoPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfLargoPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Ancho");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Largo");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Cantidad de paneles");

        spCantPaneles.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Puntos");

        spPuntos.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2), Integer.valueOf(2), null, Integer.valueOf(1)));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("Cobertura panel");

        btCrearCostura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCrearCostura.setText("Crear");
        btCrearCostura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCrearCosturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnCrearCosturaLayout = new javax.swing.GroupLayout(pnCrearCostura);
        pnCrearCostura.setLayout(pnCrearCosturaLayout);
        pnCrearCosturaLayout.setHorizontalGroup(
            pnCrearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCrearCosturaLayout.createSequentialGroup()
                .addGroup(pnCrearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCrearCosturaLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tfNombreCostura, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCrearCosturaLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(pnCrearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCrearCosturaLayout.createSequentialGroup()
                                .addComponent(tfAnchoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(tfLargoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnCrearCosturaLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnCrearCosturaLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spCantPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCrearCosturaLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cbCubiertaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCrearCosturaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCrearCostura, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        pnCrearCosturaLayout.setVerticalGroup(
            pnCrearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCrearCosturaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnCrearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombreCostura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCrearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCrearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnCrearCosturaLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnCrearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAnchoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLargoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(pnCrearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spCantPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(pnCrearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCubiertaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btCrearCostura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        tpCostura.addTab("Crear", pnCrearCostura);

        tbcosturas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbcosturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "AnchoPanel", "LargoPanel", "# Paneles", "Cobertura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbcosturas.setRowHeight(20);
        jScrollPane6.setViewportView(tbcosturas);
        if (tbcosturas.getColumnModel().getColumnCount() > 0) {
            tbcosturas.getColumnModel().getColumn(0).setResizable(false);
            tbcosturas.getColumnModel().getColumn(1).setResizable(false);
            tbcosturas.getColumnModel().getColumn(1).setHeaderValue("AnchoPanel");
            tbcosturas.getColumnModel().getColumn(2).setResizable(false);
            tbcosturas.getColumnModel().getColumn(2).setHeaderValue("LargoPanel");
            tbcosturas.getColumnModel().getColumn(3).setHeaderValue("# Paneles");
            tbcosturas.getColumnModel().getColumn(4).setHeaderValue("Cobertura");
        }

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setText("Costuras Creadas");

        javax.swing.GroupLayout pnChequearCosturaLayout = new javax.swing.GroupLayout(pnChequearCostura);
        pnChequearCostura.setLayout(pnChequearCosturaLayout);
        pnChequearCosturaLayout.setHorizontalGroup(
            pnChequearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChequearCosturaLayout.createSequentialGroup()
                .addGroup(pnChequearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnChequearCosturaLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnChequearCosturaLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        pnChequearCosturaLayout.setVerticalGroup(
            pnChequearCosturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChequearCosturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tpCostura.addTab("Chequear", pnChequearCostura);

        tpPanelPrincipal.addTab("Costura", tpCostura);

        tpLinea.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("Cortes");

        cbTipoLinea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Recta", "Zig-Zag", "Curvas", "Discostinuas" }));

        spCortes.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("cantidad de cortes");

        tbCortesLinea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbCortesLinea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "X", "Y"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbCortesLinea.setRowHeight(20);
        jScrollPane3.setViewportView(tbCortesLinea);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setText("Tipo de Linea");

        btCrearLineas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCrearLineas.setText("Crear");
        btCrearLineas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCrearLineasMouseClicked(evt);
            }
        });

        jButton1.setText("Cololar Cortes");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnCrearLineaLayout = new javax.swing.GroupLayout(pnCrearLinea);
        pnCrearLinea.setLayout(pnCrearLineaLayout);
        pnCrearLineaLayout.setHorizontalGroup(
            pnCrearLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCrearLineaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCrearLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(pnCrearLineaLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(pnCrearLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnCrearLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnCrearLineaLayout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jLabel34))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCrearLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnCrearLineaLayout.createSequentialGroup()
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(spCortes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnCrearLineaLayout.createSequentialGroup()
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbTipoLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        pnCrearLineaLayout.setVerticalGroup(
            pnCrearLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCrearLineaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnCrearLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(pnCrearLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spCortes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(30, 30, 30)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btCrearLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        tpLinea.addTab("Crear", pnCrearLinea);

        tblineas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblineas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Linea", "Cortes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblineas.setRowHeight(20);
        jScrollPane7.setViewportView(tblineas);
        if (tblineas.getColumnModel().getColumnCount() > 0) {
            tblineas.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Costuras Creadas");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tpLinea.addTab("Chequear", jPanel19);

        tpPanelPrincipal.addTab("Lineas", tpLinea);

        tpEtiqueta.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );

        tpEtiqueta.addTab("Crear", jPanel16);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );

        tpEtiqueta.addTab("Chequear", jPanel17);

        tpPanelPrincipal.addTab("Etiqueta", tpEtiqueta);

        getContentPane().add(tpPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 790, 520));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BG.jpg"))); // NOI18N
        BG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 6, true));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCrearPelotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCrearPelotaMouseClicked
        
        
        if(tfNombrepelota.getText().equals("") || cbForma.getSelectedItem()==null ||
                tfMedida.getText().equals("") || cbCubierta.getSelectedItem()==null || 
                cbNucleo.getSelectedItem() == null){
            JOptionPane.showMessageDialog(this,
                    "Existen Parametros Obligatorios Vacios.!");
            return;
        }
        
        String nombre = tfNombrepelota.getText();
        String forma = (String) cbForma.getSelectedItem();
        String cubierta = (String) cbCubierta.getSelectedItem();
        String nucleo = (String) cbNucleo.getSelectedItem();
        float med = Float.parseFloat(tfMedida.getText());
        
        Forma f = (Forma) listaDatos.ObtenerObjeto(forma, 2);                       
        Cubierta c = (Cubierta) listaDatos.ObtenerObjeto(cubierta, 3);
        Nucleo n =  (Nucleo) listaDatos.ObtenerObjeto(nucleo, 4);               
        Medida m = new Medida(med, f);
        
        Pelota pelota = new Pelota(nombre, m, n, c);
        
               
        listaDatos.listaPelota.add(pelota);
        
        Object[] nuevo = new Object[6];
         nuevo[0] = nombre;
         nuevo[1] = m.getCm();
         nuevo[2] = cubierta;
         nuevo[3] = nucleo;
         
         if(cbLinea.getSelectedIndex()!=0){
            Lineas line = (Lineas) listaDatos.ObtenerObjeto((String) cbLinea.getSelectedItem(), 6);
            pelota.setLineas(line);
            nuevo[4]=line.getTipolinea();
        }else
             nuevo[4]= "";
        
        if(cbCostura.getSelectedIndex()!=0){
            Costura costu = (Costura) listaDatos.ObtenerObjeto((String) cbCostura.getSelectedItem(), 5);
            pelota.setCostura(costu);
            nuevo[5]=costu.getNombre();
        }else
             nuevo[5]= "";
         
        modeloTablapelotas.addRow(nuevo);
        
        tfNombrepelota.setText("");
         tfMedida.setText("");
        
        
    }//GEN-LAST:event_btCrearPelotaMouseClicked

    private void btCrearFormaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCrearFormaMouseClicked
        
         if(tfLargo.getText().equals("") || tfNombreForma.getText().equals("")){
            JOptionPane.showMessageDialog(this,
                    "Existen Parametros Obligatorios Vacios.!");
            return;
        }
         
         float elip;
         
         if(chbElipse.isSelected()){
            elip = Float.parseFloat(tfElipse.getText());
            tfElipse.setText("");
         }else{
            elip = 0;
         }
         
         String nombre = tfNombreForma.getText();
         String largo = tfLargo.getText();
         float lar = Float.parseFloat(largo);
         
         Forma forma = new Forma(nombre,lar);
         forma.setElipse(elip);
         
         Object[] nuevo = new Object[3];
         nuevo[0] = forma.getNombre();
         nuevo[1] = forma.getLargo();
         nuevo[2] = forma.getElipse();
         
        listaDatos.listaForma.add(forma);    
         
         modeloTablaForma.addRow(nuevo);
         
         tfNombreForma.setText("");
         tfLargo.setText("");
         cbForma.addItem(nombre);
        
    }//GEN-LAST:event_btCrearFormaMouseClicked

    private void btCrearCobreturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCrearCobreturaMouseClicked
        
        if(tfNombreCobertura.getText().equals("") || tfVolumen.getText().equals("")
                || tfPresentacion.getText().equals("") || tfSuperficie.getText().equals("")
                || cbColor.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this,
                    "Existen Parametros Obligatorios Vacios.!");
            return;
        }
        
         String nombre = tfNombreCobertura.getText();
         int volumen = Integer.parseInt(tfVolumen.getText());
         
         Material material = new Material(volumen, tfPresentacion.getText(), (int) spPeso.getValue());
         
         Textura textura = new Textura(tfSuperficie.getText(),(int) spCorrugado.getValue());
         
         Cubierta cubierta = new Cubierta(nombre, material, textura);
         
         listaDatos.listaCubierta.add(cubierta);
         
         Object[] nuevos = new Object[3];
         nuevos[0] = cubierta.getNombre();
         nuevos[1] = material.getPresentacion();
         nuevos[2] = textura.getSuperficie();
         
         
         modeloTablacobertura.addRow(nuevos);
         
         
         
         tfNombreCobertura.setText("");
         tfVolumen.setText("");
         tfPresentacion.setText("");
         tfSuperficie.setText("");
         spPeso.setValue(1);
         spCorrugado.setValue(0);
         
         cbCobertura.addItem(nombre);
         cbCubierta.addItem(nombre);
         cbCubiertaPanel.addItem(nombre);
         
    }//GEN-LAST:event_btCrearCobreturaMouseClicked

    private void btCrearNucleoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCrearNucleoMouseClicked
        
         if(cbCubierta.getSelectedItem()==null || tfNombreNucleo.getText().equals("")){
            JOptionPane.showMessageDialog(this,
                    "Existen Parametros Obligatorios Vacios.!");
            return;
        }
         
         String n = (String) cbCubierta.getSelectedItem();
         String nombre = tfNombreNucleo.getText();
        
         Cubierta cubierta = (Cubierta) listaDatos.ObtenerObjeto(n, 3);
         
        Nucleo nucleo = new Nucleo(nombre , cubierta, (int) spCapas.getValue());
        
        listaDatos.listaNucleo.add(nucleo);
        
        Object[] nuevos = new Object[3];
         nuevos[0] = nombre;
         nuevos[1] = cubierta.getNombre();
         nuevos[2] = spCapas.getValue();
         
         modelotablanucleo.addRow(nuevos);
        
         tfNombreNucleo.setText("");
         spCapas.setValue(1);
        cbNucleo.addItem(nombre);
         
    }//GEN-LAST:event_btCrearNucleoMouseClicked

    private void btCrearCosturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCrearCosturaMouseClicked
       
        if(cbCubiertaPanel.getSelectedItem()==null || tfNombreCostura.getText().equals("")
                || tfAnchoPanel.getText().equals("") || tfLargoPanel.getText().equals("")){
            JOptionPane.showMessageDialog(this,
                    "Existen Parametros Obligatorios Vacios.!");
            return;
        }
        
        float ancho = Float.parseFloat(tfAnchoPanel.getText());
        float largo = Float.parseFloat(tfLargoPanel.getText());
        
        String nombre = tfNombreCostura.getText();
        String n = (String) cbCubierta.getSelectedItem();
        int cantpanel = (int) spCantPaneles.getValue();
        int puntos = (int) spCantPaneles.getValue();
        
        Cubierta cubierta = (Cubierta) listaDatos.ObtenerObjeto(n, 3);        
        
        Costura costura = new Costura(nombre,  cantpanel, ancho, largo, puntos, cubierta);
        
        listaDatos.listaCostura.add(costura);
        
        Object[] nuevos = new Object[5];
         nuevos[0] = nombre;
         nuevos[1] = ancho;
         nuevos[2] = largo;
         nuevos[3] = cantpanel;
         nuevos[4] = cubierta.getNombre();
         
        modelotablacostura.addRow(nuevos);
        
        tfNombreCostura.setText("");
         spCantPaneles.setValue(1);
         tfAnchoPanel.setText("");
         tfLargoPanel.setText("");
         spPuntos.setValue(2);
        cbCostura.addItem(nombre);
                
    }//GEN-LAST:event_btCrearCosturaMouseClicked

    private void btCrearLineasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCrearLineasMouseClicked
        
         int n = (int) spCortes.getValue();
        
         for (int i=0;i<n;i++){
            if(modelotablacortes.getValueAt(i, 0)==null || modelotablacortes.getValueAt(i, 1)==null) {
                    JOptionPane.showMessageDialog(this,
                        "Existen Parametros Obligatorios Vacios.!");
                return;
            }
      
        }
       
        float [] cortesX = new float[n];
        float [] cortesY = new float[n];
       
        for (int i=0;i<n;i++){
            cortesX[i]=(float) modelotablacortes.getValueAt(i, 0);
            cortesY[i]=(float) modelotablacortes.getValueAt(i, 1);        
        }
       
        String nombre = (String) cbTipoLinea.getSelectedItem();
        
       Lineas linea = new Lineas(nombre, n, cortesX, cortesY);
       
       listaDatos.listaLinea.add(linea);
       
        Object[] nuevos = new Object[2];
         nuevos[0] = nombre;
         nuevos[1] = n;
        
       modelotablalineas.addRow(nuevos);
       
       spCortes.setValue(1);
       modelotablacortes.setRowCount(0);
       modelotablacortes.setRowCount(1);
       cbLinea.addItem(nombre);
       
    }//GEN-LAST:event_btCrearLineasMouseClicked

    private void chbElipseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbElipseStateChanged
        tfElipse.setEditable(chbElipse.isSelected());
    }//GEN-LAST:event_chbElipseStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        int value = (int) spCortes.getValue();
        modelotablacortes.setRowCount(value);
        
    }//GEN-LAST:event_jButton1MouseClicked

    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btCrearCobretura;
    private javax.swing.JButton btCrearCostura;
    private javax.swing.JButton btCrearForma;
    private javax.swing.JButton btCrearLineas;
    private javax.swing.JButton btCrearNucleo;
    private javax.swing.JButton btCrearPelota;
    private javax.swing.JComboBox cbCobertura;
    private javax.swing.JComboBox cbColor;
    private javax.swing.JComboBox cbCostura;
    private javax.swing.JComboBox cbCubierta;
    private javax.swing.JComboBox cbCubiertaPanel;
    private javax.swing.JComboBox cbForma;
    private javax.swing.JComboBox cbLinea;
    private javax.swing.JComboBox cbNucleo;
    private javax.swing.JComboBox cbTipoLinea;
    private javax.swing.JCheckBox chbElipse;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel pnChequear;
    private javax.swing.JPanel pnChequear1;
    private javax.swing.JPanel pnChequearCobertura;
    private javax.swing.JPanel pnChequearCostura;
    private javax.swing.JPanel pnChequearNucleo;
    private javax.swing.JPanel pnCrearCostura;
    private javax.swing.JPanel pnCrearForma;
    private javax.swing.JPanel pnCrearLinea;
    private javax.swing.JPanel pnCrearNucleo;
    private javax.swing.JPanel pnCrearPelota;
    private javax.swing.JPanel pncrearCobertura;
    private javax.swing.JSpinner spCantPaneles;
    private javax.swing.JSpinner spCapas;
    private javax.swing.JSpinner spCorrugado;
    private javax.swing.JSpinner spCortes;
    private javax.swing.JSpinner spPeso;
    private javax.swing.JSpinner spPuntos;
    private javax.swing.JTable tbCoberturas;
    private javax.swing.JTable tbCortesLinea;
    private javax.swing.JTable tbFormas;
    private javax.swing.JTable tbNucleos;
    private javax.swing.JTable tbPelotas;
    private javax.swing.JTable tbcosturas;
    private javax.swing.JTable tblineas;
    private javax.swing.JTextField tfAnchoPanel;
    private javax.swing.JTextField tfElipse;
    private javax.swing.JTextField tfLargo;
    private javax.swing.JTextField tfLargoPanel;
    private javax.swing.JTextField tfMedida;
    private javax.swing.JTextField tfNombreCobertura;
    private javax.swing.JTextField tfNombreCostura;
    private javax.swing.JTextField tfNombreForma;
    private javax.swing.JTextField tfNombreNucleo;
    private javax.swing.JTextField tfNombrepelota;
    private javax.swing.JTextField tfPresentacion;
    private javax.swing.JTextField tfSuperficie;
    private javax.swing.JTextField tfVolumen;
    private javax.swing.JTabbedPane tpCobertura;
    private javax.swing.JTabbedPane tpCostura;
    private javax.swing.JTabbedPane tpEtiqueta;
    private javax.swing.JTabbedPane tpForma;
    private javax.swing.JTabbedPane tpLinea;
    private javax.swing.JTabbedPane tpNucleo;
    private javax.swing.JTabbedPane tpPanelPrincipal;
    private javax.swing.JTabbedPane tpPelota;
    // End of variables declaration//GEN-END:variables
}
