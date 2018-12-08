package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 1;
		String URL = "jdbc:mysql://localhost:3306/fee";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, "root", "root");
			Statement stmt = conn.createStatement();
			do {
				System.out.println("1.Insert 2.Update 3.Delete 4.Display");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					Insert(stmt);
					break;
				case 2:
					Update(stmt);
					break;
				case 3:
					Delete(stmt);
					break;
				case 4:
					Display(stmt);
					break;
				default:
					System.out.println("Invalid!");
				}
				System.out.println("Do you want to continue? (y=1/n=0)");
				cont = sc.nextInt();
			} while (cont != 0);

			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void Display(Statement stmt) throws Exception {
		ResultSet rs = stmt.executeQuery("SELECT * FROM feeslip");
		while (rs.next()) {
			System.out.print("FirstName: " + rs.getString(2) + " " + "LastName: " + rs.getString(3) + " " + "Reg.No: "
					+ rs.getString(1) + " " + "FeeMonth: " + rs.getString(4) + " " + "Fee in Rs: " + rs.getString(5));
			System.out.println();
		}
		// Close the result set, statement and the connection
		rs.close();
	}

	public static void Delete(Statement stmt) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Reg: ");
		int reg = sc.nextInt();
		boolean b = stmt.execute("DELETE FROM feeslip WHERE regno =" + reg);
		Display(stmt);
	}

	public static void Insert(Statement stmt) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("FirstName: ");
		String firstName = sc.next();
		System.out.print("LastName: ");
		String lastName = sc.next();
		System.out.print("Reg: ");
		int regNo = sc.nextInt();
		System.out.print("Month: ");
		String feeMonth = sc.next();
		System.out.print("Fee: ");
		String totalFee = sc.next();

		stmt.execute("INSERT INTO feeslip VALUES (" + regNo + ",'" + firstName + "','" + lastName + "','" + feeMonth + "','"
				+ totalFee + "')");

		// System.out.println(b);
		Display(stmt);
	}

	public static void Update(Statement stmt) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Fee: ");
		String totalFee = sc.next();
		System.out.println("Reg: ");
		int regNo = sc.nextInt();

		boolean b = stmt.execute("UPDATE feeslip SET total_fee='" + totalFee + "' WHERE regno=" + regNo + ";");
		Display(stmt);
	}

}
