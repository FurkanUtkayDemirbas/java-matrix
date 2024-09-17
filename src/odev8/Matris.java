package odev8;

import java.util.Random;

public class Matris {
    static int[][] uret(int r, int c)
    {
       int[][] m = new int[r][c];
        Random rastgele= new Random();
        int i,j;
        for(i=0;i<r;i++)
        {
            for (j=0;j<c;j++)
            {
                m[i][j]=rastgele.nextInt(5);
            }

        }
        return m;
    }
}
