package csp;
import java.util.Scanner;
public class CSP201903_1 {

    public static void main(String[] args)
{
    int iCount;
    int iMax;
    int iMin;
    float iMid;
    Scanner scan = new Scanner(System.in);
    iCount = scan.nextInt();
    int[] arrArray = new int[iCount];
    for (int i = 0 ; i< iCount;i++)
    {   
        arrArray[i] = scan.nextInt(); 
    }
    if (iCount%2 == 0)
    {
        iMid = (arrArray[iCount/2]+arrArray[iCount/2-1])/2f;
    }
    else{
        iMid = arrArray[(iCount-1)/2];
       }


    if(arrArray[0]==arrArray[iCount-1])
    {
        iMax = iMin = arrArray[0];
    }
    else{
        if(arrArray[0]<arrArray[iCount-1])
        {
            iMax = arrArray[iCount -1];
            iMin = arrArray[0];
        }
        else{
            iMax = arrArray[0];
            iMin = arrArray[iCount-1];
        }
    }
    System.out.println(iMax+" "+iMid+" "+iMin);
}
}
