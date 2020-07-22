package Java_14_Records_update;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

//Java 14 Update "record"
//record are immutable no setter method are define
// record Update_Person = final class Update_Person
//you can reverse engineering the record means create the member first then create record
//can implement Interface
//can add annotation

//can't declare abstract because it is a Final class
//it can't extends another class since it already extends java.lang.Record

public record Update_Person(@NotNull String name, int age) implements Serializable {
    //ctrl+alt+shift+s
    //Project -> SDK ->openjdk-14
    //Project Language Level -> 14(Preview) Records,Pattern,text block
    //Modules ->Language Level -> 14(Preview) Records,Pattern,text block

    //we can add static fields but can't instance
    //we can add instance and static method to a record
    static int instanceCtr;
    static int getInstanceCtr(){
        return instanceCtr;
    }

    //can modify the constructor

    //compact constructor
        //constructor does't have any parameter not even parenthesis
        /*public Update_Person {
             if(name == null && age < 0 ){
                throw new IllegalArgumentException("Invalid value");
              }
         }*/

    //Canonical Constructor
        //Constructor whose signature match with the record's state description
         /*public Update_Person(String name, int age) {
             if(name != null && age >0 ) {
                 this.name = name;
                 this.age = age;
             }
             else
                 throw new IllegalArgumentException("Invalid value");
        }*/


    //Custom Constructor
         /*public Update_Person(String name) {
             this.name = name;
         }*/
}
