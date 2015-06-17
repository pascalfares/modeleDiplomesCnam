/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.persist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author pascal
 * @param <T> The class to be persited
 */
public class PersistFacade<T extends HasId> {

    public static final String RootDepot = "/home/depot/";

    private final Class<T> entityClass;

    public PersistFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public T create(T entity) throws PropertyException, JAXBException {
        
        File file = new File(RootDepot + entity.getKey());
        JAXBContext jaxbContext = JAXBContext.newInstance(entityClass);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(entity, file);
        jaxbMarshaller.marshal(entity, System.out);
        return entity;
        
    }

    public T edit(T entity) throws JAXBException {
        File file = new File(RootDepot + entity.getKey());
        JAXBContext jaxbContext = JAXBContext.newInstance(entityClass);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(entity, file);
        jaxbMarshaller.marshal(entity, System.out);
        return entity;
    }

    public T remove(T entity) {
        return entity;
    }

    T _find(File f) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(entityClass);
        Unmarshaller u = jc.createUnmarshaller();
        return (T) u.unmarshal(f);
    }

    public T find(String id) throws JAXBException, FileNotFoundException {
        File f = new File(RootDepot+id);

        return _find(f);
    }

    public Collection<T> findAll() throws JAXBException {
        File depot = new File(RootDepot);
        ArrayList<T> lt = new ArrayList<>();

        for (final File fileEntry : depot.listFiles()) {
            if (fileEntry.isDirectory()) {
                //Ne rien faire pour le moment
            } else {
                lt.add(_find(fileEntry));
            }
        }
        return lt;
    }

}
