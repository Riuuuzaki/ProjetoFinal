package com.mycompany.testeproject.persistence.entity;

import com.mycompany.testeproject.persistence.entity.Tausencia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-29T10:32:14")
@StaticMetamodel(Tcolaborador.class)
public class Tcolaborador_ { 

    public static volatile SingularAttribute<Tcolaborador, Date> dataFimDoc;
    public static volatile SingularAttribute<Tcolaborador, String> nome;
    public static volatile SingularAttribute<Tcolaborador, String> numDoc;
    public static volatile SingularAttribute<Tcolaborador, Character> estadoCivil;
    public static volatile SingularAttribute<Tcolaborador, Long> nrColaborador;
    public static volatile SingularAttribute<Tcolaborador, Integer> nif;
    public static volatile SingularAttribute<Tcolaborador, String> repartFinancas;
    public static volatile SingularAttribute<Tcolaborador, String> nrSegSocial;
    public static volatile SingularAttribute<Tcolaborador, Date> dataNasc;
    public static volatile SingularAttribute<Tcolaborador, String> habLiteraria;
    public static volatile SingularAttribute<Tcolaborador, Character> cartaCond;
    public static volatile CollectionAttribute<Tcolaborador, Tausencia> tausenciaCollection;
    public static volatile SingularAttribute<Tcolaborador, String> nacionalidade;
    public static volatile SingularAttribute<Tcolaborador, Date> dataEmissaoDoc;

}