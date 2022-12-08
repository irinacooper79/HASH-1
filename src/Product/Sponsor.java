package Product;

public class Sponsor {

    private final boolean company;
    private final String name;
    private final int supportAmount;

    public String Sponsor(String name, int supportAmount, boolean company) {

        this.name = name;
        this.supportAmount = supportAmount;
        this.company = company;

        public void provide sponsor ship () {
            System.out.printf("Спонсор %s спонсирует заезд на сумму %d", name, supportAmount);

            public String getName {
                return name;
            }

            public int getSupportAmount () {
                return supportAmount;
            }

            public boolean isCompany () {
                return company;
            }
        }
        public boolean equals (Object 0){
            if (this == 0) {
                return true;
            }
            if (0 == null || getClass() != 0. getClass()){
                return false;
            }
            Sponsor sponsor = (Sponsor) 0;
            return Object.equals(name, sponsor.name);
        }
        public int hashCode () {
            return Object.hash(name);
        }
    }
}