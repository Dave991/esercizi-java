import javax.swing.JOptionPane;
import java.io.IOException;

public class MotorinoMain {
  public static void main (String[] args){

    int menu;
    float a;
    String input, input1;

    Motorino moto1= new Motorino(args [0], args[1], 0.f);

    System.out.println("colore motorino : " + args[0] + "\n");
    System.out.println("modello : " + args[1] +"\n");
    System.out.println("il tuo motorino è un " + args[1]+" di colore " + args[0] +"\n");

    while(true){
      //System.out.println("MENÙ \n");
      input = JOptionPane.showInputDialog("MENÙ\n" +
      "0 - inserisci antifurto\n" +
      "1 - accellerazione\n" +
      "2 - velocità attuale\n" +
      "3 - togli antifurto\n");
      menu = Integer.parseInt(input);
      switch(menu) {
          case 0: {moto1.inserisciAntifurto(); moto1.getVelocita(); break;}
          case 1: {input1 = JOptionPane.showInputDialog("Di quanto vuoi accellerare: "); a = Float.parseFloat(input1); moto1.accellera(a); System.out.println("stai andando a " + moto1.getVelocita() + " km/h "); break;}
          case 2: {System.out.println("stai andando a " + moto1.getVelocita() + " km/h "); break;}
          case 3: {moto1.togliAntifurto(); moto1.getVelocita(); break;}
          case 4: System.exit(0);
          default: System.out.println("\nERRORE: inserimento non valido");
      }
    }
  }
}
