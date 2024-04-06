import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class timViTri {
    public static void main(String[] args) {
        int[] arr = {1,7,5,6,2,9,8,-1};
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap so can tim :");
        int c=sc.nextInt();
        for(int i=0;i<8;i++){
            if(arr[i]==c){
                System.out.println("vi tri cua so can tim la : "+i);
            }
        }
    }

}
