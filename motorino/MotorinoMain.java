public class MotorinoMain {
  public static void main (String[] args){
    int menu;
    Motorino moto1= new Motorino(args [0], args[1], 0.f);

    System.out.println("colore motorino : " + args[0] + "\n");
    System.out.println("modello : " + args[1] +"\n");

    System.out.println("il tuo motorino è un " + args[1]+"di colore " + args[0] +"\n");

    while(1){
      System.out.println("MENÙ \n");
      scanf("%d", &menu)
      switch(menu) {
          case 0: ...
          case 1: ...


      }
      system("cls");
    }


    moto1.accellera(30.f);
    System.out.println("la velocità è: " + moto1.getVelocita());
    moto1.inserisciAntifurto();
    moto1.accellera(20.f);
    System.out.println("la velocità è: " + moto1.getVelocita());

  }
}
