/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Employe;

/**
 *
 * @author Nouh
 */
public class ServiceEmploye extends AbstractFacade<Employe>{
    @Override
    protected Class<Employe> getEntityClass() {
        return Employe.class;
    }
    
}
