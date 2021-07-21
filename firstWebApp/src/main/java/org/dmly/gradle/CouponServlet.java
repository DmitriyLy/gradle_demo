package org.dmly.gradle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/coupon")
public class CouponServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("SUPERSALE");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String couponCode = Objects.toString(request.getParameter("coupon"), "<EMPTY CODE>") ;
        request.setAttribute("discount", "Discount for a coupon " + couponCode + " is 50%");
        request.getRequestDispatcher("response.jsp").forward(request, response);
    }
}
