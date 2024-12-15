package ma.adam.client;

import ma.adam.proxy.BanqueControllerService;
import ma.adam.proxy.BanqueService;
import ma.adam.proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueControllerService().getBanqueServicePort();
        System.out.println(proxy.convertDHToDollar((Double) 5000.0));
        Compte cp = proxy.getCompteByCode(4);
        System.out.println("----------------------");
        System.out.println(cp.getSolde());
        System.out.println(cp.getDate());
        System.out.println(cp.getCode());
        System.out.println("-----------------------");
        List<Compte> compteList = proxy.listComptes();
        compteList.forEach(c->{
            System.out.println("----------------------");
            System.out.println(c.getSolde());
            System.out.println(c.getDate());
            System.out.println(c.getCode());
            System.out.println("-----------------------");
        });
    }
}
