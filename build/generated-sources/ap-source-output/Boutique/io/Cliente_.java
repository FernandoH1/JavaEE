package Boutique.io;

import java.util.ArrayList;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	public static volatile SingularAttribute<Cliente, String> ci;
	public static volatile SingularAttribute<Cliente, String> apellido;
	public static volatile SingularAttribute<Cliente, String> direccion;
	public static volatile ListAttribute<Cliente, Venta> ventas;
	public static volatile SingularAttribute<Cliente, Long> id;
	public static volatile SingularAttribute<Cliente, ArrayList> telefonos;
	public static volatile SingularAttribute<Cliente, String> nombre;

}

