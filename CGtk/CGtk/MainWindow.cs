using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        buttonaceptar.Clicked += delegate {
        

        };
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnButtonaceptarClicked(object sender, EventArgs e){
        string nombre = entry1.Text;
        labelsaludo.Text = "Hola " + nombre;
        Console.WriteLine("Has Hecho click en Aceptar");
    }
}
