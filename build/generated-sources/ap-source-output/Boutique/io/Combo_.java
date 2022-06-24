package Boutique.io;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Combo.class)
public abstract class Combo_ {

	public static volatile SingularAttribute<Combo, String> descripcion;
	public static volatile SingularAttribute<Combo, Double> precio;
	public static volatile ListAttribute<Combo, CombosProducto> combosProductos;
	public static volatile SingularAttribute<Combo, Long> id;
	public static volatile SingularAttribute<Combo, Integer> cantidad;
	public static volatile ListAttribute<Combo, DetalleDeVenta> detalleDeVenta;
	public static volatile SingularAttribute<Combo, String> nombre;

}

