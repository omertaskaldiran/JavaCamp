package kodlama.io.rentACar.core.utilities.exceptions;

public class BusinessException extends RuntimeException {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public BusinessException(String message) {
			super(message);   //super base sınıf demek. burada base RuntimeException  oluyor.
			// gelen mesajı base sınıfa gönderiyoruz.
		}
	

}
