using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _IPC2_Fase2
{
    public partial class CrearNomina : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            ServiceReference1.BancoClient sr = new ServiceReference1.BancoClient();
            txtCuenta.Text = sr.BuscarCuentaNomina(int.Parse(txtNoCuenta.Text));
        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            ServiceReference1.BancoClient sr = new ServiceReference1.BancoClient();
            txtCliente.Text = sr.BuscarCliente(int.Parse(txtIdCliente.Text));
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            ServiceReference1.BancoClient sr = new ServiceReference1.BancoClient();
            sr.CrearNomina(int.Parse(txtIdNomina.Text), txtEmpresa.Text, int.Parse(txtIdCliente.Text), int.Parse(txtNoCuenta.Text));
        }
    }
}