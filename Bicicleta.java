
public class Bicicleta implements  Rueda,Silla{

    public Bicicleta(){}

    @Override
    public void avanzar() {
        System.out.println("La bicicleta avanza");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta se detiene");
    }

    @Override
    public void sentarse() {
        System.out.println("sentarse");
    }
}
