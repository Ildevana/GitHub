package Jpa.entites;

import Jpa.entites.Periodo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-21T17:19:27")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, Integer> id;
    public static volatile ListAttribute<Turno, Periodo> periodoList;
    public static volatile SingularAttribute<Turno, String> nome;

}