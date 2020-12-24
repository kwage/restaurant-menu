public class MenuItem {
    // Class Variables
    private String name;
    private String desciption;
    private Double price;
    private String category;
    private Boolean isNew;

    // Constructors
    public MenuItem(String name, String desciption, Double price) {
        this.name = name;
        this.desciption = desciption;
        this.price = price;

        this.category = "Not Categorized";
        this.isNew = false;
    }

    public MenuItem(String name, String desciption, Double price, String category, Boolean isNew) {
        this.name = name;
        this.desciption = desciption;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    // Methods
    // Getters and Setters
    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getDesciption() { return this.desciption; }

    public void setDesciption(String desciption) { this.desciption = desciption; }

    public Double getPrice() { return this.price; }

    public void setPrice(Double price) { this.price = price; }

    public String getCategory() { return this.category; }

    public void setCategory(String category) { this.category = category; }

    public Boolean getIsNew() { return this.isNew; }

    public void setIsNew(Boolean isNew) { this.isNew = isNew; }
}
