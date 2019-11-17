package api;

import api.Equipo;
import api.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-13T18:37:56")
@StaticMetamodel(ReporteSolicitud.class)
public class ReporteSolicitud_ { 

    public static volatile SingularAttribute<ReporteSolicitud, String> descripcion;
    public static volatile SingularAttribute<ReporteSolicitud, String> tipo;
    public static volatile SingularAttribute<ReporteSolicitud, Integer> idreporte;
    public static volatile SingularAttribute<ReporteSolicitud, String> estatus;
    public static volatile SingularAttribute<ReporteSolicitud, Equipo> fkIdequipo;
    public static volatile SingularAttribute<ReporteSolicitud, Date> fecharegistro;
    public static volatile SingularAttribute<ReporteSolicitud, String> observacion;
    public static volatile SingularAttribute<ReporteSolicitud, Usuario> fkUsuariocedula;

}