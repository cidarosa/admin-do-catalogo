package com.github.cidarosa.admin.catalogo.domain.validation;

public abstract class Validator {

    //classe pai dos validadores
    private final ValidationHandler handler;

    protected Validator(final ValidationHandler aHandler) {
        this.handler = aHandler;
    }

    public abstract void validate();

    protected ValidationHandler validationHandler() {
        return this.handler;
    }
}
