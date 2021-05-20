/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author BIENFAIT
 */
public class Connexion {

    static Connection cx;

    public static Connection con() {
        try {
            cx = DriverManager.getConnection("jdbc:sqlserver://BIENFAIT\\SA:1433;databaseName=MEDICAL", "sa", "bienfait");
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
        return cx;
    }
    public static void main(String[] args) {
        con();
    }
}
