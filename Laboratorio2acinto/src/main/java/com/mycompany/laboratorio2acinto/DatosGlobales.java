/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio2acinto;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class DatosGlobales {
    // Esta variable será la "memoria central" de tu programa
    public static DefaultTableModel modeloGlobal = new DefaultTableModel(
        new Object[][]{}, 
        new String[]{"Usuario", "Nombre", "Puesto", "Estado", "Password"}
    );
}
