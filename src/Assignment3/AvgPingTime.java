package Assignment3;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class AvgPingTime
{

    //ping : packet internet groper

    //ping command takes ip address or url as input and sends data packet to specified address and
    // gets a response from host.

    //ping is measured in milliseconds

    //ping uses icmp (internet control msg protocol), but icmp is not supported in java

    //using InetAddress class we can do it in java

    //It is successful in case of Local Host but for other hosts this program shows that the host is unreachable.
    public static void sendPingRequest(String ipAddress) throws IOException {
        InetAddress pinging = InetAddress.getByName(ipAddress);
        System.out.println("sending ping request" + ipAddress);


        if (pinging.isReachable(5000)) {
            System.out.println("host is reachable");
            //System.out.println((finish+start)/2+"ms");
        } else {
            System.out.println("sorry! we can't reach to this host");
        }
    }
    public static void main(String[] args) throws IOException {
        String ipAddress = "1.1.1.1";
        long[] times = new long[5];
        for(int i=0;i<5;i++)
        {
            long start=new GregorianCalendar().getTimeInMillis();
            sendPingRequest(ipAddress);
            long finish = new GregorianCalendar().getTimeInMillis();

            long diff = finish - start;
            times[i]=diff;
        }
        Arrays.sort(times);
        System.out.println(times[2]);
    }
}
