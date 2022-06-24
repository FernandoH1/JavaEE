package Boutique.io;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DetalleDeVenta.class)
public abstract class DetalleDeVenta_ {

	public static volatile SingularAttribute<DetalleDeVenta, Double> precioProvedor;
	public static volatile SingularAttribute<DetalleDeVenta, Venta> venta;
	public static volatile SingularAttribute<DetalleDeVenta, Double> precioUnitario;
	public static volatile SingularAttribute<DetalleDeVenta, Double> precioCompra;
	public static volatile SingularAttribute<DetalleDeVenta, Combo> combo;
	public static volatile SingularAttribute<DetalleDeVenta, Long> id;
	public static volatile SingularAttribute<DetalleDeVenta, Integer> cantidad;
	public static volatile SingularAttribute<DetalleDeVenta, Producto> producto;

}

