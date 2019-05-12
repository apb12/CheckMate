package com.stas.game.figurePack;

import com.stas.game.Field;
import com.stas.game.Position;

import java.util.List;

/**
 * Базовый класс для всех фигур.Инскапсулирует игровое поле.
 */

public abstract class Figure {
    protected Figure[][] f = Field.getInstance().getFiguresTable();
    protected int x, y;
    private String ch;
    private String name;
    private String color;

    public String getCh() {
        return ch;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Figure() {
    }

    public Figure(String name, int x, int y, String color) {

        this.x = x;
        this.y = y;
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Метод ,возвращающий список доступных ходов.
     */
    abstract public List<Position> aviableMove();

    /**
     * Метод ,возвращающий список доступных фигур для битья.
     */

    abstract public List<Position> aviableEat();
}
