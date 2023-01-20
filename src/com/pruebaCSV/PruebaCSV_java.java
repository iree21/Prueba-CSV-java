package com.pruebaCSV;

public class PruebaCSV_java {
    /**
        @author Irene Alonso
     **/
    public static void main(String[] args)
    {
        LectorCSV miLector = new LectorCSV();
        miLector.leeCSV("./datos/pokemon.csv");
    }
}
