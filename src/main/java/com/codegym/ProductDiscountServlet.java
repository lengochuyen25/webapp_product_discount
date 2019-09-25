package com.codegym;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getOutputStream().println("<html>\n" +
                "<head>\n" +
                "    <title>\n" +
                "        Product Discount Caculator\n" +
                "    </title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"content\" style=\" width: 450px;\n" +
                "    margin: 0 auto;\n" +
                "    padding: 0px 20px 20px;\n" +
                "    background: white;\n" +
                "    border: 2px solid navy;\">\n" +
                "    <h1 style=\"  color: navy;\">Product Discount Caculator</h1>\n" +
                "    <form method=\"post\" action=\"display_discount\">\n" +
                "        <div id=\"data\">\n" +
                "            <label style=\"width: 10em;\n" +
                "                         padding-right: 1em;\n" +
                "                         float: left;padding-bottom: 1em\">Product Description: </label>\n" +
                "            <input style=\"float: right;\n" +
                "                   width: 15em;\n" +
                "                   margin-bottom: .5em\" ;type=\"text\" name=\"description\"/><br style=\"clear: left;\"/>\n" +
                "            <label>List Price: </label>\n" +
                "            <input style=\"float: right;\n" +
                "    width: 15em;\n" +
                "    margin-bottom: .5em;\" type=\"text\" name=\"price\"/><br style=\"clear: left;\"/><br/>\n" +
                "            <label>Discount Percent: </label>\n" +
                "            <input style=\" float: right;\n" +
                "                   width: 15em;\n" +
                "                   margin-bottom: .5em;\" type=\"text\" name=\"discount_percent\"/>%<br style=\"clear: left;\"/><br/>\n" +
                "        </div>\n" +
                "        <div id=\"button\">\n" +
                "            <label>&nbsp;</label>\n" +
                "            <input style=\" float: left;\n" +
                "    margin-bottom: .5em;\" type=\"submit\" value=\"Calculate Discount\"/><br/>\n" +
                "        </div>\n" +
                "    </form>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
    }
}
