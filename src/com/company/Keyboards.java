package com.company;

import javax.swing.plaf.SplitPaneUI;

public class Keyboards {
    private boolean hasPodsvetka;
    private boolean hasRightDigits;



    public Keyboards(boolean hasPodsvetka, boolean hasRightDigits) {
        this.hasPodsvetka = hasPodsvetka;
        this.hasRightDigits = hasRightDigits;
    }


    public boolean isHasPodsvetka() {
        return hasPodsvetka;
    }

    public void setHasPodsvetka(boolean hasPodsvetka) {
        this.hasPodsvetka = hasPodsvetka;
    }

    public boolean isHasRightDigits() {
        return hasRightDigits;
    }

    public void setHasRightDigits(boolean hasRightDigits) {
        this.hasRightDigits = hasRightDigits;
    }

    @Override
    public String toString() {
        return "Podsvetka: " + hasPodsvetka + "\nRight digits: "
                + hasRightDigits;
    }

}
