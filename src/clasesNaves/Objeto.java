package clasesNaves;

public abstract class Objeto {
    private int posx;
    private int posy;
    private char direccion;

    public Objeto(int posx, int posy, char direccion){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public abstract void irA(int x, int y, char direccion);

//    public int getPosx(){
//        return posx;
//    }
//    public int getPosy(){
//        return posy;
//    }
//    public char getDireccion(){
//        return direccion;
//    }
    @Override
    public String toString() {
        return "Objeto{" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direccion=" + direccion +
                '}';
    }
}