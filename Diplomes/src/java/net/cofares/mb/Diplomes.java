/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.mb;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import net.cofares.entity.Diplome;
import net.cofares.facade.AbstractFacadeNoT;

/**
 *
 * @author pascalfares
 */
@ManagedBean(name = "Diplomes")
@SessionScoped
public class Diplomes extends AbstractFacadeNoT<Diplome> {
private final EntityManagerFactory emf;
    /**
     * Creates a new instance of ListeDiplomes
     */
    public Diplomes() {
        super(Diplome.class);
         emf = Persistence.createEntityManagerFactory("DiplomesPU");
    }

    public List<Diplome> getAll() {
        return super.findAll();
    }
    
    @Override
    protected EntityManagerFactory getEntityManagerFactory() {
       return emf;
    }

    
    
}
