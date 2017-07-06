using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _IPC2_Fase2
{
    public partial class NuevoCliente : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
          
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            ServiceReference1.BancoClient sr = new ServiceReference1.BancoClient();
            sr.CrearCliente(int.Parse(txtIdCliente.Text), txtCUI.Text, txtNombre.Text, txtFecha_Nac.Text, txtUsuario.Text, txtContraseña.Text, int.Parse(DropDownList1.SelectedValue));
            
        }
    }
}