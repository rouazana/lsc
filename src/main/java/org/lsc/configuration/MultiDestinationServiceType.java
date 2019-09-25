//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.09.25 à 05:58:53 PM CEST 
//


package org.lsc.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour multiDestinationServiceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="multiDestinationServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}serviceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="xaServices"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="reference" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiDestinationServiceType", propOrder = {
    "xaServices"
})
public class MultiDestinationServiceType
    extends org.lsc.configuration.ServiceType
{

    @XmlElement(required = true)
    protected MultiDestinationServiceType.XaServices xaServices;

    /**
     * Obtient la valeur de la propriété xaServices.
     * 
     * @return
     *     possible object is
     *     {@link MultiDestinationServiceType.XaServices }
     *     
     */
    public MultiDestinationServiceType.XaServices getXaServices() {
        return xaServices;
    }

    /**
     * Définit la valeur de la propriété xaServices.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiDestinationServiceType.XaServices }
     *     
     */
    public void setXaServices(MultiDestinationServiceType.XaServices value) {
        this.xaServices = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="reference" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class XaServices {

        @XmlAttribute(name = "reference", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<org.lsc.configuration.ServiceType> reference;

        /**
         * Gets the value of the reference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<org.lsc.configuration.ServiceType> getReference() {
            if (reference == null) {
                reference = new ArrayList<org.lsc.configuration.ServiceType>();
            }
            return this.reference;
        }

    }

}
