package com.xzteam.pizzeria.api;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BucketApi {
	@XmlElement(required = false)
	public Long id;
	@XmlElement(required = true)
	public String address;
	@XmlElement(required = true)
	public Float price;
	@XmlElement(required = true)
	public Calendar date;
}
