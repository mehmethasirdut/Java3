package Gun38.EksikOdevler.Odev2;

public class Dikdortgen implements IGeometri{
    @Override
    public double alan(int... dizi) {
        return (dizi[0]*dizi[1]);
    }

    @Override
    public double cevre(int... dizi) {
        return (dizi[0]+dizi[1]*2);
    }
}
