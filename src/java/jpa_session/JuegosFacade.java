/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa_session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa_db.Juegos;

/**
 *
 * @author lalo
 */
@Stateless
public class JuegosFacade extends AbstractFacade<Juegos> implements JuegosFacadeLocal {

    @PersistenceContext(unitName = "PaginaJuegos27PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JuegosFacade() {
        super(Juegos.class);
    }
    
}
