package bsu.rfe.java.group6.lab1.Mashkantsev;

public abstract class Food implements Nutritious,Consumable {
    String name = null;
    Double calories = null;
    public Food(String name){
        this.name = name;
    }
    public boolean equals(Object arg0) {
        if(!(arg0 instanceof Food)) return false;
        if(name==null|| ((Food)arg0).name==null) return false;
        return name.equals(((Food)arg0).name);
    }
    public boolean equals_type(Object arg0){
        if (!(arg0 instanceof Food)) return false;
        if (name == null || ((Food)arg0).name == null) {
            return false;
        }
        if (name.equals(((Food)arg0).name)){
            return true;
        }
        return false;
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }
}