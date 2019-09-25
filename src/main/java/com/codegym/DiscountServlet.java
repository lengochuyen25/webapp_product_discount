package com.codegym;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float price = Float.parseFloat(req.getParameter("price"));
        float discount_percent = Float.parseFloat(req.getParameter("discount_percent"));
        float discount_amount = (float) (price * discount_percent * 0.01);
        float discount_price = price - discount_amount;
        PrintWriter writer = resp.getWriter();


        writer.println("<html>\n" +
                "    <head>\n" +
                "        <title>Product Discount Calculator</title>\n" +
                "        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <div id=\"content\">\n" +
                "            <h1>Product Discount Calculator</h1>\n" +
                "            <label>Product Description: </label><br/>");
        writer.println("<label> Price: </label>" +
                "<span>" + price + "</span><br/>");


        writer.println("<label> Discount Percent: </label>" +
                "<span>" + discount_percent + "</span><br/>");
        writer.println("<label> Discount Amount: </label>" +
                "<span>" + discount_amount + "</span><br/>");
        writer.println("<label> Discount Price </label>" +
                "<span>" + discount_price + "</span><br/>");

        writer.println("</div>\n" +
                "    </body>\n</html>");
    }
}
