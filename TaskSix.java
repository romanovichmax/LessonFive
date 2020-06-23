public class TaskSix {
    String name = "Michael";
    int age = 60;

    public TaskSix(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public static TaskSix createNewObject(){
        TaskSix newObject = new TaskSix("Bob",30);
        return newObject;
    }
}