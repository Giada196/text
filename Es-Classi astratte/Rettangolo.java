public class Rettangolo extends Forma {
    double base;
    double altezza;
    public Rettangolo(double base, double altezza){
        super();
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    void calcolaArea(){
        System.out.println("L'area del rettangolo è: " + base * altezza);
    }
}
