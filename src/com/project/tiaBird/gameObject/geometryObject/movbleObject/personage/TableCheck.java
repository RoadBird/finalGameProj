package com.project.tiaBird.gameObject.geometryObject.movbleObject.personage;

public class TableCheck {
    private static int[][] normAttackThrow = {{0}, {1}, {2}, {3}, {3}, {4}, {5},
            {6, 1}, {6, 1}, {7, 2}, {8, 3}, {9, 4}, {9, 4}, {10, 5},
            {11, 6, 1}, {12, 7, 2}, {12, 7, 2}, {13, 8, 3}, {14, 9, 4}, {15, 10, 5}};

    public static int goodSavingThrow(int personLvl) {
        return personLvl / 2 + 2;
    }

    public static int badSavingThrow(int classLvl) {
        return classLvl / 3;
    }

    public static int[] goodAttackThrow(int classLvl) {
        if (classLvl < 6) {
            int[] ret = {classLvl};
            return ret;
        } else if (classLvl < 11) {
            int[] ret = {classLvl, classLvl - 5};
            return ret;
        } else if (classLvl < 16) {
            int[] ret = {classLvl, classLvl - 5, classLvl - 10};
            return ret;
        } else if (classLvl < 21) {
            int[] ret = {classLvl, classLvl - 5, classLvl - 10, classLvl - 15};
            return ret;
        }
        return new int[0];
    }

    public static int[] badAttackThrow(int classLvl) {
        if (classLvl < 12) {
            int[] ret = {classLvl/2};
            return ret;
        } else if (classLvl < 21) {
            int[] ret = {classLvl/2, (classLvl - 5)/2};
            return ret;
        }
        return new int[0];
    }

    public static int[] normAttackThrow(int classLvl) {
        if(classLvl > 0 && classLvl < 21){
            return normAttackThrow[classLvl-1];
        }
        return new int[0];
    }
}
