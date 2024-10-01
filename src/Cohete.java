public class Cohete {

    public static final int COMBUSTIBLE_MINIMO = 10;
    public static final int PESO_MAXIMO = 2000;
    public static final int VELOCIDAD_INICIAL_MINIMA = 120;

    public int combustible;
    public int peso;
    public int velocidadInicial;

    public Cohete(int combustible, int peso, int velocidadInicial) {
        this.combustible = combustible;
        this.peso = peso;
        this.velocidadInicial = velocidadInicial;
    }

    public boolean puedeDespegar(){
        boolean puedeDespegar = false;
        if(this.combustible >= Cohete.COMBUSTIBLE_MINIMO
            && this.peso <= Cohete.PESO_MAXIMO
            && this.velocidadInicial >= Cohete.VELOCIDAD_INICIAL_MINIMA){
            puedeDespegar = true;
        }
        return puedeDespegar;
    }
}
