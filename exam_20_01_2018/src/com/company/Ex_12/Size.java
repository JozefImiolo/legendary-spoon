package com.company.Ex_12;

public enum Size {
    S(48, 71, 36),
    M(52, 74, 38),
    L(56, 76, 41),
    XL(61, 79, 41);

    public int chestWidth;
    public int shirtLength;
    public int sleeveLength;

    Size(int chestWidth, int shirtLength, int sleeveLength) {
        this.chestWidth = chestWidth;
        this.shirtLength = shirtLength;
        this.sleeveLength = sleeveLength;
    }
}
