package com.example.orm.jpa;

import java.io.Serializable;

//interface for primary key of entities.
//<T> the underlying type of entity id.

public interface EntityId<T> extends Serializable {
    T getId();
    String asString(); //returns id as string representation so that can be used in URL for example
}
