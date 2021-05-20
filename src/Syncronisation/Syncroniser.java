/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Syncronisation;

import Connexion.Connexion;
import com.toedter.calendar.JDateChooser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author honore
 */
public class Syncroniser {

    PreparedStatement ps;
    ResultSet rs;

    // 3requete
    
     public void appelle(JPanel v,JPanel w) {
        try {
            v.removeAll();
            v.add(w);
            v.repaint();
            v.revalidate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur des pages" + e.getMessage());
        }
    }
     
    public void insertionPatient(
            JTextField nom,
            JTextField postnom,
            JComboBox sexe, JXDatePicker datenaiss,
            JTextField adresse, JTextField curatif,
            JTextField mat, JTextField echo, JTextField cpn,JTextField pren,
            JTextField autre, JTextField numFiche, String requete
    ) {
        try {
            if (nom.getText().isEmpty() || postnom.getText().isEmpty() | adresse.getText().isEmpty() || sexe.getSelectedItem().toString().isEmpty() || curatif.getText().isEmpty() || echo.getText().isEmpty() || cpn.getText().isEmpty() || mat.getText().isEmpty() || numFiche.getText().isEmpty() || datenaiss.getDate().toString().isEmpty() || autre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Veiller remplir tous les champs !!!");
            } else {
                ps = Connexion.con().prepareCall(requete);
                ps.setString(1, nom.getText().toUpperCase());
                ps.setString(2, postnom.getText().toUpperCase());
                ps.setString(3, sexe.getSelectedItem().toString().toUpperCase());
                ps.setString(4, datenaiss.getDate().toString());
                ps.setString(5, adresse.getText().toUpperCase());
                ps.setString(6, curatif.getText().toUpperCase());
                ps.setString(7, mat.getText().toUpperCase());
                ps.setString(8, echo.getText().toUpperCase());
                ps.setString(9, cpn.getText().toUpperCase());
                ps.setString(10, autre.getText().toUpperCase());
                ps.setString(11, numFiche.getText().toUpperCase());
                ps.setString(12, pren.getText().toUpperCase());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Patient Identifié");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur d'Indentification de patient" + e.getMessage());
        }
    }

