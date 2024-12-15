package ma.adam.ws;

import java.util.List;

public interface IBanqueService {

    Double convert(Double montant);

    Compte getCompteByCode(int code);

    List<Compte> listComptes();
 }
