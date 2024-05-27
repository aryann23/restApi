package com.example.orm.jpa;

//interface for entity objects
public interface Entity<T extends EntityId>{
    T getId();
}
