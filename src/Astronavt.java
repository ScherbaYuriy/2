public class Astronavt {
    String name;
    int age;
    double weight;

    public Astronavt(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void hello() {
        System.out.println("Привіт я астронавт " + name);
    }

    double faktor(double i){
        if (i==1){
            return 1;
        }else {
            double x=faktor(i-1)+i;
            return x;
        }
    }


    int suma(int a, int b) {

        return a + b;
    }

    double suma(double a, double b) {
        return a + b;

    }
}
