package ma.adam.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService(name = "banqueService")
public class BanqueController {

    @WebMethod(operationName = "convertDHToDollar")
    public Double convert(@WebParam(name = "montant") Double montant){
        return new BanqueService().convert(montant);
    }

    @WebMethod(operationName = "getCompteByCode")
    public Compte getCompte(int code){
        return new BanqueService().getCompteByCode(code);
    }
    @WebMethod(operationName = "listComptes")
    public List<Compte> listComptes(){
        return new BanqueService().listComptes();
    }

}
