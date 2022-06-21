package Boutique.io;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Entrega.class)
public abstract class Entrega_ {

	public static volatile SingularAttribute<Entrega, Cliente> cliente;
	public static volatile SingularAttribute<Entrega, Date> fecha;
	public static volatile SingularAttribute<Entrega, Double> monto;
	public static volatile SingularAttribute<Entrega, Long> id;

}

