package pkg1;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

class Student {
    IntegerProperty idProperty;
    StringProperty FnameProperty;
    StringProperty LnameProperty;
    StringProperty DateInsProperty;
    StringProperty PeriodProperty;
    StringProperty DeProperty;
    StringProperty jusquaProperty;
    StringProperty nbrDe8Property;
    StringProperty TotalProperty;

    public Student() {
    
    }
    public void setidProperty(int value){
        idProperty.set(value);
    }
    public IntegerProperty getidProperty(){
        return idProperty;
    }
    
    

}
