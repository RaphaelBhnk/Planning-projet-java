/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.bean;

/**
 *
 * @author Raphael
 */
public class Utilisateur {
  //ID
  private int id = 0;
  //Nom de l'utilisateur
  private String nom = "";
  //Prénom de l'utilisateur
  private String prenom = "";
  
  private String email = "";
  
  private int droit = 0;
  
  
  public Eleve(int id, String nom, String prenom) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
  }
  public Eleve(){};
     
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  } 
}
