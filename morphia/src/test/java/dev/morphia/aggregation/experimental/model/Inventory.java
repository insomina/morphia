package dev.morphia.aggregation.experimental.model;

import dev.morphia.aggregation.experimental.AggregationTest;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity(value = "inventory", useDiscriminator = false)
public class Inventory {
    @Id
    private int id;
    private String sku;
    private String description;
    private int instock;

    public Inventory() {
    }

    public Inventory(final int id) {
        this.id = id;
    }

    public Inventory(final int id, final String sku, final String description) {
        this.id = id;
        this.sku = sku;
        this.description = description;
    }

    public Inventory(final int id, final String sku, final String description, final int instock) {
        this.id = id;
        this.sku = sku;
        this.description = description;
        this.instock = instock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getInstock() {
        return instock;
    }

    public void setInstock(final int instock) {
        this.instock = instock;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sku != null ? sku.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + instock;
        return result;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Inventory)) {
            return false;
        }

        final Inventory inventory = (Inventory) o;

        if (id != inventory.id) {
            return false;
        }
        if (instock != inventory.instock) {
            return false;
        }
        if (sku != null ? !sku.equals(inventory.sku) : inventory.sku != null) {
            return false;
        }
        return description != null ? description.equals(inventory.description) : inventory.description == null;

    }
}
