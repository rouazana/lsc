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
 * <p>Classe Java pour ldapAuthenticationType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ldapAuthenticationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="SIMPLE"/&gt;
 *     &lt;enumeration value="SASL"/&gt;
 *     &lt;enumeration value="DIGEST-MD5"/&gt;
 *     &lt;enumeration value="GSSAPI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ldapAuthenticationType")
@XmlEnum
public enum LdapAuthenticationType {

    NONE("NONE"),
    SIMPLE("SIMPLE"),
    SASL("SASL"),
    @XmlEnumValue("DIGEST-MD5")
    DIGEST_MD_5("DIGEST-MD5"),
    GSSAPI("GSSAPI");
    private final String value;

    LdapAuthenticationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LdapAuthenticationType fromValue(String v) {
        for (LdapAuthenticationType c: LdapAuthenticationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
