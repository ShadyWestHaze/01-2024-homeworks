package src.main.java.io.codelex.polymorphism.practice.exercise3;

class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int id;

    public Person() {
    }
    /*Es nesaprotu kāda jēga taisīt šeit person ar tukšu constructor.(itkā ir prasīts)
    Domāju varbūt tas ir prasīts, jo tad student var būt constructer tikai ar gpa , bet tas arī nav loģiski,
    jo tad nevar student instancēt ar visām person vērtībām (name/last name etc).
    Varbūt nesaprotu ko uzdevums prasa no manis, bet man likās, ka ir beigās jābūt konsolē viss info par student un employee.
    */


    public Person(String firstName, String lastName, String address, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }

    public void display() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Addres: " + address);
        System.out.println("ID: " + id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
