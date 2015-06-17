/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.forTest;

import javax.xml.bind.annotation.XmlRootElement;
import net.cofares.persist.HasId;

/**
 *
 * @author pascal
 */
@XmlRootElement
public class Vecteur implements HasId {

    private int x;
    private int y;

    public Vecteur(){
        
    }
    public Vecteur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getKey() {
        return "vkey.xml";

    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
}
