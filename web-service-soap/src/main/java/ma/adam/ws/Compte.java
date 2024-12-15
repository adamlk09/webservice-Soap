package ma.adam.ws;

import java.util.Date;

public class Compte {
    private Double solde;
    private int code;
    private Date date;
    public Compte() {
    }

    public Compte(Double solde, int code, Date date) {
        this.solde = solde;
        this.code = code;
        this.date = date;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Double getSolde() {
        return solde;
    }

    public int getCode() {
        return code;
    }

    public Date getDate() {
        return date;
    }
}
