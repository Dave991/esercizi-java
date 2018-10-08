public class Universita extends Docente[] {

  public int getEtaMin(Docente[] doc)
  {
    for (int i=0; i<doc.lenght; i++)
    {
      if (doc.eta < MinimoCorrente)
        MinimoCorrente=doc.eta;
    }
        return MinimoCorrente;
  }

  private int MinimoCorrente =1000;
}
