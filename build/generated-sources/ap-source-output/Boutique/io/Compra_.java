package Boutique.io;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Compra.class)
public abstract class Compra_ {

	public static volatile SingularAttribute<Compra, Date> fechaCompra;
	public static volatile ListAttribute<Compra, DetalleCompra> detalleCompras;
	public static volatile SingularAttribute<Compra, Double> valorCompra;
	public static volatile SingularAttribute<Compra, Proveedor> proveedor;
	public static volatile SingularAttribute<Compra, Long> id;

}

