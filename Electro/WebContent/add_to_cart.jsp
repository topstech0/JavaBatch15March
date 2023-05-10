<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.Cart"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.WishlistDao"%>
<%@page import="com.bean.Wishlist"%>
<%
int pid = Integer.parseInt(request.getParameter("pid"));
Product p = ProductDao.getProductById(pid);
int uid = Integer.parseInt(request.getParameter("uid"));
Cart c = new Cart();
c.setPid(pid);
c.setUid(uid);
c.setProd_price(p.getProd_price());
c.setProd_qty(1);
c.setTotal_price(p.getProd_price());
CartDao.addToCart(c);

List<Cart> c_list = CartDao.getCartByUser(uid);
session.setAttribute("cart_count", c_list.size());

response.sendRedirect("mycart.jsp");
%>