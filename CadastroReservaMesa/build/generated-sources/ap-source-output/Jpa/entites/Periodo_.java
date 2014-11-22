package Jpa.entites;

import Jpa.entites.ClienteMesa;
import Jpa.entites.Turno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-21T17:19:27")
@StaticMetamodel(Periodo.class)
public class Periodo_ { 

    public static volatile SingularAttribute<Periodo, Integer> id;
    public static volatile ListAttribute<Periodo, ClienteMesa> clienteMesaList;
    public static volatile SingularAttribute<Periodo, Turno> idturno;

}