public class Review {

    String phrase = "The cat is under the table";

    public static void main(String[] args) {

        String anotherPhrase = "Hello World!";

        Review note = new Review();
        System.out.println("Phase: " + note.phrase);
        System.out.println("The length is: " + note.phrase.length());
        System.out.println(note.phrase.concat(" now!"));
        System.out.println("The position of cat is " + note.phrase.indexOf("cat"));
        System.out.println("The first charater is " + note.phrase.charAt(0));
        System.out.println("Is this frase equals to \"" + anotherPhrase + "\"?");
        System.out.println(note.phrase.equals(anotherPhrase));
        System.out.println(note.phrase.substring(11,16));
        System.out.println(note.phrase.toUpperCase());
        System.out.println(note.phrase.toLowerCase());
    }

}