public class SpaiseStation {
    String name;
    int vmistumist;
    int age;
    String funcshn;

    public SpaiseStation(String name, int vmistumist, int age, String funcshn) {
        this.name = name;
        this.vmistumist = vmistumist;
        this.age = age;
        this.funcshn = funcshn;
    }

    public SpaiseStation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public SpaiseStation(String name, int vmistumist, int age) {
        this.name = name;
        this.vmistumist = vmistumist;
        this.age = age;
        funcshn="MeltiFynksioonal";
    }
    public SpaiseStation(){

    }

    void hello(){
        System.out.println("Привіт я космічна станція "+name);
    }


    SpaiseStation contact(SpaiseStation spaiseStation,String nameNew){
        SpaiseStation spaiseStationNew=new SpaiseStation(nameNew,vmistumist+spaiseStation.vmistumist,
                spaiseStation.metod(),funcshn+spaiseStation.funcshn);

        return spaiseStationNew;
    }


    int metod(){

        return vmistumist *age;
    }

    double metod(SpaiseStation spaiseStation){

        return spaiseStation.vmistumist *spaiseStation.age;
    }



}
