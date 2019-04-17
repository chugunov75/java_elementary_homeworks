package hillel;


public class ImageRotator
{

    /**
    *Метод rotateIntoNewArray разворачивает двумерный массив на 90 градусов
    *против часовой стрелки. Исходный массив может иметь разные
    *количества строк и столбцов.
    *@param arr принимает ссылку на исходный массив
    *@return возвращается новый массив, развёрнытый на 90 градусов относительно исходного
    */
    public static int[][] rotateIntoNewArray(int[][] arr)
    {
        int width=arr.length;
        int height=arr[0].length;
        int[][] result=new int[height][width];

        for (int row=0; row<height; row++ ) 
        {
            for(int col=0; col<width; col++)
            {
                result[row][col]=arr[col][height-1-row];
            }
        }
        return result;
    }

    /**
    *Метод rotateIntoSameArray разворачивает двумерный массив на 90 градусов
    *против часовой стрелки. Исходный массив должен иметь одинаковые
    *количества строк и столбцов. Изменение происходит в самом исходном массиве
    *@param a принимает ссылку на исходный массив
    */
    public static void rotateIntoSameArray(int[][] a)
    {
        int n=a.length;
        int temp;

        if(a.length != a[0].length)
        {
            return;
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n-i-1; j++)
            {
                temp=a[i][j];                
                a[i][j]=a[j][n-1-i];
                a[j][n-1-i]=a[n-1-i][n-1-j];
                a[n-1-i][n-1-j]=a[n-1-j][i];
                a[n-1-j][i]=temp;
            }
        }
    }

    public static void display(int[][] a)
    {
      for (int r=0; r<a.length; r++ ) 
      {
          for(int c=0; c<a[r].length; c++)
          {
              System.out.print(a[r][c]+"\t");
          }
          System.out.println();
      }
    }

    public static void main(String[] args)
    {
        int[][] a = new int[][]
        {
            {1, 2, 3},
            {4,5,6},
            {7,8,9}
        };
        int[][] b = new int[][]
        {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11, 12},
            {13, 14, 15, 16}
        };
        int[][] d=
        {
            {1, 2, 3, 4},
            {5, 6, 7, 8}            
        };
        display(d);
        System.out.println();
        int[][] c=rotateIntoNewArray(d);
        display(c);
        System.out.println();
        int e[][]=rotateIntoNewArray(c);
        display(e);
        System.out.println();
        rotateIntoSameArray(b);
        display(b);
        System.out.println();
        rotateIntoSameArray(b);
        display(b);
        System.out.println();
        rotateIntoSameArray(b);
        display(b);
        System.out.println();
        rotateIntoSameArray(b);
        display(b);
        System.out.println();
    }

    
}
