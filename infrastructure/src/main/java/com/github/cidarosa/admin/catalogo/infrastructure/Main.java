package com.github.cidarosa.admin.catalogo.infrastructure;

import com.github.cidarosa.admin.catalogo.application.UseCase;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}