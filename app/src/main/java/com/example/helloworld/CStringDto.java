package com.example.helloworld;

import lombok.Data;

@Data
public class CStringDto {

    private String cadena;
    public String getCadena() {

        return cadena + " cadena modificada";
    }

}
