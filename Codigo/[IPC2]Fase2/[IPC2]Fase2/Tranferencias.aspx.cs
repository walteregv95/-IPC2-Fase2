using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _IPC2_Fase2
{
    public partial class Tranferencias : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            ServiceReference1.BancoClient sr = new ServiceReference1.BancoClient();
            txtcliente1.Text = sr.BuscarCliente(int.Parse(txtNoCuenta1.Text));
        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            ServiceReference1.BancoClient sr = new ServiceReference1.BancoClient();
            txtCliente2.Text = sr.BuscarCliente(int.Parse(txtNoCuenta2.Text));
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            ServiceReference1.BancoClient sr = new ServiceReference1.BancoClient();
            sr.Transferencias(int.Parse(txtNoCuenta1.Text), txtMonto.Text, int.Parse(txtNoCuenta2.Text));
        }
    }
}