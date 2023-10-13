package org.pluralsight;

public class Main {

    public static void main(String[] args) {
        Donut[] donutCollection = new Donut[6];

        String[] type = {"Regular", "Sugar", "Frosted", "Apple Cider", "Jelly", "Blueberry"};
        int[] calories = {100, 160, 170, 150, 200, 120};
        double[] price = {1, 1.2, 1.5, 3, 2.2, 1.3};
        String[] description = {"Old fashioned", "Old fashioned but better(with sugar)", "Doughnut with vanilla frosting",
                "Doughnut of the apple gods", "Doughnut with a grape jelly filled center", "Healthy Doughnut with blueberries"};

        for(int i = 0; i < donutCollection.length; i++) {
            donutCollection[i] = new Donut(type[i], calories[i], price[i], description[i]);
        }

        for (Donut donut: donutCollection) {
            System.out.println(donut);
        }
    }
}
