package com.santander.developergames.redcatopensphere.quarkuschallenge.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "book")
@Getter
@Setter
public class Book extends PanacheEntity {

	private String name;

	private Integer publicationYear;

    public static Book findByName(String name){
        return find("name", name).firstResult();
    }

    public static List<Book> findByPublicationYearRange(Integer lowerYear, Integer higherYear){
        return list("publicationYear>=?1 AND publicationYear<=?2", lowerYear, higherYear);
    }
}