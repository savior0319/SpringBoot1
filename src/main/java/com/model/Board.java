package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name = "BOARD")
public class Board {

	@Id
	@GeneratedValue
	@Column(name = "BOARD_SEQ")
	private Long boardSeq;
	private String title;
	@Column(columnDefinition = "CLOB")
	private String content;
	@Column(name = "INSERT_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date insertDate;

	@ManyToOne
	@JoinColumn(name = "USER_ID", nullable = false)
	private Member member;

}
