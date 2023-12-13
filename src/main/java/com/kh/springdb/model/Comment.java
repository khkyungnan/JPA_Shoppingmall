package com.kh.springdb.model;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
@Table(name = "comments")
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="comment_seq")
	@SequenceGenerator(name="comment_seq", sequenceName="comment_seq", allocationSize=1)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	private String content;
	
	//댓글에 좋아요를 누르고 싶다면 댓글 객체로 와서 추천에 관련된 필드를 설정해주면 됨
	
}









