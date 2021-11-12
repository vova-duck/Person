package HomeWork12;

public class Person {
    public String name;
   public Person father;
   public Person mather;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, Person father, Person mather){
        this.name = name;
        this.father = father;
        this.mather = mather;
        System.out.println(this);
    }
    public String toString() {
        if(this.father==null&&this.mather==null){
            return this.name;
        }

            return "Persons name is " + this.name + " Father`s name is " + this.father + " Mather`s name is " + this.mather;
        }

    }

