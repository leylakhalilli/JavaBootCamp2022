package Homework1.multiArray;

public class Main {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];
        cities[0][0] = "Baku";
        cities[0][1] = "Istanbul";
        cities[0][2] = "Paris";

        cities[1][0] = "Ankara";
        cities[1][1] = "Bursa";
        cities[1][2] = "Berlin";

        cities[2][0] = "Sankt-Peterburq";
        cities[2][1] = "Moskva";
        cities[2][2] = "Helen";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);

            }

        }
    }
}
