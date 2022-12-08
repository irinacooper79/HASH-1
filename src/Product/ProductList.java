package sets.product;

public class ProductList{

    private final Set <Product> products = new HashSet<>();

    public void addProduct(Product product){

        if (product == null){

            return;
        }
        if(this.products.contains( product)){

            throw new ProductAlreadyExistsException();
        }else{
            this.products. add (product);
        }
    }
    public void checkProduct(String name){
        for (Product product: this.products){
            if (product.getName().equals(name)){
                product.setCheked();
                break;
            }
        }
    }
    public void removeProduct(Stribg name){

        Iterator <Product> productsIterator = this.products.iterator();
        while (productsIterator hasNext()){
            if (productsIterator.next().getName().
                    equals(name)){
                productsIterator.remove();
                break;
            }
        }
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        StringBuilder. append("Список продуктов:").append('/n');
        for (Product product: this.product){
            StringBuilder.append(product).append ('/n');
        }
        return StringBuilder.toString();
    }
}