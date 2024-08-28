package Lendi.models;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table
public class Lending {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//(מפתח ראשי, מספור אוטומטי)
		private int lendingId;
	@Column(length=9)
	//(ת.ז. של הלקוח המשאיל)
	private String customerId;
		 //(קוד הספר)
	@Column
		private int bookId ;
	//(תאריך השאלה)
	@Temporal (TemporalType.DATE)
	@Column
		private Date lendingDate ;
	//הוחזר (כן/לא)
	@Column
	private boolean returned; 
	
	public Lending() {
		
	}

	public int getLendingId() {
		return lendingId;
	}

	public void setLendingId(int lendingId) {
		this.lendingId = lendingId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Date getLendingDate() {
		return lendingDate;
	}

	public void setLendingDate(Date lendingDate) {
		this.lendingDate = lendingDate;
	}

	public boolean isReturned() {
		return returned;
	}

	public void setReturned(boolean returned) {
		this.returned = returned;
	}
	

}
