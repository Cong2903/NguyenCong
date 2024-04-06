package giaiPhuongTrinh;

import giaiPhuongTrinh.giaiPhuongTrinh;

public class test {
    public static void main(String[] args) {
        giaiPhuongTrinh Pt1=new giaiPhuongTrinh(1,2,4);
        giaiPhuongTrinh Pt3=new giaiPhuongTrinh(1,3,2);
        giaiPhuongTrinh Pt5=new giaiPhuongTrinh(0,0,9);

        BMI BMI1=new BMI(167,65);
        BMI BMI2=new BMI(170,100);
        BMI BMI3=new BMI(150,65);
        BMI BMI4=new BMI(171,70);

        System.out.print(" BMI1 = "+BMI1.BMI());
        BMI1.ketQua();

        System.out.print(" BMI2 = "+BMI2.BMI());
        BMI2.ketQua();

        System.out.print(" BMI3 = "+BMI3.BMI());
        BMI3.ketQua();
    }
}