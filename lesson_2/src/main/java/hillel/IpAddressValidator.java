package hillel;

import java.util.regex.*;

public class IpAddressValidator
{
  public static void main(String[] args)
  {
    String[] ips = new String[]
        {
            "192.168.1.0",
            "192.168.1.255",
            "0.0.0.0",
            "0.256.0.0",
            "192.168.1.256",
            "255.255.255.255",
            "255.255.255.255.0",
            "192.168.1",
        };

    for (int i = 0; i < ips.length; i++)
    {
      System.out.println(isValid(ips[i]));
    }
  }

  public static boolean isValid(String ip)
  {
    String pattern = "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])[.]){3}" +
        "([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";

    Pattern ptn = Pattern.compile(pattern);
    Matcher matcher = ptn.matcher(ip);
    return matcher.matches();
  }
}
