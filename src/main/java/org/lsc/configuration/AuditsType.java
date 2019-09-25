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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour auditsType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="auditsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="csvAudit" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}csvAuditType"/&gt;
 *         &lt;element name="ldifAudit" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}ldifAuditType"/&gt;
 *         &lt;element name="pluginAudit" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}pluginAuditType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditsType", propOrder = {
    "csvAuditOrLdifAuditOrPluginAudit"
})
public class AuditsType {

    @XmlElements({
        @XmlElement(name = "csvAudit", type = CsvAuditType.class),
        @XmlElement(name = "ldifAudit", type = LdifAuditType.class),
        @XmlElement(name = "pluginAudit", type = PluginAuditType.class)
    })
    protected List<AuditType> csvAuditOrLdifAuditOrPluginAudit;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the csvAuditOrLdifAuditOrPluginAudit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csvAuditOrLdifAuditOrPluginAudit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsvAuditOrLdifAuditOrPluginAudit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CsvAuditType }
     * {@link LdifAuditType }
     * {@link PluginAuditType }
     * 
     * 
     */
    public List<AuditType> getCsvAuditOrLdifAuditOrPluginAudit() {
        if (csvAuditOrLdifAuditOrPluginAudit == null) {
            csvAuditOrLdifAuditOrPluginAudit = new ArrayList<AuditType>();
        }
        return this.csvAuditOrLdifAuditOrPluginAudit;
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

}
