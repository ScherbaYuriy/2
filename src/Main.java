public class Main {
    public static void main(String[] args) {
        Astronavt astronavt =new Astronavt("Yura",19,70);

        Roket roket =new Roket("Apolon",70,1000,3);

        SpaiseStation spaiseStation=new SpaiseStation("Hala",10,8,"Гідропоні дослідження ");
        SpaiseStation spaiseStation1=new SpaiseStation("Stanciya",45,3);
        SpaiseStation spaiseStation2=new SpaiseStation("Lora",0);
        SpaiseStation spaiseStation3=new SpaiseStation();
        SpaiseStation spaiseStation4;




        astronavt.hello();
        System.out.println(astronavt.suma(1,2));
        System.out.println(astronavt.suma(1.2,2.4));
        System.out.println(astronavt.faktor(3));


        roket.hello();
        System.out.println(roket.bul(100));
        System.out.println(roket.bul(100.2));

        spaiseStation.hello();
        System.out.println(spaiseStation.metod());
        System.out.println(spaiseStation.metod(spaiseStation1));

        spaiseStation4=spaiseStation.contact(spaiseStation2,"Newlora");

        spaiseStation4.hello();


    }
}
