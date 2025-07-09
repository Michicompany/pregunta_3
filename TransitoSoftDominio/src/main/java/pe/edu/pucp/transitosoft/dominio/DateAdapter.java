package pe.edu.pucp.transitosoft.dominio;
import jakarta.json.bind.adapter.JsonbAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter implements JsonbAdapter<Date, String>{
    private static final String[] formatos = {
        "dd-MM-yyyy",
        "dd-MM-yyyy HH:mm:ss",
        "yyyy-MM-dd",
        "yyyy-MM-dd'T'HH:mm:ss.SSS",
        "yyyy-MM-dd'T'HH:mm:ss.SSSX" //formato original
    };

    @Override
    public String adaptToJson(Date orgnl) throws Exception {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(orgnl);   
    }

    @Override
    public Date adaptFromJson(String adptd) throws Exception {
        for(String format : formatos){
            try{
                return new SimpleDateFormat(format).parse(adptd);
            }catch(ParseException e){
                //intenta con el siguiente formato
            }
        }
        try {
        // Si es un número, lo interpretamos como timestamp
            if (adptd.matches("\\d+")) {
                long millis = Long.parseLong(adptd);
                return new Date(millis);
            }
        } catch (NumberFormatException ignored) 
        {
            //intenta con la conversión de numero
        }
        throw new RuntimeException("Formato de fecha invadldo: " + adptd);
    }
}