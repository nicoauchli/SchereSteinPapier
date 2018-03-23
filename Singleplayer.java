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
public class Singleplayer implements GameMode {

    String computerPlay;
    String spielerPlay;

    public Singleplayer() {
        firstPlay();
        secondPlay();
        spiel();
    }

    @Override
    public void firstPlay() {
        try {
            int spielerInput = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Stein, 2) Papier, 3) Schere", "Was wählen sie?", JOptionPane.PLAIN_MESSAGE));
            if (spielerInput == 1) {
                spielerPlay = "Stein";
            } else if (spielerInput == 2) {
                spielerPlay = "Papier";
            } else if (spielerInput == 3) {
                spielerPlay = "Schere";
            }
        } catch (Exception e) {
            System.out.println("Falsche Eingabe");
        }
    }

    @Override
    public void secondPlay() {
        try {
            int computerInt = (int) ((Math.random()) * 3 + 1);
            if (computerInt == 1) {
                computerPlay = "Stein";
            } else if (computerInt == 2) {
                computerPlay = "Papier";
            } else if (computerInt == 3) {
                computerPlay = "Schere";
            }
        } catch (Exception e) {
            System.out.println("Falsche Eingabe");
        }
    }

    public void spiel() {
        if (spielerPlay == computerPlay) {
            JOptionPane.showMessageDialog(null, "Sie hatten: " + spielerPlay + " Ihr gegner hatte " + computerPlay, "Untenschieden", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay == "Papier" && computerPlay == "Stein") {
            JOptionPane.showMessageDialog(null, "Sie hatten: " + spielerPlay + " Ihr gegner hatte " + computerPlay, "Gewonnen", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay == "Papier" && computerPlay == "Schere") {
            JOptionPane.showMessageDialog(null, "Sie hatten: " + spielerPlay + " Ihr gegner hatte " + computerPlay, "Verloren", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay == "Stein" && computerPlay == "Papier") {
            JOptionPane.showMessageDialog(null, "Sie hatten: " + spielerPlay + " Ihr gegner hatte " + computerPlay, "Verloren", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay == "Stein" && computerPlay == "Schere") {
            JOptionPane.showMessageDialog(null, "Sie hatten: " + spielerPlay + " Ihr gegner hatte " + computerPlay, "Gewonnen", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay == "Schere" && computerPlay == "Stein") {
            JOptionPane.showMessageDialog(null, "Sie hatten: " + spielerPlay + " Ihr gegner hatte " + computerPlay, "Verloren", JOptionPane.PLAIN_MESSAGE);
        } else if (spielerPlay == "Schere" && computerPlay == "Papier") {
            JOptionPane.showMessageDialog(null, "Sie hatten: " + spielerPlay + " Ihr gegner hatte " + computerPlay, "Gewonnen", JOptionPane.PLAIN_MESSAGE);
        }
        int nochmal = JOptionPane.showConfirmDialog(null, "Wollen sie nochmal Spielen?", "Spiel", JOptionPane.YES_NO_OPTION);
        if (nochmal == JOptionPane.YES_OPTION) {
            new Starter().GUI();
        }else if (nochmal == JOptionPane.NO_OPTION){
            System.exit(0);
        }

    }
}
