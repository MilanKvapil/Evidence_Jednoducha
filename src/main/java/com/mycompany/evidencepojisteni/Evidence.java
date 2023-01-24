/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evidencepojisteni;

import java.util.ArrayList;
import java.util.Scanner;

/**pridat druhej druh pojistence
 * rozdelit do vice trid (beh, input , output) 
 * springboot na pokrocilou verzi
 * while cykly na try /catch
 * 
 * @author mlock
 */
public class Evidence {
    
    private ArrayList<Pojistenec> pojistenci = new ArrayList<>();
    private Scanner sc = new Scanner(System.in, "UTF-8");

    public void Program() {
        
        Pojistenec pojistenec = new Pojistenec("Karel", "Novak", 722555454, 33);
        pojistenci.add(pojistenec);
        Pojistenec pojistenec2 = new Pojistenec("Josef", "Novak", 722666454, 42);
        pojistenci.add(pojistenec2);
        Pojistenec pojistenec3 = new Pojistenec("Pavel", "Stastny", 711555454, 22);
        pojistenci.add(pojistenec3);

        String prikaz = "";

        while (!prikaz.equals("4")) {
            VytiskniMenu();           

            System.out.print("Zadejte příkaz: ");
            prikaz = sc.nextLine();

            switch (prikaz) {
                case "1":
                    NovyPojistenec();
                    break;

                case "2":
                    VypisPojistencu();
                    break;

                case "3":
                    if (!pojistenci.isEmpty()) {
                        VyhledatPojistence();
                    } else {
                        System.out.println("\n Evidence je prázdna prosím vytvořte noveho pojistence \n");
                    }
                    break;               

                case "4":
                    System.out.println("Zavírám evidenci ");
                    break;
                default:
                    System.out.println("Neplatna volba");
            }
        }

    }

    void VytiskniMenu() {
        System.out.println("--------------------------------");
        System.out.println("      Evidence pojištěných");
        System.out.println("--------------------------------");
        System.out.println("Můžete provést tyto akce:");
        System.out.println(" 1 - Přidat nového pojistěného");
        System.out.println(" 2 - Zobrazit výpis všech pojištěných");
        System.out.println(" 3 - Vyhledat pojistěného");        
        System.out.println(" 4 - Ukončit program");
        System.out.println("--------------------------------");
        PocetPojistencu();
    }

    void PocetPojistencu() {
        System.out.println("------------------------------------------");
        System.out.println("Počet záznamů: " + pojistenci.size());
        System.out.println("------------------------------------------");
    }

    void NovyPojistenec() {
        System.out.println("------------------------------------------");
        System.out.println("Zadejte jmeno pojisteneho: ");
        String jmeno = sc.nextLine().trim();
        
        System.out.println("------------------------------------------");
        System.out.println("Zadejte prijmeni pojisteneho: ");
        String prijmeni = sc.nextLine().trim();
        
        System.out.println("------------------------------------------");
        System.out.println("Zadejte telefonni cislo pojisteneho: ");
        long telefon = 0;
        try {
        telefon = Long.parseLong(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Chyba");
        }
        
        System.out.println("------------------------------------------");
        System.out.println("Zadejte vek pojisteneho: ");        
        int vek = 0;
        try {
            vek = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Chyba");
        }

        Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, telefon, vek);
        pojistenci.add(pojistenec);
        
        System.out.println("Záznam byl vytvořen");
        System.out.println("------------------------------------------");
    }

    void VypisPojistencu() {
        
        System.out.println("------------------------------------------");
        for (int i = 0; i < pojistenci.size(); i++) {
            System.out.print(pojistenci.get(i));
        }        
    }

    
    void VyhledatPojistence() {
        
        System.out.println("------------------------------------------");
        System.out.println("Zadejte jmeno pojisteneho: ");
        String hledaneJmeno = sc.nextLine().trim().toLowerCase();
        
        System.out.println("------------------------------------------");
        System.out.println("Zadejte prijmeni pojisteneho: ");
        String hledanePrijmeni = sc.nextLine().trim().toLowerCase();
        
        for (Pojistenec pojistenec : pojistenci) {
            if (pojistenec.getJmeno().toLowerCase().equals(hledaneJmeno) && pojistenec.getPrijmeni().toLowerCase().equals(hledanePrijmeni)) {
                System.out.print(pojistenec + "\n");
            }
        }
    }  
}

