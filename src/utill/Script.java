package utill;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Script {
	public static void responseData(HttpServletResponse response, String jsonData) {
		
		PrintWriter out;
		
		try {
			out = response.getWriter();
			out.println("<script>");
			out.println("alert('"+jsonData+"');");
			out.println("<script>");
			out.flush(); // 버퍼 비우기
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void back(HttpServletResponse response, String msg) {
		PrintWriter out;
		
		try {
			out = response.getWriter();
			out.println("<script>");
			out.println("alert('"+msg+"');");
			out.println("<script>");
			out.flush(); // 버퍼 비우기
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}