package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Fox fox = new Fox();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Ball ball = new Ball();
        ball.tryToRun();
        hare.tryEat(ball);
        ball.tryToRun();
        wolf.tryEat(ball);
        ball.tryToRun();
        fox.tryEat(ball);
    }
}
