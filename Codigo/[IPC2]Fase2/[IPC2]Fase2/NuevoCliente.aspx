<%@ Page Title="" Language="C#" MasterPageFile="~/AtencionAlCliente.Master" AutoEventWireup="true" CodeBehind="NuevoCliente.aspx.cs" Inherits="_IPC2_Fase2.NuevoCliente" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
     <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">Servicio al Cliente<small>_Nuevo Cliente</small></h1>
            </div>
        </div>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder2" runat="server">
    <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
                <li role="presentation"  class="active"><a href="NuevoCliente.aspx">Nuevo Cliente</a></li>
               
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/user03.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para registrar nuevos clientes del sistema, debes de llenar todos los campos del siguiente formulario para registrar un cliente
                </div>
            </div>
        </div>
       
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Registrar un nuevo Cliente</div>
                <form autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <div class="group-material">
                                
                                <asp:TextBox ID="txtIdCliente" runat="server" type="text" class="material-control tooltips-general" placeholder="101" required="" maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el codigo del cliente"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Id Cliente</label>
                            </div>
                          <div class="group-material">
                                
                                <asp:TextBox ID="txtCUI" runat="server" type="text" class="material-control tooltips-general" placeholder="2969521410101" required="" maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el CUI"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>CUI</label>
                            </div>
                            <div class="group-material">
                                
                                <asp:DropDownList ID="DropDownList1" runat="server" class="material-control tooltips-general">
                                    <asp:ListItem Value="101">Individual</asp:ListItem>
                                    <asp:ListItem Value="102">Empresarial</asp:ListItem>
                                </asp:DropDownList>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label></label>
                            </div>
                              <div class="group-material">
                                
                                <asp:TextBox ID="txtNombre" runat="server" type="text" class="material-control tooltips-general" placeholder="Walter García" required="" maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el Nombre Completo"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre Completo</label>
                            </div>
                             <div class="group-material">
                                
                                <asp:TextBox ID="txtFecha_Nac" runat="server" type="text" class="material-control tooltips-general" placeholder="2017-06-30" required="" maxlength="100" data-toggle="tooltip" data-placement="top" title="YYYY-MM-DD"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Fecha de Nacimiento</label>
                            </div>
                            <div class="group-material">
                                
                                <asp:TextBox ID="txtUsuario" runat="server" type="text" class="material-control tooltips-general" placeholder="walteregv95" required="" maxlength="100" data-toggle="tooltip" data-placement="top" title="User Name"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Usuario</label>
                            </div>
                             <div class="group-material">
                                
                                <asp:TextBox ID="txtContraseña" runat="server" type="password" class="material-control tooltips-general" placeholder="contraseña" required="" maxlength="100" data-toggle="tooltip" data-placement="top" title=""></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Contraseña</label>
                            </div>
                            <p class="text-center">
                                
                                <asp:Button ID="Button2" runat="server" Text="Guardar" type="submit" class="btn btn-primary" OnClick="Button2_Click"/>
                               
                       </div>
                   </div>
                </form>
            </div>
        </div>
</asp:Content>
