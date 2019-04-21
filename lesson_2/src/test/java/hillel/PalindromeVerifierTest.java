package hillel;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeVerifierTest
{

  @Test
  public void testPositive()
  {

    assertTrue(PalindromeVerifier.verify("А роза упала на лапу Азора"));
    assertTrue(PalindromeVerifier.verify("abcba"));
    assertTrue(PalindromeVerifier.verify("abccba"));
  }

  @Test
  public void testNegative()
  {

    assertFalse(PalindromeVerifier.verify("А роза упала на лапы Азора"));
    assertFalse(PalindromeVerifier.verify("abcab"));
    assertFalse(PalindromeVerifier.verify("abcabc"));
  }
}
