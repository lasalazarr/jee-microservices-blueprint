package com.adv.blueprint.jee;

/**
 * Created by User on 5/15/17.
 */
public enum ResultEnum {


    OK("OK"),
    FAIL("FAIL"),
    SaveOk("El registro ha sido guardado con éxito"),
    SaveFail("Existen problemas al guardar el registro"),
    UpdaloadFail("Existen problemas al cargar archivo"),
    DeleteOk("El registro ha sido eliminado con éxito"),
    DeleteFail("Existen problemas al eliminar el registro"),
    ListOk("List success"),
    ListFail("List failure");

    ResultEnum(String value){
        this.value = value;
    };

    private String value;

    public String getValue() {
        return value;
    }
}
