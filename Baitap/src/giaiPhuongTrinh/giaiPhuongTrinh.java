package giaiPhuongTrinh;

public class giaiPhuongTrinh {
    private int a;
    private int b;
    private  int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public giaiPhuongTrinh(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if(a!=0) {

            if (b * b - 4 * a * c > 0) {
                double x1 = ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
                double x2 = ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
                System.out.println("PT co nghiem \n"+"x1= "+x1);
                System.out.println("x2= "+x2);

            } else {
                if (b * b - 4 * a * c < 0) {
                    System.out.println("PT vo nghiem !");

                }
            }
            if(b * b - 4 * a * c==0) {
                double x = ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));

                System.out.println("PT co nghiem kep : "+x);

            }

        }else{
            System.out.println("nhap Sai ");
        }
    }

}
