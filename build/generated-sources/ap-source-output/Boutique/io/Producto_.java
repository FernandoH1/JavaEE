package Boutique.io;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Producto.class)
public abstract class Producto_ {

	public static volatile SingularAttribute<Producto, String> marca;
	public static volatile ListAttribute<Producto, DetalleCompra> detalleCompras;
	public static volatile SingularAttribute<Producto, String> foto;
	public static volatile ListAttribute<Producto, Combo> combos;
	public static volatile ListAttribute<Producto, DetalleDeVenta> detalleDeVentas;
	public static volatile SingularAttribute<Producto, Long> id;
	public static volatile SingularAttribute<Producto, Double> precioProveedor;
	public static volatile SingularAttribute<Producto, Double> precioVenta;
	public static volatile SingularAttribute<Producto, String> nombre;

}

