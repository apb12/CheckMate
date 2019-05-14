package com.stas.game.figurePack;

import com.stas.game.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс,реализующий фигуру Слон.
 */

public class Bishop extends Figure {
    public String getCh() {
        return (getColor().equalsIgnoreCase("White")) ? ch : ch.toLowerCase();

    }

    private String ch = "C";

    Bishop(String name, Position p, String color) {
        super(name, p, color);
    }

    public List<Position> aviableEat() {
        List<Position> positionList = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            if ((x + i) <= 7 && (y + i) <= 7 && f[x + i][y + i] != null && getColor().equals(f[x + i][y + i].getColor())) {
                break;
            }
            if ((x + i) <= 7 && (y + i) <= 7 && f[x + i][y + i] != null && !getColor().equals(f[x + i][y + i].getColor())) {
                positionList.add(new Position((x + i), (y + i)));
                break;
            }
        }
        for (int i = 1; i <= 7; i++) {
            if ((x - i) >= 0 && (y - i) >= 0 && f[x - i][y - i] != null && getColor().equals(f[x - i][y - i].getColor())) {
                break;
            }
            if ((x - i) >= 0 && (y - i) >= 0 && f[x - i][y - i] != null && !getColor().equals(f[x - i][y - i].getColor())) {
                positionList.add(new Position((x - i), (y - i)));
                break;
            }
        }
        for (int i = 1; i <= 7; i++) {

            if ((x - i) >= 0 && (y + i) <= 7 && f[x - i][y + i] != null && getColor().equals(f[x - i][y + i].getColor())) {
                break;
            }
            if ((x - i) >= 0 && (y + i) <= 7 && f[x - i][y + i] != null && !getColor().equals(f[x - i][y + i].getColor())) {
                positionList.add(new Position((x - i), (y + i)));
                break;
            }
        }
        for (int i = 1; i <= 7; i++) {
            if ((x + i) <= 7 && (y - i) >= 0 && f[x + i][y - i] != null && getColor().equals(f[x + i][y - i].getColor())) {
                break;
            }
            if ((x + i) <= 7 && (y - i) >= 0 && f[x + i][y - i] != null && !getColor().equals(f[x + i][y - i].getColor())) {
                positionList.add(new Position((x + i), (y - i)));
                break;
            }
        }
        return positionList;
    }

    public List<Position> aviableMove() {
        List<Position> positionList = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            if ((x + i) <= 7 && (y + i) <= 7 && f[x + i][y + i] == null) {
                positionList.add(new Position((x + i), (y + i)));
            } else break;
        }
        for (int i = 1; i <= 7; i++) {
            if ((x - i) >= 0 && (y - i) >= 0 && f[x - i][y - i] == null) {
                positionList.add(new Position((x - i), (y - i)));
            } else break;
        }
        for (int i = 1; i <= 7; i++) {
            if ((x - i) >= 0 && (y + i) <= 7 && f[x - i][y + i] == null) {
                positionList.add(new Position((x - i), (y + i)));
            } else break;
        }
        for (int i = 1; i <= 7; i++) {
            if ((x + i) <= 7 && (y - i) >= 0 && f[x + i][y - i] == null) {
                positionList.add(new Position((x + i), (y - i)));
            } else break;
        }
        return positionList;
    }
}

