/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.dao;

/**
 *Swing
 * listener
 * serialisation
 * jdbc
 * bdd
 * TP2-TP3
 * Un peu TP4
 * @author Raphael
 */
package com.sdz.dao.implement;
//CTRL + SHIFT + O pour générer les imports
public class EleveDAO extends DAO<Eleve> {
  public EleveDAO(Connection conn) {
    super(conn);
  }

  public boolean create(Eleve obj) {
    return false;
  }

  public boolean delete(Eleve obj) {
    return false;
  }
   
  public boolean update(Eleve obj) {
    return false;
  }
   
  public Eleve find(int id) {
    Eleve eleve = new Eleve();      
      
    try {
      ResultSet result = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM eleve WHERE elv_id = " + id);
      if(result.first())
        eleve = new Eleve(
          id,
          result.getString("elv_nom"),
          result.getString("elv_prenom"
        ));         
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return eleve;
  }
}
