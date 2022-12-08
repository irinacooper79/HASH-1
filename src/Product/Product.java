package sets.product;
import class Product{
    private final String name;
    private final float price;
    private final int guantity;
    private boolean checked;

    public Product (String name, float price, int guantity){
        if(name ==null || name.isBlank() price<0 || guantity<0){
            throw new Illega (ArgumentException (Запишите карточку товара полностью);
        }
        this.name = name;
        this.price = price;
        this.guantity = guantity;
        this.checked = false;

        public String getName() {return name;}
        public float getPrice() {return price;}
        public int getQuantity() {return guantity;}
        public void setChecked () {this.checked = true;}
        public boolean isChecked () {return checked;}
        public boolean equals (Object 0){
            if (this == 0){
                return true;
            }
            if (0 == null || getClass() !=o.getClass()){
                return false;
            }
            Product product = (Product)0;
            return Objects.equals (name,product.name);
        }
        public int hashCode() {return Objects.hash (name);}

        public String toString (){
            String checkedString = this.isChecked() ? "Да": "Нет";

            return String.format ("%s, цена:%s, количество: %s, Куплен: %s,
            this.name, this.price, this.guantity, checedString);

        }
    }