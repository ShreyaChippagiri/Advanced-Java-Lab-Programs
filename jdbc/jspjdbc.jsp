
<%@page import="java.sql.*"%>
<html>
<body>
<%

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:mydsn");
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("select State,Population from [Sheet1$]");

            while (rs.next()) {
                String state = rs.getString(1);
                int population = rs.getInt(2);
                out.println(state + " - " + population);
            }
            rs.close();
            stmt.close();
 %>
</body>
</html>