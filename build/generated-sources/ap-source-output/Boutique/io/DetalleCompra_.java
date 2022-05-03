package Boutique.io;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DetalleCompra.class)
public abstract class DetalleCompra_ {

	public static volatile SingularAttribute<DetalleCompra, Compra> compra;
	public static volatile SingularAttribute<DetalleCompra, Double> precioUnitario;
	public static volatile SingularAttribute<DetalleCompra, Producto> producto;
	public static volatile SingularAttribute<DetalleCompra, Long> id;
	public static volatile SingularAttribute<DetalleCompra, Integer> cantidad;

}

