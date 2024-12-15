
package ma.adam.proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.adam.proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ConvertDHToDollar_QNAME = new QName("http://ws.adam.ma/", "convertDHToDollar");
    private static final QName _ConvertDHToDollarResponse_QNAME = new QName("http://ws.adam.ma/", "convertDHToDollarResponse");
    private static final QName _GetCompteByCode_QNAME = new QName("http://ws.adam.ma/", "getCompteByCode");
    private static final QName _GetCompteByCodeResponse_QNAME = new QName("http://ws.adam.ma/", "getCompteByCodeResponse");
    private static final QName _ListComptes_QNAME = new QName("http://ws.adam.ma/", "listComptes");
    private static final QName _ListComptesResponse_QNAME = new QName("http://ws.adam.ma/", "listComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.adam.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertDHToDollar }
     * 
     * @return
     *     the new instance of {@link ConvertDHToDollar }
     */
    public ConvertDHToDollar createConvertDHToDollar() {
        return new ConvertDHToDollar();
    }

    /**
     * Create an instance of {@link ConvertDHToDollarResponse }
     * 
     * @return
     *     the new instance of {@link ConvertDHToDollarResponse }
     */
    public ConvertDHToDollarResponse createConvertDHToDollarResponse() {
        return new ConvertDHToDollarResponse();
    }

    /**
     * Create an instance of {@link GetCompteByCode }
     * 
     * @return
     *     the new instance of {@link GetCompteByCode }
     */
    public GetCompteByCode createGetCompteByCode() {
        return new GetCompteByCode();
    }

    /**
     * Create an instance of {@link GetCompteByCodeResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteByCodeResponse }
     */
    public GetCompteByCodeResponse createGetCompteByCodeResponse() {
        return new GetCompteByCodeResponse();
    }

    /**
     * Create an instance of {@link ListComptes }
     * 
     * @return
     *     the new instance of {@link ListComptes }
     */
    public ListComptes createListComptes() {
        return new ListComptes();
    }

    /**
     * Create an instance of {@link ListComptesResponse }
     * 
     * @return
     *     the new instance of {@link ListComptesResponse }
     */
    public ListComptesResponse createListComptesResponse() {
        return new ListComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertDHToDollar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertDHToDollar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.adam.ma/", name = "convertDHToDollar")
    public JAXBElement<ConvertDHToDollar> createConvertDHToDollar(ConvertDHToDollar value) {
        return new JAXBElement<>(_ConvertDHToDollar_QNAME, ConvertDHToDollar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertDHToDollarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertDHToDollarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.adam.ma/", name = "convertDHToDollarResponse")
    public JAXBElement<ConvertDHToDollarResponse> createConvertDHToDollarResponse(ConvertDHToDollarResponse value) {
        return new JAXBElement<>(_ConvertDHToDollarResponse_QNAME, ConvertDHToDollarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteByCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteByCode }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.adam.ma/", name = "getCompteByCode")
    public JAXBElement<GetCompteByCode> createGetCompteByCode(GetCompteByCode value) {
        return new JAXBElement<>(_GetCompteByCode_QNAME, GetCompteByCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteByCodeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteByCodeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.adam.ma/", name = "getCompteByCodeResponse")
    public JAXBElement<GetCompteByCodeResponse> createGetCompteByCodeResponse(GetCompteByCodeResponse value) {
        return new JAXBElement<>(_GetCompteByCodeResponse_QNAME, GetCompteByCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.adam.ma/", name = "listComptes")
    public JAXBElement<ListComptes> createListComptes(ListComptes value) {
        return new JAXBElement<>(_ListComptes_QNAME, ListComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.adam.ma/", name = "listComptesResponse")
    public JAXBElement<ListComptesResponse> createListComptesResponse(ListComptesResponse value) {
        return new JAXBElement<>(_ListComptesResponse_QNAME, ListComptesResponse.class, null, value);
    }

}
