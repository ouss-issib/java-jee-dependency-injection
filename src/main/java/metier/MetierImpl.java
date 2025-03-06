package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    //    @Autowired
    private IDao dao;

   // public MetierImpl() {
    //}


    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao =dao;
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
