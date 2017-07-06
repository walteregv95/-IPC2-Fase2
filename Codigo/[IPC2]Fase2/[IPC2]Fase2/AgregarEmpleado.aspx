<%@ Page Title="" Language="C#" MasterPageFile="~/Nominas.Master" AutoEventWireup="true" CodeBehind="AgregarEmpleado.aspx.cs" Inherits="_IPC2_Fase2.AgregarEmpleado" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
     <div class="container">
     <div class="page-header">
              <h1 class="all-tittles">Nominas<small>_Registrar Empleado</small></h1>
            </div>
        </div>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder2" runat="server">
     <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
                <li role="presentation"  class="active"><a href="AgregarEmpleado.aspx">Nuevo Empleado</a></li>
               
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/user02.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para registrar un nuevo empleado, debes de llenar todos los campos del siguiente formulario para registrar el empleado.
                </div>
            </div>
        </div>
       
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Registrar una nuevo Empleado</div>
                <form autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            
                          <div class="group-material">
                                
                                <asp:TextBox ID="txtIdNomina" runat="server" type="text" class="material-control tooltips-general" placeholder="1012 "  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el codigo de la Nomina"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Id Nomina</label>
                            </div>
                            <div class="group-material">
                                 <p class="center-block">
                             <asp:Button ID="Button4" runat="server" Text="Buscar" type="submit" class="btn btn-primary" OnClick="Button4_Click"/>
                           </p>
                             
                            </div>
                           
                              <div class="group-material">
                                
                                <asp:TextBox ID="txtEmpresa" runat="server" type="text" class="material-control tooltips-general"   maxlength="100" data-toggle="tooltip" data-placement="top" title=""></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre de la Empresa</label>
                            </div> 
                            
                             <div class="group-material">
                                
                                <asp:TextBox ID="txtIdCliente" runat="server" type="text" class="material-control tooltips-general" placeholder="10141"  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el codigo del cliente"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Id Cliente</label>
                            </div>
                           <div class="group-material">
                                 <p class="center-block">
                             <asp:Button ID="Button1" runat="server" Text="Buscar" type="submit" class="btn btn-primary" OnClick="Button1_Click"/>
                           </p>
                             
                            </div>
                             <div class="group-material">
                                
                                <asp:TextBox ID="txtCliente" runat="server" type="text" class="material-control tooltips-general" placeholder="2017-06-30"  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el codigo del cliente"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre Cliente</label>
                            </div>
                          
                           
                            <div class="group-material">
                                
                                <asp:TextBox ID="txtSueldo" runat="server" type="text" class="material-control tooltips-general" placeholder="Walter García " maxlength="100" data-toggle="tooltip" data-placement="top" ></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Sueldo</label>
                            </div>
                           
                            <p class="text-center">
                                
                                <asp:Button ID="Button2" runat="server" Text="Guardar" type="submit" class="btn btn-primary" OnClick="Button2_Click"/>
                               
                       </div>
                   </div>
                </form>
            </div>
        </div>
</asp:Content>
