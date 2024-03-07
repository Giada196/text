class Rettangolo extends Forma {
    private double lunghezza;
    private double larghezza;

    public Rettangolo(double lunghezza, double larghezza) {
        super(TipoForma.RETTANGOLO);
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }
    @Override
 public void calcolaArea(){
    double area = lunghezza * larghezza;
    System.out.println("Area del rettangolo" + area);
    }
}