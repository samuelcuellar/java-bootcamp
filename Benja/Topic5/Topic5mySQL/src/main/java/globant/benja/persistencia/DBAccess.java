package globant.benja.persistencia;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class DBAccess {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void conectar() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost/topic5?"
							+ "user=sqluser&password=benja");
			System.out.println("conexion exitosa!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void listarCurso() throws SQLException {

		statement = (Statement) connect.createStatement();
		resultSet = statement.executeQuery("select * from course");
		writeCourseRS(resultSet);
	}

	private void writeCourseRS(ResultSet resultSet) throws SQLException {

		while (resultSet.next()) {
			String code = resultSet.getString("course_code");
			String name = resultSet.getString("name");
			String hours = resultSet.getString("hours_by_week");
			String id = resultSet.getString("id");
			System.out.println("Course Code: " + code);
			System.out.println("name: " + name);
			System.out.println("hours by week: " + hours);
			System.out.println("teacher id: " + id);
			System.out.println();
		}
	}

	public void listarCurso(int id) throws SQLException {

		preparedStatement = (PreparedStatement) connect
				.prepareStatement("select course.name, maestros.name"
						+ " from course inner join maestros"
						+ " on course.id = maestros.id"
						+ " where course.course_code = ?;	");
		preparedStatement.setString(1, "" + id);

		resultSet = preparedStatement.executeQuery();
		System.out.println(preparedStatement);
		writeCourse2RS(resultSet, id);

	}

	private void writeCourse2RS(ResultSet resultSet, int id) throws SQLException {

		while (resultSet.next()) {
			System.out.println("Result: ");
			String course = resultSet.getString("course.name");
			System.out.println("Course: " + course);

			String teacher = resultSet.getString("maestros.name");
			System.out.println("Teacher: " + teacher);

			System.out.println("Students");

			mostrarAlumnos(course,id);
			
		}
	}

	private void mostrarAlumnos(String course, int id) throws SQLException {
		preparedStatement = (PreparedStatement) connect
				.prepareStatement("select course.name, alumnos.name"
						+ " from course inner join alumnos"
						+ " where course.course_code = ?"
						+ " order by alumnos.name;");
		preparedStatement.setString(1, "" + id);
		resultSet = preparedStatement.executeQuery();
		writeAlumnos(resultSet);
		System.out.println(preparedStatement);
	}

	private void writeAlumnos(ResultSet resultSet) throws SQLException {
		while (resultSet.next()) {
			String name = resultSet.getString("alumnos.name");
			System.out.println("name: " + name);
		}
	}
}
