package Homework.HW2;

public class Shark extends Animal implements SwimAble {

    public Shark(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String swim() {
        return "30 км/ч";
    }
}
