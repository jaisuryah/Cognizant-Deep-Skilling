import java.util.*;

public class TaskManager {

    static class Task {
        int taskId;
        String taskName;
        String status;
        Task next;

        Task(int taskId, String taskName, String status) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.status = status;
            this.next = null;
        }

        public String toString() {
            return taskId + " | " + taskName + " | " + status;
        }
    }

    static Task head = null;

    public static void addTask(Scanner sc) {
        System.out.print("Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Task Name: ");
        String name = sc.nextLine();
        System.out.print("Status: ");
        String status = sc.nextLine();

        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newTask;
        }
        System.out.println("Task added.");
    }

    public static void searchTask(Scanner sc) {
        System.out.print("Enter task ID to search: ");
        int id = sc.nextInt();
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id) {
                System.out.println(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found.");
    }

    public static void displayTasks() {
        if (head == null) {
            System.out.println("No tasks.");
            return;
        }
        Task temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public static void deleteTask(Scanner sc) {
        System.out.print("Enter task ID to delete: ");
        int id = sc.nextInt();
        if (head == null) return;
        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        Task prev = null, curr = head;
        while (curr != null && curr.taskId != id) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            prev.next = curr.next;
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add\n2. Search\n3. Display\n4. Delete\n5. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: addTask(sc); break;
                case 2: searchTask(sc); break;
                case 3: displayTasks(); break;
                case 4: deleteTask(sc); break;
                case 5: return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
