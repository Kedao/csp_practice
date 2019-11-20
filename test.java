import java.util.*;
public class test{
    public static void main(String[] args)
{

    Scanner scan = new Scanner(System.in);
     int   iCount = 4;
    int[] arrArray = new int[iCount];
    for (int i = 0 ; i< iCount;i++)
    {   
        arrArray[i] = scan.nextInt(); 
        System.out.println(arrArray[i]);
    }
 /*   if (iCount%2 == 0)
    {
        iMid = arrArray[iCount/2];
    }
    else{
        iMid = (arrArray[(iCount-1)/2]+arrArray[(iCount+1)/2])/2f;
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
    System.out.println(iMax+" "+iMid+" "+iMin);*/
}
}