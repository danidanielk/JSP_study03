

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Output")
public class Output extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("EUC-KR");
response.setCharacterEncoding("EUC-KR");

String id= request.getParameter("ID");
String pw= request.getParameter("PW");
String gd= request.getParameter("GD");
String lc= request.getParameter("LC");
String[] hb=request.getParameterValues("HB");
String ind=request.getParameter("IND");
// textarea���� ���� : \r\n
//������������ �ٹٲٱ� : <br>
ind= ind.replace("\r\n", "<br>");
PrintWriter out = response.getWriter();
out.print("<html>");
out.print("<body>");
out.print("<h1>���԰��</h1>");
out.printf("<h2>ID : %s</h2>", id);
out.printf("<h2>PW : %s</h2>", pw);
out.printf("<h2>���� : %s</h2>", gd);
out.printf("<h2>���� : %s</h2>", lc);
if (hb != null) {//��̸� �������� �ʾ������� ����ؼ�
	out.print("<h2>��� : ");
	for (String s : hb) { //�迭 ��� �ϳ��� Ǯ��
		out.print(s + " ");
	}
	out.print("</h2>");
}
	out.printf("<h2>�ڱ�Ұ� : %s</h2>", ind);
	out.print("</body>");
	out.print("</html>");
	}

}
