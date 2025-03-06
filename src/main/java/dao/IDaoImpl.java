package dao;

public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version de base du données :");
        double temp = 35;
        return temp;
    }
}
