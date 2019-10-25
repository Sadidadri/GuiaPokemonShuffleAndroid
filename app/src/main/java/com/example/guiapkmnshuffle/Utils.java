package com.example.guiapkmnshuffle;

import android.widget.Spinner;

public class Utils {
    /**
     * Metodo que recorre un spinner para buscar una cadena contenida en el.
     * @param spinner
     * @param myString
     * @return Devuelve el indice correspondiende a la cadena
     */
    public static int getIndexSpinner(Spinner spinner, String myString)
    {
        int index = 0;

        for (int i = 0; i < spinner.getCount(); i++) {
            if (spinner.getItemAtPosition(i).toString().equalsIgnoreCase(myString)) {
                index = i;
            }
        }
        return index;
    }
}