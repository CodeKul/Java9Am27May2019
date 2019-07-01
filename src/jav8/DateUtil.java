package jav8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {



    public static void main(String[] args) {
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MMM-dd hh:mm:sss");
        String date=format.format(new Date());
        System.out.println(date);

    }

}
