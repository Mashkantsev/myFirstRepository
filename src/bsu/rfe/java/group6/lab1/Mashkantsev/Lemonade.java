package bsu.rfe.java.group6.lab1.Mashkantsev;

public class Lemonade extends Food {
    private String taste;
    public Lemonade (String taste) {
        super("Лимонад");
        this.taste = taste;
    }
    public Double calculateCalories()
    {
        if(taste.equals("лимон"))
        {
            calories = 100.0;
        }
        else if(taste.equals("апельсин"))
        {
            calories = 110.0;
        }
        else if(taste.equals("клубника"))
        {
            calories = 120.0;
        }
        else return 0.0;
        return calories;
    }
    public void consume(){
        System.out.println(this+ " выпит");
    }
    public String gettaste() {
        return taste;
    }
    public void settaste(String taste) {
        this.taste = taste;
    }
    public boolean equals(Object arg0) {
        if(super.equals(arg0)) {
            if(!(arg0 instanceof Lemonade)) return false;
            return taste.equals(((Lemonade)arg0).taste);
        } else
            return false;
    }
    public String toString() {
        return super.toString() + " со вкусом '"+ taste.toUpperCase() + "'";
    }

}