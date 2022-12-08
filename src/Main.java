public class HomeworkSets {
    public static void main(String[] args) {

        product banana = new Product(name:"Банан", price:50.0f, quantity:2);
        product fish = new Product(name:"Рыба", price:500.0f, quantity:1);

        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.addProduct(fish);
        System.out.pribtln(productList);
        numbersSetRemoveEven();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.pribtln(multiplicationTable);
        Task task = new Task(3, 4);
        Task task2 = new Task(4, 3);
        Set<Task> set = new HashSet<>();
        Set.add(task);
        Set.add(task2);
        System.out.println(set);

        privet static void numbersSetRemoveEven () {
            Set<Integer> numbers = new HashSet<>(initialCapacity:20);

            Random random = new Random();
            while (numbers.size() < 20) {
                numbers.add(random.nextInt(origin:0, bound:1000));
            }
            System.out.println(numbers);

            Iterator<Integer> numberIterator = numder.iterator();
            while (numberIterator.hasNext()) {
                int number = numberIterator.next();
                if (number % 2 != 0) {
                    numberIterator.remove();
                }
                System.out.println(numbers);
            }
        }
    }
}