package com.fanatics.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity //registers class as entity in DB
@Table(name="APPROVALS")//allows further configuration of Table in DB
public class Approval {
    
    private static final long serialVersionUID = 1L;
    
    @Id //necessary for Hibernate to identify objects
    @Column(name="APPROVAL_ID")
    @SequenceGenerator(name="APP_SEQ_GEN", sequenceName="APP_SEQ")
    @GeneratedValue(generator="APP_SEQ_GEN", strategy=GenerationType.SEQUENCE)
    private int id;
    
    @Column(nullable=false, name="REVIEW_ID")
    private int review_id;
    @Column(nullable=false, name="THUMBS_UP")
    private int thumb;
    @Column(nullable=false, name="SOURCE_ID")
    private int source_id;

    public Approval () {}

	public Approval(int id, int review_id, int thumb, int source_id) {
		super();
		this.id = id;
		this.review_id = review_id;
		this.thumb = thumb;
		this.source_id = source_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public int getThumb() {
		return thumb;
	}

	public void setThumb(int thumb) {
		this.thumb = thumb;
	}

	public int getSource_id() {
		return source_id;
	}

	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Approval [id=" + id + ", review_id=" + review_id + ", thumb=" + thumb + ", source_id=" + source_id
				+ "]";
	}
 
}
