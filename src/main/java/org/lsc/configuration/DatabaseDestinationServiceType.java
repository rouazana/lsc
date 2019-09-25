//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.09.25 à 05:58:53 PM CEST 
//


package org.lsc.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour databaseDestinationServiceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="databaseDestinationServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}serviceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestNameForList" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestNameForObject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestsNameForInsert" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}valuesType"/&gt;
 *         &lt;element name="requestsNameForUpdate" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}valuesType"/&gt;
 *         &lt;element name="requestsNameForDelete" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}valuesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "databaseDestinationServiceType", propOrder = {
    "requestNameForList",
    "requestNameForObject",
    "requestsNameForInsert",
    "requestsNameForUpdate",
    "requestsNameForDelete"
})
public class DatabaseDestinationServiceType
    extends ServiceType
{

    @XmlElement(required = true)
    protected String requestNameForList;
    @XmlElement(required = true)
    protected String requestNameForObject;
    @XmlElement(required = true)
    protected ValuesType requestsNameForInsert;
    @XmlElement(required = true)
    protected ValuesType requestsNameForUpdate;
    @XmlElement(required = true)
    protected ValuesType requestsNameForDelete;

    /**
     * Obtient la valeur de la propriété requestNameForList.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestNameForList() {
        return requestNameForList;
    }

    /**
     * Définit la valeur de la propriété requestNameForList.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestNameForList(String value) {
        this.requestNameForList = value;
    }

    /**
     * Obtient la valeur de la propriété requestNameForObject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestNameForObject() {
        return requestNameForObject;
    }

    /**
     * Définit la valeur de la propriété requestNameForObject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestNameForObject(String value) {
        this.requestNameForObject = value;
    }

    /**
     * Obtient la valeur de la propriété requestsNameForInsert.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getRequestsNameForInsert() {
        return requestsNameForInsert;
    }

    /**
     * Définit la valeur de la propriété requestsNameForInsert.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setRequestsNameForInsert(ValuesType value) {
        this.requestsNameForInsert = value;
    }

    /**
     * Obtient la valeur de la propriété requestsNameForUpdate.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getRequestsNameForUpdate() {
        return requestsNameForUpdate;
    }

    /**
     * Définit la valeur de la propriété requestsNameForUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setRequestsNameForUpdate(ValuesType value) {
        this.requestsNameForUpdate = value;
    }

    /**
     * Obtient la valeur de la propriété requestsNameForDelete.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getRequestsNameForDelete() {
        return requestsNameForDelete;
    }

    /**
     * Définit la valeur de la propriété requestsNameForDelete.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setRequestsNameForDelete(ValuesType value) {
        this.requestsNameForDelete = value;
    }

}
