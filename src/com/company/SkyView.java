package com.company;

import java.util.Arrays;

public class SkyView {
public double[][] view;

public SkyView (int numRows,int numCols,double[]scanned )
{
    int i=0;
    view = new double[numRows][numCols];
    for (int x = numRows;x<numRows;x++)
    {
        if (x%2 == 0)
        {
            for (int y=0;y<numCols;y++)
            {
                view[x][y] = scanned[i];
                i++;
            }
        }
        else
        {
            for (int z=numCols;z>0;z--)
            {
                view[x][z]= scanned[i];
                i++;
            }
        }
    }
}

public void printArray()
{
    System.out.println(Arrays.deepToString(this.view));


}
}
