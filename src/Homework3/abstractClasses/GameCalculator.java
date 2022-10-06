package Homework3.abstractClasses;

public abstract class GameCalculator {
    public abstract void calculate();

    public final void gameOver() {
        System.out.println("GAME OVER");
    }
}
