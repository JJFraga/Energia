package es.aplideka.energia;

public class Generador
{
    private double _potenciaNominal = 0;
    private double _eficiencia = 0;

    public Generador()
    {

    }

    public Generador(double _potenciaNominal, double _eficiencia)
    {
        this._potenciaNominal = _potenciaNominal;
        this._eficiencia = _eficiencia;
    }

    public double get_potenciaNominal()
    {
        return _potenciaNominal;
    }

    public void set_potenciaNominal(double _potenciaNominal)
    {
        this._potenciaNominal = _potenciaNominal;
    }

    public double get_eficiencia()
    {
        return _eficiencia;
    }

    public void set_eficiencia(double _eficiencia)
    {
        this._eficiencia = _eficiencia;
    }

}
