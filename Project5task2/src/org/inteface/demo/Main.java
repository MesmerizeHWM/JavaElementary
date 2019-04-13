
package org.inteface.demo;

public class Main {

    public static void main(String[] args) {

        IBird bird = new Eagle();
        IFish fish = new Barracuda();

        ((Eagle) bird).fly();
        ((Eagle) bird).say();
        bird.sing();

        System.out.println("");

        ((Barracuda) fish).say();
        ((Barracuda) fish).swim();
        fish.breathInWater();
    }

    interface IAnimal {
        void say();
    }

    interface Swimable {
        void swim();
    }

    interface Flyable {
        void fly();
    }

    interface IBird {
        void sing();
    }

    interface IFish {
        void breathInWater();
    }

    static class Eagle implements IAnimal, Flyable, IBird {

        @Override
        public void say() {
            System.out.println("Krya-Krya");
        }

        @Override
        public void fly() {
            System.out.println("Eagle flying high");
        }

        @Override
        public void sing() {
            System.out.println("Pu qe poi");
        }
    }

    static class Barracuda implements IAnimal, IFish, Swimable {

        @Override
        public void say() {
            System.out.println("Splash");
        }

        @Override
        public void swim() {
            System.out.println("Barracuda swims fast");
        }

        @Override
        public void breathInWater() {
            System.out.println("bool bool");
        }
    }

}


