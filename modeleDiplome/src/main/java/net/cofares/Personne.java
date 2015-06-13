/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pascalfares
 */
@XmlRootElement
public class Personne {
    String Nom;
    String prenom;
    String email;
    String numeroTel;
}
