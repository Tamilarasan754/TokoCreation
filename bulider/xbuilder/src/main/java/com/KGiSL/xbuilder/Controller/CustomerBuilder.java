package com.KGiSL.xbuilder.Controller;

public class CustomerBuilder {
    public Customer c=new Customer();

    public CustomerBuilder Id(int id) {
        c.setId(id);
        return this;
    }
      public CustomerBuilder firstName(String fName) {
        c.setFirstname(fName);
        return this;
    }
      public CustomerBuilder LastName(String lName) {
        c.setLastname(lName);
        return this;
    }
      public CustomerBuilder email(String Email) {
        c.setEmail(Email);
        return this;
    }
    public Customer build() {
        return c;
    }
}
