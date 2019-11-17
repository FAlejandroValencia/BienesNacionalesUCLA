package api;

import api.Departamento;
import api.EstadoEquipo;
import api.Marca;
import api.ReporteSolicitud;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-13T18:37:56")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile CollectionAttribute<Equipo, ReporteSolicitud> reporteSolicitudCollection;
    public static volatile SingularAttribute<Equipo, Marca> fkIdmarca;
    public static volatile SingularAttribute<Equipo, Integer> idequipo;
    public static volatile SingularAttribute<Equipo, Departamento> fkIddepartamento;
    public static volatile SingularAttribute<Equipo, String> nombre;
    public static volatile SingularAttribute<Equipo, EstadoEquipo> fkIdestadoequipo;

}