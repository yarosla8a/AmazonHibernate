package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "actions")

public class Action {
	@Id
	@Column(name="id", length=1000 )
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(name="id", length=1000 )
	private Long actionTime;
	
	@Column(name="id", length=1000 )
	private Boolean addedToCard;
	
	@ManyToOne(targetEntity = Account.class)
	private String login;
	
	@ManyToOne(targetEntity = Goods.class)
	private String asin;
	

}
