import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=scanner.nextInt();
        int array[]=new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=scanner.nextInt();
        }
        int count=0;
        for (int i = 0; i <size ; i++) {
            if(array[i]!=0){
                array[count++]=array[i];
            }
        }
        while(count<size){
            array[count++]=0;
        }
        System.out.println(Arrays.toString(array));
    }
}

