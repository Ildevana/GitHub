package Jpa.entites;

import Jpa.entites.ClienteMesa;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-21T17:19:27")
@StaticMetamodel(Mesa.class)
public class Mesa_ { 

    public static volatile SingularAttribute<Mesa, Integer> id;
    public static volatile SingularAttribute<Mesa, Integer> capacidadepessoas;
    public static volatile SingularAttribute<Mesa, Boolean> ocupada;
    public static volatile ListAttribute<Mesa, ClienteMesa> clienteMesaList;

}