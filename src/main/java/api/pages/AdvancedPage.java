package api.pages;

import axiom.utils.properties.ConfigFileReader;
import io.restassured.http.ContentType;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;

public class AdvancedPage {

    public final String acceptTypeJson ="application/json";
    public ContentType contentTypeJson = ContentType.JSON;

    public String readConfig(String name){
        String value = setConfigPath(getClass().getSimpleName()).getProperty(name);
        return value;
    }

    private Properties setConfigPath(String fileName){
        Properties prop = null;
        String location = getClass().getCanonicalName();
            prop = ConfigFileReader.getInstance( fileName + ".properties");
        return prop;
    }

    public int generateRandomNumberBetweenTwo(int firstNumber, int secondNumber){
       int number = ThreadLocalRandom.current().nextInt(firstNumber, secondNumber);
                return number;
    }

    public String getFutureDate(int years, int months, int days){

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
        Date currentDate = new Date();

        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);

        // manipulate date by number of years, months and days
        c.add(Calendar.YEAR, years);
        c.add(Calendar.MONTH, months);
        c.add(Calendar.DATE, days);

        Date futureDate= c.getTime();
        return dateFormat.format(futureDate);
    }
}
