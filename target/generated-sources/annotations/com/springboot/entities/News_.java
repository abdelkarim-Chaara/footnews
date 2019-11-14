package com.springboot.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-13T23:46:39")
@StaticMetamodel(News.class)
public class News_ { 

    public static volatile SingularAttribute<News, Date> date;
    public static volatile SingularAttribute<News, String> titre;
    public static volatile SingularAttribute<News, Integer> id;
    public static volatile SingularAttribute<News, String> contenu;

}