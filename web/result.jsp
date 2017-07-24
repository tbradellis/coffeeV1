<%@ page import="java.util.*" %> <%-- page directive--%>

<html>
<body>
<h1 align="center"> Coffee Recommendations </h1> <%-- "template text" in the jsp world aka standard html--%>
<p>

<%
  List styles = (List) request.getAttribute("styles");
  Iterator it = styles.iterator();
  while(it.hasNext()){
    out.print("<br>try: " + it.next());
  }
%> <%--java inside <% %> is known as sciptlet code--%>
</body>
</html>
