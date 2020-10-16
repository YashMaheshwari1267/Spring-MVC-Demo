package dao;

import connection.MyCon;
import java.sql.*;
import model.Student;
import java.util.*;

public class StudentDAO {
	String sql;
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public boolean insertStudent(Student S) throws Exception {
		sql = "insert into student values(?,?,?,?,?,?)";
		con = MyCon.myConnection();
		ps = con.prepareStatement(sql);
		ps.setInt(1, S.getId());
		ps.setString(2, S.getFirstName());
		ps.setString(3, S.getLastName());
		ps.setString(4, S.getEmail());
		ps.setString(5, S.getMobile());
		ps.setString(6, S.getCourse());
		int n = 0;
		n = ps.executeUpdate();
		if (n > 0)
			return true;
		return false;
	}

	public List<Student> searchAll() throws Exception {
		sql = "select * from student";
		con = MyCon.myConnection();
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		List<Student> mylist = new ArrayList<Student>();
		while (rs.next()) {
			Student S = new Student();
			S.setId(rs.getInt(1));
			S.setFirstName(rs.getString(2));
			S.setLastName(rs.getString(3));
			S.setEmail(rs.getString(4));
			S.setMobile(rs.getString(5));
			S.setCourse(rs.getString(6));
			mylist.add(S);
			S = null;
		}
		return mylist;
	}

}
