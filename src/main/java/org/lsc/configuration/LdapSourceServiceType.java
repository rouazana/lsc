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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ldapSourceServiceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ldapSourceServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}ldapServiceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cleanFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filterAsync" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ldapSourceServiceType", propOrder = {
    "cleanFilter",
    "filterAsync",
    "dateFormat",
    "interval"
})
@XmlSeeAlso({
    AsyncLdapSourceServiceType.class
})
public class LdapSourceServiceType
    extends LdapServiceType
{

    protected String cleanFilter;
    protected String filterAsync;
    protected String dateFormat;
    @XmlElement(defaultValue = "5")
    protected Integer interval = 5;

    /**
     * Obtient la valeur de la propriété cleanFilter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleanFilter() {
        return cleanFilter;
    }

    /**
     * Définit la valeur de la propriété cleanFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleanFilter(String value) {
        this.cleanFilter = value;
    }

    /**
     * Obtient la valeur de la propriété filterAsync.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterAsync() {
        return filterAsync;
    }

    /**
     * Définit la valeur de la propriété filterAsync.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterAsync(String value) {
        this.filterAsync = value;
    }

    /**
     * Obtient la valeur de la propriété dateFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Définit la valeur de la propriété dateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Obtient la valeur de la propriété interval.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * Définit la valeur de la propriété interval.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterval(Integer value) {
        this.interval = value;
    }

}
