package com.github.cidarosa.admin.catalogo.domain.category;

import com.github.cidarosa.admin.catalogo.domain.Identifier;

import java.util.Objects;
import java.util.UUID;

public class CategoryID extends Identifier {

    private final String value;

    private CategoryID(final String value) {
        //constraint
        Objects.requireNonNull(value);
        this.value = value;
    }

    //factory methods
    //para criar um ID novo
    public static CategoryID unique(){
        return CategoryID.from(UUID.randomUUID());
    }
    //helpers - convert
    public static CategoryID from(final String anId){
        return new CategoryID(anId);
    }

    public static CategoryID from(final UUID anId){
        return new CategoryID(anId.toString().toLowerCase());
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final CategoryID that = (CategoryID) o;
        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
