<%@ Page Title="" Language="C#" MasterPageFile="~/Nominas.Master" AutoEventWireup="true" CodeBehind="CrearNomina.aspx.cs" Inherits="_IPC2_Fase2.CrearNomina" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
     <div class="container">
     <div class="page-header">
              <h1 class="all-tittles">Nominas<small>_Aperturar Nomina</small></h1>
            </div>
        </div>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder2" runat="server">
     <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
                <li role="presentation"  class="active"><a href="CrearNomina.aspx">Nueva Nomina</a></li>
               
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/user05.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para registrar nueva Nomina, debes de llenar todos los campos del siguiente formulario para registrar una nomina
                </div>
            </div>
        </div>
       
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Registrar una nueva Nomina</div>
                <form autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <div class="group-material">
                                
                                <asp:TextBox ID="txtIdNomina" runat="server" type="text" class="material-control tooltips-general" placeholder="101"  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el codigo de la nomina"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Id Nomina</label>
                            </div>
                          <div class="group-material">
                                
                                <asp:TextBox ID="txtEmpresa" runat="server" type="text" class="material-control tooltips-general" placeholder="Diversidad de Negocios S.A. "  maxlength="100" data-toggle="tooltip" data-placement="top" title="Escribe el nombre de la empresa"></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Empresa</label>
                            </div>
                           
                              <div class="group-material">
                                
                                <asp:TextBox ID="txtNoCuenta" runat="server" type="text" class="material-control tooltips-general" placeholder="10141"  maxlength="100" data-toggle="tooltip" data-placement="top" title=""></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Numero De Cuenta</label>
                            </div>
                            <div class="group-material">
                                 <p class="center-block">
                             <asp:Button ID="Button1" runat="server" Text="Buscar" type="submit" class="btn btn-primary" OnClick="Button1_Click"/>
                           </p>
                             
                            </div>
                             <div class="group-material">
                                
                                <asp:TextBox ID="txtCuenta" runat="server" type="text" class="material-control tooltips-general" placeholder="10141"  maxlength="100" data-toggle="tooltip" data-placement="top" title=""></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Numero De Cuenta</label>
                            </div>
                             <div class="group-material">
                                
                                <asp:TextBox ID="txtIdCliente" runat="server" type="text" class="material-control tooltips-general" placeholder="2017-06-30"  maxlength="100" data-toggle="tooltip" data-placement="top" title=""></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Codigo Cliente</label>
                            </div>
                             <div class="group-material">
                                 <p class="center-block">
                             <asp:Button ID="Button3" runat="server" Text="Buscar" type="submit" class="btn btn-primary" OnClick="Button3_Click"/>
                           </p>
                             
                            </div>
                            <div class="group-material">
                                
                                <asp:TextBox ID="txtCliente" runat="server" type="text" class="material-control tooltips-general" placeholder="Walter García " maxlength="100" data-toggle="tooltip" data-placement="top" ></asp:TextBox>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre Cliente</label>
                            </div>
                           
                            <p class="text-center">
                                
                                <asp:Button ID="Button2" runat="server" Text="Guardar" type="submit" class="btn btn-primary" OnClick="Button2_Click"/>
                               
                       </div>
                   </div>
                </form>
            </div>
        </div>
</asp:Content>
