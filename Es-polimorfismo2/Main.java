public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5.0, 10.0);
        Triangolo triangolo = new Triangolo(4.0, 6.0);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}