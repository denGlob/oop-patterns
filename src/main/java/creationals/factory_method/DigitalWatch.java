package creationals.factory_method;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by denglob on 8/2/17.
 */
public class DigitalWatch implements Watch{

    public void showTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss z");
        System.out.println("time: " + simpleDateFormat.format(Calendar.getInstance().getTime()));
    }
}
