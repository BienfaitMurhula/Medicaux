/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Syncronisation.Syncroniser;
import java.awt.Color;

/**
 *
 * @author honore
 */
public class Anamnese extends javax.swing.JPanel {

    /**
     * Creates new form Anamnese
     */
     Syncroniser sy= new Syncroniser();
    public Anamnese() {
        initComponents();
      jPanel1.setBackground(new Color(192, 192, 255));
      Anamnèse.setBackground(new Color(192, 192, 255));
      jPanel2.setBackground(new Color(192, 192, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Anamnèse = new javax.swing.JPanel();
        adresse1 = new javax.swing.JTextField();
        prenom1 = new javax.swing.JTextField();
        numfiche1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        echo1 = new javax.swing.JTextField();
        cpn1 = new javax.swing.JTextField();
        curatif1 = new javax.swing.JTextField();
        autre1 = new javax.swing.JTextField();
        postnom = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        prenom2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        prenom3 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        numfiche2 = new javax.swing.JTextField();
        autre2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        curatif2 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        adresse2 = new javax.swing.JTextField();
        curatif3 = new javax.swing.JTextField();
        curatif4 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        echo2 = new javax.swing.JTextField();
        cpn2 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        autre3 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        echo3 = new javax.swing.JTextField();
        curatif5 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        curatif6 = new javax.swing.JTextField();
        adresse3 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        autre4 = new javax.swing.JTextField();
        cpn3 = new javax.swing.JTextField();
        numfiche3 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        autre5 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Anamnèse.setBackground(new java.awt.Color(255, 255, 255));
        Anamnèse.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255)), "ANAMNESE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        Anamnèse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Anamnèse.add(adresse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 210, 30));
        Anamnèse.add(prenom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 200, 30));
        Anamnèse.add(numfiche1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Bcg");
        Anamnèse.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 30, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Num lot");
        Anamnèse.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 153));
        jLabel19.setText("Num lot2");
        Anamnèse.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 153));
        jLabel20.setText("Ta");
        Anamnèse.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 90, 30));

        jLabel21.setForeground(new java.awt.Color(51, 0, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Modifié");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        Anamnèse.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 170, 40));

        jLabel22.setForeground(new java.awt.Color(51, 0, 204));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Enregistré");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        Anamnèse.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, 40));

        jLabel23.setForeground(new java.awt.Color(51, 0, 204));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Supprimé");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        Anamnèse.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 170, 40));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 153));
        jLabel24.setText("Sphere oral");
        Anamnèse.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 90, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 153));
        jLabel25.setText("Aires gangl");
        Anamnèse.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 90, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 153));
        jLabel26.setText("Paeu");
        Anamnèse.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 90, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 153));
        jLabel27.setText("Etat général");
        Anamnèse.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 90, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 153));
        jLabel28.setText("Pouls");
        Anamnèse.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 90, 30));
        Anamnèse.add(echo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 210, 30));
        Anamnèse.add(cpn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 210, 30));
        Anamnèse.add(curatif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 210, 30));
        Anamnèse.add(autre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 210, 30));
        Anamnèse.add(postnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 200, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 153));
        jLabel29.setText("Date1");
        Anamnèse.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 30));
        Anamnèse.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 200, 30));
        Anamnèse.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 10, 10));
        Anamnèse.add(prenom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 200, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 153));
        jLabel30.setText("Dtc Hep Bib2");
        Anamnèse.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 30));
        Anamnèse.add(prenom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 200, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 153));
        jLabel31.setText("Date2");
        Anamnèse.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 30));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 153));
        jLabel32.setText("Taille");
        Anamnèse.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 30));
        Anamnèse.add(numfiche2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 200, 30));
        Anamnèse.add(autre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 210, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 153));
        jLabel33.setText("Thorax");
        Anamnèse.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 90, 30));
        Anamnèse.add(curatif2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 210, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 153));
        jLabel34.setText("Abdomen");
        Anamnèse.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 70, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 153));
        jLabel35.setText("Organe Gen");
        Anamnèse.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 70, 30));
        Anamnèse.add(adresse2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 190, 30));
        Anamnèse.add(curatif3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 190, 30));
        Anamnèse.add(curatif4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 190, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 153));
        jLabel36.setText("Appareil loco");
        Anamnèse.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 90, 30));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 153));
        jLabel37.setText("Examen neuro");
        Anamnèse.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 80, 30));
        Anamnèse.add(echo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 190, 30));
        Anamnèse.add(cpn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 190, 30));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 153));
        jLabel38.setText("Resume_sydro");
        Anamnèse.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 90, 30));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 153));
        jLabel39.setText("Hypothèse");
        Anamnèse.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 90, 30));
        Anamnèse.add(autre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 190, 30));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 153));
        jLabel40.setText("Nom patient");
        Anamnèse.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 90, 30));

        Anamnèse.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 190, 30));

        jLabel17.setText("Code");
        Anamnèse.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, -1));

        Anamnèse.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 190, 30));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 153));
        jLabel41.setText("Nom patient");
        Anamnèse.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 90, 30));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 153));
        jLabel42.setText("Hypothèse");
        Anamnèse.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 90, 30));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 153));
        jLabel43.setText("Resume_sydro");
        Anamnèse.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 90, 30));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 153));
        jLabel44.setText("Examen neuro");
        Anamnèse.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 80, 30));
        Anamnèse.add(echo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 190, 30));
        Anamnèse.add(curatif5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 190, 30));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 153));
        jLabel45.setText("Appareil loco");
        Anamnèse.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 90, 30));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 153));
        jLabel46.setText("Organe Gen");
        Anamnèse.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 70, 30));
        Anamnèse.add(curatif6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 190, 30));
        Anamnèse.add(adresse3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 190, 30));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 153));
        jLabel47.setText("Abdomen");
        Anamnèse.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 70, 30));
        Anamnèse.add(autre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 190, 30));
        Anamnèse.add(cpn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 190, 30));
        Anamnèse.add(numfiche3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 200, 30));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 153));
        jLabel48.setText("Taille");
        Anamnèse.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 30));

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 153));
        jLabel49.setText("Thorax");
        Anamnèse.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 90, 30));
        Anamnèse.add(autre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 210, 30));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 153));
        jLabel50.setText("Nom patient");
        Anamnèse.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 90, 30));

        Anamnèse.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 190, 30));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 153));
        jLabel51.setText("Nom patient");
        Anamnèse.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 90, 30));

        Anamnèse.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 190, 30));

        jPanel1.add(Anamnèse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1150, 340));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)), "Information sur Anamnèse", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1130, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 1150, 240));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        //sy.UpdatePatient(id, nom, postnom, sexe, date, adresse, curatif, mat, echo, cpn, prenom, autre, numfiche, "exec sp_modifieridentite ?,?,?,?,?,?,?,?,?,?,?,?,?");
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        sy.insertionPhysique(jLabel17, nom, postnom, prenom1, prenom2
            , prenom3, numfiche1, numfiche2, adresse1,curatif2, curatif1,
            echo1,cpn1,autre1,autre2,adresse2,curatif3,curatif4,echo2,cpn2,
            autre3,"EXEC sp_identite ?,?,?,?,?,?,?,?,?,?,?,?");
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        //sy.DeletePatient(id, "delete from IDENTITE WHERE ID=?");
        //sy.affichage(jTable1, "select * from IDENTITE");// TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //sy.SelectionPatient(jTable1, nom, postnom, sexe, date, adresse, curatif, mat, echo, cpn, autre, numfiche, id, jLabel1, jLabel1, numfiche, prenom);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Anamnèse;
    private javax.swing.JTextField adresse1;
    private javax.swing.JTextField adresse2;
    private javax.swing.JTextField adresse3;
    private javax.swing.JTextField autre1;
    private javax.swing.JTextField autre2;
    private javax.swing.JTextField autre3;
    private javax.swing.JTextField autre4;
    private javax.swing.JTextField autre5;
    private javax.swing.JTextField cpn1;
    private javax.swing.JTextField cpn2;
    private javax.swing.JTextField cpn3;
    private javax.swing.JTextField curatif1;
    private javax.swing.JTextField curatif2;
    private javax.swing.JTextField curatif3;
    private javax.swing.JTextField curatif4;
    private javax.swing.JTextField curatif5;
    private javax.swing.JTextField curatif6;
    private javax.swing.JTextField echo1;
    private javax.swing.JTextField echo2;
    private javax.swing.JTextField echo3;
    private javax.swing.JLabel id;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField numfiche1;
    private javax.swing.JTextField numfiche2;
    private javax.swing.JTextField numfiche3;
    private javax.swing.JTextField postnom;
    private javax.swing.JTextField prenom1;
    private javax.swing.JTextField prenom2;
    private javax.swing.JTextField prenom3;
    // End of variables declaration//GEN-END:variables
}
