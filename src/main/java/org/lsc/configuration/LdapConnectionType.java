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
 * <p>Classe Java pour ldapConnectionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ldapConnectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}connectionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authentication" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}ldapAuthenticationType" minOccurs="0"/&gt;
 *         &lt;element name="referral" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}ldapReferralType" minOccurs="0"/&gt;
 *         &lt;element name="derefAliases" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}ldapDerefAliasesType" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}ldapVersionType" minOccurs="0"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="factory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tlsActivated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="saslMutualAuthentication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sortedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="binaryAttributes" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}valuesType" minOccurs="0"/&gt;
 *         &lt;element name="recursiveDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="saslQop" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}saslQopType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ldapConnectionType", propOrder = {
    "authentication",
    "referral",
    "derefAliases",
    "version",
    "pageSize",
    "factory",
    "tlsActivated",
    "saslMutualAuthentication",
    "sortedBy",
    "binaryAttributes",
    "recursiveDelete",
    "saslQop"
})
public class LdapConnectionType
    extends ConnectionType
{

    @XmlElement(defaultValue = "SIMPLE")
    @XmlSchemaType(name = "string")
    protected LdapAuthenticationType authentication = LdapAuthenticationType.SIMPLE;
    @XmlElement(defaultValue = "IGNORE")
    @XmlSchemaType(name = "string")
    protected LdapReferralType referral = LdapReferralType.IGNORE;
    @XmlElement(defaultValue = "NEVER")
    @XmlSchemaType(name = "string")
    protected LdapDerefAliasesType derefAliases = LdapDerefAliasesType.NEVER;
    @XmlElement(defaultValue = "VERSION_3")
    @XmlSchemaType(name = "string")
    protected LdapVersionType version = LdapVersionType.VERSION_3;
    @XmlElement(defaultValue = "-1")
    protected Integer pageSize = -1;
    @XmlElement(defaultValue = "com.sun.jndi.ldap.LdapCtxFactory")
    protected String factory = "com.sun.jndi.ldap.LdapCtxFactory";
    @XmlElement(defaultValue = "false")
    protected Boolean tlsActivated = false;
    @XmlElement(defaultValue = "false")
    protected Boolean saslMutualAuthentication = false;
    protected String sortedBy;
    protected ValuesType binaryAttributes;
    @XmlElement(defaultValue = "false")
    protected Boolean recursiveDelete = false;
    @XmlElement(defaultValue = "auth")
    @XmlSchemaType(name = "string")
    protected SaslQopType saslQop = SaslQopType.AUTH;

    /**
     * Obtient la valeur de la propriété authentication.
     * 
     * @return
     *     possible object is
     *     {@link LdapAuthenticationType }
     *     
     */
    public LdapAuthenticationType getAuthentication() {
        return authentication;
    }

    /**
     * Définit la valeur de la propriété authentication.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapAuthenticationType }
     *     
     */
    public void setAuthentication(LdapAuthenticationType value) {
        this.authentication = value;
    }

    /**
     * Obtient la valeur de la propriété referral.
     * 
     * @return
     *     possible object is
     *     {@link LdapReferralType }
     *     
     */
    public LdapReferralType getReferral() {
        return referral;
    }

    /**
     * Définit la valeur de la propriété referral.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapReferralType }
     *     
     */
    public void setReferral(LdapReferralType value) {
        this.referral = value;
    }

    /**
     * Obtient la valeur de la propriété derefAliases.
     * 
     * @return
     *     possible object is
     *     {@link LdapDerefAliasesType }
     *     
     */
    public LdapDerefAliasesType getDerefAliases() {
        return derefAliases;
    }

    /**
     * Définit la valeur de la propriété derefAliases.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapDerefAliasesType }
     *     
     */
    public void setDerefAliases(LdapDerefAliasesType value) {
        this.derefAliases = value;
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link LdapVersionType }
     *     
     */
    public LdapVersionType getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapVersionType }
     *     
     */
    public void setVersion(LdapVersionType value) {
        this.version = value;
    }

    /**
     * Obtient la valeur de la propriété pageSize.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Définit la valeur de la propriété pageSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Obtient la valeur de la propriété factory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactory() {
        return factory;
    }

    /**
     * Définit la valeur de la propriété factory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactory(String value) {
        this.factory = value;
    }

    /**
     * Obtient la valeur de la propriété tlsActivated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTlsActivated() {
        return tlsActivated;
    }

    /**
     * Définit la valeur de la propriété tlsActivated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTlsActivated(Boolean value) {
        this.tlsActivated = value;
    }

    /**
     * Obtient la valeur de la propriété saslMutualAuthentication.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaslMutualAuthentication() {
        return saslMutualAuthentication;
    }

    /**
     * Définit la valeur de la propriété saslMutualAuthentication.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaslMutualAuthentication(Boolean value) {
        this.saslMutualAuthentication = value;
    }

    /**
     * Obtient la valeur de la propriété sortedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortedBy() {
        return sortedBy;
    }

    /**
     * Définit la valeur de la propriété sortedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortedBy(String value) {
        this.sortedBy = value;
    }

    /**
     * Obtient la valeur de la propriété binaryAttributes.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getBinaryAttributes() {
        return binaryAttributes;
    }

    /**
     * Définit la valeur de la propriété binaryAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setBinaryAttributes(ValuesType value) {
        this.binaryAttributes = value;
    }

    /**
     * Obtient la valeur de la propriété recursiveDelete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecursiveDelete() {
        return recursiveDelete;
    }

    /**
     * Définit la valeur de la propriété recursiveDelete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecursiveDelete(Boolean value) {
        this.recursiveDelete = value;
    }

    /**
     * Obtient la valeur de la propriété saslQop.
     * 
     * @return
     *     possible object is
     *     {@link SaslQopType }
     *     
     */
    public SaslQopType getSaslQop() {
        return saslQop;
    }

    /**
     * Définit la valeur de la propriété saslQop.
     * 
     * @param value
     *     allowed object is
     *     {@link SaslQopType }
     *     
     */
    public void setSaslQop(SaslQopType value) {
        this.saslQop = value;
    }

}
