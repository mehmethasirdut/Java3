package Gun33.BigWorks1;

public class work6 {
    public static void main(String[] args) {
        /*
        6- {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}
    int 2D arrayini oluşturunuz.
    2D arrayinden min number print ediniz.
         */
        int[][] dizi={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int min=dizi[0][0];
        for (int i=0;i< dizi.length;i++)
            for (int j=0;j<dizi[i].length;j++)
                if (dizi[i][j]<min)
                    min=dizi[i][j];

        System.out.println();
        System.out.println("min number="+min);

    }
}
