<%--
  Created by IntelliJ IDEA.
  User: VIJAY
  Date: 9/15/2021
  Time: 10:13 AM
--%>
<meta name="layout" content="main"/>

<div class="form-content">
<!-- Form layout-->
    <g:form class="form" controller="employee" action="save">
        <g:render template="form"/>
        <div class="buttonParent">
            <g:link controller="employee" action="index" class="resetButton button cancelButton" ><g:message code="cancel"/></g:link>
            <div class="submit-reset">
                <g:submitButton class="button submitButton" name="save" value="${g.message(code: "submit")}"/>
                <button type="reset" class="resetButton button" id="resetButton"><g:message code="reset"/></button>
            </div>
        </div>
    </g:form>
</div>