    public void UpdatePatient(
            JLabel id,
            JTextField nom,
            JTextField postnom,
            JComboBox sexe, JXDatePicker datenaiss,
            JTextField adresse, JTextField curatif,
            JTextField mat, JTextField echo, JTextField cpn,JTextField pren,
            JTextField autre, JTextField numFiche, String requete
    ) {
        try {
            if (nom.getText().isEmpty() || postnom.getText().isEmpty() | adresse.getText().isEmpty() || sexe.getSelectedItem().toString().isEmpty() || curatif.getText().isEmpty() || echo.getText().isEmpty() || cpn.getText().isEmpty() || mat.getText().isEmpty() || numFiche.getText().isEmpty() ||  datenaiss.getDate().toString().isEmpty() || autre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Veiller remplir tous les champs !!!");
            } else {
                ps = Connexion.con().prepareCall(requete);
                ps.setString(1, id.getText());
                ps.setString(2, nom.getText().toUpperCase());
                ps.setString(3, postnom.getText().toUpperCase());
                ps.setString(4, sexe.getSelectedItem().toString().toUpperCase());
                ps.setString(5,  datenaiss.getDate().toString());
                ps.setString(6, adresse.getText().toUpperCase());
                ps.setString(7, curatif.getText().toUpperCase());
                ps.setString(8, mat.getText().toUpperCase());
                ps.setString(9, echo.getText().toUpperCase());
                ps.setString(10, cpn.getText().toUpperCase());
                ps.setString(11, autre.getText().toUpperCase());
                ps.setString(12, numFiche.getText().toUpperCase());
                ps.setString(13, pren.getText().toUpperCase());
                ps.execute();
            JOptionPane.showMessageDialog(null, "Patient Modifié");

        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur d'Indentification de patient" + e.getMessage());
        }
    }

    public void DeletePatient(JLabel id, String requete) {
        try {
            ps = Connexion.con().prepareStatement(requete);
            ps.setString(1, id.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Patient Supprimé");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur de suppression de  patient" + e.getMessage());
        }
    }

    public void affichage(JTable table, String requete) {
        try {
            ps = Connexion.con().prepareStatement(requete);
            rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur d'affichage des informations" + e.getMessage());
        }
    }

    public void insertionPhysique(
            JLabel codepers,
            JTextField agent,
            JTextField temp,
            JTextField FC, JTextField FR,
            JTextField SQ02, JTextField MEnsuration_poid,
            JTextField Taill,
            JTextField Ta, JTextField Pouls,
            JTextField EtatGeneral, JTextField Paeu,
            JTextField Aire_Gangl,
            JTextField Sphere_Orl, JTextField thorax,
            JTextField Abdomen, JTextField Organe_genitaux,
            JTextField Apareil_loco, JTextField Examen_neuro,
            JTextField resume_sydro, JTextField hypothese,
            String requete
    ) {
        try {
            if (agent.getText().isEmpty()
                    || temp.getText().isEmpty()
                    || FC.getText().isEmpty()
                    || FR.getText().isEmpty()
                    || SQ02.getText().isEmpty()
                    || MEnsuration_poid.getText().isEmpty()
                    || Taill.getText().isEmpty() 
                    || Ta.getText().isEmpty()
                    || Pouls.getText().isEmpty() 
                    || EtatGeneral.getText().isEmpty()
                    || Paeu.getText().isEmpty()
                    ||Aire_Gangl.getText().isEmpty()
                    ||Sphere_Orl.getText().isEmpty()
                    ||thorax.getText().isEmpty()
                    ||Abdomen.getText().isEmpty()
                    ||Organe_genitaux.getText().isEmpty()
                    ||Apareil_loco.getText().isEmpty()
                    ||Examen_neuro.getText().isEmpty()
                    ||resume_sydro.getText().isEmpty()
                    ||hypothese.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Veiller remplir tous les champs !!!");
            } else {
                ps = Connexion.con().prepareStatement(requete);
                ps.setString(1, codepers.getText().toUpperCase());
                ps.setString(2, agent.getText().toUpperCase());
                ps.setString(3, temp.getText().toUpperCase());
                ps.setString(4, FC.getText());
                ps.setString(5, FR.getText().toUpperCase());
                ps.setString(6, SQ02.getText().toUpperCase());
                ps.setString(7, MEnsuration_poid.getText().toUpperCase());
                ps.setString(8, Taill.getText().toUpperCase());
                ps.setString(9, Ta.getText().toUpperCase());
                ps.setString(10, Pouls.getText().toUpperCase());
                ps.setString(11, EtatGeneral.getText().toUpperCase());
                ps.setString(12, Paeu.getText().toUpperCase());
                ps.setString(13, Aire_Gangl.getText().toUpperCase());
                ps.setString(14, Sphere_Orl.getText().toUpperCase());
                ps.setString(15, thorax.getText().toUpperCase());
                ps.setString(16, Abdomen.getText().toUpperCase());
                ps.setString(17, Organe_genitaux.getText().toUpperCase());
                ps.setString(18, Apareil_loco.getText().toUpperCase());
                ps.setString(19, Examen_neuro.getText().toUpperCase());
                ps.setString(20, resume_sydro.getText().toUpperCase());
                ps.setString(21, hypothese.getText().toUpperCase());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Physique Identifié");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur d'Indentification de patient" + e.getMessage());
        }
    }

    public void SelectionPatient(JTable table,
            JTextField nom,
            JTextField postnom,
            JComboBox sexe,JXDatePicker datenaiss,
            JTextField adresse, JTextField curatif,
            JTextField mat, JTextField echo, JTextField cpn,
            JTextField autre, JTextField numFiche, JLabel id, JLabel numMesuel, JLabel numAnnuel,
            JTextField numfiche,JTextField prenom
    ) {
        try {
            int i = table.getSelectedRow();
            String u = table.getModel().getValueAt(i, 0).toString();
            ps = Connexion.con().prepareStatement("select * from IDENTITE WHERE ID='" + u + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                nom.setText(rs.getString(2));
                postnom.setText(rs.getString(3));
                sexe.setSelectedItem(rs.getString(4));
                //datenaiss.setDate(rs.getString(""));
//                numMesuel.setText(rs.getString(14));
//                numAnnuel.setText(rs.getString(7));
                adresse.setText(rs.getString(8));
                curatif.setText(rs.getString(9));
                mat.setText(rs.getString(10));
                echo.setText(rs.getString(11));
                cpn.setText(rs.getString(12));
                autre.setText(rs.getString(13));
                numfiche.setText(rs.getString(15));
                prenom.setText(rs.getString(16));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur de selection des information" + e.getMessage());
        }

    }
    public void Anamenese(int ID, String nom, String bcg, String dtc, String pneumo, String vpbo, String vpi3, String vpob1,
            String dtc3, String vpob2, String var,
            JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6,
            JTextField txt7, JTextField txt8, JTextField txt9, JTextField txt10, JTextField txt11, JTextField txt12,
            JTextField txt13, JTextField txt14, JTextField txt15, JTextField txt16, JTextField txt17, JTextField txt18,
            JTextField mois2, JTextField mois12_15, JTextField mois3, JTextField mois9,
            JTextField mois6, JTextField mois24, JTextArea Antecedent, JTextArea Environnement, JTextArea Complement) {

        try {
            ps =Connexion.con().prepareCall("exec sp_annamnese ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                    + "?,?,?,?,?,?,?");
            ps.setInt(1, ID);
            ps.setString(2, nom);
            ps.setString(3, bcg);
            ps.setString(4, txt1.getText());
            ps.setString(5, txt2.getText());
            ps.setString(6, dtc);
            ps.setString(7, txt3.getText());
            ps.setString(8, txt4.getText());
            ps.setString(9, pneumo);
            ps.setString(10, txt5.getText());
            ps.setString(11, txt6.getText());
            ps.setString(12, vpbo);
            ps.setString(13, txt7.getText());
            ps.setString(14, txt8.getText());
            ps.setString(15, vpi3);
            ps.setString(16, txt9.getText());
            ps.setString(17, txt10.getText());
            ps.setString(18, vpob1);
            ps.setString(19, txt11.getText());
            ps.setString(20, txt12.getText());
            ps.setString(21, dtc3);
            ps.setString(22, txt13.getText());
            ps.setString(23, txt14.getText());
            ps.setString(24, vpob2);
            ps.setString(25, txt15.getText());
            ps.setString(26, txt16.getText());
            ps.setString(27, var);
            ps.setString(28, txt17.getText());
            ps.setString(29, txt18.getText());
            ps.setString(30, mois2.getText());
            ps.setString(31, mois3.getText());
            ps.setString(32, mois6.getText());
            ps.setString(33, mois9.getText());
            ps.setString(34, mois12_15.getText());
            ps.setString(35, mois24.getText());
            ps.setString(36, Antecedent.getText());
            ps.setString(37, Environnement.getText());
            ps.setString(38, Complement.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Vaccination Enregistrée  avec succès");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erreur" + ex.getMessage());
           
        }

    }
     public void paraclinique( JLabel Agent, JLabel Exam1, JLabel Exam2, JLabel Exam3,
            JLabel Exam4, JLabel Exam5, JLabel Exam6, JLabel Exam7, JLabel Exam8, JTextArea para) {
        try {
            ps = Connexion.con().prepareCall("exec sp_paraclinique ?,?,?,?,?,?,?,?,?,?,?");
            ps.setString(1, Agent.getText());
            ps.setString(2, Exam1.getText());
            ps.setString(3, Exam2.getText());
            ps.setString(4, Exam3.getText());
            ps.setString(5, Exam4.getText());
            ps.setString(6, Exam5.getText());
            ps.setString(7, Exam6.getText());
            ps.setString(8, Exam7.getText());
            ps.setString(9, Exam8.getText());
            ps.setString(10, para.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Paraclinique Enreigistré");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e.getMessage());
        }
    }
     //paraclinique
     public void paraclinique(String nom, JLabel Agent, JLabel Exam1, JLabel Exam2, JLabel Exam3,
            JLabel Exam4, JLabel Exam5, JLabel Exam6, JLabel Exam7, JLabel Exam8, JTextArea para,String requete) {
        try {
            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, nom);

            ps.setString(2, Agent.getText());
            ps.setString(3, Exam1.getText());
            ps.setString(4, Exam2.getText());
            ps.setString(5, Exam3.getText());
            ps.setString(6, Exam4.getText());
            ps.setString(7, Exam5.getText());
            ps.setString(8, Exam6.getText());
            ps.setString(9, Exam7.getText());
            ps.setString(10, Exam8.getText());
            ps.setString(11, para.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Paraclinique Enreigistré");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e.getMessage());
        }
    }
     //deplacer examen
     public void deplacerEx1(JTable u, JLabel Exam1) {
        try {
            int i = u.getSelectedRow();
            Exam1.setText(u.getModel().getValueAt(i, 1).toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }
     //condition de deplacement des maladie
     public void deplacermaladie(JTable tab,JLabel exam1,JLabel exit1,JLabel exit2,JLabel exit3,JLabel exit4
     ,JLabel exit5,JLabel exit6,JLabel exit7,JLabel exit8,JLabel exam2,JLabel exam3,JLabel exam4,JLabel exam5
     ,JLabel exam6,JLabel exam7,JLabel exam8)
     {
         if (exam1.getText().equals("")) {
            deplacerEx1(tab, exam1);
            exit1.setVisible(true);
        } else if (!exam1.getText().equals("") && exam2.getText().equals("")) {
            deplacerEx1(tab, exam2);
            exit2.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("") && exam3.getText().equals("")) {
            deplacerEx1(tab, exam3);
            exit3.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("") && !exam3.getText().equals("") && exam4.getText().equals("")) {
            deplacerEx1(tab, exam4);
            exit4.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("") && !exam3.getText().equals("") && !exam4.getText().equals("") && exam5.getText().equals("")) {
            deplacerEx1(tab, exam5);
            exit5.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("")
                && !exam3.getText().equals("") && !exam4.getText().equals("") && !exam5.getText().equals("") && exam6.getText().equals("")) {
            deplacerEx1(tab, exam6);
            exit6.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("")
                && !exam3.getText().equals("") && !exam4.getText().equals("") && !exam5.getText().equals("") && !exam6.getText().equals("") && exam7.getText().equals("")) {
            deplacerEx1(tab, exam7);
            exit7.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("")
                && !exam3.getText().equals("") && !exam4.getText().equals("") && !exam5.getText().equals("")
                && !exam6.getText().equals("") && !exam7.getText().equals("") && exam8.getText().equals("")) {
            deplacerEx1(tab, exam8);
            exit8.setVisible(true);
        }
     }
     public void savehematologie(JTextField Examen,String requete) {
        try {

            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, Examen.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Enregistré");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }

    }
    //    ---------------------------------------------------------------------------------------------------------------------------------
// enregistrement parasitologie

    public void saveparasitologie(JTextField Examen,String requete) {
        try {

            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, Examen.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Enregistré");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }

    }
    //    ---------------------------------------------------------------------------------------------------------------------------------
// enregistrement examen urologie

    public void saveuROlogie(JTextField Examen,String requete) {
        try {

            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, Examen.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Enregistré");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }

    }
    //    ---------------------------------------------------------------------------------------------------------------------------------
// enregistrement examen lcr

    public void saveLCR(JTextField Examen,String requete) {
        try {

            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, Examen.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Enregistré");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }

    }
    //    ---------------------------------------------------------------------------------------------------------------------------------
// enregistrement examen seroImmunologie

    public void saveseroImmunologie(JTextField Examen,String requete) {
        try {

            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, Examen.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Enregistré");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }

    }
    //    ---------------------------------------------------------------------------------------------------------------------------------
// enregistrement EXAMEN UOLOGGIE

    public void saveUologie(JTextField Examen,String requete) {
        try {

            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, Examen.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Enregistrer");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }

    }
// enregistrement examen bio

    public void saveBio(JTextField Examen,String requete) {
        try {

            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, Examen.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Enregistré");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }

    }
    public void SaveExamen(JTextField Examen, JTextField Apropos,String requete) {
        try {

            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, Examen.getText());
            ps.setString(2, Apropos.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Enregistré");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }

    }
}
