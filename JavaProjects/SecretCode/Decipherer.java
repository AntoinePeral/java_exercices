class Decipherer {

    public static String deciphererMessage(String message){
        int keyNumber = message.length()/2;
        String substring = message.substring(5, 5+keyNumber);
        substring = substring.replace("@#?", " ");
        String reversedMessage = new StringBuilder(substring).reverse().toString();
        return reversedMessage;
    }

    public static void main(String[] args){
        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

        System.out.println(deciphererMessage(message1));
        System.out.println(deciphererMessage(message2));
        System.out.println(deciphererMessage(message3));
    }
}