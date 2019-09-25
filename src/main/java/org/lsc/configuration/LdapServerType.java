//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.09.25 à 05:58:53 PM CEST 
//


package org.lsc.configuration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ldapServerType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ldapServerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OpenLDAP"/&gt;
 *     &lt;enumeration value="ApacheDS"/&gt;
 *     &lt;enumeration value="OpenDS"/&gt;
 *     &lt;enumeration value="OpenDJ"/&gt;
 *     &lt;enumeration value="OracleDS"/&gt;
 *     &lt;enumeration value="SunDS"/&gt;
 *     &lt;enumeration value="NetscapeDS"/&gt;
 *     &lt;enumeration value="ActiveDirectory"/&gt;
 *     &lt;enumeration value="NovellEDirectory"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ldapServerType")
@XmlEnum
public enum LdapServerType {

    @XmlEnumValue("OpenLDAP")
    OPEN_LDAP("OpenLDAP"),
    @XmlEnumValue("ApacheDS")
    APACHE_DS("ApacheDS"),
    @XmlEnumValue("OpenDS")
    OPEN_DS("OpenDS"),
    @XmlEnumValue("OpenDJ")
    OPEN_DJ("OpenDJ"),
    @XmlEnumValue("OracleDS")
    ORACLE_DS("OracleDS"),
    @XmlEnumValue("SunDS")
    SUN_DS("SunDS"),
    @XmlEnumValue("NetscapeDS")
    NETSCAPE_DS("NetscapeDS"),
    @XmlEnumValue("ActiveDirectory")
    ACTIVE_DIRECTORY("ActiveDirectory"),
    @XmlEnumValue("NovellEDirectory")
    NOVELL_E_DIRECTORY("NovellEDirectory");
    private final String value;

    LdapServerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LdapServerType fromValue(String v) {
        for (LdapServerType c: LdapServerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
