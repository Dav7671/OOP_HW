package example1;

public class Main {

    public static void main(String[] args) {
        Author varazdat = new Author("Varazdat","varazdat@mail.com",'m');
        Author anushavan = new Author("Anushavan","anushavan@mail.com",'m');
        Author qristine = new Author("Qristine","qiso@mail.com",'f');
        Book book = new Book("Varsahardary",qristine,1500,10);
        Book book1 = new Book("Vrej",varazdat,3750);
        Book [] books = new Book[]{book,book1};
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
