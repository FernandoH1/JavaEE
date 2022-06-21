package Boutique.io;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Venta.class)
public abstract class Venta_ {

	public static volatile SingularAttribute<Venta, String> metodoPago;
	public static volatile SingularAttribute<Venta, Cliente> cliente;
	public static volatile SingularAttribute<Venta, Double> deuda;
	public static volatile SingularAttribute<Venta, Double> descuento;
	public static volatile SingularAttribute<Venta, String> tipoPago;
	public static volatile SingularAttribute<Venta, Long> id;
	public static volatile SingularAttribute<Venta, Double> precioTotal;
	public static volatile ListAttribute<Venta, DetalleDeVenta> detalleDeVenta;
	public static volatile SingularAttribute<Venta, Date> fechaVenta;

}

