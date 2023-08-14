package com.ecom.catalogmanagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "CategoryGroup")
public class CategoryGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "catGroupName")
	String name;
	@Column(name = "catGroupCode")
	String catGroupCode;
	
	String shortDescription;
	String longDescription;
	@Column(name = "imageUrl")
	String image;
	@Column(name="thumbnailUrl")
	String thumbnail;
	Integer parentCatGroup;
	public String getCatGroupCode() {
		return catGroupCode;
	}
	public void setCatGroupCode(String catGroupCode) {
		this.catGroupCode = catGroupCode;
	}
	public Integer getParentCatGroup() {
		return parentCatGroup;
	}
	public void setParentCatGroup(Integer parentCatGroup) {
		this.parentCatGroup = parentCatGroup;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public CategoryGroup(int id, String name, String shortDescription, String longDescription, String image,
			String thumbnail) {
		super();
		this.id = id;
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.image = image;
		this.thumbnail = thumbnail;
	}
	public CategoryGroup() {
		super();
	}
	
}
