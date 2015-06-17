/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.forTest;

import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;
import net.cofares.persist.PersistFacade;

/**
 *
 * @author pascal
 */
public class Main {

    public static void main(String a[]) throws JAXBException,
            FileNotFoundException {
        Vecteur v;
        v = new Vecteur(10, 20);

        PersistFacade<Vecteur> pv = new PersistFacade<>(Vecteur.class);
        System.out.println("Create");
        pv.create(v);
        System.out.println("FIND");
        Vecteur vf = pv.find("vkey.xml");
        System.out.println(Vecteur.class.toString());
    }
}
