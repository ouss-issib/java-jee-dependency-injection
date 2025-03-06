package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    public MetierImpl() {}
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tempData = dao.getData();
        double result = tempData*25;
        return result;
    }
}
