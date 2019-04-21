package hillel;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IpAddressValidatorTest
{
  String[] validIps = new String[]
      {
          "192.168.1.0",
          "192.168.1.255",
          "0.0.0.0",
          "255.255.255.255"
      };

  String[] invalidIps = new String[]
      {
          "0.256.0.0",
          "192.168.1.256",
          "255.255.255.255.0",
          "192.168.1."
      };

  @Test
  public void testPositive()
  {
    for (int i = 0; i < validIps.length; i++)
    {
      assertTrue(IpAddressValidator.isValid(validIps[i]));
    }
  }

  @Test
  public void testNegative()
  {
    for (int i = 0; i < validIps.length; i++)
    {
      assertFalse(IpAddressValidator.isValid(invalidIps[i]));
    }
  }
}
