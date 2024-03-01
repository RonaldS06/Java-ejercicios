package clasesNaves;

public class Asteroide extends Objeto{
    private int lesion;
    public Asteroide (int posx, int posy, char direccion, int lesion){
        super(posx, posy, direccion);
        this.lesion = lesion;
    }
    @Override
    public void irA(int x, int y, char direccion) {
        System.out.println("Movimiento de la nave a ( X: " + x + ", Y: " + y + ") en dirección " + direccion);
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "lesion=" + lesion +
                '}';
    }
}