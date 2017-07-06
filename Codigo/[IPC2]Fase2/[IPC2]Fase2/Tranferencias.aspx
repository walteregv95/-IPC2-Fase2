<%@ Page Title="" Language="C#" MasterPageFile="~/Cajero.Master" AutoEventWireup="true" CodeBehind="Tranferencias.aspx.cs" Inherits="_IPC2_Fase2.Tranferencias" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
     <div class="container">
     <div class="page-header">
              <h1 class="all-tittles">Cajero<small>_Solicitar Transferencia</small></h1>
            </div>
        </div>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder2" runat="server">
     <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
                <li role="presentation"  class="active"><a href="Transferencias.aspx">Solicitud de Transferencia</a></li>
                
               
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/7-512.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para solicitar transferencias, debes buscar primero el numero de cuenta.
                </div>
            </div>
        </div>
       
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Solicitud de Transferencia</div>
                <form autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <div class="group-material">
                                
                                <asp:TextBox ID="txtNoCuenta1" runat="server" type="text" class="material-control tooltips-general" placeholder="1231456"  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el número de cuenta"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Numero de Cuenta</label>
                            </div>
                           
                            <div class="group-material">
                                 <p class="center-block">
                             <asp:Button ID="Button1" runat="server" Text="Buscar" type="submit" class="btn btn-primary" OnClick="Button1_Click"/>
                           </p>
                             
                            </div>
                          
                              <div class="group-material">
                                
                                <asp:TextBox ID="txtcliente1" runat="server" type="text" class="material-control tooltips-general" maxlength="100" data-toggle="tooltip" data-placement="top" title=""></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Cliente</label>
                            </div>
                             <div class="group-material">
                                
                                <asp:TextBox ID="txtNoCuenta2" runat="server" type="text" class="material-control tooltips-general" placeholder="1231456"  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el número de cuenta"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Numero de Cuenta</label>
                            </div>
                           
                            <div class="group-material">
                                 <p class="center-block">
                             <asp:Button ID="Button3" runat="server" Text="Buscar" type="submit" class="btn btn-primary" OnClick="Button3_Click"/>
                           </p>
                             
                            </div>
                          
                              <div class="group-material">
                                
                                <asp:TextBox ID="txtCliente2" runat="server" type="text" class="material-control tooltips-general" maxlength="100" data-toggle="tooltip" data-placement="top" title=""></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Cliente</label>
                            </div>
                              <div class="group-material">
                                
                                <asp:TextBox ID="txtMonto" runat="server" type="text" class="material-control tooltips-general" maxlength="100" data-toggle="tooltip" data-placement="top" title=""></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Monto</label>
                            </div>
                            
                          
                            <p class="text-center">
                                
                                <asp:Button ID="Button2" runat="server" Text="Guardar" type="submit" class="btn btn-primary" OnClick="Button2_Click"/>
                               
                       </div>
                   </div>
                </form>
            </div>
        </div>
</asp:Content>
