package ArraysOneDimensional;

public class ArrayEx2 {


    public static void main(String[] args) {

        String [] LoadingTrucks = {"TATA","Mahindra","Daimler","Hyundai",null,null};

        LoadingTrucks [1] = "THAR";

        for (int i = 0; i < LoadingTrucks.length ; i++) {
            System.out.println(i);

        }
        System.out.println();

        for(String Trucks : LoadingTrucks){
            System.out.println(Trucks);
        }

    }

}
