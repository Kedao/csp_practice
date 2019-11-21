import java.util.Scanner;
public class CSP201903_1
{
    public static void main(String[] args)
    {
    int iCount;
    int iMax;
    int iMin;
    float iMid;
    Scanner scan = new Scanner(System.in);
    iCount = scan.nextInt();
    int[] arr = new int[iCount];
    for(int i = 0 ; i< iCount;i++)
    {   
        arr[i] = scan.nextInt(); 
    }
    if (iCount%2 == 0)
    {
        iMid = (arr[iCount/2]+arr[iCount/2-1])/2f;
    }
    else{
        iMid = arr[(iCount-1)/2];
       }
    if(arr[0]==arr[iCount-1])
    {
        iMax = iMin = arr[0];
    }
    else{
        if(arr[0]<arr[iCount-1])
        {
            iMax = arr[iCount -1];
            iMin = arr[0];
        }
        else{
            iMax = arr[0];
            iMin = arr[iCount-1];
        }
    }
    System.out.println(iMax+" "+iMid+" "+iMin);
    }
}
