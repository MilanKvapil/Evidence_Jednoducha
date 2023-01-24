/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evidencepojisteni;

/**
 *
 * @author mlock
 */
public class Pojistenec implements RozhraniPojistenec {

  private String jmeno;
  private String prijmeni;
  private long telefon;
  private int vek; 

  public Pojistenec(String jmeno, String prijmeni, long telefon, int vek) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.telefon = telefon;
    this.vek = vek;    
  }

  public String getJmeno() {
    return jmeno;
  }
  
  public String getPrijmeni() {
      return prijmeni;
  }

  public long getTelefon() {
    return telefon;
  }
  
  public int getVek () {
     return vek;
  }
  
  @Override
    public String toString() {
        return jmeno + "    " + prijmeni + "    tel: " + telefon + "    " + vek + " let\n";
    }
}
