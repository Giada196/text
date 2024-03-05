public class Triangolo extends Forma{

    private double base;
    private double altezza;
    public Triangolo(double base, double altezza){
        super();
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    void calcolaArea(){
        System.out.println("L'area del triangolo è: " + (base * altezza) / 2);
    }

}
