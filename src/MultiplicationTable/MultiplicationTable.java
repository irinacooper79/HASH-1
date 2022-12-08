package sets.multiply;

public class MultiplicationTable{
    private final Set<Task> tasks = new HashSet<>();
    public MultiplicationTable(){

        Random random = new Random();
        while (tasks.size()<15){
            tasks.add (new Task (random.nextInt (origin: 2, bound: 10),
            random.nextInt (origin: 2, bound: 10)));

            public String toString(){
                return "MultiplicationTable{" + "tasks=" + tasks + '}';
