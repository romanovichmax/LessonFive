public class TaskEleven {
    static int a = 15;
    int b = 20;

    static void change(int value) {
        TaskEleven.a = value;
//        TaskEleven.b = value;
    }

    void anotherChange(int value) {
        this.b = value;
//        this.a = value;
    }

}
class Method{
    public static void main(String[] args) {
        TaskEleven.change(16);
        TaskEleven taskEleven = new TaskEleven();
        taskEleven.anotherChange(25);

        System.out.println(TaskEleven.a);
        System.out.println(taskEleven.b);
    }
}

//In static function you can change only static values