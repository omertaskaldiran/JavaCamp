package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCarsResponse {

	private String plate;
	private double dailyPrice;
	private int modelYear;
	private String fuel;
	private String gear;
}
