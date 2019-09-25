//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.09.25 à 05:58:53 PM CEST 
//


package org.lsc.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="connections" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}connectionsType"/&gt;
 *         &lt;element name="audits" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}auditsType" minOccurs="0"/&gt;
 *         &lt;element name="tasks" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}tasksType"/&gt;
 *         &lt;element name="security" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}securityType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="revision" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "lsc")
public class Lsc {

    @XmlElement(required = true)
    protected ConnectionsType connections;
    protected AuditsType audits;
    @XmlElement(required = true)
    protected TasksType tasks;
    protected SecurityType security;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "revision")
    protected Integer revision;

    /**
     * Obtient la valeur de la propriété connections.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionsType }
     *     
     */
    public ConnectionsType getConnections() {
        return connections;
    }

    /**
     * Définit la valeur de la propriété connections.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionsType }
     *     
     */
    public void setConnections(ConnectionsType value) {
        this.connections = value;
    }

    /**
     * Obtient la valeur de la propriété audits.
     * 
     * @return
     *     possible object is
     *     {@link AuditsType }
     *     
     */
    public AuditsType getAudits() {
        return audits;
    }

    /**
     * Définit la valeur de la propriété audits.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditsType }
     *     
     */
    public void setAudits(AuditsType value) {
        this.audits = value;
    }

    /**
     * Obtient la valeur de la propriété tasks.
     * 
     * @return
     *     possible object is
     *     {@link TasksType }
     *     
     */
    public TasksType getTasks() {
        return tasks;
    }

    /**
     * Définit la valeur de la propriété tasks.
     * 
     * @param value
     *     allowed object is
     *     {@link TasksType }
     *     
     */
    public void setTasks(TasksType value) {
        this.tasks = value;
    }

    /**
     * Obtient la valeur de la propriété security.
     * 
     * @return
     *     possible object is
     *     {@link SecurityType }
     *     
     */
    public SecurityType getSecurity() {
        return security;
    }

    /**
     * Définit la valeur de la propriété security.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityType }
     *     
     */
    public void setSecurity(SecurityType value) {
        this.security = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété revision.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * Définit la valeur de la propriété revision.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRevision(Integer value) {
        this.revision = value;
    }

}
