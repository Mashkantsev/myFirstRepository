package bsu.rfe.java.group6.lab1.Mashkantsev;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Food[] breakfast= new Food[20];
        int i = 0;
        boolean cal, sort;  // случаи для спец параметров, начинающихся с дефиса
        cal = sort = false;
        for(String arg: args) {
            String[] parts = arg.split("/");
            if(parts[0].equals("Cheese")){
                breakfast[i] = new Cheese();
            }
            else if(parts[0].equals("Apple")){
                breakfast[i] = new Apple(parts[1]);
            }
            else if(parts[0].equals("Lemonade")) {
                breakfast[i] = new Lemonade(parts[1]);
            }
            else { switch (parts[0]) {
                case "-sort":
                    sort = true;
                    break;
                case "-calories":
                    cal = true;
                    break;
                default:
                    System.out.println("Cannot find class " + parts[0] + ".\nContinue...\n");
                    i--;
            }
            }
            i++;
        }

        if(sort == true){
            Arrays.sort(breakfast, new Comparator<Food>() {
                @Override
                public int compare(Food o1, Food o2) {
                    if (o1 == null) {
                        return 1;
                    }
                    else if (o2 == null) {
                        return -1;
                    }
                    else if (o1 instanceof Lemonade && o2 instanceof Lemonade) {
                        return -(((Lemonade) o1).gettaste().compareTo(((Lemonade) o2).gettaste()));
                    }
                    else if (o1 instanceof Apple && o2 instanceof Apple) {
                        return -(((Apple) o1).getSize().compareTo(((Apple) o2).getSize()));
                    }
                    else{
                        return 0;
                    }
                }
            });
        }

        System.out.println("Breakfast");

        for(int j =0; j<breakfast.length; j++) {
            if(breakfast[j]!=null)
                breakfast[j].consume();
            else break;
        }
        int counter = 0;
        Lemonade check = new Lemonade("лимон");
        for (int k = 0; k < breakfast.length; k++) {
            if (breakfast[k] != null) {
                if (breakfast[k].equals(check)) {
                    counter++;
                }
                ;
            }
        }
        System.out.println("Лимонадов " + "'" +check + "'" + ": " + counter);
        counter = 0;
        for (int j = 0; j < breakfast.length;j++){

            if (breakfast[j] != null){
                if (breakfast[j].equals_type(check)){
                    counter++;
                }
            }
        }
        System.out.println("Количество продуктов заданного типа " + "'" +check.getName() + "'" + ": " + counter);
        int calories = 0;
        if (cal == true){

            for (int j = 0; j < breakfast.length;j++){

                if (breakfast[j] != null){
                    calories += breakfast[j].calculateCalories();
                }
                else{
                    break;
                }
            }
            System.out.println("Каллорий " + calories + '\n');
        }

    }
}