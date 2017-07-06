<%@ Page Title="" Language="C#" MasterPageFile="~/AtencionAlCliente.Master" AutoEventWireup="true" CodeBehind="Prestamos.aspx.cs" Inherits="_IPC2_Fase2.Prestamos" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
     <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">Servicio al Cliente<small>_Prestamos</small></h1>
            </div>
        </div>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder2" runat="server">
    <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
                <li role="presentation"  class="active"><a href="Prestamos.aspx">Nuevo Prestamo</a></li>
               
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/payment-256.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para Solicitar Prestamo, debes de llenar todos los campos del siguiente formulario para solicitarlo.
                </div>
            </div>
        </div>
      
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Solicitar Nuevo Prestamo</div>
                <form autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                           
                          <div class="group-material">
                                
                                <asp:TextBox ID="txtNoCuenta" runat="server" type="text" class="material-control tooltips-general" placeholder="1232131"  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el numero de cuenta"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Número de Cuenta</label>
                            </div>
                             <div class="group-material">
                                 <p >
                             <asp:Button ID="Button1" runat="server" Text="Buscar" type="submit" class="btn btn-primary" OnClick="Button1_Click"/>
                           </p>
                             
                            </div>
                           
                              <div class="group-material">
                                
                                <asp:TextBox ID="txtNombre" runat="server" type="text" class="material-control tooltips-general"  maxlength="100" data-toggle="tooltip" data-placement="top" title=""></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre Cliente</label>
                            </div>
                             <div class="group-material">
                                
                                <asp:TextBox ID="txtMonto" runat="server" type="text" class="material-control tooltips-general" placeholder="10000.00"  maxlength="100" data-toggle="tooltip" data-placement="top" title="00000.00"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Monto</label>
                            </div>
                            <div class="group-material">
                                
                                <asp:DropDownList ID="DropDownList1" runat="server" class="material-control tooltips-general">
                                    <asp:ListItem Value="401">Quincenal</asp:ListItem>
                                    <asp:ListItem Value="402">Mensual</asp:ListItem>
                                    <asp:ListItem Value="403">Trimestral</asp:ListItem>
                                </asp:DropDownList>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label></label>
                            </div>
                            <p class="text-center">
                                
                                <asp:Button ID="Button2" runat="server" Text="Guardar" type="submit" class="btn btn-primary" OnClick="Button2_Click"/>
                               
                       </div>
                   </div>
                </form>
            </div>
        </div>
</asp:Content>
