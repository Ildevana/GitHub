package Jpa.entites;

import Jpa.entites.Cliente;
import Jpa.entites.ClienteMesaPK;
import Jpa.entites.Mesa;
import Jpa.entites.Periodo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-21T17:19:27")
@StaticMetamodel(ClienteMesa.class)
public class ClienteMesa_ { 

    public static volatile SingularAttribute<ClienteMesa, Mesa> mesa;
    public static volatile SingularAttribute<ClienteMesa, Cliente> cliente;
    public static volatile SingularAttribute<ClienteMesa, Integer> qtdocupada;
    public static volatile SingularAttribute<ClienteMesa, Date> data;
    public static volatile SingularAttribute<ClienteMesa, ClienteMesaPK> clienteMesaPK;
    public static volatile SingularAttribute<ClienteMesa, Periodo> periodo;

}