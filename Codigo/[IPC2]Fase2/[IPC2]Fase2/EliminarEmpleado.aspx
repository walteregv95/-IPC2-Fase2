<%@ Page Title="" Language="C#" MasterPageFile="~/Nominas.Master" AutoEventWireup="true" CodeBehind="EliminarEmpleado.aspx.cs" Inherits="_IPC2_Fase2.EliminarEmpleado" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
      <div class="container">
     <div class="page-header">
              <h1 class="all-tittles">Nominas<small>_Eliminar Empleado</small></h1>
            </div>
        </div>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder2" runat="server">
    <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
                <li role="presentation"  class="active"><a href="EliminarEmpleado.aspx">Eliminar Empleado</a></li>
               
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/user05.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para eliminar empleados, para eliminar un empleado primero debes buscarlo.
                </div>
            </div>
        </div>
       
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Eliminar Empleado</div>
                <form autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <div class="group-material">
                                
                                <asp:TextBox ID="txtIdEmpleado" runat="server" type="text" class="material-control tooltips-general" placeholder="101"  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el codigo del empleado"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Id Empleado</label>
                            </div>
                            <div class="group-material">
                                 <p class="center-block">
                             <asp:Button ID="Button1" runat="server" Text="Buscar" type="submit" class="btn btn-primary" OnClick="Button1_Click"/>
                           </p>
                             
                            </div>
                          <div class="group-material">
                                
                                <asp:TextBox ID="txtNombre" runat="server" type="text" class="material-control tooltips-general"  maxlength="100" data-toggle="tooltip" data-placement="top" title=""></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre del empleado</label>
                            </div>
                           
                            </div>
                           
                            <p class="text-center">
                                
                                <asp:Button ID="Button2" runat="server" Text="Eliminar" type="submit" class="btn btn-primary" OnClick="Button2_Click"/>
                               
                       </div>
                   </div>
                </form>
            </div>
        </div>
</asp:Content>
