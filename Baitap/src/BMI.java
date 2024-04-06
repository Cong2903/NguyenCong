public class BMI {
    private float chieuCao;
    private float ccanNang;

    public BMI(float chieuCao, float ccanNang) {
        this.chieuCao = chieuCao;
        this.ccanNang = ccanNang;
    }

    public float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }

    public float getCanNang() {
        return ccanNang;
    }

    public void setCanNang(float canNang) {
        this.ccanNang = canNang;
    }
    public float BMI(){
        int a=(int)((1000000*ccanNang/Math.pow(chieuCao,2)));
        float c=((float) a)/100;
        return c ;
    }
    public void ketQua(){
        if(BMI()>24.9){
            System.out.println(" ban thua can");
        }else{if(BMI()<18.5){
            System.out.println(" ban thieu can");
        }else{
            System.out.println(" ban binh thuong");
        }}
    }
}
