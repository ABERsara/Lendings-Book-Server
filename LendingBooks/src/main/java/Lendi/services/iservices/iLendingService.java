package Lendi.services.iservices;

import java.util.List;

import Lendi.models.Lending;

public interface iLendingService {
//פעולה להוספת השאלה
	boolean addLending(Lending lending);
	//פעולה המקבלת קוד השאלה ומעדכנת שהספר הוחזר
	boolean updateReturned(int id);
	//פעולה המציגה את פרטי ההשאלות כולל פרטי משאיל ופרטי הספר
	List<Object[]> getAllLendingsWithBookAndCustomerInfo();
	}
