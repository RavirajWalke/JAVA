import java.io.*;
import javax.servlet.*;
public class P9 extends GenericServlet
{
	public void service(ServletRequest sreq,ServletResponse sresp)throws ServletException,IOException
	{
		sresp.setContentType("text/html");
		PrintWriter pw=sresp.getWriter();
		pw.println("<html><body bgcolor=pink text=purple>");
		pw.println("<h1><center>PERSONAL DETAILS</center></h1>");
		pw.println("<b>NAME :</b>RAVIRAJ YOGIRAJ WALKE");
		pw.println("<b>Reg No :</b>2014BCS021");
		pw.println("<b>Email ID :</b>ravirajwalke9@gmail.com");
		pw.println("<b>Education :</b>B.Tech(T.Y)CSE");
		pw.println("</body></html>");
	}
}