package presentation;

import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        //Injection de dependances par instanciation statique
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Resultat = "+metier.calcul());
    }
}
