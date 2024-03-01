package clasesNaves;

public class Nave extends Objeto{
    private double velocidad;
    private int vida;
    public Nave(int posx, int posy, char direccion, double velocidad){
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = 10;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        //super.irA(x, y, direccion) sin abstract;
        System.out.println("Movimiento de la nave a ( X: " + x + ", Y: " + y + ") en dirección " + direccion);
    }

    public void girar(char direccion){
        System.out.println("La nave giro en dirección a: " + direccion);
    }

    public void restaVida(int valor){
        this.vida -= valor;
        System.out.println("Su vida es de: " + vida);
    }

    @Override
    public String toString() {
        return "Nave{" +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                '}';
    }
}