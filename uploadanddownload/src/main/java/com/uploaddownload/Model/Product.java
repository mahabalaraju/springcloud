package com.uploaddownload.Model;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "productTable")
public class Product {
@Id
@GeneratedValue
//@UuidGenerator
	private int  id;
	private String name;
	private String filetype;
	@Lob
	@Column(name= "filedata",length=1000)
	private byte[] data;
	
}
