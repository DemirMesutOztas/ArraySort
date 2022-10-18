
import java.util.Scanner;

public class ArraySort
{
    public static void main(String[] args)
    {
        Scanner in =  new Scanner(System.in);
        System.out.print("Dizinin boyutu n :");

        int size= in.nextInt();

        int[] arr = new int[size];


        System.out.println("Dizinin elemanlarını giriniz: ");
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print((i+1) +" . Elemanı : ");
            arr[i]= in.nextInt();

        }
        //System.out.println(Arrays.toString(arr));

        int value;

        for(int j =0; j<arr.length;j++)
        {
            for(int k = 0; k<arr.length-1;k++)
            {

                if(arr[k]>=arr[k+1] && j!=k && (k+1)<=arr.length)
                {
                    //System.out.println(arr[j]+" > " +arr[k]);
                    value = arr[k];
                    arr[k]= arr[k+1];
                    arr[k+1]= value;

                   // System.out.println(value);
                }
            }
        }

        System.out.print("Sıralama : ");
        for(int l: arr)
        {
            System.out.print( l + "\t");
        }


    }
}