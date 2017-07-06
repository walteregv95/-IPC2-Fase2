<%@ Page Title="" Language="C#" MasterPageFile="~/AtencionAlCliente.Master" AutoEventWireup="true" CodeBehind="AdministrarChequera.aspx.cs" Inherits="_IPC2_Fase2.AdministrarChequera" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
     <div class="container">
     <div class="page-header">
              <h1 class="all-tittles">Servicio al Cliente<small>_bloquear/habilitar</small></h1>
            </div>
        </div>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder2" runat="server">
    <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
                <li role="presentation"  class="active"><a href="AdministrarChequera.aspx">Chequera</a></li>
                
               
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/booking-256.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para bloquear o habilitar chequera, debes buscar primero el talonario.
                </div>
            </div>
        </div>
       
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Bloquear o Habilitar</div>
                <form autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <div class="group-material">
                                
                                <asp:TextBox ID="txtTalonario" runat="server" type="text" class="material-control tooltips-general" placeholder="1231456"  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el número de talonario"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Numero de Talonario</label>
                            </div>
                           
                            <div class="group-material">
                                 <p >
                             <asp:Button ID="Button1" runat="server" Text="Buscar" type="submit" class="btn btn-primary"/>
                           </p>
                             
                            </div>
                          
                              <div class="group-material">
                                
                                <asp:TextBox ID="txtNoCuenta" runat="server" type="text" class="material-control tooltips-general" maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el Nombre Completo"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Numero de Cuenta</label>
                            </div>
                             <div class="group-material">
                                
                                <asp:TextBox ID="txtEstado" runat="server" type="text" class="material-control tooltips-general" placeholder="Activa" maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el Estado"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Estado</label>
                            </div>
                            
                          
                            <p class="text-center">
                                
                                <asp:Button ID="Button2" runat="server" Text="Guardar" type="submit" class="btn btn-primary"/>
                               
                       </div>
                   </div>
                </form>
            </div>
        </div>
</asp:Content>
