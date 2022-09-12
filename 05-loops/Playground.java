import java.util.ArrayList;
import java.util.Arrays;

class Playground {

    ArrayList<String> tareas;

    public Playground(ArrayList<String> tasks) {
        this.tareas = tasks;
    }

    public void showTasks() {
        System.out.println("Tareas: ");
        System.out.println(this.tareas);
    }

    public void addTask(String task) {
        if(!this.checkTask(task)) {
            tareas.add(task);
            System.out.println("Se agregó " + task);
        }
    }

    public void removeTask(String task) {
        if(this.checkTask(task)) {
            tareas.remove(task);
            System.out.println("Se quitó  " + task);
        }
    }

    public boolean checkTask(String newTask) {
        for (String task : tareas) {
            if(task.equals(newTask)) {
                System.out.println("La tarea \"" + newTask + "\" se encuentra en el listado.");
                return true;
            }
        }
        System.out.println("La tarea \"" + newTask + "\" no se encuentra en el listado.");
        return false;
    }

    public static void main(String[] args) {

        //   for (int i = 0; i < 28; i++) {
        // 		System.out.println("Congrats on finishing Java loops!");
        //   }

        ArrayList<String> listado = new ArrayList<String>();
        listado.add("Sacar la basura");
        listado.add("Pasear al perro");
        listado.add("Hacer las compras");

        Playground play1 = new Playground(listado);
        play1.showTasks();
        play1.addTask("Limpiar el baño");
        play1.showTasks();
        play1.removeTask("Pasear al perro");
        play1.showTasks();
        play1.addTask("Cocinar la pizza");
        play1.removeTask("Limpiar la cocina");
        play1.addTask("Limpiar el baño");
        play1.showTasks();
    }

}