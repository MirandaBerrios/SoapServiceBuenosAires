/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author jocpa
 */
public class Product {
    
    private String id; 
    private String name; 
    private String value; 
    private String mark; 
    private String isAvailable; 
    private String image; 
    private String isOfert; 
    private String model; 
    private String category; 
    private String description; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIsOfert() {
        return isOfert;
    }

    public void setIsOfert(String isOfert) {
        this.isOfert = isOfert;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", value=" + value + ", mark=" + mark + ", isAvailable=" + isAvailable + ", image=" + image + ", isOfert=" + isOfert + ", model=" + model + ", category=" + category + ", description=" + description + '}';
    }

    public Product() {
    }

    public Product(String id, String name, String value, String mark, String isAvailable, String image, String isOfert, String model, String category, String description) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.mark = mark;
        this.isAvailable = isAvailable;
        this.image = image;
        this.isOfert = isOfert;
        this.model = model;
        this.category = category;
        this.description = description;
    }
    
    
        
}
