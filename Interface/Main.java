public class Main {
    public static void main (String [] args){
        Rettangolo rettangolo = new Rettangolo(30, 50);
        Triangolo triangolo = new Triangolo(30,50);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();

        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());
    }
}
