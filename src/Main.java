public class Main {
    public static void main(String[] args) {
        Cohete apolo11 = new Cohete(25, 1100, 120);
        boolean puedeDespegar = apolo11.puedeDespegar();
        if(puedeDespegar){
            System.out.println("TODO LISTO PARA EL DESPEGUE");
        } else {
            System.out.println("SE DEBEN SOLVENTAR PROBLEMAS TECNICOS");
        }
    }
}