package ch06_this.passwordApp;
/*
11. Şifreyi temsil eden bir Password sınıfı modelleyin. Şifrenin uzunluğunun en başta belirlendiğini ve
sonrasında karakter ekleyerek oluşturulduğunu düşünün. Bu amaçla şifreye, uzunluğu sayısınca geçilen
karakterleri ekleyerek oluşturan PasswordBuilder gibi bir sınıfa ihtiyaç olacaktır.
PasswordBuilder’i kullanarak aşağıdaki gibi Password nesnesini oluşturacak şekilde bu iki sınıfı geliştirin:
Password password = new PasswordBuilder().setLength(length).
add(ch1).add(ch2).add(ch3)...build();
a. Test sınıfının main metodunda gerekli testleri yazın.
 */
public class Password {

    char[] password;

    public Password(char[] password) {
        this.password = password;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}
