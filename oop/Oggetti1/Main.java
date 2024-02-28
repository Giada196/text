/*Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno ncesseari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.
 */

package Oggetti1;

public class Main {
    public static void main(String args[]) {
        Studente student = new Studente("Kim ", "Jonghyun ", 2020);
        System.out.println("Le generalità dello studente sono: " + "\n" + student.getCognome() + " " + student.getNome()
                + " " + student.getId());
    }
}
