/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iut.bad;

/**
 *
 * @author Fitahiana
 */
public class Humain {
   protected String nom;
    protected String prenom;
    protected int age;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void details() {
        System.out.println(toString());
    }

    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }

    public void manger() {
        System.out.println("Je mange.");
    }

    public void boire() {
        System.out.println("Je bois.");
    }
    
    public void ami(Humain autre, int dureeDansLesJours) {
        System.out.println(nom + " " + prenom + " est ami avec " + autre.nom + " " + autre.prenom + " depuis " + dureeDansLesJours + " jours");
    }
}
