import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightManagementSystem{
	public  boolean addFlight(Flight flightObj) {
		try {
			Connection connection = DB.getConnection();
			String query = "insert into flight values(?,?,?,?,?);";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, flightObj.getFlightId());
			preparedStatement.setString(2, flightObj.getSource());
			preparedStatement.setString(3, flightObj.getDestination());
			preparedStatement.setInt(4, flightObj.getNoOfSeats());
			preparedStatement.setDouble(5, flightObj.getFlightFare());
			preparedStatement.execute();
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}