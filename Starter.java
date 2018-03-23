/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.SSP;

import javax.swing.JOptionPane;

/**
 *
 * @author nico
 */
public class Starter {

    GameMode gamemode;

    /**
     * @param args the command line arguments
     */
    public Starter() {
        System.out.println("Die Regeln von Schere,Stein,Papier");
        System.out.println("----------------------------------");
        System.out.println("Schere schneidet Papier");
        System.out.println("Papier umwickelt Stein");
        System.out.println("Stein schleift Schere");
        GUI();

    }

    public void GUI() {
        try {
            int input = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Gamemode",
                    "1) Singleplayer 2) Multiplayer",
                    JOptionPane.PLAIN_MESSAGE));
            if (input == 1) {
                gamemode = new Singleplayer();
            } else {
                gamemode = new Multiplayer();
            }
        } catch (Exception e) {
            System.out.println("Falsche Eingabe");
        }

    }

    public static void main(String[] args) {
        new Starter();
    }
}
