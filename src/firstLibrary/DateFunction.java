/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstLibrary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

/**
 *
 * @author tss
 */
public class DateFunction {

    private DateFunction() {
    }
    
    public static String convert(Date data) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(data);
    }
    
    
}
