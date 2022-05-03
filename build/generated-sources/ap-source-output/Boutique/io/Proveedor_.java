package Boutique.io;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Proveedor.class)
public abstract class Proveedor_ {

	public static volatile SingularAttribute<Proveedor, Integer> rut;
	public static volatile SingularAttribute<Proveedor, Enum> tipo;
	public static volatile ListAttribute<Proveedor, Compra> compras;
	public static volatile SingularAttribute<Proveedor, String> ci;
	public static volatile SingularAttribute<Proveedor, Long> id;
	public static volatile SingularAttribute<Proveedor, String> telefono;
	public static volatile SingularAttribute<Proveedor, String> nombre;

}

