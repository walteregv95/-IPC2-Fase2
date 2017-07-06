using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _IPC2_Fase2
{
    public partial class EliminarEmpleado : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
             ServiceReference1.BancoClient sr = new ServiceReference1.BancoClient();
             txtNombre.Text = sr.BuscarEmpleado(int.Parse(txtIdEmpleado.Text));
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            ServiceReference1.BancoClient sr = new ServiceReference1.BancoClient();
            sr.EliminarEmpleado(int.Parse(txtIdEmpleado.Text));
        }
    }
}