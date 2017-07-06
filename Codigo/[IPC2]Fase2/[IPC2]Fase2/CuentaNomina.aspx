<%@ Page Title="" Language="C#" MasterPageFile="~/AtencionAlCliente.Master" AutoEventWireup="true" CodeBehind="CuentaNomina.aspx.cs" Inherits="_IPC2_Fase2.CuentaNomina" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
     <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">Servicio al Cliente<small>_Nueva Cuenta</small></h1>
            </div>
        </div>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder2" runat="server">
         <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
                <li role="presentation"  ><a href="NuevaCuenta.aspx">Cuenta Individual</a></li>
                 <li role="presentation" class="active" ><a href="CuentaNomina.aspx">Cuenta Nomina</a></li>
               
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/oil_tank-512.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para crear una cuenta de nómina, debes de llenar todos los campos del siguiente formulario.
                </div>
            </div>
        </div>
     
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Crear una nueva Cuenta</div>
                <form autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <div class="group-material">
                                
                                <asp:TextBox ID="txtNoCuenta" runat="server" type="text" class="material-control tooltips-general" placeholder="1231456"  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el número de Cuenta"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Número de Cuenta</label>
                            </div>
                          
                             <div class="group-material">
                                
                                <asp:TextBox ID="txtEstado" runat="server" type="text" class="material-control tooltips-general" placeholder="Activa" maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el Estado"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Estado</label>
                            </div>
                            <div class="group-material">
                                
                                <asp:TextBox ID="txtSaldo" runat="server" type="text" class="material-control tooltips-general" placeholder="5000.00"  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe Saldo de la cuenta"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Saldo</label>
                            </div>
                           
                            <p class="text-center">
                                
                                <asp:Button ID="Button2" runat="server" Text="Guardar" type="submit" class="btn btn-primary" OnClick="Button2_Click"/>
                               
                       </div>
                   </div>
                </form>
            </div>
        </div>
</asp:Content>
