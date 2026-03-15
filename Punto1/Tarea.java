import java.util.Date;

public class Tarea implements Comparable<Tarea>{

    private String descripcion;
    private int prioridad;
    private Date fechaVencimiento;

    public Tarea(String descripcion, int prioridad, Date fechaVencimiento){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public Date getFechaVencimiento(){
        return fechaVencimiento;
    }

    @Override
    public int compareTo(Tarea otra){
        return this.fechaVencimiento.compareTo(otra.fechaVencimiento);
    }

}