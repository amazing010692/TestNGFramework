package testNGListenerOnFailure;
public class TestConfig{


	
	public static String server="smtp.gmail.com";
	public static String from = "arrowphoto2112259janiellejoy@gmail.com";
	public static String password = "YouAreAmazing987";
	public static String[] to ={"selenium_test@gmail.com", "hello_test@yahoo.com.ph"};
	public static String subject = "Extent Project Report";
	
	public static String messageBody ="TestMessage";
	public static String attachmentPath="C:\\Users\\hello\\Pictures\\Evolution of Red Blood Cells.jpg";
	public static String attachmentName="error.jpg";
	
	
	
	//SQL DATABASE DETAILS	
	public static String driver="net.sourceforge.jtds.jdbc.Driver"; 
	public static String dbConnectionUrl="jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval"; 
	public static String dbUserName="sa"; 
	public static String dbPassword="$ql$!!1"; 
	
	
	//MYSQL DATABASE DETAILS
	public static String mysqldriver="com.mysql.jdbc.Driver";
	public static String mysqluserName = "root";
	public static String mysqlpassword = "selenium";
	public static String mysqlurl = "jdbc:mysql://localhost:3306/acs";

	
}
