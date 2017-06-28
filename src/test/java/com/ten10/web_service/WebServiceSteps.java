package com.ten10.web_service;

import cucumber.api.java.en.*;
import cucumber.api.java.*;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import net.webservicex.UKLocationSoap;

import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.*;


public class WebServiceSteps {

   String response;
   Service service;

   @Before
   public void before() throws Throwable {
      URL url = new URL("http://www.webservicex.net/uklocation.asmx?WSDL");
      QName qname = new QName("http://www.webserviceX.NET", "UKLocation");
      service = Service.create(url, qname);
   }

   @Given("^I retrieve the UK county (.*)$")
   public void i_retrieve_the_uk_county(String county) throws Throwable {
      UKLocationSoap location = service.getPort(UKLocationSoap.class);
      response = location.getUKLocationByCounty(county);
   }

   @Then("^the result should contain town (.*)")
   public void the_result_should_contain_town(String town) throws Throwable {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      InputStream stream = new ByteArrayInputStream(response.toString().getBytes());
      Document doc = builder.parse(stream);
      XPathFactory xPathfactory = XPathFactory.newInstance();
      XPath xpath = xPathfactory.newXPath();
      XPathExpression expr = xpath.compile("//Town[text() = '" + town + "']");

      Object result = expr.evaluate(doc);
      assertEquals(result, town);
   }

   @Then("^the result should contain postcode (.*)")
   public void the_result_should_contain_postcode(String postcode) throws Throwable {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      InputStream stream = new ByteArrayInputStream(response.toString().getBytes());
      Document doc = builder.parse(stream);
      XPathFactory xPathfactory = XPathFactory.newInstance();
      XPath xpath = xPathfactory.newXPath();
      XPathExpression expr = xpath.compile("//PostCode[text() = '" + postcode + "']");

      Object result = expr.evaluate(doc);
      assertEquals(result, postcode);
   }

}
