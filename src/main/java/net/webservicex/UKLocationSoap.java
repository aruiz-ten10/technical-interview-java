
package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UKLocationSoap", targetNamespace = "http://www.webserviceX.NET")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UKLocationSoap {


    /**
     * Get UK town,Postcode and County by full /partial County
     * 
     * @param county
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetUKLocationByCounty", action = "http://www.webserviceX.NET/GetUKLocationByCounty")
    @WebResult(name = "GetUKLocationByCountyResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetUKLocationByCounty", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByCounty")
    @ResponseWrapper(localName = "GetUKLocationByCountyResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByCountyResponse")
    public String getUKLocationByCounty(
        @WebParam(name = "County", targetNamespace = "http://www.webserviceX.NET")
        String county);

    /**
     * Get UK town,Postcode and County by full /partial Town
     * 
     * @param town
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetUKLocationByTown", action = "http://www.webserviceX.NET/GetUKLocationByTown")
    @WebResult(name = "GetUKLocationByTownResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetUKLocationByTown", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByTown")
    @ResponseWrapper(localName = "GetUKLocationByTownResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByTownResponse")
    public String getUKLocationByTown(
        @WebParam(name = "Town", targetNamespace = "http://www.webserviceX.NET")
        String town);

    /**
     * Get UK town,Postcode and County by Postcode(First Section of Post Code)
     * 
     * @param postCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetUKLocationByPostCode", action = "http://www.webserviceX.NET/GetUKLocationByPostCode")
    @WebResult(name = "GetUKLocationByPostCodeResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetUKLocationByPostCode", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByPostCode")
    @ResponseWrapper(localName = "GetUKLocationByPostCodeResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByPostCodeResponse")
    public String getUKLocationByPostCode(
        @WebParam(name = "PostCode", targetNamespace = "http://www.webserviceX.NET")
        String postCode);

    /**
     * Validate UK address,Use First Section of Poscode for Postcode atribute
     * 
     * @param town
     * @param county
     * @param postCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ValidateUKAddress", action = "http://www.webserviceX.NET/ValidateUKAddress")
    @WebResult(name = "ValidateUKAddressResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "ValidateUKAddress", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.ValidateUKAddress")
    @ResponseWrapper(localName = "ValidateUKAddressResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.ValidateUKAddressResponse")
    public String validateUKAddress(
        @WebParam(name = "Town", targetNamespace = "http://www.webserviceX.NET")
        String town,
        @WebParam(name = "County", targetNamespace = "http://www.webserviceX.NET")
        String county,
        @WebParam(name = "PostCode", targetNamespace = "http://www.webserviceX.NET")
        String postCode);

}
