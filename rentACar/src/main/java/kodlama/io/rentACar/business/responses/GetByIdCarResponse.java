package kodlama.io.rentACar.business.responses;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdCarResponse {
	
	private int id;
	private String plate;
	private double dailyPrice;
	private int modelYear;
	private int state;
	private String fuel;
	private String gear;
	private Date startDate;
	private Date endDate;

}
