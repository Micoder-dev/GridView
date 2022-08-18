package com.example.gridview;

public class GridModel {

    private String gridName;
    private int gridImage;

    public GridModel(String gridName, int gridImage) {
        this.gridName = gridName;
        this.gridImage = gridImage;
    }

    public String getGridName() {
        return gridName;
    }

    public void setGridName(String gridName) {
        this.gridName = gridName;
    }

    public int getGridImage() {
        return gridImage;
    }

    public void setGridImage(int gridImage) {
        this.gridImage = gridImage;
    }
}
