package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name ="goods")

public class Goods {
	@Id
	@Column(name ="asin", length=100)
	private String asin;
	
	@Column(name ="name", length=100)
	private String name;
	
	@Column(name ="price", length=30)
	private Integer price;
	
	@Column(name ="initial_price", length=100)
	private Integer initial_price;
	
	@Column(name ="good_url", length=100)
	private String good_url;
	
	@Column(name ="img_url", length=100)
	private String img_url;
	
	public Goods() {
	}

	public Goods(String asin, String name, Integer price, Integer initial_price, String good_url, String img_url) {
		this.asin = asin;
		this.name = name;
		this.price = price;
		this.initial_price = initial_price;
		this.good_url = good_url;
		this.img_url = img_url;
	}
	
	

}
