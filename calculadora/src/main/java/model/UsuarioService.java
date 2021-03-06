/*
** This file contains the persistence class.
** Each class attribute is known as persistence attribute
 */
package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


/**
 *
 * @author fabricio
 */

public class UsuarioService { //persistence class
    
	public List<Usuario> list(String nomeUsuario){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
            EntityManager em = emf.createEntityManager();
            List<Usuario> registro = null;
            Query query = em.createQuery("FROM usuario u WHERE login = '"+nomeUsuario+"'"); 
            //Query query = em.createQuery("FROM usuario u "); 
            registro = query.getResultList();
            em.close();
            emf.close();
            return registro;            
	}
	
}
