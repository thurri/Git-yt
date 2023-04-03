package it.Ashok;

import jakarta.persistence.Id;

public class Book {
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

}
