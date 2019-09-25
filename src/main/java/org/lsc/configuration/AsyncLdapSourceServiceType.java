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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour asyncLdapSourceServiceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="asyncLdapSourceServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}ldapSourceServiceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="synchronizingAllWhenStarting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="serverType" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}ldapServerType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asyncLdapSourceServiceType", propOrder = {
    "synchronizingAllWhenStarting",
    "serverType"
})
public class AsyncLdapSourceServiceType
    extends LdapSourceServiceType
{

    @XmlElement(defaultValue = "true")
    protected Boolean synchronizingAllWhenStarting = true;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LdapServerType serverType;

    /**
     * Obtient la valeur de la propriété synchronizingAllWhenStarting.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSynchronizingAllWhenStarting() {
        return synchronizingAllWhenStarting;
    }

    /**
     * Définit la valeur de la propriété synchronizingAllWhenStarting.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSynchronizingAllWhenStarting(Boolean value) {
        this.synchronizingAllWhenStarting = value;
    }

    /**
     * Obtient la valeur de la propriété serverType.
     * 
     * @return
     *     possible object is
     *     {@link LdapServerType }
     *     
     */
    public LdapServerType getServerType() {
        return serverType;
    }

    /**
     * Définit la valeur de la propriété serverType.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapServerType }
     *     
     */
    public void setServerType(LdapServerType value) {
        this.serverType = value;
    }

}
