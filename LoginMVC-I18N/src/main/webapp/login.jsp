<%@taglib   uri="http://www.springframework.org/tags/form"     prefix="form"%>
<%@taglib   uri="http://www.springframework.org/tags"     prefix="spring"%>

<%@page   pageEncoding="utf-8" %>
<a  href="getLoginPage.form?language=en"> <spring:message code="label.english"/> </a>
&nbsp;&nbsp;&nbsp;
<a  href="getLoginPage.form?language=hi"> <spring:message code="label.hindi"/> </a>
&nbsp;&nbsp;&nbsp;
<a  href="getLoginPage.form?language=te"> <spring:message code="label.telugu"/> </a>


<form:form   action="checkLogin.form"   method="post"   modelAttribute="userLogin">
    <table>
       <tr>
         <td><spring:message code="label.username"/></td>
         <td><form:input  path="username"/>
         <td><form:errors  path="username"/> 
       </tr>
       <tr>
         <td><spring:message  code="label.password"/></td>
         <td><form:password  path="password"/>
         <td><form:errors  path="password"/> 
       </tr>
       <tr>
          <td  align="center" colspan="3">
            <input   type="submit"   value='<spring:message  code="label.submit"/>'>
          </td>
    </table>
</form:form>