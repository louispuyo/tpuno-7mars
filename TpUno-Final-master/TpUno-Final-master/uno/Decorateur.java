package uno;
interface Decorable {

    public String cartesDecorateur = ""
   + ".------..------..------.\n"
   + "|U.--. ||N.--. ||O.--. |\n"
   + "| (  ) || :(): || :    |\n "
   + "| : : ||| ()() || :  : |\n"
   + "| '--'U|| '--'N|| '--'O|\n"
   + "`------'`------'`------'";


   public String logoUno = ""
  +" _   _  _ __    ___  \n"
  +"| | | ||  _    / _  \n"
  +"| |_| || | | || (_) |\n"
  +"  __,_||_| |_| | ___/ \n"
  +"                     ";


   
                      
                      
                      



    

}


class Decorateur implements Decorable
{


  Decorateur(){

  }
  
  public void printLogo()
  {
      System.out.println(Decorable.logoUno);
      

  }

  /**
   * @param String Logo
   * @return void (affiche des cartes)
   * 
   */
  public void printCartes()
  {
    System.out.println(Decorable.cartesDecorateur);

  }

}
