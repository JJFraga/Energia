package desalacion;

public class Desalador
{
    private String _id = "";
    private int _version = 0;

    public Desalador(String id, int version)
    {
        this._id = id;
        this._version=version;
    }

    public String getid()
    {
        return this._id;
    }

    public void set_id(String id)
    {
        this._id = id;
    }

    public int get_version()
    {
        return this._version;
    }

    public void set_version(int version)
    {
        this._version = version;
    }
}
