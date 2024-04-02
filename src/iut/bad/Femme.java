/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iut.bad;

/**
 *
 * @author Fitahiana
 */
public class Femme extends Humain {
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public static void main(String[] args) {
        Homme homme = new Homme("Doe", "John", 30);
        Femme femme = new Femme("Doe", "Jane", 28);
        homme.ami(femme, 100); // Durée de l'amitié de 100 jours (valeur par défaut)
    }
}
