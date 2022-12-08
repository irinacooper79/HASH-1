package sets.product;

public class Recipe{

    private final String name;
    private final Set <Product> products;

    public Recipe (String name, Set<Product> products){
        if (name == null || name.isBlank() || products == null || products.size()==0){
            throw new IllegalArgumentException ("Не заполнены все поля");
        }
        this.name = name;
        this.products = products;

        public String getName() {return name;}
        public float getRecipePrice(){
            float sum = 0;
            for (Product product: products)}
        sum += product. getPrice();
    }
    return sum;
}
    public Set<Product> getProducts() {return products;}
    public boolean equals (Object 0){
        if (this == 0){
            return true;
        }