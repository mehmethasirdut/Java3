package Gun38.EksikOdevler.Odev2;

public class Daire implements IGeometri{
    @Override
    public double alan(int... dizi) {
        return (Math.PI*dizi[0]*dizi[0]);
    }

    @Override
    public double cevre(int... dizi) {
        return (2*Math.PI*dizi[0]);
    }
}
