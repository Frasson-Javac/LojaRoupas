/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author vinic
 */
public class utilitarios {

    public String obter_data() {
        Date date = new Date();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String s = format.format(date);

        return s;

    }

    public String obter_hora() {
        Date date = new Date();

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        String s = format.format(date);

        return s;

    }

    public String convertnumero(double numero) {

        DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance(new Locale("pt", "BR"));
        DecimalFormatSymbols real = new DecimalFormatSymbols(BRAZIL);
        String s = df.format(numero);
        return s;

    }
}
