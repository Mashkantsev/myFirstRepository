package bsu.rfe.java.group6.lab1.Mashkantsev;

public class Cheese extends Food {
    public Cheese(){
        super("Сыр");
    }
    public void consume() {
        System.out.println(this+ " съеден");
    }
    public Double calculateCalories()
    {
        calories = 400.0;
        return calories;
    }
}