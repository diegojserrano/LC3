package entidades;

public class Municipalidad {

    private Plan[] planes;

    public Municipalidad(int cantidadPlanes) {
        planes = new Plan[cantidadPlanes];
    }

    public void agregarPlan(Plan p) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] == null) {
                planes[i] = p;
                break;
            }
        }
    }

    public int cantidadPlanesPagados() {
        int c = 0;

        for (Plan p : planes) {
            if (p != null && p.estaPagadoTotalmente()) {
                c++;
            }
        }

        return c;
    }

    public float sumatoriaDeuda() {
        float ac = 0;

        for (Plan p : planes) {
            if (p != null) {
                ac += p.getDeuda();
            }
        }

        return ac;
    }
    
    public String listadoPagosContribuyente(String nombre) {
        String salida = "No se encuentra";
        for (Plan p: planes) {
            if (p != null && p.getNombre().equalsIgnoreCase(nombre))
                salida = p.listadoPagos();
        }
        return salida;
    }
    
    public float promedioIntereses() {
        float ac = 0;
        int c = 0;
        
        for (Plan p: planes) {
            if (p != null) {
                ac += p.sumaInteresesCobrados();
                c++;
            }
        }
        
        float promedio = 0;
        if (c != 0)
            promedio = ac / c;
        
        return promedio;
    }
    
}
