//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.03 at 02:56:36 PM CET 
//


package com.github.kayak.canio.kcd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://kayak.2codeornot2code.org/1.0}Notes" minOccurs="0"/>
 *         &lt;element ref="{http://kayak.2codeornot2code.org/1.0}Producer" minOccurs="0"/>
 *         &lt;element ref="{http://kayak.2codeornot2code.org/1.0}Multiplex" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://kayak.2codeornot2code.org/1.0}Signal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="0x[A-F0-9]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="length" default="auto">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="auto"/>
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="4"/>
 *             &lt;enumeration value="5"/>
 *             &lt;enumeration value="6"/>
 *             &lt;enumeration value="7"/>
 *             &lt;enumeration value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="interval" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="60000"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="triggered" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="count" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="1000000"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="format" default="standard">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="standard"/>
 *             &lt;enumeration value="extended"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="remote" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notes",
    "producer",
    "multiplex",
    "signal"
})
@XmlRootElement(name = "Message")
public class Message {

    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Producer")
    protected Producer producer;
    @XmlElement(name = "Multiplex")
    protected List<Multiplex> multiplex;
    @XmlElement(name = "Signal")
    protected List<Signal> signal;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "length")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String length;
    @XmlAttribute(name = "interval")
    protected Integer interval;
    @XmlAttribute(name = "triggered")
    protected Boolean triggered;
    @XmlAttribute(name = "count")
    protected Integer count;
    @XmlAttribute(name = "format")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String format;
    @XmlAttribute(name = "remote")
    protected Boolean remote;

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link Producer }
     *     
     */
    public Producer getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Producer }
     *     
     */
    public void setProducer(Producer value) {
        this.producer = value;
    }

    /**
     * Gets the value of the multiplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Multiplex }
     * 
     * 
     */
    public List<Multiplex> getMultiplex() {
        if (multiplex == null) {
            multiplex = new ArrayList<Multiplex>();
        }
        return this.multiplex;
    }

    /**
     * Gets the value of the signal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Signal }
     * 
     * 
     */
    public List<Signal> getSignal() {
        if (signal == null) {
            signal = new ArrayList<Signal>();
        }
        return this.signal;
    }

    /**
     * Gets the value of the id property.
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
     * Sets the value of the id property.
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        if (length == null) {
            return "auto";
        } else {
            return length;
        }
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getInterval() {
        if (interval == null) {
            return  0;
        } else {
            return interval;
        }
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterval(Integer value) {
        this.interval = value;
    }

    /**
     * Gets the value of the triggered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTriggered() {
        if (triggered == null) {
            return false;
        } else {
            return triggered;
        }
    }

    /**
     * Sets the value of the triggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTriggered(Boolean value) {
        this.triggered = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCount() {
        if (count == null) {
            return  0;
        } else {
            return count;
        }
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        if (format == null) {
            return "standard";
        } else {
            return format;
        }
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the remote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRemote() {
        if (remote == null) {
            return false;
        } else {
            return remote;
        }
    }

    /**
     * Sets the value of the remote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemote(Boolean value) {
        this.remote = value;
    }

}
