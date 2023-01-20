package com.pruebaCSV;

/*
    Esta clase se encarga de leer el archivo .csv que se pase como parámetro
    NO devuelve nada, sino que muestra el contenido del .csv por el terminal
 */

import java.io.FileReader;
import com.opencsv.CSVReader;

public class LectorCSV {
    public void leeCSV (String nombreArchivo)
    {
        // intenta leer el archivo que se le pase
        try
        {
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila = null;
            /*
                while -> lee una fila con el readNext(), la almacena en 'fila' y ejecuta lo de dentro
                readNext() -> lee una fila y pasa a la siguiente
             */
            while((fila = csvReader.readNext()) != null)
            {
                // muestra los 3 primeros elementos de la fila
                System.out.println(fila[0]
                         + " | " + fila[1]
                         + " | " + fila[2]);
            }
            csvReader.close();
        }
        // si no hay ningún archivo, salta a la excepción (la propia en este caso es FileNotFoundException)
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
