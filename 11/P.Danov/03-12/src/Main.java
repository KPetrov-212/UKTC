public class Main {
    public static void main(String[] args){
        House[] houses = new House[2];

        for (int i = 0; i < houses.length; i++){
            System.out.println("House " + (i+1) + ":");
            houses[i] = new House(0, 0, "", 0, "", "");
            houses[i].inputData();
        }

        House biggestHouse = House.findBiggestHouse(houses);
        System.out.println("mostSpaciousHouse");
        biggestHouse.display();
    }


}