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
public class Multiplayer implements GameMode {

    String spielerPlay2;
    String spielerPlay1;

    public Multiplayer() {
        firstPlay();
        secondPlay();
        spiel();
    }

    @Override
    public void firstPlay() {
        try{
        JOptionPane.showMessageDialog(null, "Schauen sie, dass der Zweite Spieler Ihren Zug nicht sieht!", "Zweiter Zug", JOptionPane.PLAIN_MESSAGE);
        int spielerInput = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Stein, 2) Papier, 3) Schere", "Was wählen sie?", JOptionPane.PLAIN_MESSAGE));
        if (spielerInput == 1) {
            spielerPlay1 = "Stein";
        } else if (spielerInput == 2) {
            spielerPlay1 = "Papier";
        } else if (spielerInput == 3) {
            spielerPlay1 = "Schere";
        }
        JOptionPane.showMessageDialog(null, "Schauen sie, dass der erste Spieler Ihren Zug nicht sieht!", "Zweiter Zug", JOptionPane.PLAIN_MESSAGE);
        }catch(Exception e){
            System.out.println("Falsche Eingabe");
        }
    }

    @Override
    public void secondPlay() {
        try{
        int spielerInput2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Stein, 2) Papier, 3) Schere", "Was wählen sie?", JOptionPane.PLAIN_MESSAGE));
        if (spielerInput2 == 1) {
            spielerPlay2 = "Stein";
        } else if (spielerInput2 == 2) {
            spielerPlay2 = "Papier";
        } else if (spielerInput2 == 3) {
            spielerPlay2 = "Schere";
        }
        }catch(Exception e){
            System.out.println("Falsche Eingabe");
        }
    }

    public void spiel() {
        if (spielerPlay1 == spielerPlay2) {
            JOptionPane.showMessageDialog(null, "Spieler 1 hatte: " + spielerPlay1 + " Spieler 2 hatte: " + spielerPlay2 + " Somit ist es ein Untentschieden", "Untenschieden", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay1 == "Papier" && spielerPlay2 == "Stein") {
            JOptionPane.showMessageDialog(null, "Spieler 1 hatte: " + spielerPlay1 + " und hat Gewonnen  \n Spieler 2 hatte: " + spielerPlay2 + " und hat Verloren", "Gewonnen", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay1 == "Papier" && spielerPlay2 == "Schere") {
            JOptionPane.showMessageDialog(null, "Spieler 1 hatte: " + spielerPlay1 + " und hat Verloren \n Spieler 2 hatte: " + spielerPlay2 + " und hat Gewonnen", "Verloren", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay1 == "Stein" && spielerPlay2 == "Papier") {
            JOptionPane.showMessageDialog(null, "Spieler 1 hatte: " + spielerPlay1 + " und hat Verloren \n Spieler 2 hatte: " + spielerPlay2 + " und hat Gewonnen", "Verloren", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay1 == "Stein" && spielerPlay2 == "Schere") {
            JOptionPane.showMessageDialog(null, "Spieler 1 hatte: " + spielerPlay1 + " und hat Gewonnen \n Spieler 2 hatte: " + spielerPlay2 + " und hat Verloren", "Gewonnen", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay1 == "Schere" && spielerPlay2 == "Stein") {
            JOptionPane.showMessageDialog(null, "Spieler 1 hatte: " + spielerPlay1 + " und hat Verloren \n Spieler 2 hatte: " + spielerPlay2 + " und hat Gewonnen", "Verloren", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay1 == "Schere" && spielerPlay2 == "Papier") {
            JOptionPane.showMessageDialog(null, "Spieler 1 hatte: " + spielerPlay1 + " und hat Gewonnen \n Spieler 2 hatte: " + spielerPlay2 + " und hat Verloren", "Gewonnen", JOptionPane.PLAIN_MESSAGE);
        }
        int nochmal = JOptionPane.showConfirmDialog(null, "Wollen sie nochmal Spielen?", "Spiel", JOptionPane.YES_NO_OPTION);
        if (nochmal == JOptionPane.YES_OPTION) {
            new Starter().GUI();
        }else if (nochmal == JOptionPane.NO_OPTION){
            System.exit(0);
        }
            
    }
}
