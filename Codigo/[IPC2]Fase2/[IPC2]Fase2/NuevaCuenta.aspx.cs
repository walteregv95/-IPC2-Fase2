using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _IPC2_Fase2
{
    public partial class NuevaCuenta : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
           
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            ServiceReference1.BancoClient sr = new ServiceReference1.BancoClient();
            txtNombre.Text = sr.BuscarCliente(int.Parse(txtBuscar.Text));
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            ServiceReference1.BancoClient sr = new ServiceReference1.BancoClient();
            sr.CrearCuenta(int.Parse(txtNoCuenta.Text), txtEstado.Text, txtSaldo.Text, int.Parse(txtInteres.Text), int.Parse(txtPlazo.Text), int.Parse(txtBuscar.Text), int.Parse(DropDownList1.SelectedValue));
}
    }
}