package hillel;

public class PalindromeVerifier
 {

    /**
    *Метод проверяет, является ли строка палиндромом
    *@param string проверяемая строка
    *@return возвращает истину если строка является палиндромом, иначе - ложь
    */   
     public static boolean verify(String string)
     {
         String pattern="[^a-zа-яё]";
         char tmp;

         String str = string.toLowerCase();
         str=str.replaceAll(pattern, "");
         char[] chars = str.toCharArray();
         for(int i=0; i<=chars.length-1-i; i++)
         {
             tmp=chars[i];
             chars[i]=chars[chars.length-1-i];
             chars[chars.length-1-i]=tmp;
         }
         String reverse=new String(chars);

         return str.equals(reverse);
     }

     public static void main(String[] args)
     {
         String str="А роза упала на лапу Азора";
         System.out.println(verify(str));
         str="А роза упала на лапы Азора";
         System.out.println(verify(str));
     }
 } 