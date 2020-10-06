package bsu.rfe.java.group6.lab1.Mashkantsev;

public class Apple extends Food {
    private String size;
    private Double calories = null;
    public Apple (String size) {
        super("Apple");
        this.size = size;
    }
    public Double calculateCalories()
    {
        if(size.equals("маленькое"))
        {
            calories = 200.0;
        }
        else if(size.equals("среднее"))
        {
            calories = 240.0;
        }
        else if(size.equals("большое"))
        {
            calories = 300.0;
        }
        else return 0.0;
        return calories;
    }
    public void consume(){

        System.out.println(this+ " съедено");
    }
    public String getSize() {

        return size;
    }
    public void setSize(String number) {
        this.size = size;
    }
    public boolean equals(Object arg0) {if(super.equals(arg0)) {
        if(!(arg0 instanceof Apple)) return false;
        return size.equals(((Apple)arg0).size);
    }
    else return false;
    }
    public String toString() {
        return super.toString() + " размера '"+ size.toUpperCase() + "'";
    }

}