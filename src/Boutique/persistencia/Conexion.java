package Boutique.persistencia;

import Boutique.io.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Conexion {
    
    private Conexion() {
    }
    
    public static Conexion getInstance() {
        return ConexionHolder.INSTANCE;
    }
    
    private static class ConexionHolder {

        private static final Conexion INSTANCE = new Conexion();
        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BoutiquePU");
        private static final EntityManager em = emf.createEntityManager();
    }

    public EntityManager getEntity(){
        return ConexionHolder.em;
    }
    
    public void guardar(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public void merge(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public void delete(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public void refresh(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.refresh(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public void closeConection(){
        getEntity().close();
    }
    
    public List<Cliente> listarClientes() {
        EntityManager em = getEntity();
        List<Cliente> clientes = null;
        em.getTransaction().begin();
        try {
            clientes = em.createNativeQuery("SELECT * FROM cliente",Cliente.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return clientes;
    }
    
}
