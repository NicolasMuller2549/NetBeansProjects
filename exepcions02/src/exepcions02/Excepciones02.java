package com.mycompany.excepciones02;

import entidades.ClaseNueva;


public class Excepciones02 
{

    public static void main(String[] args) 
    {
        ClaseNueva cn = new ClaseNueva();
        cn.accessArray(3);//llamamos un indice valido
        cn.accessArray(10);//llamamos un indice NoValido
    }
}
