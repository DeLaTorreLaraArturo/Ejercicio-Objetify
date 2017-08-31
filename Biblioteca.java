import java.util.ArrayList;

public class Biblioteca
{
    private ArrayList<String> canciones;
    private Reproductor reproductor;
    
    public Biblioteca()
    {
        canciones = new ArrayList<String>();
        reproductor = new Reproductor();
    }
    
    public void agregarCancion(String nombreCancion)
    {
        canciones.add(nombreCancion);
    }
    
    public void reproducirCancion(int numeroCancion)
    {
        reproductor.reproducir(canciones.get(numeroCancion));
    }
}