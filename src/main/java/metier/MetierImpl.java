package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
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
