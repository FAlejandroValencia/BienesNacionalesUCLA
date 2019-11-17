package api;

import api.Equipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-13T18:37:56")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile SingularAttribute<Marca, Integer> idmarca;
    public static volatile CollectionAttribute<Marca, Equipo> equipoCollection;
    public static volatile SingularAttribute<Marca, String> nombre;

}