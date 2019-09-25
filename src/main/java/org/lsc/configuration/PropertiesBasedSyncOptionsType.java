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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour propertiesBasedSyncOptionsType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="propertiesBasedSyncOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}syncOptionsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pivotTransformation" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}pivotTransformationType" minOccurs="0"/&gt;
 *         &lt;element name="defaultDelimiter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultPolicy" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}policyType"/&gt;
 *         &lt;element name="conditions" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}conditionsType" minOccurs="0"/&gt;
 *         &lt;element name="dataset" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}datasetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertiesBasedSyncOptionsType", propOrder = {
    "pivotTransformation",
    "defaultDelimiter",
    "defaultPolicy",
    "conditions",
    "dataset"
})
public class PropertiesBasedSyncOptionsType
    extends SyncOptionsType
{

    protected PivotTransformationType pivotTransformation;
    @XmlElement(required = true)
    protected String defaultDelimiter;
    @XmlElement(required = true, defaultValue = "FORCE")
    @XmlSchemaType(name = "string")
    protected PolicyType defaultPolicy = PolicyType.FORCE;
    protected ConditionsType conditions;
    protected List<DatasetType> dataset;

    /**
     * Obtient la valeur de la propriété pivotTransformation.
     * 
     * @return
     *     possible object is
     *     {@link PivotTransformationType }
     *     
     */
    public PivotTransformationType getPivotTransformation() {
        return pivotTransformation;
    }

    /**
     * Définit la valeur de la propriété pivotTransformation.
     * 
     * @param value
     *     allowed object is
     *     {@link PivotTransformationType }
     *     
     */
    public void setPivotTransformation(PivotTransformationType value) {
        this.pivotTransformation = value;
    }

    /**
     * Obtient la valeur de la propriété defaultDelimiter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultDelimiter() {
        return defaultDelimiter;
    }

    /**
     * Définit la valeur de la propriété defaultDelimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultDelimiter(String value) {
        this.defaultDelimiter = value;
    }

    /**
     * Obtient la valeur de la propriété defaultPolicy.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getDefaultPolicy() {
        return defaultPolicy;
    }

    /**
     * Définit la valeur de la propriété defaultPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setDefaultPolicy(PolicyType value) {
        this.defaultPolicy = value;
    }

    /**
     * Obtient la valeur de la propriété conditions.
     * 
     * @return
     *     possible object is
     *     {@link ConditionsType }
     *     
     */
    public ConditionsType getConditions() {
        return conditions;
    }

    /**
     * Définit la valeur de la propriété conditions.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionsType }
     *     
     */
    public void setConditions(ConditionsType value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the dataset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatasetType }
     * 
     * 
     */
    public List<DatasetType> getDataset() {
        if (dataset == null) {
            dataset = new ArrayList<DatasetType>();
        }
        return this.dataset;
    }

}
