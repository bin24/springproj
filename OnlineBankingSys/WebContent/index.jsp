<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
View transactions:<br/>
<a href="daily.obj">Daily</a><br/>
<a href="monthly.obj">Monthly</a><br/>
<a href="quaterly.obj">Quarterly</a><br/>
<a href="yearly.obj">Yearly</a><br/>
 ${DailyTransactionsList}
 
 
 <table>
			<tr><th>#</th><th>Account number</th><th>Trans desc</th><th>Date of trans</th><th>Amount</th></tr>
			<c:forEach var="item" items="${DailyTransactionsList}">
				<tr>
					<td>${item.transactionId}</td>
					<td>${item.accountNumber}</td>
					<td>${item.transactionDescription}</td>
				    <%-- <td>${item.DateOfTransaction}</td>   --%>
					<td>${item.transactionamount}</td>
				</tr> 
			</c:forEach>
		</table>
 <%-- <c:if test="${DailyTransactionsList!=null }"> --%>
 <%-- Transaction id:<c:out value="${DailyTransactionsList.transactionId}"/><br/>
Account number:<c:out value="${DailyTransactionsList.accountNumber}"/><br/>
Transaction description:<c:out value="${DailyTransactionsList.transactionDescription}"/><br/>
Date of Transaction:<c:out value="${DailyTransactionsList.DateOfTransaction}"/><br/>
Transaction Amount:<c:out value="${DailyTransactionsList.transactionamount}"/><br/> --%>

<%-- </c:if>  --%>


${MonthlyTransactionsList}
${QuarterlyTransactionsList}
${YearlyTransactionsList}



</body>
</html>