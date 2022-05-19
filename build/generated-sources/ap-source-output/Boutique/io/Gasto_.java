package Boutique.io;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Gasto.class)
public abstract class Gasto_ {

	public static volatile SingularAttribute<Gasto, Rubro> rubro;
	public static volatile SingularAttribute<Gasto, Date> fecha;
	public static volatile SingularAttribute<Gasto, Double> monto;
	public static volatile SingularAttribute<Gasto, Long> id;

}

