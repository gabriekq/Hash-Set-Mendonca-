/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto3;

import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class Client {
    
private String name;
private int age;
private String street;

    public Client(String name, int age, String street) {
        super();
        this.name = name;
        this.age = age;
        this.street = street;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


@Override
    public int hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime*result + ( (  street == null ) ?0: street.hashCode() );
    result = prime* result + ( (name == null)  ?0: name.hashCode());
    result = prime*result + Integer.hashCode(age);
    
    
    return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "name=" + name + ", age=" + age + ", street=" + street + '}';
    }
     

   




}
