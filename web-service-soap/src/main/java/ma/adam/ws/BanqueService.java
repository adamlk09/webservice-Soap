package ma.adam.ws;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class BanqueService implements IBanqueService{
    @Override
    public Double convert(Double montant) {
        return montant*9;
    }

    @Override
    public Compte getCompteByCode(int code) {
        return new Compte(1000*Math.random()+9000,code,new Date());
    }

    @Override
    public List<Compte> listComptes() {
        return List.of(
                new Compte(1000*Math.random()+9000,1,new Date()),
                new Compte(1000*Math.random()+9000,2,new Date()),
                new Compte(1000*Math.random()+9000,3,new Date())
        );
    }
}
