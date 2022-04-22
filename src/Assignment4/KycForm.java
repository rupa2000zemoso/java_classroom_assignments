package Assignment4;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class KycForm
{

    public static void main(String[] args) throws ParseException {
        int TestCases;
        System.out.println("Enter Number Of Test Case");
        Scanner s = new Scanner(System.in);
        TestCases = s.nextInt();

        while(TestCases>0)
        {
            String date1=s.next();
            String date2=s.next();
            Date signupDate=new SimpleDateFormat("dd-MM-yyyy").parse(date1);
            Date curDate=new SimpleDateFormat("dd-MM-yyyy").parse(date2);
            if(curDate.compareTo(signupDate)>0)
            {
                Date start,end,cal;
                cal=signupDate;
                cal.setYear(curDate.getYear());
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(cal);
                calendar.add(Calendar.DATE, 30);
                end=calendar.getTime();
                calendar.add(Calendar.DATE,-60);
                start=calendar.getTime();
                if(end.compareTo(curDate)>0)
                    end=curDate;
                SimpleDateFormat print=new SimpleDateFormat("dd-MM-yyyy");
                System.out.println(print.format(start)+"  "+print.format(end));

            }
            else
            {
                System.out.println("No range");
            }
            TestCases--;

        }
    }

}

