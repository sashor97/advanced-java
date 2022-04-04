import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Building bulding=new Building();
        Office office=new Office();
        build(bulding);
        build(office);
        List<Building> buildingList=new ArrayList<>();
        buildingList.add(new Building());
        buildingList.add(new Building());
        printBuldings(buildingList);

        List<Office> officeList=new ArrayList<>();
        officeList.add(new Office());
        officeList.add(new Office());
        printOffices(officeList);
        ThreadExample threadExample=new ThreadExample();
        threadExample.setName("First thread");
        threadExample.start();
        ThreadExample threadExample2=new ThreadExample();
        threadExample.setName("Second thread");
        threadExample2.start();
    }
    static void build(Building building){
        System.out.println("Construction of new "+ building.toString());
    }
    static void printBuldings(List<? extends Building> buildingList){
        buildingList.forEach(Building::toString);
    }
    static void printOffices(List<Office> officeList){
        officeList.forEach(Office::toString);
    }
}
