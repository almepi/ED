using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
		treeView.AppendColumn("Nombre", new CellRendererText(), "text", 0);
		treeView.AppendColumn("Teléfono", new CellRendererText(), "text", 1);
        ListStore listStore = new ListStore(typeof(String), typeof(String));
		treeView.Model = listStore;
		listStore.AppendValues("Sergio", "95356732");
		listStore.AppendValues("Aaron", "615767942");
		listStore.AppendValues("Luis", "963343437");
        listStore.AppendValues("Alejandro", "633818001");

		editAction.Sensitive = false;

		newAction.Activated += (sender, e) => {
			vBoxContacto.Visible = true;
			treeView.Sensitive = false;
		};
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
