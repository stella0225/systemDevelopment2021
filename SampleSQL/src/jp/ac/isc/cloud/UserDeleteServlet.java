package jp.ac.isc.cloud;

public class UserDeleteServlet {
	try {
		 Connection users = null;
		 try {
		 request.setCharacterEncoding("utf-8");
		 Class.forName("com.mysql.jdbc.Driver");
		 users = DriverManager.getConnection("jdbc:mysql://localhost/servlet_db"
		,"root","");
		 String id = request.getParameter("deleteId");
		 Statement state = users.createStatement();
		 state.executeUpdate("DELETE FROM user_table WHERE id='" + id + "'");
		 state.close();
		 users.close();
		 response.sendRedirect("/select"); //UserSelectServletを呼び出す
		 }catch(ClassNotFoundException e) {
		 e.printStackTrace();
		 }
		 }catch(SQLException e){
		 e.printStackTrace();
		 }

}
