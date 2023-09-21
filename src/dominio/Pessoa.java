package dominio;

public class Pessoa {
    private String firstName;
    private String lastName;
    private String email;

    public Pessoa(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public static class PersonBuilder{
        private String firstName;
        private String lastName;
        private String email;

        public PersonBuilder firstname(String firstName){
            this.firstName = firstName;
            return this;
        }
        public PersonBuilder lastName(String lastName){
            this.firstName = lastName;
            return this;
        }
        public PersonBuilder email(String email){
            this.firstName = email;
            return this;
        }
    }

    public Pessoa build(){
        return new Pessoa(firstName,lastName,email);
    }
}