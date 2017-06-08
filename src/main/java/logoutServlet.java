/**
 * Created by jsr on 6/8/17.
 */

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;




@WebServlet(name="logoutServlet", urlPatterns = "/logout")

public class logoutServlet extends HttpServlet {
    protected void  doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("user");
        request.getSession().invalidate();
        response.sendRedirect("/login");
    }
}
