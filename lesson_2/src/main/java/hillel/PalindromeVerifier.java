package hillel;

public class PalindromeVerifier
{

  /**
   * Метод проверяет, является ли строка палиндромом
   *
   * @param string проверяемая строка
   * @return возвращает истину если строка является палиндромом, иначе - ложь
   */
  public static boolean verify(String string)
  {
    String pattern = "[^a-zа-яё]";
    boolean result = true;
    int length = 0;

    String str = string.toLowerCase();
    str = str.replaceAll(pattern, "");
    length = str.length();

    for (int i = 0; i <= length / 2; i++)
    {
      if (str.charAt(i) != str.charAt(length - 1 - i))
      {
        result = false;
        break;
      }
    }

    return result;
  }

  public static void main(String[] args)
  {
    String str = "А роза упала на лапу Азора";
    System.out.println(verify(str));
    str = "А роза упала на лапы Азора";
    System.out.println(verify(str));
  }
}