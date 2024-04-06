import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap do rong cua mag :");
        int a=sc.nextInt();
        int [] arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.print(" nhap a["+i+"] : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=1;j<a-i;j++){
                if(arr[i]<arr[i+j]){
                    int c=arr[i];
                    arr[i]=arr[i+j];
                    arr[i+j]=c;
                }
            }
        }
        System.out.println("so lon nhat trong mang la: "+arr[0]);

    }
}
