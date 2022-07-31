public class main {
    public static void main(String[] args) {
        int a=75;
        int b=97;
        int c=4;
        if (a==b){
            System.out.println("a ravno b");
        }else if(a>b){
            System.out.println("a bolshe b");
        }else if(a<b){
            System.out.println("a menshe b");
        }

        switch (c){
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
        }
    }
}
