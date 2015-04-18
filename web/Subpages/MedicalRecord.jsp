<%--
  Created by IntelliJ IDEA.
  User: aashish
  Date: 23/11/14
  Time: 12:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%
  User addUser = (User) session.getAttribute(Constants.USERINFO);
  if (addUser == null) {
    response.sendRedirect("Login.jsp");
    return;
  }
%>

<div class="row">
  <form class="form-horizontal well" role="form" id="spForm" method="post" action="addMedicalRecord">
    <div class="form-group">
      <label class="col-sm-3 control-label">ChiefComplaints</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" placeholder="chiefComplaints" name="chiefComplaints"
               id="spChiefComplaints">
      </div>
    </div>
    <div class="form-group">
      <label class="col-sm-2 control-label">MentalSymptoms</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" placeholder="mentalSymptoms" name="mentalSymptoms"
               id="spMentalSymptoms">
      </div>
    </div>
    <div class="form-group">
      <label class="col-sm-2 control-label">PhysicalSymptoms</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="physicalSymptoms"
               placeholder="physicalSymptoms" id="spPhysicalSymptoms">
      </div>
    </div>
    <div class="form-group">
      <label class="col-sm-2 control-label">Investigation</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="investigation"
               placeholder="investigation" id="spInvestigation">
      </div>
    </div>
    <div class="form-group">
      <label class="col-sm-2 control-label">FamilyHistory</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="familyHistory"
               placeholder="familyHistory" id="spFamilyHistory">
      </div>
    </div>
    <div class="form-group">
      <label class="col-sm-2 control-label">Thermal</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="thermal"
               placeholder="thermal" id="spThermal">
      </div>
    </div>
    <div class="form-group">
      <label class="col-sm-2 control-label">Desire</label>
        <div class="col-sm-10">
        <input type="text" class="form-control" name="desire"
               placeholder="aversion" id="spDesire">
      </div>
    </div>
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-2">
        <button class="btn btn-primary" id="spAdd">Add</button>
      </div>
      <div class="col-sm-2">
        <button class="btn btn-default" id="spClear">Clear</button>
      </div>
    </div>
  </form>
</div>