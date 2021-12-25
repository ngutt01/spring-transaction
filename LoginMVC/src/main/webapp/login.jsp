<%@taglib   uri="http://www.springframework.org/tags/form"     prefix="form"%>

<form:form   action="checkLogin.form"   method="post"   modelAttribute="userLogin">
    <table>
       <tr>
         <td>Username</td>
         <td><form:input  path="username"/>
         <td><form:errors  path="username"/> 
       </tr>
       <tr>
         <td>Password</td>
         <td><form:password  path="password"/>
         <td><form:errors  path="password"/> 
       </tr>
       <tr>
          <td  align="center" colspan="3">
            <input   type="submit"   value="Login">
          </td>
    </table>
</form:form>