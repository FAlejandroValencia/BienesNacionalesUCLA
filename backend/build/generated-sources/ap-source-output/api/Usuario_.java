package api;

import api.Departamento;
import api.ReporteSolicitud;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-13T18:37:56")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> tipo;
    public static volatile SingularAttribute<Usuario, String> estatus;
    public static volatile SingularAttribute<Usuario, String> cedula;
    public static volatile SingularAttribute<Usuario, String> contrasenna;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile CollectionAttribute<Usuario, ReporteSolicitud> reporteSolicitudCollection;
    public static volatile SingularAttribute<Usuario, Departamento> fkIddepartamento;
    public static volatile SingularAttribute<Usuario, String> nombre;

}