//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.30 at 09:58:51 PM CEST 
//


package fr.vitec.model.xmlbinding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilmType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilmType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageEncoded" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ImagePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TitleDisk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Genre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Runtime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Director" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Actor" type="{}ActorType" maxOccurs="unbounded"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilmType", propOrder = {
    "imageEncoded",
    "imagePath",
    "reference",
    "title",
    "titleDisk",
    "year",
    "path",
    "genre",
    "runtime",
    "country",
    "director",
    "actor",
    "summary"
})
public class FilmType {

    @XmlElement(name = "ImageEncoded", required = true)
    protected String imageEncoded;
    @XmlElement(name = "ImagePath", required = true)
    protected String imagePath;
    @XmlElement(name = "Reference", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String reference;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "TitleDisk", required = true)
    protected String titleDisk;
    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "Path", required = true)
    protected String path;
    @XmlElement(name = "Genre", required = true)
    protected String genre;
    @XmlElement(name = "Runtime", required = true)
    protected String runtime;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "Director", required = true)
    protected String director;
    @XmlElement(name = "Actor", required = true)
    protected List<ActorType> actor;
    @XmlElement(name = "Summary", required = true)
    protected String summary;

    /**
     * Gets the value of the imageEncoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageEncoded() {
        return imageEncoded;
    }

    /**
     * Sets the value of the imageEncoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageEncoded(String value) {
        this.imageEncoded = value;
    }

    /**
     * Gets the value of the imagePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Sets the value of the imagePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath(String value) {
        this.imagePath = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the titleDisk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDisk() {
        return titleDisk;
    }

    /**
     * Sets the value of the titleDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDisk(String value) {
        this.titleDisk = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Gets the value of the runtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuntime() {
        return runtime;
    }

    /**
     * Sets the value of the runtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuntime(String value) {
        this.runtime = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the director property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector(String value) {
        this.director = value;
    }

    /**
     * Gets the value of the actor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActorType }
     * 
     * 
     */
    public List<ActorType> getActor() {
        if (actor == null) {
            actor = new ArrayList<ActorType>();
        }
        return this.actor;
    }

    public void setActor(List<ActorType> actors){
    	getActor().clear();
    	for (ActorType actorType : actors) {
    		getActor().add(actorType);
		}
    }
    
    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

}
