package ch06_this.overloaded;

import java.time.LocalDate;
/*
10. Daha önce örnek olarak verilen ch05.overloaded.Employee sınıfının kurucularına da this() çağrıları koyun.
a. Test sınıfında her kurucuyu çağırarak Employee nesneleri oluşturun.
 */
/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 * </p>
 */
public class Employee {

    int id;
    String firstName;
    String lastName;
    LocalDate birthDate;
    float salary;
    String department = "No department yet!";
    String phone = "";
    Address address;

    public Employee(int id, String firstName, String lastName, LocalDate birthDate, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public Employee(int id, String firstName, String lastName, LocalDate birthDate, float salary, String department, String phone, Address address) {
        this(id, firstName, lastName, birthDate, salary);
        this.department = department;
        this.phone = phone;
        this.address = address;
    }
}

class Address{}
