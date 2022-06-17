package Boutique.persistencia;

import Boutique.io.Accesorio;
import Boutique.io.Calzado;
import Boutique.io.Cliente;
import Boutique.io.Combo;
import Boutique.io.CombosProducto;
import Boutique.io.Indumentaria;
import Boutique.io.Producto;
import Boutique.io.Venta;
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
    
    
    public List<Producto> listarProductos() {
        EntityManager em = getEntity();
        List<Producto> productos = null;
        em.getTransaction().begin();
        try {
            productos = em.createNativeQuery("SELECT * FROM producto, accesorio WHERE producto.id = accesorio.id",Accesorio.class).getResultList();
            productos.addAll(em.createNativeQuery("SELECT * FROM producto, calzado WHERE producto.id = calzado.id",Calzado.class).getResultList());
            productos.addAll(em.createNativeQuery("SELECT * FROM producto, indumentaria WHERE producto.id = indumentaria.id",Indumentaria.class).getResultList());
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return productos;
    }
    
    public List<Accesorio> listarAccesorio() {
        EntityManager em = getEntity();
        List<Accesorio> productos = null;
        em.getTransaction().begin();
        try {
            productos = em.createNativeQuery("SELECT * FROM producto, accesorio WHERE producto.id = accesorio.id",Accesorio.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return productos;
    }
    
    public List<Indumentaria> listarIndumentaria() {
        EntityManager em = getEntity();
        List<Indumentaria> productos = null;
        em.getTransaction().begin();
        try {
            productos = em.createNativeQuery("SELECT * FROM producto, indumentaria WHERE producto.id = indumentaria.id",Indumentaria.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return productos;
    }
    
    public List<Calzado> listarCalzado() {
        EntityManager em = getEntity();
        List<Calzado> productos = null;
        em.getTransaction().begin();
        try {
             productos = em.createNativeQuery("SELECT * FROM producto, calzado WHERE producto.id = calzado.id",Calzado.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return productos;
    }
    
     public List<Cliente> listarClientesByName(String cliente) {
        EntityManager em = getEntity();
        List<Cliente> clientes = null;
        em.getTransaction().begin();
        try {
            clientes = em.createNativeQuery("SELECT * FROM cliente WHERE nombre LIKE '"+cliente+"%' ORDER BY nombre ASC",Cliente.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return clientes;
    }
     
     public List<Indumentaria> listarIndumentariaByNombre(String nombre, String tipo, String talle) {
        EntityManager em = getEntity();
        List<Indumentaria> productos = null;
        em.getTransaction().begin();
        try {
            productos = em.createNativeQuery("SELECT * FROM producto, indumentaria WHERE producto.id = indumentaria.id AND nombre LIKE '"+nombre+"%' AND tipo='"+tipo+"' AND talle="+talle+" ORDER BY nombre ASC",Indumentaria.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return productos;
    }


    public Combo obtenerUltimoCombo() {
        EntityManager em = getEntity();
        Combo combo = null;
        em.getTransaction().begin();
        try {
            combo = (Combo) em.createNativeQuery("SELECT * FROM combo ORDER BY id DESC LIMIT 1;",Combo.class).getSingleResult();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return combo;
    }
    
    public List<Combo> getAllCombo(){
       EntityManager em = getEntity();
        List<Combo> combos = null;
        em.getTransaction().begin();
        try {
            combos = em.createNativeQuery("SELECT * FROM combo",Combo.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return combos;
    }
    
    public List<CombosProducto> obtenerProductosByComboID(Long id){
       EntityManager em = getEntity();
        List<CombosProducto> combos = null;
        em.getTransaction().begin();
        try {
            combos = em.createNativeQuery("SELECT * FROM `combosproducto` WHERE `combo_id`="+id,CombosProducto.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return combos;
    }

    
    public Producto obtenerProductobyID(Long id){
        EntityManager em = getEntity();
        Producto producto = null;
        em.getTransaction().begin();
        try {
            producto = (Producto) em.createNativeQuery("SELECT * FROM producto WHERE producto.id = "+id,Producto.class).getSingleResult();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return producto;
    }
    
    public List<Producto> listarProductoComboSelecionados(Long id) {
        EntityManager em = getEntity();
        List<Producto> productos = null;
        em.getTransaction().begin();
        try {
            productos = em.createNativeQuery("SELECT producto.* FROM combosproducto INNER JOIN producto on producto.id = combosproducto.producto_id WHERE combo_id = "+id,Producto.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return productos;
    }
    
    public List<Calzado> listarCalzadoPorCodigo() {
        EntityManager em = getEntity();
        List<Calzado> productos = null;
        em.getTransaction().begin();
        try {
            productos = em.createNativeQuery("SELECT * FROM calzado, producto WHERE producto.id=calzado.id GROUP BY producto.codigo;",Calzado.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return productos;
    }
    
    public List<Accesorio> listarAccesorioPorCodigo() {
        EntityManager em = getEntity();
        List<Accesorio> productos = null;
        em.getTransaction().begin();
        try {
            productos = em.createNativeQuery("SELECT * FROM accesorio, producto WHERE producto.id=accesorio.id GROUP BY producto.codigo;",Accesorio.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return productos;
    }
    
    public List<Indumentaria> listarIndumentariaPorCodigo() {
        EntityManager em = getEntity();
        List<Indumentaria> productos = null;
        em.getTransaction().begin();
        try {
            productos = em.createNativeQuery("SELECT * FROM indumentaria, producto WHERE producto.id=indumentaria.id GROUP BY producto.codigo;",Indumentaria.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return productos;
    }
    
    public double precioDeProductos(String codigo){
    EntityManager em = getEntity();
        double precio = 0;
        em.getTransaction().begin();
        try {
            precio = (double) em.createNativeQuery("SELECT precioVenta FROM producto WHERE codigo="+codigo+" ORDER BY codigo DESC LIMIT 1").getSingleResult();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return precio;
    }
    
    public List<Venta> listarVentaCliente(Long id) {
        EntityManager em = getEntity();
        List<Venta> ventas = null;
        em.getTransaction().begin();
        try {
            ventas = em.createNativeQuery("SELECT * FROM venta WHERE cliente_id="+id,Venta.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return ventas;
    }
    
}
