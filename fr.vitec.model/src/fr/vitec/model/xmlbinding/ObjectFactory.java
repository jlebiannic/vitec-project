//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.22 at 09:18:42 AM CET 
//


package fr.vitec.model.xmlbinding;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.vitec.main.model.xmlbinding package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Base_QNAME = new QName("", "Base");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.vitec.main.model.xmlbinding
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link FilmType }
     * 
     */
    public FilmType createFilmType() {
        return new FilmType();
    }

    /**
     * Create an instance of {@link ActorType }
     * 
     */
    public ActorType createActorType() {
        return new ActorType();
    }

    /**
     * Create an instance of {@link DirectoryType }
     * 
     */
    public DirectoryType createDirectoryType() {
        return new DirectoryType();
    }

    /**
     * Create an instance of {@link BaseType }
     * 
     */
    public BaseType createBaseType() {
        return new BaseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Base")
    public JAXBElement<BaseType> createBase(BaseType value) {
        return new JAXBElement<BaseType>(_Base_QNAME, BaseType.class, null, value);
    }

}
