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
public class PasswordBuilder {

    char[] password;
    int length;
    int index = 0;

    public int getLength() {
        return length;
    }

    public PasswordBuilder setLength(int length) {
        this.length = length;
        this.password = new char[length];
        return this;
    }

    public PasswordBuilder add(char c){
        if(index<length){
            password[index] = c;
            index++;
        }
        return this;
    }

    public Password build(){
        return new Password(password);
    }
}
