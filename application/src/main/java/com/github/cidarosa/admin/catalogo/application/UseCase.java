package com.github.cidarosa.admin.catalogo.application;

import com.github.cidarosa.admin.catalogo.domain.category.Category;

public class UseCase {

    public Category execute(){
        return Category.newCategory("Filmes", "A categoria mais assistida", true);
    }

}