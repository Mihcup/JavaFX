package br.dedigados.gerenciador_dedigados.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Validations {
    public static boolean validardate(String data) {
        //método de validação da data no formato "dd/MM/yyyy"

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(data);

            if (data.equals(sdf.format(date))) {
                return true; // A data é válida
            } else {
                return false; // A data foi interpretada como válida, mas não é um formato válido (por exemplo, "32/01/2022")
            }
        } catch (ParseException e) {
            return false; // A data é inválida
        }
    }

}
