<%--
    Document   : editarVehi
    Created on : 4/10/2025, 03:30:00 PM
    Author     : wcastro
--%>

<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<%@page import="dao.tipoVehiDAO"%>
<%@page import="modelo.vehi"%>

<html lang="es">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />
    <title>SoWil Company - Editar Vehículo</title>
    <meta name="description" content="Wilson Castro Gil" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
    <%@include file="cssplantilla.jsp" %>
</head>

<body class="no-skin">
    <div id="navbar" class="navbar navbar-default ace-save-state">
        <div class="navbar-container ace-save-state" id="navbar-container">
            <div class="navbar-header pull-left">
                <a href="${ctx}/index.jsp" class="navbar-brand">
                    <small>
                        <i class="fa fa-book"></i>
                        Gestión de Vehículos
                    </small>
                </a>
            </div>
        </div>
    </div>

    <div class="main-container ace-save-state" id="main-container">
        <div id="sidebar" class="sidebar responsive ace-save-state">
            <ul class="nav nav-list">
                <li class="">
                    <a href="${ctx}/index.jsp">
                        <i class="menu-icon fa fa-tachometer"></i>
                        <span class="menu-text"> Inicio </span>
                    </a>
                </li>
                <li class="active open">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-book"></i>
                        <span class="menu-text"> Gestionar Vehículos </span>
                        <b class="arrow fa fa-angle-down"></b>
                    </a>
                    <ul class="submenu">
                        <li class="">
                            <a href="${ctx}/listarVehi.jsp">
                                <i class="menu-icon fa fa-caret-right"></i>
                                Lista de Vehículos
                            </a>
                        </li>
                        <li class="">
                            <a href="${ctx}/registrarVehi.jsp">
                                <i class="menu-icon fa fa-caret-right"></i>
                                Registrar Vehículo
                            </a>
                        </li>
                        <li class="">
                            <a href="${ctx}/registrarTv.jsp">
                                <i class="menu-icon fa fa-caret-right"></i>
                                Registrar Tipo Vehículo
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>

        <div class="main-content">
            <div class="main-content-inner">
                <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                    <ul class="breadcrumb">
                        <li>
                            <i class="ace-icon fa fa-home home-icon"></i>
                            <a href="#">Inicio</a>
                        </li>
                        <li class="active">Editar Vehículo</li>
                    </ul>
                </div>

                <div class="page-content">
                    <div class="page-header">
                        <h1>
                            Editar Vehículo
                            <small>
                                <i class="ace-icon fa fa-angle-double-right"></i>
                                Modificar datos del vehículo
                            </small>
                        </h1>
                    </div>

                    <div class="row">
                        <div class="col-xs-12">
                            <c:if test="${not empty mensaje}">
                                <div class="alert alert-info">
                                    <button type="button" class="close" data-dismiss="alert">
                                        <i class="ace-icon fa fa-times"></i>
                                    </button>
                                    ${mensaje}
                                </div>
                            </c:if>

                            <form class="form-horizontal" action="${ctx}/vehiControlador" method="post" role="form">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-1">Placa</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="form-field-1" name="txtplaca"
                                               value="${vehiculo.placavehi}" class="col-xs-10 col-sm-5" readonly />
                                        <span class="help-inline col-xs-12 col-sm-7">
                                            <span class="middle">La placa no se puede modificar</span>
                                        </span>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-2">Marca</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="form-field-2" name="txtmarca"
                                               value="${vehiculo.marcavehi}" placeholder="Marca del vehículo"
                                               class="col-xs-10 col-sm-5" required />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-3">Referencia</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="form-field-3" name="txtmatricula"
                                               value="${vehiculo.refvehi}" placeholder="Referencia del vehículo"
                                               class="col-xs-10 col-sm-5" required />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-4">Modelo</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="form-field-4" name="txtmodelo"
                                               value="${vehiculo.modelovehi}" placeholder="Modelo del vehículo"
                                               class="col-xs-10 col-sm-5" required />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="form-field-select-1">Tipo Vehículo</label>
                                    <div class="col-sm-9">
                                        <select class="form-control" id="form-field-select-1" name="txtidtv" required>
                                            <option value="">Seleccione un tipo</option>
                                            <% for (modelo.tipoVehi tv : tipoVehiDAO.listarTv()) { %>
                                                <option value="<%= tv.getIdtv() %>"
                                                    ${vehiculo.id_tv == tv.idtv ? 'selected' : ''}>
                                                    <%= tv.getNomtv() %>
                                                </option>
                                            <% } %>
                                        </select>
                                    </div>
                                </div>

                                <div class="clearfix form-actions">
                                    <div class="col-md-offset-3 col-md-9">
                                        <button class="btn btn-info" type="submit" name="accion" value="actualizar">
                                            <i class="ace-icon fa fa-check bigger-110"></i>
                                            Actualizar
                                        </button>

                                        &nbsp; &nbsp; &nbsp;
                                        <a class="btn" href="${ctx}/listarVehi.jsp">
                                            <i class="ace-icon fa fa-undo bigger-110"></i>
                                            Cancelar
                                        </a>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="footer">
            <div class="footer-inner">
                <div class="footer-content">
                    <span class="bigger-120">
                        Wilson Castro Gil &copy; SoWil-2025
                    </span>
                </div>
            </div>
        </div>
    </div>

    <!-- basic scripts -->
    <script src="assets/js/jquery-2.1.4.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="${ctx}/assets/js/ace-elements.min.js"></script>
    <script src="${ctx}/assets/js/ace.min.js"></script>
</body>
</html>
