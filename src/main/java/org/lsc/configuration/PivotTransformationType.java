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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour pivotTransformationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pivotTransformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transformation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="fromAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="toAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="pivotOrigin" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}pivotOriginType" default="BOTH" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pivotTransformationType", propOrder = {
    "transformation"
})
public class PivotTransformationType {

    protected List<PivotTransformationType.Transformation> transformation;

    /**
     * Gets the value of the transformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PivotTransformationType.Transformation }
     * 
     * 
     */
    public List<PivotTransformationType.Transformation> getTransformation() {
        if (transformation == null) {
            transformation = new ArrayList<PivotTransformationType.Transformation>();
        }
        return this.transformation;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="fromAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="toAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="pivotOrigin" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}pivotOriginType" default="BOTH" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Transformation {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "fromAttribute")
        protected String fromAttribute;
        @XmlAttribute(name = "toAttribute")
        protected String toAttribute;
        @XmlAttribute(name = "pivotOrigin")
        protected PivotOriginType pivotOrigin;

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété fromAttribute.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromAttribute() {
            return fromAttribute;
        }

        /**
         * Définit la valeur de la propriété fromAttribute.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromAttribute(String value) {
            this.fromAttribute = value;
        }

        /**
         * Obtient la valeur de la propriété toAttribute.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToAttribute() {
            return toAttribute;
        }

        /**
         * Définit la valeur de la propriété toAttribute.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToAttribute(String value) {
            this.toAttribute = value;
        }

        /**
         * Obtient la valeur de la propriété pivotOrigin.
         * 
         * @return
         *     possible object is
         *     {@link PivotOriginType }
         *     
         */
        public PivotOriginType getPivotOrigin() {
            if (pivotOrigin == null) {
                return PivotOriginType.BOTH;
            } else {
                return pivotOrigin;
            }
        }

        /**
         * Définit la valeur de la propriété pivotOrigin.
         * 
         * @param value
         *     allowed object is
         *     {@link PivotOriginType }
         *     
         */
        public void setPivotOrigin(PivotOriginType value) {
            this.pivotOrigin = value;
        }

    }

}
