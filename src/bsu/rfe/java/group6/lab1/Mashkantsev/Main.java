package bsu.rfe.java.group6.lab1.Mashkantsev;



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