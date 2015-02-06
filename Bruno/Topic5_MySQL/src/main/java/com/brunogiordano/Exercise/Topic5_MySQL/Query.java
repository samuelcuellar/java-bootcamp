package com.brunogiordano.Exercise.Topic5_MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Query {

	public void point_4(int num) {
		MyDataAccess connect = new MyDataAccess();
		ResultSet result, result2;
		String s_name, s_last, c_name, t_name, t_last;
		result = connect.getQuery("select c.name, t.first_name, t.last_name from course c inner join teacher t"
				+ " on t.id_teacher = c.Teacher_id_teacher where c.id_course=" + num);
		try {
			while (result.next()) {
				c_name = result.getString("name");
				t_name = result.getString("t.first_name");
				t_last = result.getString("t.last_name");
				System.out.println(" Course: " + c_name);
				System.out.print(" Teacher: " + t_name);
				System.out.println(" " + t_last);

				result2 = connect.getQuery("select s.first_name, s.last_name from student s inner join student_has_course hc"
						+ " on hc.student_id_student = s.id_student inner join course c "
						+ " on c.id_course=hc.course_id_course where c.id_course=" + num + " order by s.last_name asc");

				System.out.println(" Students: ");
				while (result2.next()) {
					s_name = result2.getString("s.first_name");
					s_last = result2.getString("s.last_name");
					System.out.print("    " + s_name);
					System.out.println(" " + s_last);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void point_5(String last_n) {
		MyDataAccess connect = new MyDataAccess();
		ResultSet result;
		String s_name, s_last, c_name;
		int note;
		result = connect.getQuery("select s.first_name, s.last_name, c.name, hc.Final from student s inner join student_has_course hc"
				+ " on hc.student_id_student=s.id_student inner join course c "
				+ " on c.id_course=hc.course_id_course where s.last_name= '" + last_n + "' order by hc.Final desc, c.name asc");

		try {
			while (result.next()) {
				c_name = result.getString("name");
				s_name = result.getString("s.first_name");
				s_last = result.getString("s.last_name");
				note = result.getInt("hc.Final");
				System.out.println(" Course: " + c_name);
				System.out.print(" Student: " + s_name);
				System.out.print(" " + s_last);
				System.out.println(", Final Note: " + note);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void point_7(String last_n) {
		MyDataAccess connect = new MyDataAccess();
		ResultSet result;
		int i=0;
		String t_name, t_last, c_name, tn_day, tn_b, tn_e;
		result = connect.getQuery("select t.first_name, t.last_name, c.name, tn.day, tn.begin, tn.end from teacher t inner join course c"
				+ " on c.teacher_id_teacher=t.id_teacher inner join turn tn "
				+ " on tn.course_id_course=c.id_course where t.last_name= '" + last_n + "' order by tn.day asc");
		
		try {
			while (result.next()) {
				if(i==0){
					t_name = result.getString("t.first_name");
					t_last = result.getString("t.last_name");
					System.out.print(" Teacher: " + t_name);
					System.out.println(" " + t_last);
					i++;
				}
					c_name = result.getString("name");
					tn_day = result.getString("tn.day");
					tn_b = result.getString("tn.begin");
					tn_e = result.getString("tn.end");
					System.out.print(" Day: " + tn_day);
					System.out.print("  " + tn_b);
					System.out.print("  " + tn_e);
					System.out.println(" Course: " + c_name);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
