public class Roket {
    String name;
    double lenMetr;
    int power;
    int stypeni;


    public Roket(String name, double lenMetr, int power, int stypeni) {
        this.name = name;
        this.lenMetr = lenMetr;
        this.power = power;
        this.stypeni = stypeni;
    }

    void hello(){
        System.out.println("Привіт я ракета "+name);
    }


    boolean bul(int distance){
        if (distance<power*100){
            return true;
        }else return false;
    }
    boolean bul(double distance){
        if (distance<power*100){
            return true;
        }else return false;
    }



}
