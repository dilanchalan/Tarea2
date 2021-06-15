package test;

import dominio.Curso;

public class testcurso {
    public static void main(String[] args) {
        Curso cursoA=new Curso();
       
        double [] notas=new double[12];
        llenaNotas(notas);
       
        cursoA.setNotas(notas);
        cursoA.mostrarNotas();
        cursoA.setPromedio();
        cursoA.setnroEstudaintesEncimaPromedio();
        System.out.println("Puede evidenciar el promedio del curso: "+cursoA.getPromedio());
        System.out.println("Estudiantes por encima del promedio:"+cursoA.getnroEstudiantesEncimaPromedio());
    }
    public static void llenaNotas(double [] notas ){
        for(int i=0;i<12;i++){
            notas[i] = Math.random()*6;
        }
    }
}
