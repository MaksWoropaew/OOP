package Homework.HW2;

public class Main {
    public static void main(String[] args) {
        // Создать интерфейс, скорость плаванья
        // Добавить новое животное, способное плавать
        // Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

        Zoo zoo = new Zoo();
        zoo.talk();
        System.out.println("run\n");
        zoo.run();
        System.out.println("fly\n");
        zoo.fly();
        System.out.println("swim\n");
        zoo.swim();
    }
}
