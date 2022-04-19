package es.aplideka.energia;

public class Instructor
{
    private int jj = 0;
    private int jsj = 0;
    private int aa = 0;

    public Instructor(int jj, int jsj, int aa)
    {
        this.jj = jj;
        this.jsj = jsj;
        this.aa = aa;
    }

    public int getJj()
    {
        return jj;
    }

    public void setJj(int jj)
    {
        this.jj = jj;
    }

    public int getJsj()
    {
        return jsj;
    }

    public void setJsj(int jsj)
    {
        this.jsj = jsj;
    }

    public int getAa()
    {
        return aa;
    }

    public void setAa(int aa)
    {
        this.aa = aa;
    }

    public Boolean EvaluarMetodo()
    {
        return true;
    }
}
