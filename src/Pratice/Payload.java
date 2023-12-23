package Pratice;

public class Payload {
	public static String addBook(String isbn , String aisle , String author , String name ) {
		// Add Book Payload
		
		String addbookPayload = "{\r\n"
				+ "\r\n"
				+ "\"name\":\""+name+"\",\r\n"
				+ "\"isbn\":\""+isbn +"\",\r\n"
				+ "\"aisle\":\""+ aisle +"\",\r\n"
				+ "\"author\":\""+author+"\"\r\n"
				+ "}\r\n"
				+ "";
		return addbookPayload;
	}
	
	 public static String DeleteBook(String ID) {
		// Delete Book Payload
		 
		 String DeleteBookPayload ="{\r\n"
		 		+ " \r\n"
		 		+ "\"ID\" : \""+ID+"\"\r\n"
		 		+ " \r\n"
		 		+ "} \r\n"
		 		+ "";
		 return DeleteBookPayload;
	 }
}