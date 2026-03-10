package ch12_encapsulation.schedule;

import java.util.Date;

/*
private java.util.Date appointmentDate alanına ve ilgili kurucuya sahip Schedule isimli bir class oluşturun.
Bu sınıfa koyacağınız bir getAppointmentDate() metoduyla bu alanı döndürmesini sağlayın.
Sonra ScheduleTest sınıfının main metodunda şu satırları yazın:
Date myDate = schedule.getAppointmentDate();
myDate.setTime(0); // Do you think this is ok?

a. Sizce bu son satır sağlıklı mı? Bunun önüne geçmek için getAppointmentDate() metodunda ne yapmak gerekir?
-> Bu durum representation exposure olarak bilinir. Bir nesnenin içindeki mutable (değiştirilebilir) veri dışarıya verilmiştir.
-> dışarıdan veri değiştirilebilir-nesnenin kontrolü kaybolur-beklenmeyen bug'lar oluşur.
-> sağlıklı çözüm : "Defensive Copy" . Getter metodu kopya döndürmelidir.
 */

public class Schedule {

    private Date appointmentDate;

    public Schedule() {
        appointmentDate = new Date();
    }

    public  Date getAppointmentDate(){
        // return appointmentDate;
        return new Date(appointmentDate.getTime());

    }

}
